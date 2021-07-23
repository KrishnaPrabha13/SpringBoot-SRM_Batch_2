package com.org.collect;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main
{
	public static void main(String[] args)
	{
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("bean.xml");
		Demo d = (Demo)context.getBean("mycollection");
		System.out.println("List Items-----");
		List<String>list = d.getMyList();
		System.out.println(list);
		
		
		System.out.println("Set Item------");
        Set<String> set=d.getMySet();
        Iterator<String> itr= set.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
	}


}
