package com.demowebshop.genericutilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class JavaUtility {
	public String getTimeStamp() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
		}
	public int getRandomNumber() {
//		Random random = new Random();
//		return random.nextInt(10000);
		return new Random().nextInt(10000);
	}
}
