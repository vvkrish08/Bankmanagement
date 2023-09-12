package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;


public class SignUp extends JFrame implements ActionListener{
    
    JLabel test1,text2,text3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b;
    JDateChooser dateChooser;
    
    
    Random ran = new Random();
    long randomNumber = ((ran.nextLong() % 9000L) + 1000L);
    String num = "" + Math.abs(randomNumber);
    
    SignUp(){
        
        setTitle("NEW ACCOUNT APPLICATION FORM");
       
        test1 = new JLabel("APPLICATION FORM NO. "+num);
        test1.setFont(new Font("Raleway", Font.BOLD, 38));
        test1.setBounds(140,20,600,40);
        add(test1);
        
        text2 = new JLabel("Page 1: Personal Details");
        text2.setFont(new Font("Raleway", Font.BOLD, 22));
        text2.setBounds(290,80,600,30);
        add(text2);
        
        text3 = new JLabel("Name:");
        text3.setFont(new Font("Raleway", Font.BOLD, 20));
        text3.setBounds(100,140,100,30);
        add(text3);
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        t1.setBounds(300,140,400,30);
        add(t1);
        
        l4 = new JLabel("Father's Name:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        l4.setBounds(100,190,200,30);
        add(l4);
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        t2.setBounds(300,190,400,30);
        add(t2);
       // Date choosing function*********************************************************** 
        
        l5 = new JLabel("Date of Birth:");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        l5.setBounds(100,240,200,30);
        add(l5);
       
        
        
        dateChooser = new JDateChooser();
	dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 240, 400, 30);
//	dateChooser.setBounds(137, 337, 200, 29);
	add(dateChooser);
       //Ended here ************************************************************************
         
        
        
      //gender888888888888888888888888888888888888888888888  88888888888888888888888888888
       
        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        l6.setBounds(100,290,200,30);
        add(l6);
        
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(300,290,60,30);
        add(r1);
        
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(450,290,90,30);
        add(r2);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        
       //8888888888888888888888888888888888888888888888888888888 888888888888888888888888888888
       
       
        l7 = new JLabel("Email Address:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        l7.setBounds(100,340,200,30);
        add(l7);
        
        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));
        t3.setBounds(300,340,400,30);
        add(t3);
        
      // Marital status*************************************************************************  
        
        l8 = new JLabel("Marital Status:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        l8.setBounds(100,390,200,30);
        add(l8);
             
        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
        r3.setBounds(300,390,100,30);
        add(r3);
        
        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);
        r4.setBounds(450,390,100,30);
        add(r4);
        
        
        
        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);
        r5.setBounds(635,390,100,30);
        add(r5);
        
        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(r3);
        groupstatus.add(r4);
        groupstatus.add(r5);
        
       //**************************************************************************************** 
       
       
        l9 = new JLabel("Address:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        l9.setBounds(100,440,200,30);
        add(l9);
        
        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 14));
        t4.setBounds(300,440,400,30);
        add(t4);
        
                
        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        l10.setBounds(100,490,200,30);
        add(l10);
        
        t5 = new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 14));
        t5.setBounds(300,490,400,30);
        add(t5);
        
        l11 = new JLabel("Pin Code:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        l11.setBounds(100,540,200,30);
        add(l11);
              
        t6 = new JTextField();
        t6.setFont(new Font("Raleway", Font.BOLD, 14));
        t6.setBounds(300,540,400,30);
        add(t6);
        
               
        l12 = new JLabel("State:");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));
        l12.setBounds(100,590,200,30);
        add(l12);
        
        
        t7 = new JTextField();
        t7.setFont(new Font("Raleway", Font.BOLD, 14));
        t7.setBounds(300,590,400,30);
        add(t7);
        
        
//        l13 = new JLabel("Date");
//        l13.setFont(new Font("Raleway", Font.BOLD, 14));
//        
//        l14 = new JLabel("Month");
//        l14.setFont(new Font("Raleway", Font.BOLD, 14));
//        
//        l15 = new JLabel("Year");
//        l15.setFont(new Font("Raleway", Font.BOLD, 14));
        
        
       
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(620,660,80,30);
        add(b);
        
        b.addActionListener(this); 
        
        setLayout(null);
                  
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(500,120);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String formno = "" +num;
        String name = t1.getText();
        String fname = t2.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        
        if(r1.isSelected()){ 
            gender = "Male";
        }else if(r2.isSelected()){ 
            gender = "Female";
        }
        String email = t3.getText();
        String marital = null;
        
        if(r3.isSelected()){ 
            marital = "Married";
        }else if(r4.isSelected()){ 
            marital = "Unmarried";
        }else if(r5.isSelected()){ 
            marital = "Other";
        }
           
        String address = t4.getText();
        String city = t5.getText();
        String pincode = t6.getText();
        String state = t7.getText();
        

        try
        {
           
            if(t6.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c = new Conn();
                String q1 = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c.s.executeUpdate(q1);
                setVisible(false);
                new SignUp2(formno).setVisible(true);
                
            }
            
        }
        catch(Exception e){
//             e.printStackTrace();
                System.out.println(e);
        }
        
    }
    
    
    public static void main(String[] args){
        new SignUp();
    }
}
