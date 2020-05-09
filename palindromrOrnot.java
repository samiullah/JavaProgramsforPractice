/**
 * 
 */
package naveenAutomationPractice;

/**
 * @author sami
 *
 */
public class palindromrOrnot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1221;
		int reverse = 0;
		int originalNum = num;
		
		while(num!=0) {
			
			int n =num%10;
			reverse = reverse*10+n;
			num = num/10;
					
		}
		System.out.println(reverse);
		
		if(originalNum == reverse) {
			System.out.println("number is palindromw");
		}
		
		else {
			System.out.println("number is not palindrome");
		}

	}

}
