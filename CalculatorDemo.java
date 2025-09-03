import java.awt.*;
import java.awt.event.*;
class CalculatorDemo extends Frame implements ActionListener
{
     Button b1,b2,b3,b4,b5;
     TextField tf1,tf2,tf3;
CalculatorDemo()
{
setLayout(null);
setBackground(Color.pink);
Label L1=new Label("*******Simple Calculator**********");
setForeground(Color.red);
Label L2=new Label("Enter 1st Number:");
Label L3=new Label("Enter 2nd Number:");
Label L4=new Label("Risult:");

tf1=new TextField(30);
tf2=new TextField(30);
tf3=new TextField(30); 

Button=new b1("ADD");
Button=new b2("SUB");
Button=new b3("MUL");
Button=new b4("DIV");
Button=new b5("Clear");
Font f1=new Font("Artical black",Font.BOLD|Font.ITALIC,25);
Font f2=new Font("Artical black",Font.BOLD,18);

L1.setFont(f1);
L2.setFont(f2);
L3.setFont(f2);
L4.setFont(f2);
tf1.setFont(f2);
tf2.setFont(f2);
tf3.setFont(f2);

b1.setFont(f2);
b2.setFont(f2);
b3.setFont(f2);
b4.setFont(f2);
b5.setFont(f2);

L1.setBounds(140,50,500,40);
L2.setBounds(50,180,180,40);
tf1.setBounds(260,180,160,40);
L3.setBounds(50,260,180,40);
L4.setBounds(50,340,180,40);
tf2.setBounds(260,180,160,40);
tf3.setBounds(260,180,160,40);
tf3.setForeground(Color.blue);
b1.setBounds(50,420,100,40);
b2.setBounds(170,420,100,40);
b3.setBounds(260,420,100,40);
b4.setBounds(340,420,100,40);

add(L1); add(L2); add(L3); add(L4);
add(tf1); add(tf2); add(tf3);
add(b1); add(b2); add(b3); add(b4); add(b5);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
  int x=Integer.parseInt(tf1.getText());
int y=Integer.parseInt(tf2.getText());
int z;
String str=ae.getActionCommand();

if(str.equals("ADD"))
{
   z=x+y;
tf3.setText(""+z);
}
else if(ae.getSource()==b2)

{
   z=x-y;
tf3.setText(""+z);
}
else if(ae.getSource()==b3)

{
   z=x*y;
tf1.setText(""+z);
}
else if(ae.getSource()==b4)
   z=x/y;
tf1.setText(""+z);
}
else if(ae.getSource()==b5)
{
 tf1.setText("");
 tf2.setText("");
 tf3.setText("");

  }

}
public static void main (String args[])
{
 CalculatorDemo f1=new CalculatorDemo();
 f1.setVisible(true);
f1.setTitle("Calculator Demo");
f1.setVisible(500,500);


 }
}








 

