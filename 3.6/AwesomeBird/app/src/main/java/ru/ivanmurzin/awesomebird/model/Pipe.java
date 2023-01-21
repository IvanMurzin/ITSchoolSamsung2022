package ru.ivanmurzin.awesomebird.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import ru.ivanmurzin.awesomebird.R;

public class Pipe extends GameObject {
    private Bitmap topPipe;
    private Bitmap bottomPipe;

    private static final float X_SPEED = 50;
    private static final float SPACER_SIZE = 300;

    private final float height;
    private final float width;


    public Pipe(Context context, float height, float width) {
        super(width, 0);
        this.height = height;
        this.width = width;
        topPipe = BitmapFactory.decodeResource(context.getResources(), R.drawable.pipe_rotated);
        bottomPipe = BitmapFactory.decodeResource(context.getResources(), R.drawable.pipe);
        generatePipes();
    }

    private void generatePipes() {
        y = random(height / 4f, height * 3 / 4f); // рандомная y координата с отступом в 1/4 с каждого конца

        topPipe = Bitmap.createScaledBitmap(topPipe, 200, (int) (y - SPACER_SIZE), false);
        bottomPipe = Bitmap.createScaledBitmap(bottomPipe, 200, (int) (height - y - SPACER_SIZE), false);
    }

    @Override
    public void update() {
        x -= X_SPEED;
        if (x <= -bottomPipe.getWidth()) {
            x = width;
            generatePipes();
        }
    }


    public boolean isCollision(GameObject object) {
        if (x - 50 < object.x && x + bottomPipe.getWidth() > object.x) {
            if (object.y < topPipe.getHeight()) return true; // collision with top
            return object.y - 10 > height - bottomPipe.getHeight(); // collision with bottom
        }
        return false;
    }


    private float random(float min, float max) {
        return (float) (min + (Math.random() * (max - min)));
    }

    public Bitmap getTopPipe() {
        return topPipe;
    }

    public Bitmap getBottomPipe() {
        return bottomPipe;
    }
}
