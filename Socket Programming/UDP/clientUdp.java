import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clientUdp {
    public static void main(String args[]) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");

            // Taking input from user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter number1: ");
            double number1 = Double.parseDouble(reader.readLine());
            System.out.print("Enter number2: ");
            double number2 = Double.parseDouble(reader.readLine());
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = reader.readLine().charAt(0);

            String message = number1 + "," + number2 + "," + operator;
            byte[] sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 4000);
            socket.send(sendPacket);

            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);
            String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Server response: " + response);

            // Closing socket at client-end
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
