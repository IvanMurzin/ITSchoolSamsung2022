package ru.ivanmurzin.awesomebird.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

import ru.ivanmurzin.awesomebird.R;
import ru.ivanmurzin.awesomebird.model.Bird;
import ru.ivanmurzin.awesomebird.model.Pipe;

public class GameView extends SurfaceView implements SurfaceHolder.Callback {
    private static final int FPS = 300;
    private final Bitmap background;
    private SurfaceHolder surfaceHolder;
    private DrawThread drawThread;
    private Bird bird;
    private Pipe pipe;


    public GameView(Context context) {
        super(context);
        background = BitmapFactory.decodeResource(context.getResources(), R.drawable.back);
        drawThread = new DrawThread();
        getHolder().addCallback(this);

    }

    private void init() {
        bird = new Bird(getContext(), 200, getHeight() / 2f);
        pipe = new Pipe(getContext(), getHeight(), getWidth());
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        this.surfaceHolder = surfaceHolder;
        init();
        drawThread.start();
    }

    private void drawFrames(Canvas canvas) {
        Rect backgroundRect = new Rect(0, 0, getWidth(), getHeight());
        canvas.drawBitmap(background, null, backgroundRect, null);
        canvas.drawBitmap(bird.getSprite(), bird.x, bird.y, null);
        canvas.drawBitmap(pipe.getTopPipe(), pipe.x, 0, null);
        canvas.drawBitmap(pipe.getBottomPipe(), pipe.x, getHeight() - pipe.getBottomPipe().getHeight(), null);
    }

    private void update() {
        bird.update();
        pipe.update();
        if (pipe.isCollision(bird) || bird.y <= 0 || bird.y >= getHeight()) {
            drawThread.running = false;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        bird.fly();
        if (!drawThread.running) {
            drawThread = new DrawThread();
            init();
            drawThread.start();
        }
        return super.onTouchEvent(event);
    }

    private class DrawThread extends Thread {
        private volatile boolean running = true;

        @Override
        public void run() {
            Canvas canvas;
            while (running) {
                canvas = surfaceHolder.lockCanvas();
                try {
                    sleep(1000 / FPS);
                    drawFrames(canvas);
                    update();
                } catch (Exception e) {
                    Log.e("RRR", "run: ", e);
                } finally {
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
        }
    }


    @Override
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {
    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
    }
}
