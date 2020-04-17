/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketlab2;

/**
 *
 * @author arnob
 */
import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

    public static LinkedList<clientThread> clientList = new LinkedList<>();

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(20);
            System.out.println("Server Started!");

            new Thread() {
                    @Override 
                    
                    public void run()
                    
                    {
                        super.run();
                        Scanner consoleInput = new Scanner (System.in);
                        
                        while(true)
                        {
                            String serverInput = consoleInput.nextLine();
                            System.out.println(serverInput);
                            for (int i = 0; i < clientList.size(); i++) {
                                System.out.println(serverInput);
                                clientList.get(i)
                                        .writer.println(serverInput);
                                
                            }
                        }
                    }
            }.start();
            
            while(true)
            {
                clientList.add (new clientThread(serverSocket.accept()));
                clientList.peekLast().start();
            }
        }catch(IOException e)
        {
            System.out.println("Sorry! Can not start the server");
        }
    }
}
class clientThread extends Thread {
    
    Socket clientSocket;
    Scanner reader;
    PrintWriter writer;
    
    public clientThread (Socket clientSocket) throws IOException {
        this.clientSocket = clientSocket;
        this.reader = new Scanner (clientSocket.getInputStream());
        this.writer = new PrintWriter (clientSocket.getOutputStream(),true);
    } 
    @Override
    public void run(){
        try{
            while(clientSocket.isConnected()){
                //System.out.println("Client:" + reader.nextLine());
                
                String exp = reader.nextLine();
                String Arnob = "ID: 1620952042, Section: 4, Subject: CSE438";
                String Tanjim = "ID: 1830952042, Section: 4, Subject: EEE452";
                String Rashad = "ID: 1620999999, Section: 6, Subject: CSE115";
                String Munna = "ID: 1900000000, Section: 2, Subject: CSE225";
                
                if(Arnob == exp)
                {
                    System.out.println(Arnob);
                }else if (Tanjim == exp)
                {
                     System.out.println(Tanjim);
                }else if (Rashad == exp)
                {
                     System.out.println(Rashad);
                }else if (Munna == exp)
                {
                     System.out.println(Munna);
                }
                
            }
        }catch(Exception e)
        {
            System.out.println("Client Left!");
        }
        Server.clientList.remove(this);
    }
}
