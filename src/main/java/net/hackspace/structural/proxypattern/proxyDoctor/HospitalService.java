package net.hackspace.structural.proxypattern.proxyDoctor;

public class HospitalService {

	public void callNurse() {
		System.out.println("Doing the basic check up and like BP, breathing etc");
	}

	public void generateSummaryRepor(){
		System.out.println("Call pathology and generate reports ");
	}
	
}
