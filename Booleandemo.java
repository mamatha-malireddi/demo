package sunw.demo.booleandemo
import java.io.*;
import java.awt.*;
public class Booleandemo extends canvas
{
  public boolean rectangle;
  public Booleandemo()
  {
    rectangle=false;
    setSize(120,120);
  }
  public boolean isRectangle()
  {
    return rectangle;
  }
  public void setRectangle(boolean rectangle)
  {
    this.rectangle=rectangle; 
  }
  public void paint(Graphics g)
  {
    if(rectangle)
	g.drawRect(10,10,100,100);
    else
	g.drawOval(10,10,100,100);
  }
}