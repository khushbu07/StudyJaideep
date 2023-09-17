package Selenium.Zz_SeleniumBasics;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Topic_SendEmail {

	public static void main(String[] args) throws EmailException {
		
		System.out.println("Test Started");
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("jaideepchoudhary89", "ABC"));
		email.setSSLOnConnect(true);
		email.setFrom("jaideepchoudhary89@gmail.com");
		email.setSubject("Test Selenium");
		email.setMsg("This is my message!");
		email.addTo("jaideepchoudhary@yahoo.com");
		email.send();
		
		System.out.println("Test Ended");
	}

}
