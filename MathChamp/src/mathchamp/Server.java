package mathChamp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;


public class Server {
	
	static LinkedList<clientThread> clients =new LinkedList<>();
	private static ServerSocket serverSocket;
	
	public static void main(String[] args) {
		
		try {
			serverSocket = new ServerSocket(12039);
			
			System.out.println("Math Champ Server Started!");
			
			while(true){
				
				clients.add(new clientThread(serverSocket.accept()));
				clients.peekLast().start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}

class clientThread extends Thread{
	GenerateQuestions generateQuestions = new GenerateQuestions();
	Socket client;
	Scanner reader;
	PrintWriter writer;
	
	public clientThread(Socket client){
		this.client = client;
		
		try {
			this.reader = new Scanner( client.getInputStream() );
			this.writer = new PrintWriter(client.getOutputStream(), true);
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("Client has left");
			Server.clients.remove(this);
		}
	}
	
	
	
	public void run(){
		super.run();
				
		String question = "";
		int realAnswer = 0;
		int playerAnswer = 0;
		int playerScore = 0;
		
		writer.println("Welcome to Math Champ!");		
		String name = reader.nextLine();
		generateQuestions.generateNewExpression();
		while(true){
			
			
			question = generateQuestions.getExpression();
			realAnswer = (int)generateQuestions.getResult();
			
			writer.println("Here is your next question\n"+question+" = ?");
			
			playerAnswer = Integer.parseInt(reader.nextLine());
			
			if(playerAnswer == realAnswer){
				System.out.println("Player ("+name+") answered " + playerAnswer +
							"\n         Server : Answer is Correct! "+ realAnswer + 
							"\n         10 points awarded to "+name);
				playerScore += 10;
				writer.println("Congrats! The answer is correct! \n"+name+"'s Current Score "+playerScore);
			}
				
			else{
				System.out.println("Player ("+name+") answered " + playerAnswer+
							"\n         Server : Answer is wrong! "+ realAnswer+
							"\n         10 points deducted from "+ name);
				playerScore -= 10;
				writer.println("Sorry! The answer is wrong!\n"+name+"'s Current Score "+playerScore);
			}
			
			generateQuestions.generateNewExpression();
				
		}
	}
	
	
	
}
