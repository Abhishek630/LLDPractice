package OopsDay3;

public class EmailNotifier implements INotifier{

    @Override
    public void sendNotification(String msg) {
        System.out.println("Email Sent " + msg);
    }
}
