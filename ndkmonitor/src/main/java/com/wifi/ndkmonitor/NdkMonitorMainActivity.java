package com.wifi.ndkmonitor;

import java.io.File;

import com.example.ndk.JniUtil;
import com.example.ndk.NdkMonitor;
import com.example.ndkmonitor.R;

import android.app.Activity;
import android.os.Bundle;

public class NdkMonitorMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ndk_monitor_activity_main);

		File file = new File("/mnt/sdcard/breakpad");
		file.mkdirs();
		final JniUtil jniUtil = new JniUtil();
		new NdkMonitor().setNativeCrashDir("/mnt/sdcard/breakpad");
		findViewById(R.id.tv).postDelayed(new Runnable() {

			@Override
			public void run() {
				// System.loadLibrary("ndk_monitor");

			}

		}, 2000);

		findViewById(R.id.tv).postDelayed(new Runnable() {

			@Override
			public void run() {
//				String jniStr = jniUtil.crash();
			}

		}, 2000);

	}

}
