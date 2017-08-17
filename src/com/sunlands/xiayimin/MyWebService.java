package com.sunlands.xiayimin;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by sunlandsxym on 2017/8/17.
 */
@WebService
public class MyWebService {

    public String sayHello(String name) {
        return name + " 你好！";
    }


    public static void main(String[] args){
        String address = "http://172.16.103.189:9999/ws";
        String address2 = "http://172.16.103.189:9999/ws2";

        Endpoint.publish(address, new MyWebService());
        Endpoint.publish(address2, new MyWebService());

        System.out.println("访问WSDL的地址为：" + address + "?WSDL");
        System.out.println("访问WSDL的地址为：" + address2 + "?WSDL");
    }
}
