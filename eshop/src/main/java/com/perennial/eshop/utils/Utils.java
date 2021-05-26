package com.perennial.eshop.utils;

import java.util.Random;

public class Utils {

	public static long idGenerator() {
		return new Random().nextInt();
	}
}
