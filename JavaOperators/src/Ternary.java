
/*
 Java ternary operator is the only conditional operator that takes three operands. 
 Java ternary operator is a one liner replacement for if-then-else statement and used a lot in java programming. 
 We can use ternary operator to replace switch also as shown in below example.
The first operand in java ternary operator should be a boolean or a statement with boolean result.
 If the first operand is true then java ternary operator returns second operand else it returns third operand.

Syntax of java ternary operator is:

result = testStatement ? value1 : value2; */


public class Ternary {


  
    public static void main(String[] args) {
         
        System.out.println(getMinValue(4,10));
         
        System.out.println(getAbsoluteValue(-10));
         
        System.out.println(invertBoolean(true));
         
        String str = "Australia";
        String data = str.contains("A") ? "Str contains 'A'" : "Str doesn't contains 'A'";
        System.out.println(data);
        
        int i = 10;
        switch (i){
        case 5: 
        	System.out.println("i=5");
        	break;
        case 10:
        	System.out.println("i=10");
        	break;
        default:
        	System.out.println("i is not equal to 5 or 10");
        }
        
        System.out.println((i==5) ? "i=5":((i==10) ? "i=10":"i is not equal to 5 or 10"));
    }
 
    private static boolean invertBoolean(boolean b) {
        return b ? false:true;
    }
 
    private static int getAbsoluteValue(int i) {
        return i<0 ? -i:i;
    }
 
    private static int getMinValue(int i, int j) {
        return (i<j) ? i : j;
    
}

}

/*As you can see that we are using java ternary operator to avoid if-then-else and switch case statements.
 *  This way we are reducing the number of lines of code in java program.
 *  That’s all for a quick roundup of ternary operator in java.*/
