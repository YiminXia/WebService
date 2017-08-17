package com.sunlands.xiayimin;
import com.sunlands.xiayimin.API.*;
/**
 * Created by sunlandsxym on 2017/8/17.
 */
public class _Main {
    public static void main(String[] args){
        HelloWorldService service = new HelloWorldService();
        HelloWorld port = service.getHelloWorldPort();
        System.out.println(port.sayHello("你好啊"));
    }


}
