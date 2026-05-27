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

        String[] validEmails = {

                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com"
        };

        String[] invalidEmails = {

                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"
        };

        System.out.println("VALID EMAILS");

        for(String email : validEmails) {

            System.out.println(
                    email + " -> "
                            + user.validateEmail(email)
            );
        }

        System.out.println();

        System.out.println("INVALID EMAILS");

        for(String email : invalidEmails) {

            System.out.println(
                    email + " -> "
                            + user.validateEmail(email)
            );
        }


        System.out.println("Enter the Mobile Number:");
        String phone=sc.nextLine();
        System.out.println("Valid Mobile Number:"+user.mobileValidation(phone));

        System.out.println("Enter Password:");
        String password=sc.nextLine();
        System.out.println("Valid password"+user.validatePassword(password));

    }
}