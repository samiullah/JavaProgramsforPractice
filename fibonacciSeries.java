/**
 * 
 */
package naveenAutomationPractice;

/**
 * @author sami
 *
 */
public class fibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 20;
		
		int t1=0;
		int t2=1;
		
		for (int i =1;i<=num;i++) {
			System.out.println(t1);
			
			int sum = t1+t2;
			
			t1=t2;
			t2 = sum;
			
					
		}

	}

}
