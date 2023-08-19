package net.hackspace.structural.proxypattern.proxyDoctor;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ClientForProxyDoctor {

	public static void main(String[] args) {

		System.out.println("Welcome to Proxy Doctor Hospital ");

		Doctor doctor = new ProxyDoctor();
		Scanner scan = new Scanner(System.in);
		String repeat = "yes";
		while (repeat.equalsIgnoreCase("yes") || repeat.equalsIgnoreCase("ya")) {
			System.out.println("What do you want from doctor ");
			System.out.println(" Press 1 for general checkup");
			System.out.println(" Press 2 for surgery and operation ");
			System.out.println(" Press 3 for testing report and surgery ");

			int type = scan.nextInt();

			switch (type) {
			case 1:
				doctor.doGeneralCheckup();
				break;
			case 2:
				doctor.doOperationAndSurgery();
				break;
			case 3:
				doctor.provideSummaryandReport();
				break;
			}
			
			System.out.println("=============================");

			System.out.println("Repeat (yes/no): ");
			try {
				// https://www.baeldung.com/regular-expressions-java
				repeat = scan.next(Pattern.compile("([Yy][Ee][Ss])|([Yy][Aa])|([Nn][Oo])|([Nn][Aa])"));
				System.out.println("Scanned repeat value " + repeat);
			} catch (Exception e) {
				repeat = "no";
			}

		}
	}
}
