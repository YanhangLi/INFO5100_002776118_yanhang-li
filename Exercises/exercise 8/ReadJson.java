package com;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ReadJson {
    public static void main(String[] args) {
        String bookJson = "{\"array\":[{\"title\": clean Code,\"year\": \"2020.2\",\"num\": \"385\",\"author\": \"Robert C.martin\"},{\"title\": Thinking in Java,\"year\": \"2003\",\"num\": \"1300\",\"author\": \"Bruce Eckel\"}]}";
        JSONObject obj = new JSONObject(bookJson);

        JSONArray jsonArray = obj.getJSONArray("array");

        for (int i = 0; i < jsonArray.length(); i++) {
            System.out.println(jsonArray.get(i));
        }
    }
}
