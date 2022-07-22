package com.kenyo.serverless.util;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonMapper<T> {
	
	public <T> T toObject(String json, Class<T> clazz) {
		Gson gson = new Gson();
		T object = gson.fromJson(json, clazz);
		return object;
	}
	
	public String toJson(T object) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(object);
	}
	
	public String toJson(List<T> objects) {
		Gson gson = new Gson();
		return gson.toJson(objects);
	}

}
