package test_ng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Session_31_Parameter_demo {
	
	@Test
	@Parameters({"i","j"})
	public void add(int a,int b) {
		System.out.println("addition" + (a+b));
	}

    @Test
    @Parameters({"i","j"})
	public void sub(int a,int b) {
		System.out.println("subtarction" + (a-b));
	}
	
    @Test
    @Parameters({"i","j"})
	public void mul(int a,int b) {
		System.out.println("multiplay" + (a*b));
	}
	
}

