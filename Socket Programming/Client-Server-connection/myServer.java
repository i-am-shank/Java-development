import java.net.ServerSocket;
import java.net.Socket;

public class myServer{
  public static void main(String[] args) {
    try{
      System.out.println("Waiting for clients...");

      ServerSocket ss = new ServerSocket(9806);
      // PORT no. --> 9806 (of server)

      // To wait for client connections :-

      Socket soc = ss.accept();
      // When execution will come here.. it will wait for incoming client-connections.
      // As soon as it gets a client-connection, it will return a socket-object (i.e. soc here)

      // Will only execute, after a connection gets accepted
      System.out.println("Connection established !");
      ss.close();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}