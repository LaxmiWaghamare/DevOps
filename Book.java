//Default Constructor
import java.util.*;
class Book
       {
        	int book_id;
		String book_name;
		Float price;
		Book()
         {
		Scanner sc=new Scanner(System.in);
            System.out.println("Enter Book Id:");
		book_id=sc.nextInt();
		System.out.println("Enter Book Name:");
		book_name=sc.next();
            System.out.println("Enter Book Price:");
		price=sc.nextFloat();
		
         }
		void display()
        {
		System.out.println("*********************************");
 		System.out.println("Book Id="+book_id);
		System.out.println("Book Name="+book_name);
            System.out.println("Book Price="+price);
		System.out.println("*********************************");
       
	  }
		public static void main(String args[])
	 {
 		Book b1=new Book();
            b1.display();
       }


     }
	 


