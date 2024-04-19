import java.net.Socket;
import java.net.ServerSocket;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class serverTcp {
    public static void main(String args[]) {
        try {
            ServerSocket serverSkt = new ServerSocket(4000);
            System.out.println("TCP Server waiting for client connection requests...");
			boolean flag = true;
            while (flag) {
                Socket socket = serverSkt.accept();
                System.out.println("Client’s connection request accepted by server: " + socket.getInetAddress());
	 			// Initialising writers & readers, for handling IO tasks
	 			PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
               	BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

	  			// Parsing input -------------------------
                String str = reader.readLine();
                String[] expressions = str.split(",");
				double number1=1, number2=1, output=0;
				char operator='+';
				for(int i=0; i<expressions.length; i++) {
					if(i == 0) {
						number1 = Double.parseDouble(expressions[i]);
					}
					else if(i == 1) {
						number2 = Double.parseDouble(expressions[i]);
					}
					else if(i == 2) {
						operator = expressions[i].charAt(0);
					}
				}

	  			// Carrying out operation --------------------------
				if(operator == '/') {
					output = number1 / number2;
				}
				else if(operator == '*') {
					output = number1 * number2;
				}
				else if(operator == '+') {
					output = number1 + number2;
				}
				else if(operator == '-') {
					output = number1 - number2;
				}
				else {
					writer.println("Operator is invalid!");
				}

				// Printing output
				writer.print("Output is : ");
				writer.println(output);

				// Closing this instance of socket at server-end.
				socket.close();
            }
			// Closing serverSocket
			serverSkt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
