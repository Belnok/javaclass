//  we can use switch and string in java compiler 1.8 

public class SwicthandString {

	public static void main(String[] args) {
		
		String d = "pqr";
		
		switch (d)
		{
		case "abc": 
			System.out.println("one");
		
		break;
		
		case "pqr":
			System.out.println("two");
		
		break;
		
		default:
			System.out.println("No match");
		
		}
	}

}
