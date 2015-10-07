package example;


import DcuServise.Services;
import DcuServise.ServicesService;
import DcuServise.SigninInfo;
import webClient.HelloWorld;
import webClient.HelloWorldService;

import java.util.Date;

/**
 * Created by weblogic12 on 4/19/2015.
 */
public class JaXClient {
    public static void main(String[] args) {
//        HelloWorld helloWorld = new  HelloWorldService().getHelloWorld();
//        System.out.println(helloWorld.sayHelloWorldFrom("Hamed"));
//        System.out.println(helloWorld.sayHowAreYouFrom("Hamed"));

//        Services services = new ServicesService().getServices();
//        System.out.println(services.heloTemp("Hamed"));
//        System.out.println(services.howAreYouTemp("Hamed"));

//        HelloWorld helloWorld = new HelloWorldService().getHelloWorldPort();
//        System.out.println(helloWorld.sayHelloWorldFrom("Hamed"));
//        System.out.println(helloWorld.sayHowAreYouFrom("Hamed"));

        Services services = new ServicesService().getServices();
        SigninInfo signinInfo = new SigninInfo();
        signinInfo.setUserId("1177");
        signinInfo.setIp("10.92.20.11");
        Date date = new Date();
        signinInfo.setRequestDate("13900519");
        services.signinUser(signinInfo,"HVL1", "HVL1");

    }
}
