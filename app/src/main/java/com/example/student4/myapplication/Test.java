package com.example.student4.myapplication;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Test extends View {
    public Test(Context context){
        super(context);
    }
    Paint color = new Paint();
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawCircle(100,100,30,color);

    }
}
