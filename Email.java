import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String department;
    private String alternateEmail;
    private String password;
    private String email;
    private String companyName="ecorp.com";
    private int defaultLength=10;
    private int mailBoxCapacity=500;

    //Constructor which takes two parameters
public Email(String firstName,String lastName){

    this.firstName=firstName;
    this.lastName=lastName;
    System.out.println("Hello "+firstName+" "+lastName+" ");
    this.department=setDepartment();
    this.password=randomPassword(defaultLength);
    System.out.println("-------------------------------");
    System.out.println("Your password is: "+password);
    email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companyName;
    System.out.println("Your Email address is: "+email);
    System.out.println("-------------------------------");
}

//This method will ask the user the department
private String setDepartment(){

    Scanner in=new Scanner(System.in);

    System.out.print("Please enter the department \n1 for sales \n2 for development \n3 for accounting: ");
    int input=in.nextInt();

    if(input==1){return "sales";}
    else if(input==2){return "dev";}
    else if(input==3){return "acc";}
    else{return "";}
}

//This method will generate a random password
private String randomPassword(int length){

    String characterSet="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ@#%!";
    char [] password=new char[length];
    for(int i=0;i<length;i++){

        int randNumber=(int)(Math.random()*characterSet.length());//wil generate a random number
        password[i]=characterSet.charAt(randNumber);
    }

    return new String(password);
}

//now we have to create setter methods to set the password,alternative email and the mailbox capacity
public void setPassword(String password){

    this.password=password;
}

public void setAlternateEmail(String alternateEmail){

    this.alternateEmail=alternateEmail;
}

public void setMailBoxCapacity(int mailBoxCapacity){

    this.mailBoxCapacity=mailBoxCapacity;
}

//below are the getters
public String getPassword(){
    return password;
}

public String getAlternateEmail(){
    return alternateEmail;
}

public int getMailBoxCapacity(){

    return mailBoxCapacity;
}

//showing the options to the user in order to pass values in to setter methods
public void menu(){

Scanner in=new Scanner(System.in);
int input;
    do {
        System.out.print("Please Follow the instructions\npress 1 to reset your password\npress 2 to create an alternative email address\npress 3 to set your mail box capacity\n press 0 to exit the Menu: ");
        input = in.nextInt();


        if(input==1){
            Scanner ps=new Scanner(System.in);
            System.out.println("please type a new password:");
            String password=ps.nextLine();
            setPassword(password);
            System.out.println("Saved new Password");


        }else if(input==2){
            Scanner em=new Scanner(System.in);
            System.out.println("please type a new email:");
            String alMail=em.nextLine();
            setAlternateEmail(alMail);
            System.out.println("Saved alternative email");


        }else if(input==3){
            Scanner cty=new Scanner(System.in);
            System.out.println("please type the capacity(mb): ");
            int cap=cty.nextInt();
            setMailBoxCapacity(cap);
            System.out.println("Capacity Changed");

        }else if(input==0){
            System.out.println("_____________________________");
            System.out.println("Thanks for using the System ");
            System.out.println("_____________________________");
        }

}while (input!=0);

}

//showing the final results
public void showDetails(){
    System.out.println("Welcome to the company "+"Mr."+firstName+" "+lastName);
    System.out.println("________________________________________________________");
    System.out.println("________________________________________________________");
   System.out.println("Your alternative email is : "+getAlternateEmail());
   System.out.println("Your mail box capacity is : "+getMailBoxCapacity()+"mb");
   System.out.println("Your password is : "+getPassword());
   System.out.println("________________________________________________________");
   System.out.println("________________________________________________________");

}

}
