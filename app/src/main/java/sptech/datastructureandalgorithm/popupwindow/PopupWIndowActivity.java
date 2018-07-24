package sptech.datastructureandalgorithm.popupwindow;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import sptech.datastructureandalgorithm.R;

public class PopupWIndowActivity extends AppCompatActivity {

    AppCompatButton buttonPopUp;
    FrameLayout frame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_window);

        buttonPopUp = findViewById(R.id.buttonPopUp);
        frame = findViewById(R.id.frame);

        buttonPopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frame.setVisibility(View.VISIBLE);
                showPopUpWIndow(PopupWIndowActivity.this, "alskdjalsdjlaskjdlaskdasd", view);

            }
        });

    }

    public void showPopUpWIndow(Context context, String strPopupInfo,
                                View anchor) {
        RelativeLayout mLinearlayoutInfoPopUp;
        AutoCompleteTextView autoComplete;

        // popup window
        final PopupWindow popupWindowProductInfo;

        AppCompatImageView mImageViewInfoArrowUp;
        AppCompatImageView mImageViewInfoArrowDown;
        AppCompatTextView tvTextPopupInfo;

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_window_layout,
                null, true);
        mLinearlayoutInfoPopUp = (RelativeLayout) layout.findViewById(R.id.mLinearlayoutInfoPopUp);
        autoComplete = (AutoCompleteTextView) layout.findViewById(R.id.autoComplete);
        mImageViewInfoArrowUp = (AppCompatImageView) layout.findViewById(R.id.mImageViewInfoArrowUp);
        mImageViewInfoArrowDown = (AppCompatImageView) layout.findViewById(R.id.mImageViewInfoArrowDown);
        tvTextPopupInfo = (AppCompatTextView) layout.findViewById(R.id.tvTextPopupInfo);
        tvTextPopupInfo.setText(strPopupInfo);

        int xPos, yPos;
        int rootWidth;

        int[] location = new int[2];
        anchor.getLocationOnScreen(location);
        Rect anchorRect = new Rect(location[0], location[1], location[0] + anchor.getWidth(), location[1] + anchor.getHeight());
        layout.measure(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        int rootHeight = layout.getMeasuredHeight();


        ArrayList<String> list = new ArrayList<>();
        list.add("Siba");
        list.add("Satya");
        list.add("Narayan");
        list.add("Mohanty");
        list.add("Prasad");
        list.add("Hello");
        list.add("Abcd");
        list.add("asdadas");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_dropdown_item_1line, list);
        autoComplete.setAdapter(adapter);


        rootWidth = layout.getMeasuredWidth();

        WindowManager mWindowManager = (WindowManager) context.getSystemService(WINDOW_SERVICE);

        Display display = mWindowManager.getDefaultDisplay();

        Point size = new Point();
        display.getSize(size);
        int screenHeight = size.y;
        int screenWidth = size.x;

        if ((anchorRect.left + rootWidth) > screenWidth) {
            xPos = anchorRect.left - (rootWidth - anchor.getWidth());
            xPos = (xPos < 0) ? 300 : xPos;
        } else {
            if (anchor.getWidth() > rootWidth) {
                xPos = anchorRect.centerX() - (rootWidth / 2);
            } else {
                xPos = anchorRect.left;
            }
        }

        int dyTop = anchorRect.top;
        int dyBottom = screenHeight - anchorRect.bottom;
        if (dyTop > dyBottom) {
            mImageViewInfoArrowDown.setVisibility(View.VISIBLE);
            mImageViewInfoArrowUp.setVisibility(View.INVISIBLE);
            if (rootHeight > dyTop) {
                yPos = 15;
                ViewGroup.LayoutParams l = mLinearlayoutInfoPopUp.getLayoutParams();
                l.height = dyTop - anchor.getHeight();
            } else {
                yPos = anchorRect.top - rootHeight - anchor.getHeight();
            }
        } else {
            mImageViewInfoArrowDown.setVisibility(View.INVISIBLE);
            mImageViewInfoArrowUp.setVisibility(View.VISIBLE);
            yPos = anchorRect.bottom;
            if (rootHeight > dyBottom) {
                ViewGroup.LayoutParams l = mLinearlayoutInfoPopUp.getLayoutParams();
                l.height = dyBottom;
            }
        }

        popupWindowProductInfo = new PopupWindow(layout, screenWidth - 200, WindowManager.LayoutParams.WRAP_CONTENT, false);
        popupWindowProductInfo.setTouchable(true);
        popupWindowProductInfo.setFocusable(true);
        popupWindowProductInfo.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popupWindowProductInfo.setOutsideTouchable(true);
        //  popupWindowProductInfo.setAnimationStyle(R.style.animationName);

        popupWindowProductInfo.showAtLocation(anchor, Gravity.NO_GRAVITY, xPos, yPos);


        popupWindowProductInfo.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                frame.setVisibility(View.GONE);
            }
        });

    }
}
