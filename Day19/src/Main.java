import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Welcome to the user registration management");
        Scanner sc=new Scanner(System.in);
        UserRegistration user=new UserRegistration();
        System.out.println("Enter Password:");
        String password=sc.nextLine();
        System.out.println("Valid password"+user.validatePassword(password));

    }
}