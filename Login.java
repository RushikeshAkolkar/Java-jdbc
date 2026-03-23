import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
class Login extends JFrame implements ActionListener
{

 
JLabel l1=new JLabel("Username");
JLabel l2=new JLabel("Password");
JTextField t1=new JTextField(20);
JPasswordField t2=new JPasswordField(20);
JButton b=new JButton("Login");
JLabel l=new JLabel();

 
Login()
{
setSize(300,300);



setLayout(new FlowLayout());

add(l1);add(t1);
add(l2);add(t2);
add(b);
add(l);
b.addActionListener(this);
setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
String a=t1.getText();
String b=t2.getText();

try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/db","root","");  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from login");  
while(rs.next())  
{
String r1=rs.getString(1);
String r2=rs.getString(2);
if(r1.equals(a) & r2.equals(b))
{
l.setText("Login successful");
}
}
}catch(Exception ex){ System.out.println(ex);} 
}  
public static void main(String args[])
{

Login f=new Login();
  
}
}