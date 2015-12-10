package com.gregacucnik;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Grega on 23/11/15.
 */
public class ETT_EditText extends EditText {

    private OnEditTextListener mListener;

    public interface OnEditTextListener{
        void onEditTextKeyboardDismissed();
        void onEditTextKeyboardDone();
    }

    public ETT_EditText(Context context) {
        super(context);

        init();
    }

    public ETT_EditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        init();
    }

    public ETT_EditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }

    private void init(){
        setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {

                    if(mListener != null)
                        mListener.onEditTextKeyboardDone();

                    return true;
                }
                return false;
            }
        });
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