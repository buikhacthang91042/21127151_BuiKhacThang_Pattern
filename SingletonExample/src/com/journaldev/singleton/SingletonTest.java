package com.journaldev.singleton;

public class SingletonTest {
    public static void main(String[] args) {
       
        EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
        
        
        System.out.println(singleton);

      
        EagerInitializedSingleton singleton2 = EagerInitializedSingleton.getInstance();
        System.out.println(singleton2);

    
        System.out.println("Are both instances same? " + (singleton == singleton2));
    }
}
