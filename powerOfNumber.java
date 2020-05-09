/**
 * 
 */
package naveenAutomationPractice;

/**
 * @author sami
 *
 */
public class powerOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 3;
		int expo = 3;
		int result = 1;
		
		while(expo>0) {
			
			 result = result *num;
			--expo;
		}
		
		System.out.println(result);
		
		//System.out.println(Math.pow(num, 3));
	}

}
