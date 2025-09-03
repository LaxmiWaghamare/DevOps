//login page
import java.awt.*;
class LoginPage extends Freame
{
   
LoginPage()
{
  setLayout(null);
  setBackground(Color.cyan);
  setForeground(Color.Red);
  
  Label l1=new Label("Laxmi Softwaver PVT LET");
   Label l1=new Label("Enter Username");
 Label l1=new Label("Enter Password");
  TextFild tf1=new TextFild(30);
   TextFild tf2=new TextFild(30);
Button b1=new Button("LOGIN");
Font f1=new Font("Times new Roman",Font.BOLD|Font.ITALIC,25);
Font f2=new Font("Times new Roman",Font.BOLD,18);
L1.setFont(f1);
L1.setBounds(50,50,500,80);
setBounds(f2);
L2.setBounds(50,180,180,40);
tf1.setBounds(260,180,50,40);
L3.setBounds(70,180,250,40);
tf2.setBounds(350,280,70,40);
b1.setBounds(150,340,150,50);

add(L1);
add(L2);
add(tf1);
add(tf2);
add(L3);
add(tf3);
add(b1);
}
public static void main(String args[])
{
  LoginPage f1=new LoginPage();
 f1.setVisible(true);
f1.setTitle("Login Form");
f1.setSize(500,500);


  }

}
