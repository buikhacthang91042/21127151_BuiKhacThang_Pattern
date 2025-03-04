package com.journaldev.singleton;

public class SingletonTest {
    public static void main(String[] args) {
       
        // EagerInitializedSingleton
        EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
        System.out.println(singleton);

        // StaticBlockSingleton
        StaticBlockSingleton staticSingleton1 = StaticBlockSingleton.getInstance();
        System.out.println(staticSingleton1);

        // LazyInitializedSingleton
        LazyInitializedSingleton lazySingleton1 = LazyInitializedSingleton.getInstance();
        System.out.println(lazySingleton1);

        // ThreadSafeSingleton (synchronized method)
        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        System.out.println(threadSafeSingleton1);

        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();
        System.out.println(threadSafeSingleton2);

        System.out.println("Are both ThreadSafeSingleton instances same? " + (threadSafeSingleton1 == threadSafeSingleton2));

        // ThreadSafeSingleton using double checked locking
        ThreadSafeSingleton threadSafeSingleton3 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        System.out.println(threadSafeSingleton3);

        System.out.println("Are both ThreadSafeSingleton (double checked locking) instances same? " + (threadSafeSingleton1 == threadSafeSingleton3));
    

        // Bill Pugh Singleton
        BillPughSingletonImplementation billPughSingleton1 = BillPughSingletonImplementation.getInstance();
        System.out.println(billPughSingleton1);

        BillPughSingletonImplementation billPughSingleton2 = BillPughSingletonImplementation.getInstance();
        System.out.println(billPughSingleton2);

        System.out.println("Are both BillPughSingleton instances same? " + (billPughSingleton1 == billPughSingleton2));
    }
}
