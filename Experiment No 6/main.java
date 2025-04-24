
import java.util.*;
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}
public class main {
    public static void main(String[] args) 
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number :");
	int num=sc.nextInt();
        try {
           	if(num%2!=0)
		{
			throw new OddNumberException("Entered Number is Odd.");
		}
		else
		{
			System.out.println("Exception is not Occur");
		}
  
        } catch (OddNumberException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}