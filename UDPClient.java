import java.io.*;
import java.net.*;
public class UDPClient
{
  public static void main(String args[])
  {
    try
    {
      DatagramSocket ds= new DatagramSocket();
      InetAddress ia=InetAddress.getByName("localhost");
      byte[] incomingData=new byte[1024];
      String Sentence="This is a message from client";
      byte[] data=Sentence.getBytes();
      DatagramPacket sendpacket=new DatagramPacket(data,data.length,ia,9876);
      ds.send(sendpacket);
      DatagramPacket incomingpacket=new DatagramPacket(incomingData,incomingData.length);
      ds.receive(incomingpacket);
      String response=new String(incomingpacket.getData());
      System.out.println("response from server:"+response);
      ds.close();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
 }
}