
public class Calculator {
	/**
	 * This is the method just prints calculator project.
	 * @param args
	 */
	public static void main(String args[]){
		System.out.println("This is calculator project" +args[0]+"  "+args[1] );
		printMe();
		//control + space
		System.out.println(returnYourName());
		System.out.println(System.currentTimeMillis());
		System.out.println();//Sysout + ctrl + space
		System.out.println("Calculator.main()");//Systrace + ctrl + space
		
	}
	/*
	 * This is test method
	 */
	public static void printMe()
	{
		System.out.println("PrintMe" +"  "+returnYourName());
	}
	public  static String  returnYourName()
	{
		return "Nirmala";
		
	}

}
