import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the user registration management");
        Scanner sc=new Scanner(System.in);
        UserRegistration user=new UserRegistration();
        System.out.println("Enter the firstName:");
        String firstName=sc.nextLine();
        System.out.println("Valid FirstName:"+user.validateFirstName(firstName));

        System.out.println("Enter the lastName");
        String lastName=sc.nextLine();
        System.out.println("Valid LastName:"+user.lastNameValidation(lastName));

        System.out.println("Enter the email");
        String email=sc.nextLine();
        System.out.println("Valid email:"+user.mailValidation(email));

        System.out.println("Enter the Mobile Number:");
        String phone=sc.nextLine();
        System.out.println("Valid Mobile Number:"+user.mobileValidation(phone));

        System.out.println("Enter Password:");
        String password=sc.nextLine();
        System.out.println("Valid password"+user.validatePassword(password));

    }
}