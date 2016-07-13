package com.caizenghui1.bmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BModuleMainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmodule_main);
        findViewById(R.id.btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn) {
            try {
                Class<?> clazz = Class.forName("com.caizenghui1.amodule.UtilTest");
                Constructor<?> constructor = clazz.getConstructor(null);
                Object o = constructor.newInstance();
                Toast.makeText(this,o.toString(),Toast.LENGTH_LONG).show();
                Class<?> clazz1 = Class.forName("com.caizenghui.blogging.MainActivity");
                Constructor<?> constructor1 = clazz1.getConstructor(null);
                Object o1 = constructor1.newInstance();
                Toast.makeText(this,o1.toString(),Toast.LENGTH_LONG).show();
            } catch (ClassNotFoundException e) {
                Toast.makeText(this,"ClassNotFoundException",Toast.LENGTH_LONG).show();
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                Toast.makeText(this,"NoSuchMethodException",Toast.LENGTH_LONG).show();
                e.printStackTrace();
            } catch (IllegalAccessException e) {
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
