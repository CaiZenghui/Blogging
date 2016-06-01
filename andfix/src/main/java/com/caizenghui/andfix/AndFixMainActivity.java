package com.caizenghui.andfix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.caizenghui.baseapplication.BaseApplication;
import com.caizenghui.utils.ToastUtils;

import java.io.File;

public class AndFixMainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_and_fix_main);

        findViewById(R.id.btn_fix_bug).setOnClickListener(this);
        findViewById(R.id.btn_show_bug).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_fix_bug) {
            fixBug();
        } else if (i == R.id.btn_show_bug) {
            showStatus();
        }
    }

    private void showStatus() {
//        ToastUtils.showToast(this, "have a big bug");
//        ToastUtils.showToast(this, "bug has been fixed");
//        ToastUtils.showToast(this,"fix bug again");
        modify1();
    }

    private void modify1() {
//        ToastUtils.showToast(this, "bug has been fixed");
        modify2();
    }

    private void modify2() {
        ToastUtils.showToast(this,"fix bug again");
    }


    /**
     * 1.需要验证新增加方法；
     * 2.删除方法；
     * 3.新增成员变量；
     * mac 上生成 patch 的命令如下
     * ./apkpatch.sh -f app-debug_fix_bug.apk -t app-debug_has_bug.apk -o output1 -k keystore_gradle_debug.jks -p 123456 -a GradleUseDebug -e 123456
     */
    private void fixBug() {
    File dir = new File(getFilesDir(),"patch");
        try {
            if (!dir.exists()){
                dir.mkdirs();
            }
            File[] files = dir.listFiles();
            for (File file : files) {
                BaseApplication.patchManager.addPatch(file.getAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
