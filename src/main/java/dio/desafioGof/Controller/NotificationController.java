package dio.desafioGof.Controller;

import dio.desafioGof.Facade.NotificationFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notify")
public class NotificationController {
    private final NotificationFacade notificationFacade;

    public NotificationController(NotificationFacade notificationFacade) {
        this.notificationFacade = notificationFacade;
    }

    //Metodo get para poder testar no navegador exemplo http://localhost:8080/notify/email?receiver="uilherme&msg=olá
    @GetMapping("/email")
    public String sendEmail(@RequestParam String receiver, @RequestParam String msg) {
        notificationFacade.sendEmail(receiver, msg);
        return "Email enviado!";
    }

    @GetMapping("/sms")
    public String sendSms(@RequestParam String receiver, @RequestParam String msg) {
        notificationFacade.sendSms(receiver, msg);
        return "SMS enviado!";
    }
}
