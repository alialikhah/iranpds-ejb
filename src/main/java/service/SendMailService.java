package service;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Session Bean implementation class SendMailService
 */
@Stateless
public class SendMailService implements SendMailServiceLocal {

    /**
     * Default constructor. 
     */
    public SendMailService() {
        // TODO Auto-generated constructor stub
    }
    
    @Resource(name = "java:jboss/mail/Default")
    private Session sessionSend;
    
    @Override
    public void send(String msgk) throws AddressException, MessagingException {
        Message message = new MimeMessage(sessionSend);
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("naghian@iranpds.com"));
        message.setSubject("عضویت خوب رانان");
        
        
/*        String msg="<h1>SALAM</h1><br/>";
        msg+="<input type='button' value='aliam'/><br/>";
        msg+="<h2>bye</h2>";*/
        message.setContent(msgk,"text/html; charset=UTF-8");
        Transport.send(message);
        System.err.println("****************************************************************");
}
    
}
