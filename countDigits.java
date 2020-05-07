/**
 * 
 */
package naveenAutomationPractice;

/**
 * @author sami
 *
 */
public class countDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234;
		int count = 0;
		
		for (int index = 1;num>0;++index) {
		
		num=num/10;
		count = index;
			}
		
		System.out.println(count);
		

	}
	

}
