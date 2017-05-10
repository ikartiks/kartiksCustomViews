package shah.kartik.com.kartikscustomviews.sample;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import shah.kartik.com.kartikscustomviews.R;
import shah.kartik.com.kartikscustomviews.ui.BaseDialog;
import shah.kartik.com.kartikscustomviews.utility.LoggerGeneral;

public class MainActivity extends Activity {

	Context context = this;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);

		//BaseDialog dialog=BaseDialog.createFullScreenBaseDialog(context,R.style.AppTheme,R.drawable.overlay);
        BaseDialog dialog = new BaseDialog(context,R.style.AppTheme,R.drawable.overlay);

        View v =getLayoutInflater().inflate(R.layout.activity_main,null);
        dialog.setContent(v);
        dialog.show();

        LoggerGeneral.e("asdasd");


		//Test CHange

		/*SliderView sv=(SliderView)findViewById(R.id.SliderView1);
		sv.setOnReachedListener(new OnReachedListener() {
			@Override
			public void onReached() {
				LoggerGeneral.info("reached");
			}

			@Override
			public void onLoggedOut() {
				LoggerGeneral.info("logout maar");
			}
		});*/

		/*CustomTextView ctx=findViewById(R)
		Typeface type = Typeface.createFromAsset(getAssets(),"s.ttf");
		   txtyour.setTypeface(type);*/
		//fm=getSupportFragmentManager();
		//fm.beginTransaction().add(R.id.container,new ListViewScrollListenerFragment()).commit();
	}
}
