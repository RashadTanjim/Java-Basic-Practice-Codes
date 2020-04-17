/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketlab2;

/**
 *
 * @author arnob
 * 
 */
import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

    public static void main(String[] args) {
        try{
            Socket server = new Socket ("localhost", 20);
            Scanner reader = new Scanner(server.getInputStream());
            PrintWriter writer = new PrintWriter (server.getOutputStream(),true);
            
            Scanner consoleInput = new Scanner (System.in);
            
            new Thread()
            {
                @Override
                public void run()
                {
                    while(true)
                    {
                        System.out.println("Server: " + reader.nextLine());
                    }
                };
            }.start();
            while(server.isConnected())
            {
                writer.println(consoleInput.nextLine());
            }
            
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
