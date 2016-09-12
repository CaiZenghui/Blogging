package com.example.protobuf;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.example.caizenghui.DCRequest;

/**
 * Created by caizenghui on 2016/9/12.
 */
public class Test {
    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put("t1_","dctype01");
        map.put("t2_",1111111111);

        TestBean bean = new TestBean();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            try {
                Field field = TestBean.class.getDeclaredField(entry.getKey());
                field.setAccessible(true);
                Class<?> type = field.getType();
                field.set(bean,convert(entry.getValue(),type));
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        bean.toString();
    }

    public static Object convert(Object object, Class<?> type) {
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
}
