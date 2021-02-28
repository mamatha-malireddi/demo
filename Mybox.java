package sunw.demo.Mybox;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class Mybox extends canvas
{
  public int height;
  public int width;
  public Mybox()
  {
    setSize(100,100);
    height=50;
    width=50;
  }
  public int getHeight()
  {
    return height;
  }
  public int setHeight(int height)
  {
    this.height=height;
  }
  public int getWidth()
  {
    return width;
  }
  public int setWidth(int width)
  {
    this.width=width;
  }
  public void pain(Graphics g)
  {
    g.drawRect(0,0,width,height);
  }
}
