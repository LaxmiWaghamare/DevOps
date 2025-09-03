import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
import java.awt.Color;
import java.lang.Math;  
import java.sql.*;
import javax.swing.table.DefaultTableModel;

class Project extends JFrame implements ActionListener  
{
    JFrame f= new JFrame("Guess the Number ? ");     
    JPanel panel1=new JPanel();  
    JPanel panel2=new JPanel();  
    JPanel panel3=new JPanel(); 
    JLabel label,name,l1,l2,l3,l4,l5,l6; 
    Font font=new Font("Comic Sans MS", Font.BOLD, 16); 
    int random_no=(int)(Math.random()*100+1);
    JScrollPane scroll;
    JTextField t1,t2; 
    JButton start,guess,exit;   
    String n; 
   
    int count=0;  
    Project(){
    
        panel1.setBounds(0,0,600,400); 
        panel2.setBounds(0,0,600,400); 
        panel3.setBounds(0,0,600,400);
        panel1.setBackground(Color.white);
        panel2.setBackground(Color.white);
        panel3.setBackground(Color.white);
        //panel1 

        //image icon
        ImageIcon i=new ImageIcon("start.png");
        name =new JLabel("Name : ");
        name.setFont(font);

        //text filed for name 
        t1=new JTextField();
        t1.setFont(font);

        //start button
        start=new JButton(i);
        ImageIcon i1=new ImageIcon("img.png");
        label = new JLabel(i1);
    
        name.setBounds(200,200,100,30);
        t1.setBounds(300,200,100,30);
        start.setBounds(205,250,215,91);
        label.setBounds(112,0,377,162);
        start.setBackground(Color.white);
        start.setBorderPainted(false);
    
        panel1.add(label);
        panel1.add(name);
        panel1.add(t1);
        panel1.add(start);
        start.addActionListener(this);
        //panel1 end

        //panel 2

        //image icon
        ImageIcon i2=new ImageIcon("img1.png");
        l1=new JLabel(i2);

        //text filed for entering number 
        t2=new JTextField();
        l1.setFont(font);
        t2.setHorizontalAlignment(JTextField.CENTER);
        l2=new JLabel("Enter Smaller Number!");
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setFont(font);
        l2.setForeground(Color.red);
        l2.setVisible(false);

        //guess button
        guess =new JButton("Guess");
        guess.setFont(font);
        guess.setBackground(Color.blue);
        guess.setForeground(Color.white);
        guess.addActionListener(this);

        l1.setBounds(139,0,322,116);
        t2.setBounds(265,130,50,30);
        l2.setBounds(200,170,200,30);
        guess.setBounds(240,230,100,50);
    
        panel2.add(l1);
        panel2.add(t2);
        panel2.add(l2);
        panel2.add(guess);
        //panel 2 end

        //panel 3

        //label for score : 
        l3=new JLabel("Your Score : "+count);
        l3.setFont(font);
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setForeground(Color.blue);

        //label for hig score 
        l4=new JLabel("High Scores :"+count);
        l4.setFont(font);
        l4.setHorizontalAlignment(JLabel.CENTER);
        l4.setForeground(Color.red);

        //exit button
        exit= new JButton("Exit");
        exit.setFont(font);
        exit.setBackground(Color.red);
        exit.setForeground(Color.white);
        exit.addActionListener(this);

        //label for table 
        l5=new JLabel("NAME");
        l5.setFont(font);
        l5.setHorizontalAlignment(JLabel.CENTER);
        l5.setForeground(Color.darkGray);

        //label for tabel
        l6=new JLabel("SCORE");
        l6.setFont(font);
        l6.setHorizontalAlignment(JLabel.CENTER);
        l6.setForeground(Color.darkGray);
        
        l3.setBounds(200,20,200,30);
        l4.setBounds(200,50,200,30);
        exit.setBounds(240,250,100,50);
        l5.setBounds(200,100,100,30);
        l6.setBounds(300,100,100,30);

        panel3.add(l3);
        panel3.add(l4);
        panel3.add(l5);
        panel3.add(l6);
        panel3.add(exit);
        //panel 3 end

        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        f.setContentPane(panel1) ;
        f.setSize(601,400);    
        f.setLayout(null);    
        f.setVisible(true);

    }
      public void actionPerformed(ActionEvent e)  
    {  

        if(e.getSource()==start)  
        {  
            
            n=t1.getText();
            System.out.println("Random no : "+random_no);
            f.setContentPane(panel2);
            //change to panel 2
            f.setSize(601,400);
        }

        if(e.getActionCommand().equals("Guess")){

            l2.setVisible(true);
            int ans=Integer.parseInt(t2.getText());

            if(ans==random_no){

                count=count+1;
                guess.setBounds(215,230,150,50);
                guess.setText("View Score");
                l2.setForeground(Color.blue);
                l2.setText("You guessed it Right!");

                try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                PreparedStatement stmt1=con.prepareStatement("insert into hisc values(?,?)");  
                
                stmt1.setString(1,n); 
                stmt1.setInt(2,count); 

                int p=stmt1.executeUpdate();  
                System.out.println(p+" records inserted");  
                con.close();
                }
                catch (Exception ee2){}
               //if guess is right insert it in table
            }
            else if(ans<random_no){

            l2.setText("Enter Bigger Number!");
            count=count+1;
            }
            else{

                l2.setText("Enter Smaller Number!");
                count=count+1;
            }

        }

        if(e.getSource()==exit){
            f.dispose();
        }

        if(e.getActionCommand().equals("View Score")){
           //show score on screen 
            l3.setText("Your Score : "+count);

            String col[]={"NAME","SCORE"};
            String r[][]=new String[5][5];

            try{
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                    Statement stmt=con2.createStatement(); 

                    ResultSet rs=stmt.executeQuery("Select * from hisc order by score asc");
                    
                    String s1,s2;
                    int k=0;
                    while(rs.next()){
                        s1=rs.getString(1);
                        s2=String.valueOf(rs.getInt(2));
                        System.out.println(s1+" "+s2);
                        r[k][0]=s1;
                        r[k][1]=s2;
                        k++;
                    }

                    con2.close();
            }catch(Exception exce){}

            JTable tabel=new JTable(r,col);
            tabel.setFont(font);
            tabel.setBounds(200,130,200,280);

            panel3.add(tabel);
            //change screen to panel 3
            f.setContentPane(panel3);
            f.setSize(601,400);
        }
    }

 public static void main(String s[])  
    {  
        Project p=new Project();  
        
    }  

}