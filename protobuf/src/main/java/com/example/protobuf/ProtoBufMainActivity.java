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

    public static void main(String[] args) {

        DCRequest.DCRequestBean bean1 = DCRequest.DCRequestBean.newBuilder().setMsg("msg_02").setDcType("dctype01")
                .build();
        byte[] bytes1 = bean1.toByteArray();

        System.out.println(bytes1);

        HashMap<String, String> map = new HashMap<>();
        map.put("dcType_", "dctype01");
        map.put("msg_", "msg_02");

        DCRequest.DCRequestBean bean2 = DCRequest.DCRequestBean.newBuilder().build();

        byte[] bytes2 = toByteArray(map, bean2);

        System.out.println(bytes2);
    }

    private static byte[] toByteArray(HashMap<String, String> map, DCRequest.DCRequestBean bean) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            try {
                Field field = DCRequest.DCRequestBean.class.getDeclaredField(entry.getKey());
                field.setAccessible(true);
                field.set(bean, convert(entry.getValue(), field.getType()));
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return bean.toByteArray();
    }

    private static Object convert(Object object, Class<?> type) {
        if (object instanceof Number) {
            Number number = (Number) object;
            if (type.equals(byte.class) || type.equals(Byte.class)) {
                return number.byteValue();
            }
            if (type.equals(short.class) || type.equals(Short.class)) {
                return number.shortValue();
            }
            if (type.equals(int.class) || type.equals(Integer.class)) {
                return number.intValue();
            }
            if (type.equals(long.class) || type.equals(Long.class)) {
                return number.longValue();
            }
            if (type.equals(float.class) || type.equals(Float.class)) {
                return number.floatValue();
            }
            if (type.equals(double.class) || type.equals(Double.class)) {
                return number.doubleValue();
            }
        }
        return object;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proto_buf_main);

    }
}
