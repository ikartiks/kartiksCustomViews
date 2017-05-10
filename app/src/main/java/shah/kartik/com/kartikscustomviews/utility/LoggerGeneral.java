package shah.kartik.com.kartikscustomviews.utility;

import android.util.Log;

import shah.kartik.com.kartikscustomviews.BuildConfig;

public class LoggerGeneral {

	public static final String TAG = "kartiks custom views";
	
	public static void e(String msg) {
		if (BuildConfig.DEBUG)
			Log.e(TAG,  msg);
		
	}
	
	public static void info(String msg) {
		if (BuildConfig.DEBUG) {
			Log.i(TAG, msg);
		}
	}
	
}
