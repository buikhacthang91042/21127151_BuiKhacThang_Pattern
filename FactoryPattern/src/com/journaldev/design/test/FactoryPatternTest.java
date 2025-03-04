package com.journaldev.design.test;

import com.journaldev.design.factory.ComputerFactory;
import com.journaldev.design.model.Computer;

public class FactoryPatternTest {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC", "16GB", "1TB", "Intel i7");
        Computer server = ComputerFactory.getComputer("Server", "64GB", "4TB", "AMD EPYC");

        System.out.println("Factory PC Config:: " + pc);
        System.out.println("Factory Server Config:: " + server);
    }
}
