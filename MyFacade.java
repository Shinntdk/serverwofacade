package serverwofacade;

public class MyFacade {
    private static MyFacade MyFacadeObj = null;
        private MyFacade() {}
        public static MyFacade getMyFacadeObject() {
            if (MyFacadeObj == null){
                MyFacadeObj = new MyFacade();
            }
            return MyFacadeObj;
        }
        public void ServerStart(){
            ServerStart start = new ServerStart();
            start.ServerStartFunc();
        }
        public void ServerOffline(){
            ServerOffline off = new ServerOffline();
            off.ServerOfflineFunc();
        }

}
