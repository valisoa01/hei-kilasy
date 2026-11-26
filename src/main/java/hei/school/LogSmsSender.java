package hei.school;

import org.springframework.stereotype.Component;

@Component
public class LogSmsSender implements SmsSender {

    @Override
    public void send(String phone, String message) {
        System.out.println("[SMS] " + phone + " : " + message);
    }
}
