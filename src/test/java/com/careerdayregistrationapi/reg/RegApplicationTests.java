package com.careerdayregistrationapi.reg;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;
import com.jayway.restassured.specification.RequestSpecification;
import models.JobApplicant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegApplicationTests {

    @Before
    public void setUp(){
        RestAssured.baseURI="http://localhost:8080/CareerDay/api";

    }
    @Test
    public void givenApplicant_whenGetApplicant_thenReturnJsonArrsy()throws Exception{
        JobApplicant jay=new JobApplicant();
        RequestSpecification httpRequest= RestAssured.given();
        Response response=httpRequest
                .contentType(ContentType.JSON)
                .get("/applicant/12345678");

        ResponseBody body=response.getBody();

        String stringBodyValue=body.asString();

        System.out.println(stringBodyValue);

        Assert.assertTrue(stringBodyValue.contains("rows"));
        List<Map<String,String>> rows=response.jsonPath().getList("rows");
        Assert.assertEquals(rows.get(0).get("firstname"),"Joseph");
        System.out.println(rows.get(0).get("firstname"));

    }

    @Test
    public void contextLoads() {
    }




}

