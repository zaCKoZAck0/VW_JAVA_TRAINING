package exceptionhandling;


//this is uncjecked exception  so compiler does npt mandate you to handle the exception
public class ExceptionEx {
	
	
	public static void main(String[] args)
	{
		String s=null; // =  "namrata";
		
		
		System.out.println("program execution strarted..");
		
		//if(s!=null)
		  s.toLowerCase();
		
		System.out.println("remaining program executes..");
	}

}