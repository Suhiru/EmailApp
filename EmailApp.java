import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args){

    System.out.println("Hello,Welcome to Ecorp Email Management System");
    Scanner input=new Scanner(System.in);
    System.out.println("******************************");
    System.out.print("Please Enter your First Name: ");
    String firstName=input.next();
    System.out.println("******************************");


    System.out.println("******************************");
    System.out.print("Please Enter your Last Name: ");
    String lastName=input.next();
    System.out.println("******************************");

    Email obj=new Email(firstName,lastName);
    obj.menu();
    obj.showDetails();

    }



}
