package ru.ivanmurzin.recursion;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.view.View;

import java.util.Random;


public class Fractal extends View {
    Paint paint;
    Paint backgroundPaint;
    Handler handler = new Handler();

    public Fractal(Context context) {
        super(context);
        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.MAGENTA);
        paint.setStrokeWidth(5);

        backgroundPaint = new Paint();
        backgroundPaint.setColor(Color.parseColor("#ff8000"));
    }


    private void drawCircles(Canvas canvas, int x, int y, int radius) {
        paint.setColor(getRandomColor());
        canvas.drawCircle(x, y, radius, paint);
        if (radius > 40) {
            drawCircles(canvas, x - radius, y, radius / 2);
            drawCircles(canvas, x + radius, y, radius / 2);
            drawCircles(canvas, x, y - radius, radius / 2);
            drawCircles(canvas, x, y + radius, radius / 2);
        }
    }

    private int mainRadius = 500;
    private int decrement = 30;
    private int angle = 0;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        handler.postDelayed(() -> {
//            backgroundPaint.setColor(getRandomColor());
//        }, 3000);
        canvas.drawRect(0, 0, getWidth(), getHeight(), backgroundPaint);
        // circles
        canvas.rotate(angle, getWidth() / 2, getHeight() / 2);
        angle += 10;
        drawCircles(canvas, getWidth() / 2, getHeight() / 2, mainRadius);
        mainRadius -= decrement;
        if (mainRadius < 50) {
            decrement = -decrement;
            invalidate();
        } else {
            if (mainRadius > 500) decrement = -decrement;
            handler.postDelayed(this::invalidate, 60);
        }
    }

    private int getRandomColor() {
        int[] colors = {Color.RED, Color.GREEN, Color.MAGENTA, Color.BLUE, Color.BLACK, Color.DKGRAY, Color.CYAN};
        return colors[new Random().nextInt(colors.length)];
    }
}
