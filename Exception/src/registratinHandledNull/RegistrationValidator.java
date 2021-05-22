package registratinHandledNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationValidator {
	private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,20}$";
	
	public boolean registrationFirstName(String FirstName) throws RegiatrationValidatorException {
		Pattern p = Pattern.compile(FIRST_NAME_PATTERN) ;
		try {
		
		if (FirstName == null) 
	        return  (Boolean) null;	    	
		Matcher m = p.matcher(FIRST_NAME_PATTERN); 
		return true;
		
		} catch (NullPointerException e) {
	    	throw new RegiatrationValidatorException ("Enter a proper Name") ; 
	    }
      
		}
	}
