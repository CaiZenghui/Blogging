package com.example.getrunningapps;

import java.util.List;
import java.util.Map;

import com.caizenghui.utils.RunningAppUtil;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class RunningAppsMainActivity extends AppCompatActivity {

    @Override
    @SuppressLint("NewApi")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running_apps_main);

        ActivityManager manager = (ActivityManager) this.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> processes = manager.getRunningAppProcesses();
        StringBuilder sb = new StringBuilder();
        String[] supportedAbis = Build.SUPPORTED_ABIS;

        sb.append("--------------- support abis:---------------------\n" );
        for (String abi : supportedAbis){
            sb.append(abi+"\n");
        }
        sb.append("---------------pid " + android.os.Process.myPid() + "------------------\n");
        sb.append("-------------- result of before 5.0 method :" + processes.size() + "---------------\n");
        for (ActivityManager.RunningAppProcessInfo info : processes) {
            sb.append(info.processName);
            sb.append("\n");
        }

        ((TextView) findViewById(R.id.tv)).setText(sb.toString());

        Map<Integer, String> runningAppInfoByProc = RunningAppUtil.getRunningAppInfoByProc();
        sb.append("-------------- result of afater 5.0 method : " + runningAppInfoByProc.size() + "---------------\n");

        for (Map.Entry<Integer, String> entrySet : runningAppInfoByProc.entrySet()) {
            sb.append(entrySet.getValue());
            sb.append(":");
            sb.append(entrySet.getKey());
            sb.append("\n");
        }

        ((TextView) findViewById(R.id.tv)).setText(sb.toString());

    }

}
