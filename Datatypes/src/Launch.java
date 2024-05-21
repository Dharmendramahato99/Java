//Type Casting
/*public class Launch {

	public static void main(String[] args) {
	 double a = 10.0;
	 byte b;
	 b=(byte) a;
	 System.out.println(a);
	 System.out.println(b);

	}

}*/
//post increment vs post decrement
/*public class Launch {

	public static void main(String[] args) {
	 int a = 5;
	 int b = 0;
	 b = a++ + a++ + ++a + ++a;
	 System.out.println(a);
	 System.out.println(b);

	}

}*/

//Truncation
/*public class Launch {

	public static void main(String[] args) {
	 int a = 25;
	 int b = 2;
	 float c = a/b;
	 System.out.println(c);

	}

}*/

/*pattern

*
**
***
****
*****

*/
/*public class Launch {

	public static void main(String[] args) {
	   int n = 5;
	   for(int i = 0;i<n;i++) {
		    for(int j=0;j<=i;j++) {
			  System.out.print("*");
		    }
		    System.out.println();
		
	   }

	}

}*/
/*
*****
*   *
*   *
*   *
*****

*/

/*public class Launch {

	public static void main(String[] args) {
	   int n = 5;
	   for(int i = 0;i<n;i++) {
		    for(int j=0;j<n;j++) {
		    	if(i==0 || i==(n-1) || j==0 ||j==(n-1)) {
			       System.out.print("*");
		    	}
		    	else {
		    		System.out.print(" ");
		    	}
		    }
		    System.out.println();
		
	   }

	}

}*/
/*
*    *
*    *
******
*    *
*    *
*    *

*/

/*public class Launch {

	public static void main(String[] args) {
	   int n = 10;
	   for(int i = 0;i<n;i++) {
		    for(int j=0;j<n;j++) {
		    	if(i==(n-1)/2 ||j==0 ||j==(n-1)) {
			       System.out.print("*");
		    	}
		    	else {
		    		System.out.print(" ");
		    	}
		    }
		    System.out.println();
		
	   }

	}

}*/

/* 
 
 *****
 *   *
 *****
 *   *
 *   *
 
*/

/*public class Launch {

	public static void main(String[] args) {
	   int n = 10;
	   for(int i = 0;i<n;i++) {
		    for(int j=0;j<n;j++) {
		    	if(i==0 || i==(n-1)/2 || j==0 ||j==(n-1)) {
			       System.out.print("*");
		    	}
		    	else {
		    		System.out.print(" ");
		    	}
		    }
		    System.out.println();
		
	   }

	}

}*/

/* 
 
  ***
 *   *
 *****
 *   *
 *   *
 
*/

/*public class Launch {

	public static void main(String[] args) {
	   int n = 10;
	   for(int i = 0;i<n;i++) {
		    for(int j=0;j<n;j++) {
		    	if((i==0&&j!=0&&j!=(n-1)) || i==(n-1)/2 || (j==0&&i!=0) ||(j==(n-1)&&i!=0)) {
			       System.out.print("*");
		    	}
		    	else {
		    		System.out.print(" ");
		    	}
		    }
		    System.out.println();
		
	   }

	}

}*/

/*
 
 ****
 *    *
 *    *
 *    *
 ****
 
 */

/*public class Launch {

	public static void main(String[] args) {
	   int n = 10;
	   for(int i = 0;i<n;i++) {
		    for(int j=0;j<n;j++) {
		    	//if(j==0 || (i==0&&j!=(n-1)) ||(i==(n-1)&&j!=(n-1))|| (j==(n-1)&&i!=0&&i!=(n-1)))
		    	if(i==0&&j!=0&&j!=(n-1) || j==0&&i!=0 || j==(n-1)&&i!=0 || i==(n-1)/2)
		    	{
			       System.out.print("*");
		    	}
		    	else {
		    		System.out.print(" ");
		    	}
		    }
		    System.out.println();
		
	   }

	}

}*/


