/**
 * 
 */
package com.example.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * 所有活动的基础类
 * @author leiqiang
 *
 */
public class BaseActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ActivityCollector.addActivity(this);
		// 日志记录当前启动的哪个活动
		Log.d("Now Activity", this.getClass().getSimpleName());
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		ActivityCollector.removeActivity(this);
	}
}
