/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author HP
 */
public class processInfo {
    private String processName;
    private String processId;
    private String sessionName;
    private String sessionId;
    private String memoryUsage;
    
    public processInfo(){
        
    }
    
    public processInfo(String processName, String processId, String sessionName, String sessionId, String memoryUsage){
        this.processName = processName;
        this.processId = processId;
        this.sessionName = sessionName;
        this.sessionId = sessionId;
        this.memoryUsage = memoryUsage;
    }
    
    public String getProcessName(){
        return this.processName;
    }
    
    public String getProcessId(){
        return this.processId;
    }
    
    public String getSessionName(){
        return this.sessionName;
    }
    
    public String getSessionId(){
        return this.sessionId;
    }
    
    public String getMemoryUsage(){
        return this.memoryUsage;
    }
}
