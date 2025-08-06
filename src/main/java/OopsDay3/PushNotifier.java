package OopsDay3;

public class PushNotifier implements INotifier {

    @Override
    public void sendNotification(String msg) {
        System.out.println("Push Sent " + msg);
    }
}
