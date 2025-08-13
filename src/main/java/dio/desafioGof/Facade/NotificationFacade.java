package dio.desafioGof.Facade;

import dio.desafioGof.Strategy.EmailNotification;
import dio.desafioGof.Strategy.SmsNotification;
import org.springframework.stereotype.Component;

@Component
public class NotificationFacade {
    private final EmailNotification emailNotification;
    private final SmsNotification smsNotification;

    public NotificationFacade(EmailNotification emailNotification, SmsNotification smsNotification) {
        this.emailNotification = emailNotification;
        this.smsNotification = smsNotification;
    }

    public void sendEmail(String receiver, String message) {
        emailNotification.sendNotification(receiver, message);
    }

    public void sendSms(String receiver, String message) {
        smsNotification.sendNotification(receiver, message);
    }
}
