
package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;




public class SignUp2 extends JFrame implements ActionListener{
    
    JLabel ad2,religion,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField pan, aadhar;
    JRadioButton r3,r4;
    JButton b;
    JComboBox reli,category,income,education,occupation;
    String formno;
//    int num;
    
    
    SignUp2(String formno){
        
        this.formno = formno;
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE2");
       
       
        ad2 = new JLabel("Page 2: Additional Details ");
        ad2.setFont(new Font("Raleway", Font.BOLD, 22));
        ad2.setBounds(350,80,600,30);
        add(ad2);
        
        religion= new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String valReligion[] =  {"HINDU", "MUSLIM", "SIKH","CHRISTIAN","OTHER"};
        
        reli = new JComboBox(valReligion);
        reli.setBounds(300,140,400,30);
        reli.setBackground(Color.WHITE);
        add(reli);
        
 
        
        
        l4 = new JLabel("Category:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        l4.setBounds(100,190,200,30);
        add(l4);
        
        String valCategory[] =  {"OC", "BC", "ST","SC","OTHER"};
        
        category = new JComboBox(valCategory);
        category .setBounds(300,190,400,30);
        category .setBackground(Color.WHITE);
        add(category );
        
        
       // Date choosing function*********************************************************** 
        
        l5 = new JLabel("Income:");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        l5.setBounds(100,240,200,30);
        add(l5);
       
        String valIncome[] =  {"Null", "<2,00,000", "<3lakh","<5lakh","OTHER"};
        
        income = new JComboBox(valIncome);
        income .setBounds(300,240,400,30);
        income .setBackground(Color.WHITE);
        add(income);
        
       
      
       
        l6 = new JLabel("Educational");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        l6.setBounds(100,290,200,30);
        add(l6);
        
        l7 = new JLabel("Qualification:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        l7.setBounds(100,315,200,30);
        add(l7);
        
        String valQualification[] =  {"Not-Graduated", "Graduate", "PostGraduate","Doctrate","OTHER"};
        
        education = new JComboBox(valQualification);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
      // Marital status*************************************************************************  
        
        l8 = new JLabel("Occupation:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        l8.setBounds(100,390,200,30);
        add(l8);
        
         String valoccupation[] =  {"Police", "Proffessor", "Engineer","Retired Army","OTHER"};
        
        occupation = new JComboBox(valoccupation);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
             
     
        
       //**************************************************************************************** 
       
       
        l9 = new JLabel("Pannumber:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        l9.setBounds(100,440,200,30);
        add(l9);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
                
        l10 = new JLabel("Aadhar:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        l10.setBounds(100,490,200,30);
        add(l10);
        
        aadhar = new JTextField();
        aadhar .setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar .setBounds(300,490,400,30);
        add(aadhar);
        
        l11 = new JLabel("Existing Account:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        l11.setBounds(100,540,200,30);
        add(l11);
        
        r3 = new JRadioButton("Yes!");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
        r3.setBounds(300,540,100,30);
        add(r3);
        
        r4 = new JRadioButton("No!");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);
        r4.setBounds(450,540,100,30);
        add(r4);
        
        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(r3);
        groupstatus.add(r4);
                 
                

       
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
        
//         String form = ""+ formno;
        String sReligion = (String)reli.getSelectedItem();
        String sCategory= (String)category.getSelectedItem();
        String sIncome= (String)income.getSelectedItem();
        String sEducation= (String)education.getSelectedItem();
        String sOccupation= (String)occupation.getSelectedItem();
        
        String existing = null;
        
        if(r3.isSelected()){ 
            existing = "Yes";
        }else if(r4.isSelected()){ 
            existing = "No";
        }
      
        String aa = aadhar.getText();
        String pa = pan.getText();
        
        try
        {
           
            if(pan.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c = new Conn();
                String q1 = "insert into signup2 values('"+formno+"','"+sReligion+"','"+sIncome+"','"+sCategory+"','"+sEducation+"','"+sOccupation+"','"+existing+"','"+aa+"','"+pa+"')";
                c.s.executeUpdate(q1);
                setVisible(false);
                new SignUp3(formno).setVisible(true);
               
            }
            
        }
        catch(Exception e){
                System.out.println(e);
        }
        
    }
    
    
    public static void main(String[] args){
        new SignUp2("").setVisible(true);
    }
}

    

