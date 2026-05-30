public class UserRegistration {

    UserValidation validateFirstName =
            (firstName) -> {

                String pattern =
                        "^[A-Z][a-z]{2,}$";

                if(firstName.matches(pattern))

                    return true;

                throw new InvalidUserException(

                        InvalidUserException
                                .exceptionType
                                .Invalid_FirstName,

                        "Invalid First Name"
                );
            };



    UserValidation validateLastName =
            (lastName) -> {

                String pattern =
                        "^[A-Z][a-z]{2,}$";

                if(lastName.matches(pattern))

                    return true;

                throw new InvalidUserException(

                        InvalidUserException
                                .exceptionType
                                .Invalid_LastName,

                        "Invalid Last Name"
                );
            };



    UserValidation validateEmail =
            (email) -> {

                String pattern =
                        "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$";

                if(email.matches(pattern))

                    return true;

                throw new InvalidUserException(

                        InvalidUserException
                                .exceptionType
                                .Invalid_Email,

                        "Invalid Email"
                );
            };



    UserValidation validateMobile =
            (mobile) -> {

                String pattern =
                        "^[0-9]{2}\\s[0-9]{10}$";

                if(mobile.matches(pattern))

                    return true;

                throw new InvalidUserException(

                        InvalidUserException
                                .exceptionType
                                .Invalid_Email,

                        "Invalid Mobile"
                );
            };



    UserValidation validatePassword =
            (password) -> {

                String pattern =
                        "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*!]*[@#$%^&*!][^@#$%^&*!]*$).{8,}$";

                if(password.matches(pattern))

                    return true;

                throw new InvalidUserException(

                        InvalidUserException
                                .exceptionType
                                .Invalid_Password,

                        "Invalid Password"
                );
            };


}