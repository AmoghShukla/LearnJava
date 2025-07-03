package Random;
import java.util.*;

public class Anagram_check {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Input 1 : ");
    String x = sc.next();

    System.out.println("Input 2 : ");
    String y = sc.next();

    if (x.length() != y.length())
    	System.out.println("Length not same so : Not Anagram");
    else if (AnagramCheck(x, y))
        System.out.println("It's an Anagram ");
    else
        System.out.println("It's not an anagram ");

    sc.close();
	}
	
	
	static boolean AnagramCheck(String x, String y) {
		
		char[] one = x.toLowerCase().toCharArray();
        char[] two = y.toLowerCase().toCharArray();
        
        Arrays.sort(one);
        Arrays.sort(two);
        
        return Arrays.equals(one, two);
		
	}

}


