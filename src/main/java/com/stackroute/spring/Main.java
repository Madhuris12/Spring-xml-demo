package com.stackroute.spring;

import com.stackroute.spring.beans.Actor;
import com.stackroute.spring.beans.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.beans.beancontext.BeanContext;



public class Main {
        public static void main(String[] args) {


            ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
            Movie movie = (Movie) context.getBean("movie");

            // singleton scope (default) returns true, 'prototype' returns false

            System.out.println(movie.welcomeMsg()+"\nMovie name : "+movie.getMovieName()+"\nActor Name : "+movie.getActorNAme()+"\nGenre : "+movie.getGenre());

            Actor actor = (Actor) context.getBean("actor");


            // singleton scope (default) returns true, 'prototype' returns false



            System.out.println("\nActor name : "+actor.getName()+"\ngender : "+actor.getGender()+"\n age :"+actor.getAge());
        }
    }
