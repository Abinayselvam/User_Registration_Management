import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to User Registration Management"
        );

        Scanner sc = new Scanner(System.in);

        UserRegistration user =
                new UserRegistration();

        try {

            System.out.println(
                    "Enter First Name:"
            );

            String firstName =
                    sc.nextLine();

            System.out.println(
                    "Valid First Name : "
                            + user.validateFirstName.validate(
                            firstName
                    )
            );


            System.out.println(
                    "Enter Last Name:"
            );

            String lastName =
                    sc.nextLine();

            System.out.println(
                    "Valid Last Name : "
                            + user.validateLastName.validate(
                            lastName
                    )
            );

        }

        catch (InvalidUserException e) {

            System.out.println(
                    e.getMessage()
            );
        }


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


        System.out.println(
                "\nVALID EMAILS"
        );

        for(String email : validEmails) {

            try {

                System.out.println(

                        email + " -> "

                                + user.validateEmail.validate(
                                email
                        )
                );
            }

            catch (InvalidUserException e) {

                System.out.println(

                        email + " -> "

                                + e.getMessage()
                );
            }
        }


        System.out.println(
                "\nINVALID EMAILS"
        );

        for(String email : invalidEmails) {

            try {

                System.out.println(

                        email + " -> "

                                + user.validateEmail.validate(
                                email
                        )
                );
            }

            catch (InvalidUserException e) {

                System.out.println(

                        email + " -> "

                                + e.getMessage()
                );
            }
        }


        try {

            System.out.println(
                    "\nEnter Mobile Number:"
            );

            String mobile =
                    sc.nextLine();

            System.out.println(

                    "Valid Mobile : "

                            + user.validateMobile.validate(
                            mobile
                    )
            );


            System.out.println(
                    "Enter Password:"
            );

            String password =
                    sc.nextLine();

            System.out.println(

                    "Valid Password : "

                            + user.validatePassword.validate(
                            password
                    )
            );

        }

        catch (InvalidUserException e) {

            System.out.println(
                    e.getMessage()
            );
        }

        sc.close();
    }
}