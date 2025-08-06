package OopsDay3;

import java.util.List;

public class NotificationService {

    List<INotifier> notifierList;

    public NotificationService(List<INotifier> notifierList) {
        this.notifierList = notifierList;
    }

    public void notifyAll(String msg, String log){
        for(INotifier iNotifier : notifierList) {
            iNotifier.sendNotification(msg);
            addLog(log);
        }
    }

    private void addLog(String log){
        System.out.println(log);
    }

}
