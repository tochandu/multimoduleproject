package captemplate.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility classes.
 * @author Vinay Kureel
 */

public class Utils {

    public String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    /**
     * Validate ZipCode standards before sending it to ECPR.
     * @param zipCode 5 digits only
     * @return String value.
     */
    public static boolean isValidateZipCode(String zipCode) {
        boolean status = false;
        //String zip = unFormattedValue(zipCode);
        if (zipCode != null) {
            String regex = "^[0-9]{5}";

            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(zipCode);
            if (matcher.matches()) {
                status = true;
            }
        }

        return status;
    }

    /**
     * isValidEmailAddress: Validate Email using Java reg ex.
     * @param emailAddress String validate Email
     * @return boolean: true if Email is valid, false otherwise.
     */
    public static boolean isValidEmailAddress(String emailAddress) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        Pattern pattern = Pattern.compile(ePattern);
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.matches();
    }


}
