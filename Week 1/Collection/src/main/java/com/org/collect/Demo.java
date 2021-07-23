package com.org.collect;
import java.util.List;
import java.util.Set;

public class Demo 
{

	private List<String>myList;
	private Set<String>mySet;		
	private List<Book>bookList;

	public Demo() {}
	public Demo(List<String>myList,Set<String>mySet)
	{
		this.myList=myList;
		this.mySet=mySet;
	}
		
	public List<String> getMyList()
	{
		return myList;
	}
		
	public Set<String> getMySet()
	{
		return mySet;
	}
		
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList)	
	{
		this.bookList = bookList;
	}
}
