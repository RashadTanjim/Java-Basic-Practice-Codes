package mathChamp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	private static Socket server;
	private static Scanner reader;
	private static Scanner console;
        
	public static void main(String[] args) {
		try {
			server = new Socket("localhost", 12039);

			reader = new Scanner( server.getInputStream() );
			console = new Scanner(System.in);
			PrintWriter writer = new PrintWriter(server.getOutputStream(), true);
			System.out.println("Math Champ Server Online");
			System.out.print("Enter your name: ");
			writer.println(console.nextLine());
			new Thread(){
				public void run(){
					super.run();
					while(true){
						System.out.println("Server: " + reader.nextLine());
					}
				}
			}.start();

			while(true){
				writer.println(console.nextLine());
			}		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
