
package rockpaperscissors;

/**
 *
 * @author Md Rashad Tanjim
 * 
 */
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static Socket socket = null;

	public static void main(String[] args) {
		
		try{
			socket = new Socket("localhost", 8089);
			System.out.println(" Connected to Server\n"+ "Socket: "+ socket.getInetAddress() + ":" + socket.getPort() + "\n");
		} catch(IOException e){
			System.out.println("Connection to network can not be stablished");
		}

		BufferedReader in = null;
		PrintWriter out = null;
		Scanner consoleInput = new Scanner(System.in);

		try{
			in = new BufferedReader( new InputStreamReader( socket.getInputStream() ));
			out = new PrintWriter( socket.getOutputStream(), true);

			System.out.println("");
			System.out.println("Server: "+ in.readLine());
			//System.out.println("Client: ");
			//out.println(consoleInput.nextLine());

			while(true){
				System.out.println("Client:");
				out.println(consoleInput.nextLine());
				System.out.println("Server: ");
				System.out.println(in.readLine());
			}
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}

