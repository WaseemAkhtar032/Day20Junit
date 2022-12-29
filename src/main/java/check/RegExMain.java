package check;

import java.util.regex.Pattern;

@FunctionalInterface
interface Validation
{
    boolean validate(String object) throws InvalidUserDetailsException;
}

public class RegExMain {
    public String firstName = "Wasee";
    public String lastName = "Ansari";
    public String emailId = "wasee@gmail.com";
    public String phoneNo = "+91 7020302004";
    public String password = "waseem@123";

    public boolean validateName(String name) throws InvalidUserDetailsException {

        String regex = "[A-Z][a-z]{3,}";
        Validation Name = (obj) -> (Pattern.compile(regex).matcher(name).matches());
        return Name.validate(name);
    }

    public boolean validateEmail(String email) throws InvalidUserDetailsException {

        String regex = "^[a-z0-9+_.-]+@+[a-z]+.+[a-z]+.+[a-z]$";
        Validation Email = (obj) -> (Pattern.compile(regex).matcher(email).matches());
        return Email.validate(email);
    }

    public boolean validatePhoneNo(String mobNo) throws InvalidUserDetailsException {
        String regex = "^\\++[91]+\\s+[789]\\d{9}$";
        Validation Mob = (obj) -> (Pattern.compile(regex).matcher(mobNo).matches());
        return Mob.validate(mobNo);
    }

    public boolean validatePassword(String password) throws InvalidUserDetailsException {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        Validation Password = (obj) -> (Pattern.compile(regex).matcher(password).matches());
        return Password.validate(password);
    }
}