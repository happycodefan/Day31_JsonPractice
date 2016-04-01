package com.example.happy_fan.day31_jsonpractice;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Created by Happy_Fan on 2016.4.1.
 */
public class NetworkTask extends AsyncTask<String,Void,Response> {
    public static Gson gson;
    static{
        gson =new GsonBuilder().setVersion(2).registerTypeAdapter(String[].class, new TypeAdapter<String[]>() {
            @Override
            public void write(JsonWriter out, String[] value) throws IOException {
                if(value != null && value.length > 0){
                    StringBuilder builder = new StringBuilder();
                    for(String s : value){
                        builder.append(s).append(',');
                    }
                    builder.deleteCharAt(builder.length() - 1);
                    out.value(builder.toString());
                }
            }

            @Override
            public String[] read(JsonReader in) throws IOException {
                return new String[0];
            }
        }).create();
    }
    @Override
    protected Response doInBackground(String... params) {
        return null;
    }
}
