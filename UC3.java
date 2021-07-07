package com.bl.programs;

import java.util.LinkedList;
import java.util.Queue;

public class UC3 {
	public static void main(String[] args)
    {
        Queue<Integer> q
            = new LinkedList<>();
       
            q.add(56);
            q.add(30);
            q.add(70);
  
        System.out.println("Elements of queue "
                           + q);
  
        System.out.println(q);
  
        int head = q.peek();
        System.out.println("head of queue::"
                           + head);
  
        int size = q.size();
        System.out.println("Size of queue::"
                           + size);
    }

}
