import java.awt.*;
class TextAreaDemo extends Frame
{
	TextAreaDemo()
{
	FlowLayout f1=new FlowLayout();
	setLayout(f1);
	setBackground(Color.blue);
	TextArea ta1=new TextArea(15,15);
	TextArea ta2=new TextArea("Enter comment hear",30,30,TextArea.SCROLLBAR_BOTH);
	add(ta1);
	add(ta2);
}
      public static void main(String args[]) 

{
	TextAreaDemo tad=new TextAreaDemo();
	tad.setVisible(true);
	tad.setTitle("TextArea Control");
	tad.setSize(500,500);


        }
 	}