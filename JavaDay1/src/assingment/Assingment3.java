/**
 * 
 */
package assingment;

/**
 * @author W9KE7EK
 *
 */
public class Assingment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		boolean flag = true;
		for(int i=2; i<Math.sqrt(n)+1; i++) {
			if (n % i == 0){
				System.out.println(n+" is Prime");
				flag = false;
			    break;
			}
		}
		if (flag==true)
			System.out.println(n+" is not Prime.");
	}

}
