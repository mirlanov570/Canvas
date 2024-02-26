package com.example.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);


        int screenWidth = canvas.getWidth();
        int screenHeight = canvas.getHeight();

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setTextSize(30);

        int numOfLines = 100;
        float startX = 0;
        float startY = 0;
        float endX = screenWidth;
        float endY = screenHeight;

        // Рисуем 100 диагональных линий
        for (int i = 1; i <= numOfLines; i++) {
            canvas.drawLine(startX, startY, endX, endY, paint);
            startY += screenHeight / numOfLines;
            endX -= screenWidth / numOfLines;
        }
    }
}