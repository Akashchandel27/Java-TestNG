package java_file;

public class Arrays {

	public static void main(String[] args) {
		
		//initalize the array
		int roll_no [] = new int [5];
		
		// insert the value in the array
		roll_no[0]=10;
		roll_no[1]=0;
		roll_no[2]=12;
		roll_no[3]=14;
        roll_no[4]=14;
		
        // print the size of the array
		System.out.println(roll_no.length);
		
		// the the particular array 
		System.out.println("value of 4th element" +roll_no[3]);
		
		
		// print all the value of the array
		for(int i=0; i<roll_no.length; i++) {
			System.out.println(roll_no[i]);
		}
		

		
	}

}
