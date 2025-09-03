import java.awt.*;
import java.awt.event.*;

class LaxmiSoftware extends Frame implements ActionListener
{
  Label L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14;
Button b1;
TextField tf1,tf2,tf3;
Checkbox c1,c2;
CheckboxGroup cbg;
  LaxmiSoftware()
{
setLayout(null);
setBackground(Color.cyan);
Font f1=new Font("Arial Black",Font.BOLD|Font.ITALIC,25);
L1=new Label("***********Laxmi Software PVT.LED************",Label.CENTER);
L1.setFont(f1);
Font f2=new Font("Arial Black",Font.BOLD,18);
setFont(f2);
L2=new Label("Enter Name:",Label.RIGHT);
tf1=new TextField(50);
tf2=new TextField(50);

L3=new Label("Select Gender:",Label.RIGHT);
 cbg=new CheckboxGroup();
c1=new Checkbox ("Male",false,cbg);
c2=new Checkbox ("Female",false,cbg);
L4=new Label("Enter Mobile NO:",Label.RIGHT);
tf2=new TextField(50);
L5=new Label("Enter City :",Label.RIGHT);
tf3=new TextField(50);
b1=new Button("Submit");


L1.setBounds(150,100,400,40);
L2.setBounds(100,200,150,40);
tf1.setBounds(300,200,150,40);
L3.setBounds(100,250,150,40);
c1.setBounds(300,250,60,40);
c2.setBounds(400,250,100,40);
L4.setBounds(100,300,170,40);
tf2.setBounds(300,300,150,40);
L5.setBounds(100,350,150,40);
tf3.setBounds(300,350,150,40);
b1.setBounds(150,420,150,40);
L6.setBounds(350,420,500,40);
L7.setBounds(100,500,150,40);
L8.setBounds(300,500,150,40);
L9.setBounds(500,500,150,40);
L10.setBounds(700,500,150,40);
L11.setBounds(100,550,150,40);
L12.setBounds(300,550,150,40);
L13.setBounds(500,550,150,40);
L14.setBounds(700,550,150,40);
b1.addActionListener(this);

add(L1);add(L2);add(L3);
add(L4);add(L5);add(L6);
add(L7);add(L8);add(L9);
add(L10);add(L11);add(L12);
add(L13);add(L14);
add(b1);
add(tf1);add(tf2);add(tf3);
add(c1);add(c2);   

}
    public void actionPerformed(ActionEvent ae)
  {
     L7.setText("NAME");
      L6.setText("Records Submitted SuccessFully!!!...Please see below details...");

	L8.setText("GENDER");
	L9.setText("MOBILE");
	L10.setText("CITY");
	L11.setText(tf1.getText());
	L13.setText(tf2.getText());
	L14.setText(tf3.getText());
	L12.setText(cbg.getSelectedCheckbox().getLabel());
}

public static void main(String args[])
{
LaxmiSoftware f1=new LaxmiSoftware();
f1.setVisible(true);
f1.setTitle("Laxmi Software");
f1.setSize(900,800);

 }
}