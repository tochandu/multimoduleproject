package captemplate.common;


/**
 * Constant classe.
 * @author Vinay Kureel
 */
public final class Constant {

  // ERROR Messages
  public final static String ERROR_MSG_INVALID_DATA = "Invalid Data : ";
  public final static String ERROR_MSG_MISSING_DATA = "Missing Data : ";
  public final static String ERROR_MSG_INTERNAL_SERVER = "Internal Error : ";
  public final static String ERROR_MSG_COMM_SERVER = "Communication Error : ";
  public final static String ERROR_MSG_BACKEND_SERVER = "Backend Server Error : Could not connect to datasource";

  // Microservice ERROR CODES
  public final static String CODE_INVALID_DATA = "invalidData";
  public final static String CODE_MISSING_DATA = "missingData";
  public final static String MISSING = "Missing";
  public final static String VERIFY_PERSON = "VERIFYPERSON";

  public final static String ERROR_INVALID_ZIP_CODE = "ZipCode, please correct and retry";
  public final static String ERROR_INVALID_EMAIL_ID = "EmailAddress, please correct and retry";
  public final static String ERROR_MISSING_NAME = "Either First Name Or Last Name is required, "
                                                  + "please correct and retry";
  public final static String ERROR_MISSING_REQUEST_DATA = "Request Data, please provide and retry";
  public final static String ERROR_MISSING_INDIVIDUAL_NAME = "individualName block, please provide and retry";
  public final static String ERROR_PRIMARY_PHONE = "Phone number list must have 1 Primary Phone number, "
                                                           + "please provide and retry";
  public final static String ERROR_MISSING_PHONE_PREFERENCE = "Phone number must have Phone preference, "
                                                              + "please correct and retry";
}
