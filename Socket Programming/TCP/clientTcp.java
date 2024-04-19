import java.net.Socket;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;

public class clientTcp {
    public static void main(String args[]) {
        try {
            Socket socket = new Socket("localhost", 4000);
            // Initialising writers & readers, for handling IO tasks
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter number1: ");
            double num1 = Double.parseDouble(reader.readLine());
            System.out.print("Enter number2: ");
            double num2 = Double.parseDouble(reader.readLine());
            System.out.print("Enter an operator out of    [ + ,  -  ,  * ,  / ]    :    ");
            char operator = reader.readLine().charAt(0);

            // The following string will be communicated to server, for carrying out calculation there
            writer.println(num1 + "," + num2 + "," + operator);

            // Reading input in serverReader .. & fetch the response from it
            BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String res = serverReader.readLine();
            System.out.println("Server response: " + res);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
