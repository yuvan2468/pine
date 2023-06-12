import java.awt.*;
import java.awt.event.*;
public class ButtonClick extends Frame implements ActionListener
{
 TextField t1,t2,t3,t4;
 Label l1,l2,l3,l4;
 Button b1;
 ButtonClick() 
 {
  setLayout(new GridLayout(4,2));
  t1=new TextField(30);
  t2=new TextField(30);
  t3=new TextField(30);
  t4=new TextField(30);
  l1=new Label("name:",Label.LEFT);
  l2=new Label("street:",Label.LEFT);
  l3=new Label("city:",Label.LEFT);
  l4=new Label("place:",Label.LEFT);
  b1=new Button("my details");
  add(l1);
  add(t1);
  add(l2);
  add(t2);
  add(l3);
  add(t3);
  add(l4);
  add(t4);
 setLayout(new FlowLayout(FlowLayout.CENTER));
 b1.addActionListener(this);
  add(b1);
 }
public void actionPerformed(ActionEvent ae)
{
  if(ae.getSource()==b1)
  {
     t1.setText("Vijay");
     t2.setText("Vadavalli");
     t3.setText("Cbe");
     t4.setText("19");
   }
}
public static void main(String args[])
{
   ButtonClick m=new ButtonClick();
   m.setSize(600,200);
   m.addWindowListener(new WindowAdapter()
{
   public void WindowClosing(WindowEvent e)
   {
       System.exit(0);
    }
});
m.show();
}
}  