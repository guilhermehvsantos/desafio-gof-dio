package dio.desafioGof.Strategy;

import org.springframework.stereotype.Component;

@Component
public class SmsNotification implements NotificationStrategy {

    @Override
    public void sendNotification(String receiver, String message) {
        System.out.println("Enviando SMS para " + receiver + ": " + message);
    }
}
