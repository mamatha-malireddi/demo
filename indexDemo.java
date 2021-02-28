package sunw.demo.indexDemo;
import java.awt.*;
public class IndexDemo
{
 private final static int n=5;
 private boolean x[];
 public IndexDemo()
 {
   x=new Boolean[n];
   for(i=0;i<n;i++)
	x[i]=false;
 }
public boolean getX(int index)
{
 return x[index];
}
public boolean[] getX()
{
 return x;
}
public void setX(int index, boolean value)
{
 x[index]=value;
}
public void setX(boolean value)
{
 x=values;
}
}