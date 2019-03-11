package se.jpdc.soapmanagement;

import java.util.List;

public class SoapsMain {
	
	public static void main (String [] args ) {
		
		HandSoapWeb service = new SOAPmanagementWebServiceImplementationService().getHandSoapWebPort();
		
		List<HandSoap> handSoaps = service.getAllSoaps();
		
		for (HandSoap h : handSoaps) {
			System.out.println(h.getName());
		}
		
		
//		HandSoap mySoap = new HandSoap();
//		mySoap.setBrand("Vioe");
//		mySoap.setName("Geiger");
//		mySoap.setPrice(3.75);
//		mySoap.setWeightInGrams(210);
//		
//		service.addNewSoap(mySoap);
		
		
		
		
		
	}

}
