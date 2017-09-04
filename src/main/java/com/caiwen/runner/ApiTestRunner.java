package com.caiwen.runner;

import com.caiwen.core.Runnable;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ApiTestRunner implements Runnable {

    @Override
    public void run() {

    }

    public void run(RequestSpecification requestSpecification, ResponseSpecification responseSpecification) {
        String caseJson = "" +
                "{" +
                "'request': {" +
                "   params: {}" +
                "cookies: {}" +
                "" +
                "}" +
                "}";

        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.addCookie("userid");
        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder();
        RestAssured.given().spec(requestSpecification)
                .post()
                .then()
                .spec(responseSpecification);
    }
}
