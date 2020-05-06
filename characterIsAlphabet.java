/**
 * 
 */
package naveenAutomationPractice;

/**
 * @author sami
 *
 */
public class characterIsAlphabet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = '&';
		
		if((ch>='a' && ch <= 'z') || (ch>='A' && ch <= 'Z'))
		{
			
			System.out.println("its an alphabet");
		}
		else
		{
			System.out.println("not an alphabet");
		}
		

	}

}
