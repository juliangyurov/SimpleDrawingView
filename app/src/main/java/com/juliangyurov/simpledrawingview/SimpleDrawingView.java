package com.juliangyurov.simpledrawingview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by juliangyurov on 4/20/17.
 */

public class SimpleDrawingView extends View {
    //setup initial color
    private final int paintColor = Color.BLACK;
    //defines paint and canvas
    private Paint drawPaint;


    public SimpleDrawingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setupPaint();
    }

    private void setupPaint(){
        drawPaint = new Paint();
        drawPaint.setColor(paintColor);
        drawPaint.setAntiAlias(true);
        drawPaint.setStrokeWidth(3);
        drawPaint.setStyle(Paint.Style.STROKE);
        drawPaint.setStrokeJoin(Paint.Join.ROUND);
        drawPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    protected void onDraw(Canvas canvas){

        canvas.drawCircle(50,50,20,drawPaint);
        drawPaint.setColor(Color.GREEN);
        canvas.drawCircle(50,150,20,drawPaint);
        drawPaint.setColor(Color.BLUE);
        canvas.drawCircle(50,250,20,drawPaint);
        drawPaint.setColor(Color.BLACK);
        canvas.drawLine(50,50,50,150,drawPaint);
        drawPaint.setColor(Color.GREEN);
        canvas.drawLine(50,150,150,150,drawPaint);
        canvas.drawCircle(150,150,20,drawPaint);
        canvas.drawLine(150,150,50,250,drawPaint);

        //color elements r g b
        int r,g,b;
        r=g=b=0;
        //incrementing or decrementing colors r g b
        boolean ir,ig,ib;
        ir=ig=ib=true;
        //color steps r g b
        int sr,sg,sb;
        //sr=sg=sb=5;
        sr=1;sg=3;sb=61;

        for (int i = 0;i<700;i++){

            if(ir) {
                r+=sr;
                if(r>255-sr){
                    ir=!ir;
                }
            }else{
                r-=sr;
                if (r<sr){
                    ir=!ir;
                }
            }

            //r=40;

            if(ig) {
                g+=sg;
                if(g>255-sg){
                    ig=!ig;
                }
            }else{
                g-=sg;
                if (g<sg){
                    ig=!ig;
                }
            }

            //g=40;

            if(ib) {
                b+=sb;
                if(b>255-sb){
                    ib=!ib;
                }
            }else{
                b-=sb;
                if (b<sb){
                    ib=!ib;
                }
            }

            //b=40;

            drawPaint.setColor(Color.rgb(r,g,b));

            //canvas.drawLine(150+i,150,150+i,750,drawPaint);

            canvas.drawLine(150,150+i,750,150+i,drawPaint);

            canvas.drawLine(150+i,150+(float)Math.sqrt(i),500+(float)Math.sqrt(i),350+i,drawPaint);

            //canvas.drawLine(150+i,150+i,500+(float)Math.sqrt(i),350+i,drawPaint);

            //canvas.drawCircle(400,500,i,drawPaint);

        }


    }
}
