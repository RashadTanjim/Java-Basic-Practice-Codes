//package RPS;
//
//// import streams(java.io) Socket(java.net)and the GUI stuff
//import java.io.*;
//import java.net.*;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class SimpleChatClient { // gui stuff to begin with
//	JTextArea incoming;
//	JTextField outgoing;
//	// usual stuff
//	BufferedReader reader;
//	// printwriter is new Write strings to server sockets..
//	// Prints formatted representations of objects to a text-output stream. This
//	// class implements all of the print methods found in PrintStream.
//	PrintWriter writer;
//	Socket sock;
//
//	public synchronized void start() {
//		JFrame frame = new JFrame("Rock Paper Scissors Client");
//		JPanel mainPanel = new JPanel();
//		// text window size
//		incoming = new JTextArea(10, 30);
//		incoming.setLineWrap(true);
//		incoming.setWrapStyleWord(true);
//		incoming.setEditable(false);
//		JScrollPane qScroller = new JScrollPane(incoming);
//		qScroller
//				.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		qScroller
//				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
//		outgoing = new JTextField(20);
//		JButton sendButton = new JButton("Play");
//		// Register an instance of the event handler class as a listener on one
//		// or more components.
//		// someComponent.addActionListener(instanceOfMyClass);
//		sendButton.addActionListener(new SendButtonListener());
//		mainPanel.add(qScroller);
//		mainPanel.add(outgoing);
//		mainPanel.add(sendButton);
//		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
//		// calls method below to build socket and printwriter
//		setUpNetworking();
//
//		Thread readerThread = new Thread(new IncomingReader());
//		readerThread.start();
//
//		frame.setSize(400, 250);
//		frame.setVisible(true);
//
//	}
//
//	// make a socket then make a printwriter(Printerwriter acts as
//	// assign stuff to instance variables
//	// called from go() method right before we display app GUI
//	private void setUpNetworking() {
//		try {
//			sock = new Socket("localhost", 5000);
//			// get messages from the server
//			InputStreamReader streamReader = new InputStreamReader(
//					sock.getInputStream());
//
//			reader = new BufferedReader(streamReader);
//
//			// Print writer declared above, for this private
//			// we use socket connection to server and press writer to it
//			// now we can write to Server..
//			// write string to socket connection
//			// Creates a new PrintWriter, without automatic line flushing, from
//			// an existing OutputStream
//			writer = new PrintWriter(sock.getOutputStream());
//
//			System.out.println("networking established");
//		} catch (IOException ex) {
//			ex.printStackTrace();
//		}
//	}
//
//	// this is here seen as we will use the gui instead of the console
//	// ActionListener interface for receiving action events.
//	// Include code that implements the methods in listener interfac
//	public class SendButtonListener implements ActionListener {
//		// invoked when an actions occurs
//                @Override
//		public void actionPerformed(ActionEvent ev) {
//			// code that reacts to the action...
//			// get the text from the text fireld and
//			// send it to the server using the writer
//			// turns out this is where we do the writing
//			try {
//
//				writer.println(outgoing.getText());
//
//				writer.flush();
//
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//			// default text box fill
//			// writer.print("ClientOne picked: ");
//			outgoing.setText("");
//			outgoing.requestFocus();
//		}
//	}
//
//	public static void main(String[] args) {
//		new SimpleChatClient().start();
//	}
//
//	class IncomingReader implements Runnable {
//                @Override
//		public void run() {
//			String message;
//			try {
//				while ((message = reader.readLine()) != null) {
//					System.out.println("Client Plays " + message);
//					incoming.append(message + "\n");
//				}
//			} catch (IOException ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
//}
//
//
