package org.rose.generator;

import java.util.UUID;

public class IDGenerator {
	public static String generateId() {
		return UUID.randomUUID().toString();//.replace("-", "");
	}
}
