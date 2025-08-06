package OopsDay3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<INotifier> notify = new ArrayList<>();
        EmailNotifier emailNotifier = new EmailNotifier();
        SMSNotifier smsNotifier = new SMSNotifier();
        PushNotifier pushNotifier = new PushNotifier();
        notify.add(emailNotifier);
        notify.add(smsNotifier);
        notify.add(pushNotifier);

        NotificationService service = new NotificationService(notify);
        service.notifyAll("Email","Email");


    }
}
