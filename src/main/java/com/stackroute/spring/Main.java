package com.stackroute.spring;

import com.stackroute.spring.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
        public static void main(String[] args) {
            ApplicationContext applicationContext3=new ClassPathXmlApplicationContext("beans.xml");


            Movie movie=(Movie)applicationContext3.getBean("movie4");

            System.out.println(movie.toString());

            Movie movie1=(Movie)applicationContext3.getBean("movie5");
            System.out.println(movie1.toString());


        }
}
