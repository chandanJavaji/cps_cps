package com.sampleSpring.circularDI;

import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 * uk_vl commit
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
    	
    First f=	(First) beanFactory.getBean("first");
    f.test();
    	

    Second s=	(Second) beanFactory.getBean("secound");
   s.test();
   
   A a=	(A) beanFactory.getBean("a");
    }
}
