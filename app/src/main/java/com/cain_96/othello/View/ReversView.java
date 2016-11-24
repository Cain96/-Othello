package com.cain_96.othello.View;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import com.cain_96.othello.Helper.MainProcess;
import com.cain_96.othello.R;

/**
 * Created by Cain96 on 2016/11/24.
 */
public class ReversView extends View {
    private Paint mPaint = new Paint();
    //画像読み込み
    private Resources res = this.getContext().getResources();
    private Bitmap IMG_BOARD = BitmapFactory.decodeResource(res, R.drawable.board);
    private Bitmap IMG_BLACK = BitmapFactory.decodeResource(res, R.drawable.black);
    private Bitmap IMG_WHITE = BitmapFactory.decodeResource(res, R.drawable.white);
    private Bitmap IMG_LIGHT = BitmapFactory.decodeResource(res, R.drawable.light);

    private final int PLAYER = 1;
    private final int CPU = 2;
    private int turn;

    private int[][] board = new int[10][10];

    private MainProcess mProcess = new MainProcess();

    public ReversView(Context context) {
        super(context);
        IMG_BOARD = Resize(IMG_BOARD);
    }

    private Bitmap Resize(Bitmap image) {
        return Bitmap.createScaledBitmap(image, 1080, 1080, false);
    }


    //描写処理
    @Override
    public void onDraw(Canvas c) {
        //ボード表示
        c.drawBitmap(IMG_BOARD, 0, 0, mPaint);
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (board[j][i] == PLAYER) {
                    c.drawBitmap(IMG_BLACK, 108 * j, 108 * i, mPaint);
                }
                if (board[j][i] == CPU) {
                    c.drawBitmap(IMG_WHITE, 108 * j, 108 * i, mPaint);
                }
            }
        }
    }

    //タッチ入力処理
    public boolean onTouchEvent(MotionEvent me) {
        int tapX = (int) me.getX() / 108;
        int tapY = (int) me.getY() / 108;

        if (me.getAction() == MotionEvent.ACTION_DOWN) {
            mProcess.tap(tapX, tapY, turn);
        }

        return true;
    }
}
