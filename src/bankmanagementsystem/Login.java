
package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pinField;
    JButton signIn,clear,signUp;
  
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(70, 10, 100, 100);
        add(l11);
        
        l1 = new JLabel("WELCOME TO ATM");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        l1.setBounds(200,40,450,40);
        add(l1);
        
        l2 = new JLabel("Card No:");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setBounds(125,150,375,30);
        add(l2);
        
        tf1 = new JTextField(15);
        tf1.setBounds(300,150,230,30);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        add(tf1);
        
        l3 = new JLabel("PIN:");
        l3.setFont(new Font("Raleway", Font.BOLD, 28));
        l3.setBounds(125,220,375,30);
        add(l3);
        
        pinField = new JPasswordField(15);
        pinField.setFont(new Font("Arial", Font.BOLD, 14));
        pinField.setBounds(300,220,230,30);
        add(pinField);
                
        signIn = new JButton("SIGN IN");
        signIn.setBackground(Color.BLACK);
        signIn.setForeground(Color.WHITE);
        signIn.setFont(new Font("Arial", Font.BOLD, 14));
        signIn.setBounds(300,300,100,30);
        signIn.addActionListener(this);
        add(signIn);
        
        clear = new JButton("CLEAR");
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.setFont(new Font("Arial", Font.BOLD, 14));
        clear.setBounds(430,300,100,30);
        clear.addActionListener(this);
        add(clear);
        
        signUp = new JButton("SIGN UP");
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.setFont(new Font("Arial", Font.BOLD, 14));
        signUp.setBounds(300,350,230,30);
        signUp.addActionListener(this);
        add(signUp);
        
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,480);
        setLocation(550,200);
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
      
         if(ae.getSource()==clear){
                tf1.setText("");
               pinField.setText("");  
               
         }else if(ae.getSource()==signIn){   
                Conn c = new Conn();
                String cardno = tf1.getText();
                String pin = pinField.getText();
                String query = "select * from Login where cardno = '"+cardno+"' and pin = '"+pin+"' ";
                
                try{
                    
                    ResultSet rs = c.s.executeQuery(query);
                    if(rs.next()){
                        setVisible(false);
                        new Transactions(pin).setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null,"Incorrect number or pin");
                    }
                    
                }
                catch(Exception e){
                    System.out.println(e);
                }
                                                                                                         
                
        }
        else if(ae.getSource()==signUp){
                setVisible(false);
                new SignUp().setVisible(true);
               

        }
            
          

    }
    public static void main(String[] args){
        new Login();
    }

    
}
