import java.awt.event.*;
 import java.awt.*; 
 import java.applet.*; 
 /* <applet code=exp1.class width=200 height=200> </applet> */ 
 public class exp1 extends Applet 
 { public void init() 
 { 
 add(new Button("TOP"),BorderLayout.NORTH); 
 add(new Button("BOTTOM"),BorderLayout.SOUTH); 
 add(new Button("RIGHT"),BorderLayout.EAST);
 add(new Button("LEFT"),BorderLayout.WEST); 
   } 
 }