package shah.kartik.com.kartikscustomviews.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.support.v7.widget.AppCompatTextView;

import shah.kartik.com.kartikscustomviews.R;


public class CustomTextView extends AppCompatTextView {

	Context context;

	public CustomTextView(Context context) {
		super(context);
		this.context = context;
		
	}

	public CustomTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
		TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomTextView, 0, 0);
		try {

			String resourse = a.getString(R.styleable.CustomTextView_ttfResourseName);
			

			if (resourse != null && !isInEditMode()) {
				Typeface tf = Typeface.createFromAsset(context.getAssets(), resourse);
				setTypeface(tf);
			}

		} finally {
			a.recycle();
		}
	}

	public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.context = context;

		TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomTextView, 0, 0);
		
		try {
			String resourse = a.getString(R.styleable.CustomTextView_ttfResourseName);
			// LoggerGeneral.e("res "+resourse);
			if (resourse != null && !isInEditMode()) {
				Typeface tf = Typeface.createFromAsset(context.getAssets(), resourse);
				setTypeface(tf);
			}
			

		} finally {
			a.recycle();
		}
	}

	public void setCustomTypeFace(String path) {

		if (path != null) {
			Typeface tf = Typeface.createFromAsset(context.getAssets(), path);
			setTypeface(tf);
		}
		invalidate();
		requestLayout();
	}

}
