package com.journaldev.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;

        try {
            Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                // Cho phép truy cập constructor private
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Instance One HashCode: " + instanceOne.hashCode());
        System.out.println("Instance Two HashCode: " + instanceTwo.hashCode());
    }
}
