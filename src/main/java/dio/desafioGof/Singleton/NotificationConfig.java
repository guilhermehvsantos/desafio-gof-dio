package dio.desafioGof.Singleton;

import org.springframework.stereotype.Component;

@Component
public class NotificationConfig {
    private String emailApiKey = "chave-email";
    private String smsApiKey = "chave-sms";

    public String getEmailApiKey() {
        return emailApiKey;
    }

    public String getSmsApiKey() {
        return smsApiKey;
    }
}
