package com.tgt.igniteplus;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

   static void deliverability(int zipCode){
      Set<Integer> nonDeliverableZipCodes=new LinkedHashSet<>();
      nonDeliverableZipCodes.add(123);
      nonDeliverableZipCodes.add(456);
      nonDeliverableZipCodes.add(789);
      try {
         if(nonDeliverableZipCodes.contains(zipCode)) throw new MyException(String.format("Not yet delivering at " + zipCode));
         System.out.println("Delivery available in your area! ");
      } catch (MyException e) {
         System.out.println("Caught exception");
         System.out.println(e.getMessage());
      }


   }

   public static void main(String[] args){
      Scanner in =new Scanner(System.in);
      System.out.print("Enter zip code to check availability : ");
      int zipCode=in.nextInt();
      deliverability(zipCode);

   }
}
