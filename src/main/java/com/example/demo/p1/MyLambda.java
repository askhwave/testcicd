package com.example.demo.p1;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MyLambda implements RequestHandler<String, String> {
	
    @Override
    public String handleRequest(String input, Context context) {
        return "Hello2, " + input + "!";
    }
}