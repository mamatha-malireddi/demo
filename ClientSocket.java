import java.io.*;
import java.net.*;
public class ClientSocket
{
  public static void main(String args[])
  {
    try
    {
      int serverPort=4020;
      System.out.println("connecting to server on port"+serverPort);
      Socket socket=new Socket("localhost",4020);
      System.out.println("just connected to"+socket.getRemoteSocketAddress());
      PrintWriter toServer=new PrintWriter(socket.getOutputStream(),true); 
      BufferedReader fromServer=new BufferedReader(new InputStreamReader(socket.getInputStream())); 
      toServer.println("Hello from"+socket.getLocalSocketAddress());
      String line=fromServer.readLine();
      System.out.println("client received"+line+"fromServer");
      toServer.close();
      fromServer.close();
      socket.close();
     }
     catch(UnknownHostException ex)
     {
       ex.printStackTrace();
     }
     catch(IOException e)
    {
       e.printStackTrace();
     }
  }
}
//https://support.microsoft.com/en-us/help/15288/windows-8-update-to-windows-8-1s