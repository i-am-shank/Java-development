import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class serverUdp {
    public static void main(String args[]) {
        try {
            DatagramSocket socket = new DatagramSocket(4000);
            System.out.println("Waiting for client's connection-request...");

            boolean flag = true;
            while (flag) {
				byte[] fetchData = new byte[1024];

				// Fetching data from client.. also client's address & PORT no.
                DatagramPacket receivePacket = new DatagramPacket(fetchData, fetchData.length);
                socket.receive(receivePacket);
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

				System.out.println("Client connected at PORT no. " + clientPort + ", & address : " + clientAddress);

				// Taking input
                String input = new String(receivePacket.getData(), 0, receivePacket.getLength());
                String[] expressions = input.split(",");
                double number1=1, number2=1, output=0;
				char operator = '+';
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

				// Carrying out calculations
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
					System.out.println("Invalid operator !");
				}

				// Send the response (with output-data) to client.
                String response = "Output = " + output;
				byte[] sendData = new byte[1024];
                sendData = response.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                socket.send(sendPacket);
            }

			// Closing the socket at server-end
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
