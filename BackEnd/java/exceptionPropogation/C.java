package exceptionpropogation;

public class C {
     static void m()
     {
    	 System.out.println(10/0);
     }catch(ArithmeticException a)
     
     {
    System.out.println(a.getmessage());	 
     }
}
