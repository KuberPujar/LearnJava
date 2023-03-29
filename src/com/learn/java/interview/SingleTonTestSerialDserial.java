package com.learn.java.interview;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingleTonTestSerialDserial {
	static DemoSingleton INSTANCE = DemoSingleton.getInstance();

	public static void main(String[] args) {

		try {
			// serialize to file
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
			out.writeObject(INSTANCE);
			out.close();
			INSTANCE.setNumber(20);

			// Deserialize from file
			ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
			DemoSingleton demo = (DemoSingleton) in.readObject();
			in.close();
			System.out.println(INSTANCE.getNumber());
			System.out.println(demo.getNumber());
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		catch(ClassNotFoundException eN)
		{
			System.out.println(eN.getLocalizedMessage());
		}
	}

}
