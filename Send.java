/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abc
 */
public class Send {
    protected Socket sock;
    protected boolean conn=false;
    protected boolean rec;
    
    PrintWriter pw;
    BufferedReader br;
    //BufferedReader brk;
    public void initializer()
            {
        try {
            br=new BufferedReader(new InputStreamReader(sock.getInputStream()));           
            pw=new PrintWriter(sock.getOutputStream(),true);
            conn=false;
    
    
        } catch (IOException ex) {
            conn=false;
            Logger.getLogger(Send.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            
    public void sendText(String x)
    {
        pw.println(x);
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(Send.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String receiveText()
     {
        try {
            return(br.readLine());
        } catch (IOException ex) {
            conn=false;
            Logger.getLogger(Send.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
     }

    public boolean isConnected(){return conn;}
    public boolean isReceived(){return rec;}
    
    
}
