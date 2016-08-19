package com.example.getrunningapps;

import android.app.ActivityManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunningAppsMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running_apps_main);

        ActivityManager manager = (ActivityManager) this.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> processes = manager.getRunningAppProcesses();
        StringBuilder sb = new StringBuilder();
        sb.append("-------------- result of before 5.0 method---------------\n");
        for (ActivityManager.RunningAppProcessInfo info : processes) {
            sb.append(info.processName);
            sb.append("\n");
        }

        ((TextView) findViewById(R.id.tv)).setText(sb.toString());

        List<String> processNames = getProcessNames();
        sb.append("-------------- result of afater 5.0 method---------------\n");

        for (String processName : processNames){
            sb.append(processName);
            sb.append("\n");
        }

        ((TextView) findViewById(R.id.tv)).setText(sb.toString());
    }

    public static List<String> getProcessNames() {
        List<String> list = null;
        try {
            File dir = new File("/proc/");
            File[] files = dir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    String rex = "^[0-9]*[1-9][0-9]*$";
                    Pattern p = Pattern.compile(rex);
                    Matcher m = p.matcher(pathname.getName());
                    return m.matches();
                }
            });

            if (files == null || files.length == 0){
                return list; // null
            }
            list = new ArrayList<>();
            BufferedReader mBufferedReader = null;
            for (File file : files) {
                try {
                    mBufferedReader = new BufferedReader(new FileReader(new File(file, "cmdline")));
                    String processName = mBufferedReader.readLine().trim();
                    if (!TextUtils.isEmpty(processName) && !TextUtils.isEmpty(processName.trim()) && processName.contains("com.")&& !processName.contains("com.android")){
                        list.add(processName);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    mBufferedReader.close();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
