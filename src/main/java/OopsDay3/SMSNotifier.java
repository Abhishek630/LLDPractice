package OopsDay3;

public class SMSNotifier implements INotifier{
    @Override
    public void sendNotification(String msg) {
        System.out.println("SMS sent" + msg);
    }
}
