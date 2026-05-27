import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the user registration management");
        UserRegistration user=new UserRegistration();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lastName");
        String lastName=sc.nextLine();
        System.out.println("Valid LastName:"+user.lastNameValidation(lastName));
    }
}