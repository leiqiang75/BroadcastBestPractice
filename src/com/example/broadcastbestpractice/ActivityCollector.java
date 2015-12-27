/**
 * 
 */
package com.example.broadcastbestpractice;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

/**
 * 活动管理类，便于一键结束所有活动
 * @author leiqiang
 *
 */
public class ActivityCollector {
	private static List<Activity> activities = new ArrayList<Activity>();
	
	/**
	 * 向管理器里面添加活动
	 * @param activity 准备添加的活动
	 */
	public static void addActivity(Activity activity) {
		activities.add(activity);
	}
	
	public static void removeActivity(Activity activity) {
		activities.remove(activity);
	}
	
	public static void finishAll() {
		for (Activity activity : activities) {
			if (!activity.isFinishing()) {
				activity.finish();
			}
		}
		activities.clear();
	}
}
