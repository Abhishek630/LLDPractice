package OopsDay3;

public class PushNotifier extends INotifier {

    @Override
    public void sendNotification(String msg) {
        System.out.println("Push Sent " + msg);
    }
}
