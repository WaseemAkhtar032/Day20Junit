package uservalidationtest;

import org.junit.Assert;
import org.junit.Test;
import check.UserRegistrationJUnit;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

public class UserRegistrationJUniTest {

    UserRegistrationJUnit obj = new UserRegistrationJUnit();

    List<String> emailList = new ArrayList<>();

    @Test
    public void validateFirstNameTest() {
        System.out.println("Valid first name of user");
        String firstName = "Wasee";
        Assert.assertTrue(obj.validateName(firstName));
    }


    @Test
    public void validateFirstNameLessThanThreeShouldFail() {
        System.out.println("Invalid first name of user which having only three characters");
        String firstName = "Was";
        Assert.assertFalse(obj.validateName(firstName));
    }

    @Test
    public void validateLastNameTest() {
        System.out.println("Valid last name of user");
        String lastName = "Ansari";
        Assert.assertTrue(obj.validateName(lastName));
    }


    @Test
    public void validateLastNameLessThanThreeShouldFail() {
        System.out.println("Invalid last name of user which having only three characters");
        String lastName = "ans";
        Assert.assertFalse(obj.validateName(lastName));
    }

    @Test
    public void validateEmailTest() {
        System.out.println("Valid email id ");
        String emailId = "waseemakhtar032@gmail.com";
        Assert.assertTrue(obj.validateEmail(emailId));
    }

    @Test
    public void validateEmailWithoutDomainShouldFail() {
        System.out.println("Invalid email id ");
        String emailId = "waseemakh";
        Assert.assertFalse(obj.validateEmail(emailId));
    }

    @Test
    public void validateEmailWithStartingFirstLetterCapitalShouldFail() {
        System.out.println("Invalid email id ");
        String emailId = "Waseemakhtar032@gmail.com";
        Assert.assertFalse(obj.validateEmail(emailId));
    }

    @Test
    public void validateMobileNoTest() {
        System.out.println("Valid mobile number");
        String phoneNo = "+91 8237791113";
        Assert.assertTrue(obj.validatePhoneNo(phoneNo));
    }

    @Test
    public void validateMobileNoWithoutCountryCodeShouldFail() {
        System.out.println("Invalid mobile number");
        String phoneNo = "8237791113";
        Assert.assertFalse(obj.validatePhoneNo(phoneNo));
    }

    @Test
    public void validateMobileNoWithoutProperSimCodeShouldFail() {
        System.out.println("Invalid mobile number ");
        String phoneNo = "+91 6578641811";
        Assert.assertFalse(obj.validatePhoneNo(phoneNo));
    }

    @Test
    public void validateInvalidMobileNoShouldFail() {
        System.out.println("Invalid mobile number");
        String phoneNo = "+91 7020302004";
        Assert.assertFalse(obj.validatePhoneNo(phoneNo));
    }

    @Test
    public void validatePasswordTest() {
        System.out.println("Valid password");
        String password = "Wasee117@";
        Assert.assertTrue(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordLimitLowerThanEightCharactersShouldFail() {
        System.out.println("Invalid password ");
        String password = "Wasee@";
        Assert.assertFalse(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordTestLimitGreaterThanTwentyCharactersShouldFail() {
        System.out.println("Invalid password ");
        String password = "Wasee117jhajshj";
        Assert.assertFalse(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordWithoutUpperCaseShouldFail() {
        System.out.println("Invalid password ");
        String password = "wasee117@";
        Assert.assertFalse(obj.validatePassword(password));
    }

    @Test
    public void validateSampleEmailTest() {
        System.out.println("Validate some sample email");
        emailList.add("abc@yahoo.com");
        emailList.add("abc-100@yahoo.com");
        emailList.add("abc111@abc.com");
        emailList.add("abc.100@yahoo.com");
        emailList.add("abc-100@abc.net");
        emailList.add("abc.100@abc.com.au");
        emailList.add("abc@1.com");
        emailList.add("abc@gmail.com.com");
        emailList.add("abc+100@gmail.com");
        for (int i = 0; i < emailList.size(); i++)
        {
            try
            {
                Assert.assertTrue(obj.validateEmail(emailList.get(i)));
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                emailList.remove(i);
            }
        }
    }
}
