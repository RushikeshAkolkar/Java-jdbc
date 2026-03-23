
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Choice extends JFrame implements ActionListener
{
JTextField t1=new JTextField(20);
JButton b1=new JButton("Add String into List");
JButton b2=new JButton("Delete String into List");
JButton b3=new JButton("SearchString into List");
JButton b4=new JButton("Delete All String into List");
JList li=new JList();
JLabel ll=new JLabel();
DefaultListModel mod=new DefaultListModel();
Choice()
{
setSize(500,500);

setLayout(new FlowLayout());
add(t1);
add(li);
add(b1);
add(b2);
add(b3);
add(b4);
add(ll);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
mod.addElement(""+t1.getText());
li.setModel(mod);
ll.setText("Inserted into List");
t1.setText("");
}
else if(e.getSource()==b2)
{
mod.removeElement(""+t1.getText());
li.setModel(mod);
ll.setText("Removed From List");
}
else if(e.getSource()==b3)
{
String str=t1.getText();
if(mod.contains(str))
{
String str11="Searched";
ll.setText(str11);
}
else
{
String str11="Not Avalible";
ll.setText(str11);
}
}
else
{
mod.removeAllElements();
}
}

public static void main(String[] args)
{
Choice c=new Choice();
}
}