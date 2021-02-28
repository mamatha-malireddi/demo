import java.net.*;
import java.io.*;
public class Server
{
  public static void main(String args[])
  {
    try
    {
      ServerSocket serverSocket=new ServerSocket(4020);
      serverSocket.setSoTimeout(10000);
      while(true)
      {
        System.out.println("waiting for client on port"+serverSocket.getLocalPort()+"....");
        Socket server=serverSocket.accept();
        System.out.println("just connected to"+server.getRemoteSocketAddress());
        PrintWriter toClient =new PrintWriter(server.getOutputStream(),true);
        BufferedReader fromClient=new BufferedReader(new InputStreamReader(server.getInputStream()));
        String line =fromClient.readLine();
        System.out.println("Server received:"+line);
        toClient.println("Thank you for connecting to"+server.getLocalSocketAddress()+"Good Bye");
       }
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