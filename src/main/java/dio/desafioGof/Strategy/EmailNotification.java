package dio.desafioGof.Strategy;

import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements NotificationStrategy {

    @Override
    public void sendNotification(String receiver, String message) {
        System.out.println("Enviando Email para " + receiver + ": " + message);
    }
}
