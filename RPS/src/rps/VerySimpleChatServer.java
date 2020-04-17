package RPS;

import java.io.*;
import java.net.*;
import java.util.*;

public class VerySimpleChatServer {
	// can add values to ArrayList with .add
	// below we use ""clientOutputStreams.add(writer);""
	// we add writer...we can also use
	// clientOutputStreams.add(indexOfTheValueYouWantToGet)
	ArrayList clientOutputStreams;

	// this is our thread constructor that needs to be passed an object
	// runnable interface is in java.lang package
	public class ClientHandler implements Runnable {
		BufferedReader reader;
		Socket sock;

		public ClientHandler(Socket clientSocket) {
			try {
				sock = clientSocket;
				InputStreamReader isReader = new InputStreamReader(
						sock.getInputStream());
				reader = new BufferedReader(isReader);

			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		// ok so Runnable has only one method to implement:
		// this is where i put the game I thinks
		// method that goes at bottom of new stack.
		// also it seems its an interface
		// //GIVE our thread a job
		public void run() {

			String message;

			try {
				// InputStreamReader isReader = new
				// InputStreamReader(sock.getInputStream());
				// reading in from socket i thinks
				// reader = new BufferedReader(isReader);
				//
				while ((message = reader.readLine()) != null) {

					// System.out.println("arse " + message);
					// RPS game = new RPS();
					tellEveryone(message);
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new VerySimpleChatServer().start();
	}

	public void start() {
		clientOutputStreams = new ArrayList();
		try {
			ServerSocket serverSock = new ServerSocket(5000);

			// into the permanent loop. waiting for (and servicing)client
			// requests
			while (true) {

				Socket clientSocket = serverSock.accept();

				PrintWriter writer = new PrintWriter(
						clientSocket.getOutputStream());

				// writer.println("Hello" + "");

				clientOutputStreams.add(writer);
				// make the thread object (the worker) and give it a runnable
				// (the job)
				// "new (ClientHandler(clientSocket)) is the "threadjob"
				// thread instance created put not started //
				Thread t = new Thread(new ClientHandler(clientSocket));
				// once this is started you go from just a thread to new
				// thread of execution
				// when new thread starts up, it takes the runnable objects
				// run()
				// method and puts it on the bottom of the the new threads stack
				// so we shall bring our new ClientHandler(clientSocket) to
				// run()
				// //start tread, it moves into runnable state
				// means thread is ready to be run.
				t.start();
				System.out.println("got a connection");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	//
	public void tellEveryone(String message) {
		Iterator it = clientOutputStreams.iterator();

		while (it.hasNext()) {
			try {

				PrintWriter writer = (PrintWriter) it.next();

				writer.println(message);
				writer.flush();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}


