package serverwofacade;

public class ServerOffline {
    public void ServerOfflineFunc(){
        ScheduleServer off = new ScheduleServer();
        System.out.println("After work done.........");
        off.releaseProcesses();
        off.destory();
        off.destroySystemObjects();
        off.destoryListeners();
        off.destoryContext();
        off.shutdown();
    }
    
}
