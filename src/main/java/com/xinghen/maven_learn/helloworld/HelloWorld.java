package com.xinghen.maven_learn.helloworld;

/**
 * Created by xinghen on 2017/3/17.
 */
public class HelloWorld {
    public String sayHello(){
       return "hello world!!";
    }

    public static void main(String[] args) {

        System.out.println(new HelloWorld().sayHello());

    }


}
