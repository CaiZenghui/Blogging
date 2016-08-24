package com.example.protobuf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.googlecode.protobuf.format.JsonFormat;

public class ProtoBufMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proto_buf_main);

//        Message someProto = SomeProto.getDefaultInstance();
//        String jsonFormat = JsonFormat.printToString("d");
//
//        Message.Builder builder = SomeProto.newBuilder();
//        String jsonFormat = JsonFormat.merge(jsonFormat, builder);
    }
}
