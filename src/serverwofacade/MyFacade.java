/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverwofacade;

/**
 *
 * @author ASUS
 */
public class MyFacade {
    private static MyFacade MyFacadeObj= null ;
    private MyFacade(){};
    public static MyFacade getMyFacadeObject(){
        if(MyFacadeObj == null){
           MyFacadeObj = new MyFacade();
        }
        return MyFacadeObj;
    }
    public void classStart(){
     ScheduleServer obj = new ScheduleServer();
     obj.startBooting();
     obj.readSystemConfigFile();
     obj.init();
     obj.initializeContext();
     obj.initializeListeners();
     obj.createSystemObjects();
    }
     public void classStop(){
     ScheduleServer obj = new ScheduleServer();
     obj.releaseProcesses();
     obj.destory();
     obj.destroySystemObjects();
     obj.destoryListeners();
     obj.destoryContext();
     obj.shutdown();
    }
}
