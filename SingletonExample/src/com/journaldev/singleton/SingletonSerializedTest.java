package com.journaldev.singleton;

import java.io.*;

public class SingletonSerializedTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializedSingleton instanceOne = SerializedSingleton.getInstance();

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(instanceOne);
		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
		in.close();

		System.out.println("instanceOne hashCode = " + instanceOne.hashCode());
		System.out.println("instanceTwo hashCode = " + instanceTwo.hashCode());

		System.out.println("Are both instances same? " + (instanceOne == instanceTwo));
	}
}
