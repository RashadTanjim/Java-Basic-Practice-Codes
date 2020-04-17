package rockpaperscissors;

/**
 *
 * @author Md Rashad Tanjim
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private static ServerSocket server = null;
    private static Socket socket = null;
    private static final int port = 8089;

    public static void main(String[] args) {
        // create IO objects
        BufferedReader in = null;
        PrintWriter out = null;
        Scanner consoleInput = new Scanner(System.in);

        //start server
        try {
            System.out.println(" Server is starting ...");
            server = new ServerSocket(port);
            System.out.println("Server has started");
        } catch (IOException e) {
            System.out.println("Can not listen to port: " + port);
            System.exit(-1);
        }

        while (true) {
            // create socket
            try {
                socket = server.accept();
                System.out.println("Client has been connected\n");
            } catch (IOException e) {
                System.out.println("Communication error with client ");
                System.exit(-1);
            }

            try {
                boolean flag = true;
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);
                out.println("NSU CSE338 LAB Server");
                //System.out.println("Client: "+ in.readLine() );

                while (socket.isConnected() && flag) {

                    String value = in.readLine();
                    System.out.println("Client: ");
                    System.out.println(value);
                    out.println(studentInfo(value));

                }
                socket.close();
                consoleInput.close();
            } catch (IOException e) {
                System.out.println("Client Left");
                consoleInput.close();
            }

        }

    }

    public static String studentInfo(String Student_Name) {
        
        String infoStudent = null;

        if (Student_Name.equals("Rashad")) {
            infoStudent = "ID:16209520, Semester: Summer 18, Subject: CSE448";
            
        } 
        else if (Student_Name.equals("Tanjim")) {
            infoStudent = "ID:644111191, Semester: fall 18, Subject: CSE448";

        }
        else if (Student_Name.equals("Sanjoy")) {
            infoStudent = "ID:46164964, Semester: sp 18, Subject: CSE115";
        }
        else if (Student_Name.equals("Rumi")) {
            infoStudent = "ID:449449496, Semester: sp 18, Subject: EEE452";
        }
        else {
            infoStudent = "wrong input";
        }

        return infoStudent;
    }
}
