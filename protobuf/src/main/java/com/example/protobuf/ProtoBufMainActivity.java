package com.example.protobuf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.example.caizenghui.DCRequest;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProtoBufMainActivity extends AppCompatActivity {

    public static void main(String[] args){


        HashMap<String, String> map = new HashMap<>();
        map.put("dcType_","dctype01");
        map.put("msg_","msg_02");
        DCRequest.DCRequestBean bean = DCRequest.DCRequestBean.newBuilder().build();


        /************* split ****************/


        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            try {
                Field field = DCRequest.DCRequestBean.class.getDeclaredField(entry.getKey());
                field.setAccessible(true);
                field.set(bean,entry.getValue());
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        byte[] bytes = bean.toByteArray();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proto_buf_main);


    }
}
