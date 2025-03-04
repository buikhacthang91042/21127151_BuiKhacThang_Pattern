package com.journaldev.singleton;

public class SingletonTest {
    public static void main(String[] args) {
       
        // EagerInitializedSingleton
        EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
        System.out.println(singleton);

        EagerInitializedSingleton singleton2 = EagerInitializedSingleton.getInstance();
        System.out.println(singleton2);

        System.out.println("Are both EagerInitializedSingleton instances same? " + (singleton == singleton2));

        // StaticBlockSingleton
        StaticBlockSingleton singleton1 = StaticBlockSingleton.getInstance();
        System.out.println(singleton1);

        StaticBlockSingleton singleton3 = StaticBlockSingleton.getInstance();
        System.out.println(singleton3);

        System.out.println("Are both StaticBlockSingleton instances same? " + (singleton1 == singleton3));
    }
}
