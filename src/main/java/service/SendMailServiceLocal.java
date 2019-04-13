package service;

import javax.ejb.Local;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

@Local
public interface SendMailServiceLocal {

	void send(String msgk) throws AddressException, MessagingException;

}
