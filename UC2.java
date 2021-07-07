package com.bl.programs;

import java.util.EmptyStackException;
import java.util.Stack;

public class UC2 {
	public static void main(String args[])   
	{  

	Stack <Integer> stk = new Stack<>();  
	System.out.println("stack: " + stk);  
	
	pushelmnt(stk, 70);  
	pushelmnt(stk, 30);  
	pushelmnt(stk, 56);  
	
	int top = stk.peek();
	System.out.println("Top of stack::" +top);
	
	popelmnt(stk);  
	popelmnt(stk);  
	
	 
	try   
	{  
	popelmnt(stk);  
	}   
	catch (EmptyStackException e)   
	{  
	System.out.println("empty stack");  
	}  
	}  
	
	@SuppressWarnings("removal")
	static void pushelmnt(Stack stk, int x)   
	{  
     
	stk.push(new Integer(x));  
	System.out.println("push -> " + x);  
	//prints modified stack  
	System.out.println("stack: " + stk);  
	}  

	static void popelmnt(Stack stk)   
	{  
	System.out.print("pop -> ");  
  
	Integer x = (Integer) stk.pop();  
	System.out.println(x);  

	System.out.println("stack: " + stk);  
	}  
}
