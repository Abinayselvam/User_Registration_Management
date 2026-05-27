import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the user registration management");
        UserRegistration user=new UserRegistration();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Mobile Number:");
        String phone=sc.nextLine();
        System.out.println("Valid Mobile Number:"+user.mobileValidation(phone));
    }
}