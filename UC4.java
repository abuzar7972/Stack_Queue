package com.bl.programs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UC4 {
	public static void main(String[] args)
    {
		Scanner scanner = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
       System.out.print("Enter size of que::");
       int size1 = scanner.nextInt();
       for (int i=0;i<size1;i++) {
    	   System.out.print("Enter elements of que::");
    	   int element = scanner.nextInt();
    	   q.add(element);
       }
        System.out.println("Elements of queue:: "
                           + q);
  
        int removedele = q.remove();
        System.out.println("removed element::" + removedele);
  
        System.out.println(q);
  
        int head = q.peek();
        System.out.println("head of queue::"
                           + head);
  
        int size = q.size();
        System.out.println("Size of queue::"
                           + size);
    }


}
