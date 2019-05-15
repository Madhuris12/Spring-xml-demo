package com.stackroute.spring.beans;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class BeanLifeCycleDemo implements InitializingBean, DisposableBean  {

        public void destroy() throws Exception {
            System.out.println("Bean has been destroyed");
        }

        public void afterPropertiesSet() throws Exception {
            System.out.println("Bean has been initialised");
        }

    }
