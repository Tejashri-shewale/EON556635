package controls;

import java.util.Scanner;

public class SwitchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new  Scanner(System.in);
		 //int day;
		
		System.out.println("entre number  ");
		int day=s.nextInt();
		 switch(day)
		 {
		 case 0:
			 System.out.println("sunday");
		 break;
		 
		 case 1:
			 System.out.println("monday");
		 break;
		 
		 case 2:
			 System.out.println("tuesday");
		 break;
		 
		 case 3:
			 System.out.println("wed");
		 break;
		 
		 case 4:
			 System.out.println("thu");
		 break;
		 
		 case 5:
			 System.out.println("fri");
		 break;
		
		 
		 default:
			 
			 System.out.println("Wrong");
		 break;
	}

}
}
