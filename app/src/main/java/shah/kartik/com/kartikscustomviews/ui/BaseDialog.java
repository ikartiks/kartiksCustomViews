package shah.kartik.com.kartikscustomviews.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import shah.kartik.com.kartikscustomviews.R;


/**
 * Created by kartik on 6/7/15.
 */
public class BaseDialog extends Dialog{

    private int bgResourceId;

    private BaseDialog(Context context) {
        super(context);
    }

    private BaseDialog(Context context, int theme) {
        super(context, theme);
    }

    private BaseDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    public BaseDialog(@NonNull Context context, @StyleRes int themeResId, int bgResourceId) {
        super(context, themeResId);
        this.bgResourceId = bgResourceId;

        Activity activity = (Activity) context;
        DisplayMetrics displaymetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;
        int width = displaymetrics.widthPixels;

        this.getWindow().setLayout(width, height);

        this.getWindow().setBackgroundDrawableResource(R.drawable.overlay);

        this.setContentView(R.layout.base_dialog);
    }

    public void setContent(View v){
        RelativeLayout mainContainer= (RelativeLayout) findViewById(R.id.MainContainer);
        mainContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        LinearLayout container=(LinearLayout)findViewById(R.id.Container);
        container.setBackgroundResource(bgResourceId);
        container.addView(v,new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));
    }

}