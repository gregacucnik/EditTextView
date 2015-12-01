package com.gregacucnik;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;

/**
 * Created by Grega on 23/11/15.
 */
public class ETT_EditText extends EditText {

    private OnEditTextListener mListener;

    public interface OnEditTextListener{
        void onEditTextKeyboardDismissed();
    }

    public ETT_EditText(Context context) {
        super(context);
    }

    public ETT_EditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ETT_EditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setOnKeyboardDismissedListener(OnEditTextListener listener){
        this.mListener = listener;
    }

    @Override
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_UP) {

            if(mListener != null)
                mListener.onEditTextKeyboardDismissed();

            return false;
        }
        return super.dispatchKeyEvent(event);
    }
}