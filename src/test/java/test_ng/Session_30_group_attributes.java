package test_ng;

import org.testng.annotations.Test;

public class Session_30_group_attributes {

	@Test(groups ="sofware company")
	public void infosys() {
		System.out.println("infosys");

	}

	@Test(groups ="sofware company")
	public void wipro() {
		System.out.println("wipro");

	}
	
	@Test(groups ="automobile company")
	public void tata() {
		System.out.println("tata");

	}

	@Test(groups ="automobile company")
	public void maruti() {
		System.out.println("maruti");

	}

}
