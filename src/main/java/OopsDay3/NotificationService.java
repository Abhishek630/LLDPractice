package OopsDay3;

public class NotificationService {

    PushNotifier pushNotifier;
    SMSNotifier smsNotifier;
    EmailNotifier emailNotifier;

    public NotificationService(PushNotifier pushNotifier, SMSNotifier smsNotifier, EmailNotifier emailNotifier) {
        this.pushNotifier = pushNotifier;
        this.smsNotifier = smsNotifier;
        this.emailNotifier = emailNotifier;
    }

    public void sendEmail(String msg){
        emailNotifier.sendNotification(msg);
        addLog("EMail Logged");
    }

    public void sendSMS(String msg){
        smsNotifier.sendNotification(msg);
        addLog("SMS Logged");
    }

    public void sendPush(String msg){
        pushNotifier.sendNotification(msg);
        addLog("Push Logged");
    }

    private void addLog(String log){
        System.out.println(log);
    }

}
