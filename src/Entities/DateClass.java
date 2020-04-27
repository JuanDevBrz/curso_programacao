package Entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat fds1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat fds2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = fds1.parse("25/06/2018");
		Date y2 = fds2.parse("25/06/2018 15:42:07");
		
		Date x1 = new Date();
		
		System.out.println(fds2.format(x1));
		System.out.println(fds1.format(x1));
		System.out.println(fds1.format(y1));
		System.out.println(fds2.format(y2));
		
	}
}
