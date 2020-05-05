/**
 * 
 */
package naveenAutomationPractice;

/**
 * @author sami
 *
 */
public class addTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		addTwoNumbers obj = new addTwoNumbers();
		int sum = obj.addTwoNumbers(11, 12);
		System.out.println(sum);

	}

	public int addTwoNumbers(int x, int y) {

		int z = x + y;
		return z;
	}

}
