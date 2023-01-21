package ru.ivanmurzin.myviewapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import androidx.annotation.NonNull;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    private SurfaceHolder surfaceHolder;
    private final DrawThread drawThread;

    public MySurfaceView(Context context) {



        super(context);
        getHolder().addCallback(this);
        int a = 1;
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        drawThread = new DrawThread();
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {
        this.surfaceHolder = holder;
        drawThread.start();
    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

    }


    class DrawThread extends Thread {
        private volatile boolean running = true;
        private Canvas canvas;

        public void run() {
            while (running) {
                try {
                    sleep(100);
                    canvas = surfaceHolder.lockCanvas();
                    canvas.drawColor(Color.DKGRAY);
                    for (MyCircle circle : circles) {
                        circle.draw(canvas);
                    }
                    for (MyCircle circle : circles) {
                        circle.update(2);
                    }
                } catch (Exception e) {
                } finally {
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
        }
    }

    private final List<MyCircle> circles = new ArrayList<>();

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        circles.add(new MyCircle(event.getX(), event.getY()));
        return super.onTouchEvent(event);
    }

    class MyCircle {
        float x, y, radius;
        Paint paint;

        public MyCircle(float x, float y) {
            this.x = x;
            this.y = y;
            this.radius = 50;
            paint = new Paint();
            switch (new Random().nextInt(5)) {
                case 0:
                    paint.setColor(Color.YELLOW);
                    break;
                case 1:
                    paint.setColor(Color.RED);
                    break;
                case 2:
                    paint.setColor(Color.MAGENTA);
                    break;
                case 3:
                    paint.setColor(Color.BLUE);
                    break;
                default:
                    paint.setColor(Color.WHITE);
            }
        }

        void draw(Canvas canvas) {
            canvas.drawCircle(x, y, radius, paint);
        }

        void update(float dr) {
            radius += dr;
        }
    }
}


class A {
    public static void main(String[] args) {

    }


    void f() throws InterruptedException {
        Thread.sleep(1000);
    }
}
