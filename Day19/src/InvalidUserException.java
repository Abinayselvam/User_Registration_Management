public class InvalidUserException extends Exception {

    public enum exceptionType
    {
        Invalid_FirstName,
        Invalid_LastName,
        Invalid_Mobile,
        Invalid_Email,
        Invalid_Password
    }
    exceptionType type;

    public InvalidUserException(exceptionType type,String message)
    {
        this.type=type;
        super(message);
    }

}
