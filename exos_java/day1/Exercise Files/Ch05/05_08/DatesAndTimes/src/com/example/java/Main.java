package com.example.java;

import java.lang.reflect.GenericArrayType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {

		/*Date d1 = new Date();
		System.out.println(d1);

		GregorianCalendar gc = new GregorianCalendar(2020, 11, 23);
		gc.add(GregorianCalendar.DATE, 1);
		Date d2 = gc.getTime();
		System.out.println(d2);

		// DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss SS");
		System.out.println(df.format(d1));*/

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		LocalDate ld = LocalDate.of(2020, 11, 23);
		System.out.println(ld);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dtf.format(ld));



	}

}
