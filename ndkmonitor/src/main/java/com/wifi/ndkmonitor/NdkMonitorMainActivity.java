package com.wifi.ndkmonitor;

import java.io.File;

import com.example.ndk.JniUtil;
import com.example.ndk.NdkMonitor;
import com.example.ndkmonitor.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;

public class NdkMonitorMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ndk_monitor_activity_main);

		File file = new File("/mnt/sdcard/breakpad");
		File externalStorageDirectory = Environment.getExternalStorageDirectory();
		File dir = new File(externalStorageDirectory,"breakpad");
		dir.mkdirs();
		file.mkdirs();
		final JniUtil jniUtil = new JniUtil();
		new NdkMonitor().setNativeCrashDir(dir.getAbsolutePath());
//		String jniStr = jniUtil.crash();
//		findViewById(R.id.tv).postDelayed(new Runnable() {
//
//			@Override
//			public void run() {
//				// System.loadLibrary("ndk_monitor");
//
//			}
//
//		}, 2000);

		findViewById(R.id.tv).postDelayed(new Runnable() {

			@Override
			public void run() {
				String jniStr = jniUtil.crash();
			}

		}, 2000);

	}

}
