package dio.desafioGof.Strategy;

import org.springframework.stereotype.Component;

public interface NotificationStrategy {
    void sendNotification(String receiver, String message);
}

