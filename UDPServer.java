import java.io.*;
import java.net.*;
public class UDPServer
{
  public static void main(String[] args)
  {
   try
   {
     DatagramSocket ds=new DatagramSocket(9876);
     byte[] incomingData=new byte[1024];
     while(true)
     {
      DatagramPacket incomingpacket=new DatagramPacket(incomingData,incomingData.length);
      ds.receive(incomingpacket);
      String message=new String(incomingpacket.getData());
      System.out.println("received from client"+message);
      InetAddress ip=incomingpacket.getAddress();
      int port=incomingpacket.getPort();
      String reply="Thank you for connecting";
      byte[] data=reply.getBytes();
      DatagramPacket replyPacket=new DatagramPacket(data,data.length,ip,port);
      ds.send(replyPacket);
      Thread.sleep(2000);
      ds.close();
     }
   }
   catch(Exception e)
   {
     e.printStackTrace();
   }
  }
}
