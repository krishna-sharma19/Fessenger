/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abc
 */
public class Client extends Send  {
    
   public Client()
           {
        try {
             sock=new Socket("abc-PC",4567);
             conn=true;
             initializer();
        }
        catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
           conn=false; 
        }
           }
    
    
            
    
}
