package serverwofacade;

public class ServerStart {
    public void ServerStartFunc(){
        ScheduleServer start = new ScheduleServer();
        start.startBooting();
        start.readSystemConfigFile();
        start.init();
        start.initializeContext();
        start.initializeListeners();
        start.createSystemObjects();
        System.out.println("Start working......");
}
    
}
