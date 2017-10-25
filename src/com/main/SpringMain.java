/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.main;

import com.spr.MyMessage;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author vi391762
 */
public class SpringMain {
    public static void main(String[] args){
    ApplicationContext context=new ClassPathXmlApplicationContext("newSpringXMLConfig.xml");
    MyMessage msg=(MyMessage)context.getBean("id1");
    MyMessage msg1=(MyMessage)context.getBean("id2");
    System.out.println("Message from Spring bean 1:"+msg.getMessage());
    System.out.println("Message from Spring bean 2:"+msg1.getMessage());
    }
}
