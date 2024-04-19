import java.net.Socket;

public class myClient {
  public static void main(String[] args) {
    try{
      System.out.println("Client started !");
      Socket soc = new Socket("localhost", 9806);
      // 1st arg --> IP-address of server (localhost .. as both client & server are on same machine)
      // 2nd arg --> PORT-no.
      soc.close();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
