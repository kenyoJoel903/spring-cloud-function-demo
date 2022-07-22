package com.kenyo.serverless;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.kenyo.serverless.model.Person;
import com.kenyo.serverless.repository.PersonRepository;
import com.kenyo.serverless.util.JsonMapper;

@Component
public class Hello implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
	
	@Autowired
	private PersonRepository repository;

	@Override
	public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent input) {
		System.out.println("resource: " + input.getResource());
		System.out.println("path: " + input.getPath());
		System.out.println("http-method: " + input.getHttpMethod());
		System.out.println("header: " + input.getHeaders());
		System.out.println("query parameters: " + input.getQueryStringParameters());
		System.out.println("path paramters: " + input.getPathParameters());
		System.out.println("stage variables: " + input.getStageVariables());
		JsonMapper<Person> mapper = new JsonMapper<>();
		APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
        responseEvent.setStatusCode(200);
        responseEvent.setBody(mapper.toJson(repository.listAll()));
        //responseEvent.setBody("Hello! Reached the Spring Cloud Function with message: " + input.getBody());
        return responseEvent;
	}



}
