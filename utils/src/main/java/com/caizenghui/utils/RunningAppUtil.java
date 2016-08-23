package com.caizenghui.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.text.TextUtils;

/**
 * Created by caizenghui on 2016/8/23.
 */
public class RunningAppUtil {

    /**
     * first filter principle packageName: whithout these strings will be
     * ignored;
     */
    private static String[] PRO_NAME_CONSERENED = { "com.", "cn." };

    /**
     * second filter principle: packageName with these strings will be ignored;
     */
    private static String[] PRO_NAME_IGNORED = { "com.android", ":", };

    /**
     * returns null or zero map-size if no app found.
     * 
     * @return Map contains running app info. key is pid, value is packageName.
     */
    public static Map<Integer, String> getRunningAppInfoByProc() {
        Map<Integer, String> map = null;
        try {
            File[] files = readFiles();
            if (files == null || files.length == 0) {
                return null;
            }
            map = new HashMap<>();
            readAppInfo(map, files);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    // public static Map<Integer, String> getRunningAppInfoByPS() {
    // try {
    // Runtime r = Runtime.getRuntime();
    // Process p = r.exec("ps");
    // BufferedReader br = new BufferedReader(new
    // InputStreamReader(p.getInputStream()));
    // String inline;
    // while ((inline = br.readLine()) != null) {
    // Log.i("PS", "" + inline);
    // }
    // br.close();
    // // StringTokenizer processInfoTokenizer = new
    // // StringTokenizer(inline);
    // // int count = 0;
    // // while (processInfoTokenizer.hasMoreTokens()) {
    // // count++;
    // // processId = processInfoTokenizer.nextToken();
    // // if (count == 2) {
    // // break;
    // // }
    // // }
    // // r.exec("kill -15 " + processId);
    // } catch (IOException ex) {
    // }
    // }

    private static void readAppInfo(Map<Integer, String> map, File[] files) {
        BufferedReader mBufferedReader = null;
        for (File file : files) {
            try {
                mBufferedReader = new BufferedReader(new FileReader(new File(file, "cmdline")));
                String processName = mBufferedReader.readLine();
                if (filterProcessByName(processName)) {
                    map.put(Integer.parseInt(file.getName()), processName);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (mBufferedReader != null) {
                        mBufferedReader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    private static boolean filterProcessByName(String fileName) {
        if (TextUtils.isEmpty(fileName) || TextUtils.isEmpty(fileName.trim())) {
            return false;
        }
        boolean contains = false;
        for (String reg : PRO_NAME_CONSERENED) {
            if (fileName.contains(reg)) {
                contains = true;
                break;
            }
        }
        if (!contains) {
            return false;
        }

        for (String reg : PRO_NAME_IGNORED) {
            if (fileName.contains(reg)) {
                return false;
            }
        }

        return true;
    }

    private static File[] readFiles() {
        try {
            File dir = new File("/proc/");
            return dir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if (pathname.isDirectory()) {
                        // only concern file named with int;
                        String rex = "^[0-9]*[1-9][0-9]*$";
                        Pattern p = Pattern.compile(rex);
                        Matcher m = p.matcher(pathname.getName());
                        return m.matches();
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
