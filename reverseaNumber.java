/**
 * 
 */
package naveenAutomationPractice;

/**
 * @author sami
 *
 */
public class reverseaNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		System.out.println(reverse);
//		System.out.println(rem);
		int num = 1234;
//		
		int reverse = 0;
//		int rem=num;
//		
//		num = num%10;
//		rem = rem/10;
//		
//		reverse = reverse +num;
		
		while(num!=0) {
			int n = num%10;
			reverse= reverse*10+n;
			num=num/10;
			
			
			
			
			
		}
		System.out.println(reverse);

	}

}
