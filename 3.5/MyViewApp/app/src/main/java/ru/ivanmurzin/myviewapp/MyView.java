package ru.ivanmurzin.myviewapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MyView extends View {
    private final Bitmap someBird;
    private final Paint paint = new Paint();
    private int currentColor = 0;

    public MyView(Context context) {
        super(context);
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.bluebird_1);
        someBird = Bitmap.createScaledBitmap(bitmap, 70, 50, false);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        switch (currentColor) {
            case 0:
                canvas.drawColor(Color.DKGRAY);
                break;
            case 1:
                canvas.drawColor(Color.LTGRAY);
                break;
            default:
                canvas.drawColor(Color.YELLOW);
        }
        for (int i = 0; i < coordinates.size(); i++) {
            Pair<Float, Float> pair = coordinates.get(i);
            canvas.drawBitmap(someBird,
                    pair.first,
                    pair.second,
                    null
            );
        }
        drawStaff(canvas);

        Log.v("RRR", "onDraw");
        super.onDraw(canvas);
    }


    private final List<Pair<Float, Float>> coordinates = new ArrayList<>();


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        currentColor = (currentColor + 1) % 3;
        coordinates.add(new Pair<>(event.getX(), event.getY()));
        invalidate();
        return super.onTouchEvent(event);
    }

    private void drawStaff(Canvas canvas) {
        paint.setColor(Color.GRAY);
        paint.setTextSize(100);
        canvas.drawText("Слава булочке!", getWidth() / 2f - 400, getHeight() / 2f, paint);
        float rotateCenterX = 200;
        float rotateCenterY = 400;
        float rotateAngle = 45;
        canvas.rotate(-rotateAngle, rotateCenterX, rotateCenterY);
        canvas.drawText("Logika", 1000, 1000, paint);
        canvas.rotate(rotateAngle, rotateCenterX, rotateCenterY);
        paint.setColor(Color.RED);
        canvas.drawRect(0, 0, 180, 1000, paint);
        paint.setColor(Color.GREEN);
        paint.setAlpha(205);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        canvas.drawCircle(0, 0, 180, paint);
        canvas.drawBitmap(someBird, 300, 300, null);
    }
}
