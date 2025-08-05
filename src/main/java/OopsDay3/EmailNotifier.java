package OopsDay3;

public class EmailNotifier extends INotifier{

    @Override
    public void sendNotification(String msg) {
        System.out.println("Email Sent " + msg);
    }
}
