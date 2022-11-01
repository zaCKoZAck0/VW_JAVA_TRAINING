/**
 * 
 */
package assingment;

/**
 * @author W9KE7EK
 *
 */
public class Assingment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenSum = 0;
		int oddSum = 0;
		for (int i=1; i<=10; i++) {
			if (i%2==1) {
				System.out.println(i+" is Odd.");
				oddSum+=i;
			}
			if (i%2==0) {
				System.out.println(i+" is Even.");
				evenSum+=i;
			}
		}
		
		System.out.println("Sum of all Even = "+evenSum);
		System.out.println("Sum of all Odd = "+oddSum);
	}

}
