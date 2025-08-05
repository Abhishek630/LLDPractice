package OopsDay3;

public class Main {
    public static void main(String[] args) {

        EmailNotifier email = new EmailNotifier();
        SMSNotifier sms = new SMSNotifier();
        PushNotifier push = new PushNotifier();
        NotificationService service = new NotificationService(push, sms,email);
        service.sendEmail("Email");
        service.sendSMS("SMS");
        service.sendPush("Push");

    }
}
