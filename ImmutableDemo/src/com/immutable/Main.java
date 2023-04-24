package com.immutable;
public class Main {
  public static void main(String[] args) {

    // create object of Immutable
    Immutable obj = new Immutable("Programiz", 2011);

    System.out.println("Name: " + obj.getName());
    System.out.println("Date: " + obj.getDate());
    
    
    //Immutable if final we cant Extend it
    //Name and Data cant be changed , not even by calling CONST ,kyu ki const ek hi baar call hota hai
    //variable private bhi hai 
    //and data members  private hai , you cant even think of chamging
  }
}
