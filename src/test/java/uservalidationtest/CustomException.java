package uservalidationtest;

import check.InvalidUserDetailsException;
import check.UserRegistrationJUnit;
import check.InvalidUserDetailsException;
import check.UserRegistrationJUnit;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CustomException {

    UserRegistrationJUnit obj = new UserRegistrationJUnit();

    @Test
    @Order (1)
    public void validateFirstNameTest() {
        try
        {
            boolean result = obj.validateName("Soumya123");
            if (!result)
            {
                throw new InvalidUserDetailsException("Invalid First Name");
            }
            else
            {
                System.out.println("Given First name is valid");
            }
        }
        catch (InvalidUserDetailsException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    @Order (2)
    public void validateLastNameTest() {
        try
        {
            boolean result = obj.validateName("Ranjan123");
            if (!result)
            {
                throw new InvalidUserDetailsException("Invalid Last Name");
            }
            else
            {
                System.out.println("Given Last name is valid");
            }
        }
        catch (InvalidUserDetailsException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    @Order (3)
    public void validateEmailTest() {
        try
        {
            boolean result = obj.validateEmail("soumyars675");
            if (!result)
            {
                throw new InvalidUserDetailsException("Invalid Email id");
            }
            else
            {
                System.out.println("Given Email id is valid");
            }
        }
        catch (InvalidUserDetailsException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    @Order (4)
    public void validateMobileNoTest() {
        try
        {
            boolean result = obj.validatePhoneNo("+91 89086418112");
            if (!result)
            {
                throw new InvalidUserDetailsException("Invalid Phone no");
            }
            else
            {
                System.out.println("Given Mobile no is valid");
            }
        }
        catch (InvalidUserDetailsException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    @Order (5)
    public void validatePasswordTest() {
        try
        {
            boolean result = obj.validatePassword("soumya");
            if (!result)
            {
                throw new InvalidUserDetailsException("Invalid Password");
            }
            else
            {
                System.out.println("Given Password is valid");
            }
        }
        catch (InvalidUserDetailsException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
