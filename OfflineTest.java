import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;
class Filecopy
{
public void copy(String name,String reg,String dept,String clg,String mark) throws IOException
{
byte b3[]=c.getBytes();
byte b4[]=d.getBytes();
byte b5[]=e.getBytes();
FileOutputStream f=new FileOutputStream("t1.txt");
f.write(b1);
f.write(b2);
f.write(b3);
f.write(b4);
f.write(b5);
f.close();
}
}
class OfflineTest extends JFrame implements ActionListener
{
 JLabel l;
 JRadioButton jb[]=new JRadioButton[5];
 JButton b1,b2;
 ButtonGroup bg;
 int count=0,current=0,x=1,y=1,now=0;
 int m[]=new int[10];
 String name1,reg1,dept1,clg1;
 OfflineTest(String a,String b,String c,String d)
 {
 name1=a;
reg1=b;
dept1=c;
clg1=d;
 l=new JLabel();
 add(l);
 bg=new ButtonGroup();
 for(int i=0;i<5;i++)
 { 
 jb[i]=new JRadioButton();
 add(jb[i]);
 bg.add(jb[i]);
 }
 b1=new JButton("Next");
 b2=new JButton("Bookmark");
 b1.addActionListener(this);
 b2.addActionListener(this);
 add(b1);
 add(b2);
 set();
 l.setBounds(30,40,450,20);
 jb[0].setBounds(50,80,100,20);
 jb[1].setBounds(50,110,100,20);
 jb[2].setBounds(50,140,100,20);
 jb[3].setBounds(50,170,100,20);
 b1.setBounds(100,240,100,30);
 b2.setBounds(270,240,100,30);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLayout(null);
 setLocation(250,100);
 setTitle("Offline Test of Java");
 setVisible(true);
 setSize(600,350);
 }
 public void actionPerformed(ActionEvent e)
 {
 if(e.getSource()==b1)
 {
 if(check())
 count=count+1;
 current++; 
 set();
 if(current==9)
 {
 b1.setEnabled(false);
 b2.setText("Result");

 current=now;
 }
 }
 if(e.getActionCommand().equals("Result"))
 {
 if(check())
 count=count+1;
 current++;
 String val=ans(count);
 try
{
 Filecopy fc=new Filecopy();
 fc.copy(name1,reg1,dept1,clg1,val);
 JOptionPane.showMessageDialog(this,"Number of Correct answer is
 "+count+"...It can be stored on a text file...");
 System.exit(0);
 }
 catch(IOException exc)
 {
System.out.println(exc);
 }
 }
 }
 void set()
 {
 jb[4].setSelected(true);
 if(current==0)
 {
l.setText("Que1: Which one among these is not a primitive datatype?");
jb[0].setText("int");
jb[1].setText("Float");
jb[2].setText("boolean");
jb[3].setText("char");
 }
 if(current==1)
 {
l.setText("Que2: Which Keyword is used to convert a class into Thread?");
jb[0].setText("threading");
jb[1].setText("implements Thread");
jb[2].setText("extends Thread");
jb[3].setText("Threaded");
 }
 if(current==2)
 {
l.setText("Que3: Which package is directly available to our class
without importing it?");
jb[0].setText("swing");
jb[1].setText("awt");
jb[2].setText("net");
jb[3].setText("lang");
 }
 if(current==3)
 {
l.setText("Que4: String class is defined in which package?");
jb[0].setText("lang");
jb[1].setText("Swing");
jb[2].setText("Applet");
jb[3].setText("awt");
 }
 if(current==4)
 {
l.setText("Que5: Which Language among these is Object Oriented ?");
jb[0].setText("C");
jb[1].setText("Fortran");
jb[2].setText("Java");
jb[3].setText("Pascal");
 }
 if(current==5)
 {
l.setText("Que6: Which one among these is not a keyword?");
jb[0].setText("class");
jb[1].setText("int");
jb[2].setText("get");
jb[3].setText("if");
 }
 if(current==6)
 {
l.setText("Que7: Which one among these is not a class? ");
jb[0].setText("String");
jb[1].setText("int");
jb[2].setText("Double");
jb[3].setText("Float");
 }
 if(current==7)
 {
l.setText("Que8: which one among these is not a method?");
jb[0].setText("setSize");
jb[1].setText("clone");
jb[2].setText("setPriority");
jb[3].setText("try");
 }
 if(current==8)
 {
l.setText("Que9: which one among these is not a Pre-defined Exception?");
jb[0].setText("ArithmeticException");
jb[1].setText("ErrorException");
jb[2].setText("FileNotFoundException");
jb[3].setText("IndexOutOfBoundsException");
 }
 if(current==9)
 {
l.setText("Que10: Which one among these is not a valid component?");
jb[0].setText("JButton");
jb[1].setText("JList");
jb[2].setText("JButtonGroup");
jb[3].setText("JTextArea");
 }
 l.setBounds(30,40,450,20);
 for(int i=0,j=0;i<=90;i+=30,j++)
 jb[j].setBounds(50,80+i,200,20);
 }
 String ans(int c)
 {
if(c==1)
return "One";
if(c==2)
return "Two";
if(c==3)
return "Three";
if(c==4)
return "Four";
if(c==5)
return "Five";
if(c==6)
return "Six";
if(c==7)
return "Seven";
if(c==8)
return "Eight";
if(c==9)
return "Nine";
if(c==10)
return "Ten";
return "Zero";
 }
 boolean check()
 {
 if(current==0)
 return(jb[1].isSelected());
 if(current==1)
 return(jb[2].isSelected());
 if(current==2)
 return(jb[3].isSelected());
 if(current==3)
 return(jb[0].isSelected());
 if(current==4)
 return(jb[2].isSelected());
 if(current==5)
 return(jb[2].isSelected());
 if(current==6)
 return(jb[1].isSelected());
 if(current==7)
 return(jb[3].isSelected());
 if(current==8)
 return(jb[1].isSelected());
 if(current==9)
 return(jb[2].isSelected());
 return false;
 }
}
class Login1 extends JFrame //implements ActionListener
{
JButton b1,b2;
JLabel l1,l2,l3,l4,l5,dl;
Container c;
Login1()
{
l1=new JLabel("---Registeration---");
l2=new JLabel("*Name ");
l3=new JLabel("*Reg.No ");
l4=new JLabel("*Department ");
l5=new JLabel("*College Name ");
dl=new JLabel("*Enter all the Details...");
b1=new JButton("OK");
b2=new JButton("Exit");
JTextField t2=new JTextField();
JTextField t3=new JTextField();
JTextField t4=new JTextField();
JTextField t5=new JTextField();
Font f=new Font("Arial", Font.BOLD,18);
Font f1=new Font("Arial",Font.BOLD,12);
c=this.getContentPane();
c.setLayout(null);
c.setBackground(Color.PINK);
c.add(l1);
l1.setBounds(160,0,300,40);
l1.setFont(new Font("Serif",Font.BOLD,35));
l1.setForeground(Color.RED);
c.add(l2);
l2.setBounds(120,80,160,30);
l2.setFont(f); //new Font("Serif",Font.BOLD,25));
l2.setForeground(Color.BLUE);
c.add(t2);
t2.setBounds(270,80,190,30);
c.add(l3);
l3.setBounds(120,120,160,30);
l3.setFont(f); //new Font("Serif",Font.BOLD,25));
l3.setForeground(Color.BLUE);
c.add(t3);
t3.setBounds(270,120,190,30);
c.add(l4);
l4.setBounds(120,160,160,30);
l4.setFont(f); //new Font("Serif",Font.BOLD,25));
l4.setForeground(Color.BLUE);
c.add(t4);
t4.setBounds(270,160,190,30);
c.add(l5);
l5.setBounds(120,200,160,30);
l5.setFont(f); //new Font("Serif",Font.BOLD,25));
l5.setForeground(Color.BLUE);
c.add(t5);
t5.setBounds(270,200,190,30);
c.add(b1);
b1.setBounds(180,280,100,30);
c.add(b2);
b2.setBounds(330,280,100,30);
setSize(600,380);
setLocation(700,200);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
System.exit(0);
}
});
b1.addActionListener(new ActionListener()
{
 public void actionPerformed(ActionEvent e)
 {
 if((t2.getText().equals(""))||(t3.getText().equals(""))||(t4.getText().equals(""))||
 (t5.getText().equals("")))
{
c.add(dl);
dl.setBounds(300,230,190,30);
dl.setFont(f1);
dl.setForeground(Color.RED);
dl.setVisible(true);
}
 else
{
String s1=t2.getText();
String s2=t3.getText();
String s3=t4.getText();
String s4=t5.getText();
setVisible(false);
 OfflineTest o=new OfflineTest(s1,s2,s3,s4);
}
 }
});
}
}
class Login
{
public static void main(String args[])
{
Login1 l=new Login1();
}
}
