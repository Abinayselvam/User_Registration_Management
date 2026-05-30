@FunctionalInterface
public interface UserValidation {
    boolean validate(String input)
        throws InvalidUserException;
}
