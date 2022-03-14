package Demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailId {

    public boolean emailIdValidate(String emailId) {
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();
    }
}