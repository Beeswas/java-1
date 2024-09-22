import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Regular here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentsGUI 
 {
    private JFrame studentframe;//decleration of jframe

    private JPanel regularpanel,dropoutpanel;//decleration of regular and dropout panel
    //decleration of regular JLabel,JTextField,JComboBox and JButton.
    private JLabel studentnameLabel,enrollmentidLabel,
    coursenameLabel,coursedurationLabel,tuitionfeeLabel,
    numberofmodulesLabel,numberofcredithoursLabel,
    numberofdayspresentLabel,numberofremainingmodulesLabel,
    numberofmonthsattendedLabel,remainingamountLabel,dateofbirthLabel,
    dateofenrollmentLabel,dateofdropoutLabel,titelrLabel; 

    private JTextField studentnameText,enrollmentidText,
    coursenameText,coursedurationText,tuitionfeeText,
    numberofmodulesText,numberofcredithoursText,
    numberofdayspresentText,numberofremainingmodulesText,
    numberofmonthsattendedText,remainingamountText; 

    private JComboBox dateofbirthComboBox,dateofbirthComboBoxm,dateofbirthComboBoxd,dateofenrollmentComboBox;

    private JButton addaregularstudent,
    presentpercentage,grantcertificate,
    clearrecord,dropoutButton,displayButton;
    private Regular regular;
    private int Rcourseduration,Rtuitionfee,Rnumofmodules,Renrollmentid,
    Rnumofcredithrs,Rdayspresent;
    private String Rcoursename,Rstudentname,Rdateofbirth,Rdateofenrollment; 
    ////decleration of dropout JLabel,JTextField,JComboBox and JButton.  
    private JLabel studentnameLabel1,enrollmentidLabel1,
    coursenameLabel1,coursedurationLabel1,tuitionfeeLabel1,
    numberofmodulesLabel1,numberofcredithoursLabel1,
    numberofremainingmodulesLabel1,
    numberofmonthsattendedLabel1,remainingamountLabel1,dateofbirthLabel1,
    dateofenrollmentLabel1,dateofdropoutLabel1,titeldLabel; 

    private JTextField studentnameText1,enrollmentidText1,
    coursenameText1,coursedurationText1,tuitionfeeText1,
    numberofremainingmodulesText1,
    numberofmonthsattendedText1,remainingamountText1; 

    private JComboBox dateofbirthComboBox1,dateofenrollmentComboBox1,
    dateofdropoutComboBox1;

    private JButton addadropoutstudent,
    paybills,removestudent,
    clearrecord1,regularButton,displayButton1;
    private Dropout dropout;
    private int Denrollmentid,Dcourseduration,Dtuitionfee,
    Dnumofremainingmodules,Dnumofmonthattend;
    private String Dcoursename,Dstudentname,Ddateofbirth,Ddateofenrollment,
    Ddateofdropout;
    private ArrayList<Students>student=new ArrayList<>();
    public Regular regularobjectdetails()
    {
    Rcourseduration=Integer.parseInt(coursedurationText.getText());
    Rtuitionfee=Integer.parseInt(tuitionfeeText.getText());
    Rnumofmodules=Integer.parseInt(numberofmodulesText.getText());
    Renrollmentid=Integer.parseInt(enrollmentidText.getText());
    Rnumofcredithrs=Integer.parseInt(numberofcredithoursText.getText());
    Rdayspresent=Integer.parseInt(numberofdayspresentText.getText());
    
    Rcoursename=coursenameText.getText();
    Rstudentname=studentnameText.getText();
    Rdateofbirth=dateofbirthComboBox.getSelectedItem().toString();
    Rdateofenrollment=dateofenrollmentComboBox.getSelectedItem().toString();
      

    
    Regular regular=new Regular( Rdateofbirth, Rstudentname,  Rcourseduration,Rtuitionfee, Rnumofmodules,
    Rnumofcredithrs, Rdayspresent, Renrollmentid, Rcoursename, Rdateofenrollment);
    
    
      return regular;  
    }
    
    public void regularenrollidcompare(int newenid,int dayPresent,ArrayList<Students>student)
    {
        for(Students students:student)
        {
         if (students instanceof Regular)   
         {
             if(students.getEnrollmentID()==newenid)
             {
                 String idcheck=((Regular)students).presentPercentage(Rdayspresent);
                 JOptionPane.showMessageDialog(null,"present value"+idcheck);
                 break;
                }
                else{
                   JOptionPane.showMessageDialog(null,"please enter correct enrollment id" );
                }
            
         }
        }
        
    }
    public void checkenidforgrandcertificate(int newenid,String entercourseName, String enterdateofenrollment ,ArrayList<Students>student){
       for(Students students:student)
        {
         if (students instanceof Regular)   
         {
             if(students.getEnrollmentID()== newenid)
             {
                 String idcheck=((Regular)students).grantCertificate( Rcoursename, Renrollmentid ,Rdateofenrollment);
                 JOptionPane.showMessageDialog(null,"certificate of this student is "+idcheck);
                 break;
                }
                else
                {
                 JOptionPane.showMessageDialog(null,"please enter correct enrollment id");
                }
            }
        }
    }
    public Dropout dropoutobjectdetails(){
        
        Denrollmentid=Integer.parseInt(enrollmentidText1.getText());
        Dcourseduration=Integer.parseInt(coursedurationText1.getText());
        Dtuitionfee=Integer.parseInt(tuitionfeeText1.getText());
        Dnumofremainingmodules=Integer.parseInt(numberofremainingmodulesText1.getText());
        Dnumofmonthattend=Integer.parseInt(numberofmonthsattendedText1.getText());

        Dcoursename=coursenameText1.getText();
        Dstudentname=studentnameText1.getText();

        Ddateofbirth=dateofbirthComboBox1.getSelectedItem().toString();
        Ddateofenrollment=dateofenrollmentComboBox1.getSelectedItem().toString();
        Ddateofdropout=dateofdropoutComboBox1.getSelectedItem().toString();
        
        dropout=new Dropout( Ddateofbirth,Dstudentname,Dcourseduration,Dtuitionfee,Dnumofremainingmodules, 
                             Dnumofmonthattend,Ddateofdropout,Denrollmentid, Dcoursename,Ddateofenrollment);
                             

        return dropout;
    }
    
    public  StudentsGUI()
    { 
        //GUI for regular students
        studentframe=new JFrame ("..Students_management_system.."); 
        studentframe.setSize(800,600);
        studentframe.setVisible(true);

        regularpanel=new JPanel();
        regularpanel.setSize(800,600);
        regularpanel.setLayout(null);
        regularpanel.setVisible(true);

        titelrLabel=new JLabel("Regular Management System ");
        titelrLabel.setBounds(300,60,200,40);
        regularpanel.add(titelrLabel);

        studentnameLabel=new JLabel("Student name");
        studentnameLabel.setBounds(150,140,100,40);
        regularpanel.add(studentnameLabel);

        studentnameText=new JTextField();
        studentnameText.setBounds(250,145,300,30);
        regularpanel.add(studentnameText);

        enrollmentidLabel=new JLabel("Enrollment ID ");
        enrollmentidLabel.setBounds(120,100,100,40);
        regularpanel.add(enrollmentidLabel);

        enrollmentidText=new JTextField();
        enrollmentidText.setBounds(220,105,150,30);
        regularpanel.add(enrollmentidText);

        coursenameLabel=new JLabel("Course Name");
        coursenameLabel.setBounds(150,220,100,40);
        regularpanel.add(coursenameLabel);

        coursenameText=new JTextField();
        coursenameText.setBounds(250,225,300,30);
        regularpanel.add(coursenameText);

        coursedurationLabel=new JLabel("Course Duration");
        coursedurationLabel.setBounds(450,180,150,40);
        regularpanel.add(coursedurationLabel);

        coursedurationText=new JTextField();
        coursedurationText.setBounds(560,185,150,30);
        regularpanel.add( coursedurationText);

        tuitionfeeLabel=new JLabel("Tuition Fee");
        tuitionfeeLabel.setBounds(120,260,100,40);
        regularpanel.add(tuitionfeeLabel);

        tuitionfeeText=new JTextField();
        tuitionfeeText.setBounds(220,265,140,30);
        regularpanel.add(tuitionfeeText);

        numberofmodulesLabel=new JLabel("Number Of Modules");
        numberofmodulesLabel.setBounds(420,260,150,40);
        regularpanel.add(numberofmodulesLabel);

        numberofmodulesText=new JTextField();
        numberofmodulesText.setBounds(560,265,140,30);
        regularpanel.add(numberofmodulesText);

        numberofcredithoursLabel=new JLabel("Number Of Credit Hours");
        numberofcredithoursLabel.setBounds(120,300,180,40);
        regularpanel.add(numberofcredithoursLabel);

        numberofcredithoursText=new JTextField();
        numberofcredithoursText.setBounds(280,305,150,30);
        regularpanel.add(numberofcredithoursText);

        numberofdayspresentLabel=new JLabel("Number Of Days Present");
        numberofdayspresentLabel.setBounds(470,300,180,40);
        regularpanel.add(numberofdayspresentLabel);

        numberofdayspresentText=new JTextField();
        numberofdayspresentText.setBounds(630,305,150,30);
        regularpanel.add(numberofdayspresentText);    

        dateofbirthLabel=new JLabel("Date Of Birth");
        dateofbirthLabel.setBounds(450,100,100,40);
       
        String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
        String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
        String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };
        dateofbirthComboBox=new JComboBox(years);
        dateofbirthComboBoxm=new JComboBox(months);
        dateofbirthComboBoxd=new JComboBox(dates);
        regularpanel.add(dateofbirthComboBoxm);
        dateofbirthComboBoxm.setBounds(600,100,80,40);
        dateofbirthComboBox.setBounds(520,100,100,40);
        dateofbirthComboBoxd.setBounds(680,100,80,40);
        regularpanel.add(dateofbirthComboBox);
        regularpanel.add(dateofbirthComboBoxd);
        regularpanel.add(dateofbirthComboBoxm);
        
        dateofenrollmentLabel=new JLabel("Date Of Enrollment");
        dateofenrollmentLabel.setBounds(120,180,150,40);
        dateofenrollmentComboBox=new JComboBox();
        for(int i=1990;i<=2022;i++)
        {
            dateofenrollmentComboBox.addItem(i);
        }
        dateofenrollmentComboBox.setBounds(260,180,100,40);
        regularpanel.add(dateofenrollmentComboBox);
        regularpanel.add(dateofenrollmentLabel);

        addaregularstudent=new JButton("Add regular Student");
        addaregularstudent.setBounds(160,340,200,50);
        regularpanel.add(addaregularstudent);
        addaregularstudent.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e1)
            {
                
                Regular studentregular= regularobjectdetails();
                student.add(studentregular);
                JOptionPane.showMessageDialog(null,"regular student is added in the list");
                
            }
        });

        presentpercentage=new JButton("Present Percentage");
        presentpercentage.setBounds(420,340,200,50);
        regularpanel.add(presentpercentage);
       
        presentpercentage.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e1)
            {
              String enternewid=JOptionPane.showInputDialog(null,"insert enrollmentid"+JOptionPane.PLAIN_MESSAGE);
              String enterdayspresent=JOptionPane.showInputDialog(null,"insert dayspresent"+JOptionPane.PLAIN_MESSAGE);
              int newenid=Integer.valueOf(enternewid);
              int dayPresent=Integer.valueOf(enterdayspresent);
              regularenrollidcompare(newenid,dayPresent,student);
            }
            });


        grantcertificate=new JButton("Grant Certificate");
        grantcertificate.setBounds(240,400,300,50);
        regularpanel.add(grantcertificate);
        grantcertificate.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e3)
            {
               String insertenid=JOptionPane.showInputDialog(null,"insert enrollmentid"+JOptionPane.PLAIN_MESSAGE);
               String entercourseName=JOptionPane.showInputDialog(null,"insert coursename"+JOptionPane.PLAIN_MESSAGE);
               String enterdateofenrollment=JOptionPane.showInputDialog(null,"insert dateofenrollment"+JOptionPane.PLAIN_MESSAGE); 
               int newenid=Integer.valueOf(insertenid);
               checkenidforgrandcertificate( newenid,entercourseName,enterdateofenrollment,student);
            }
        });


        clearrecord=new JButton("Clear Record");
        clearrecord.setBounds(260,450,100,50);
        regularpanel.add(clearrecord);
        clearrecord.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e1)
            {
                enrollmentidText.setText("");
                coursedurationText.setText("");
                tuitionfeeText.setText("");
                numberofmodulesText.setText("");
                numberofcredithoursText.setText("");
                numberofcredithoursText.setText("");
                numberofdayspresentText.setText("");
                coursenameText.setText("");
                studentnameText.setText("");
                dateofbirthComboBox.setSelectedItem("");
                dateofenrollmentComboBox.setSelectedItem("");
                
            }
        });

        

        displayButton=new JButton("DISPLAY");
        displayButton.setBounds(420,450,100,50);
        regularpanel.add(displayButton);
        displayButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e1)
            {
                Regular studentregular= regularobjectdetails();
                studentregular.display();
                
            }
        });

        dropoutButton=new JButton("Go To Dropout");
        dropoutButton.setBounds(310,30,200,40);
        regularpanel.add(dropoutButton);
        dropoutButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e1)
            {
             regularpanel.setVisible(false); 
             dropoutpanel.setVisible(true); 
             JOptionPane.showMessageDialog(null,"welcome to dropout management system");
            }
        });
        

        studentframe.add(regularpanel);
        regularpanel.setBackground(Color.yellow);
        studentframe.setResizable(false);

        //GUI for dropout students   
        dropoutpanel=new JPanel();
        dropoutpanel.setSize(800,600);
        dropoutpanel.setLayout(null);
        
        titeldLabel=new JLabel("Dropout Management System ");
        titeldLabel.setBounds(300,60,200,40);
        dropoutpanel.add(titeldLabel);

        studentnameLabel1=new JLabel("Student name");
        studentnameLabel1.setBounds(150,140,100,40);
        dropoutpanel.add(studentnameLabel1);

        studentnameText1=new JTextField();
        studentnameText1.setBounds(250,145,300,30);
        dropoutpanel.add(studentnameText1);

        enrollmentidLabel1=new JLabel("Enrollment ID ");
        enrollmentidLabel1.setBounds(120,100,100,40);
        dropoutpanel.add(enrollmentidLabel1);

        enrollmentidText1=new JTextField();
        enrollmentidText1.setBounds(220,105,100,30);
        dropoutpanel.add(enrollmentidText1);

        coursenameLabel1=new JLabel("Course Name");
        coursenameLabel1.setBounds(150,220,100,40);
        dropoutpanel.add(coursenameLabel1);

        coursenameText1=new JTextField();
        coursenameText1.setBounds(250,225,300,30);
        dropoutpanel.add(coursenameText1);

        coursedurationLabel1=new JLabel("Course Duration");
        coursedurationLabel1.setBounds(500,180,150,40);
        dropoutpanel.add(coursedurationLabel1);

        coursedurationText1=new JTextField();
        coursedurationText1.setBounds(620,185,100,30);
        dropoutpanel.add( coursedurationText1);

        tuitionfeeLabel1=new JLabel("Tuition Fee");
        tuitionfeeLabel1.setBounds(120,260,100,40);
        dropoutpanel.add(tuitionfeeLabel1);

        tuitionfeeText1=new JTextField();
        tuitionfeeText1.setBounds(220,260,100,30);
        dropoutpanel.add(tuitionfeeText1);      

        numberofremainingmodulesLabel1=new JLabel("Number Of Remaining Modules");
        numberofremainingmodulesLabel1.setBounds(360,260,200,40);
        dropoutpanel.add(numberofremainingmodulesLabel1);

        numberofremainingmodulesText1=new JTextField();
        numberofremainingmodulesText1.setBounds(560,265,150,30);
        dropoutpanel.add(numberofremainingmodulesText1);

        numberofmonthsattendedLabel1=new JLabel("Number Of Months Attended");
        numberofmonthsattendedLabel1.setBounds(80,300,200,40);
        dropoutpanel.add(numberofmonthsattendedLabel1);

        numberofmonthsattendedText1=new JTextField();
        numberofmonthsattendedText1.setBounds(280,305,100,30);
        dropoutpanel.add(numberofmonthsattendedText1);      

        dateofbirthLabel1=new JLabel("Date Of Birth");
        dateofbirthLabel1.setBounds(410,100,100,40);
        dateofbirthComboBox1=new JComboBox();
        for(int i=1990; i<=2020; i++)
        {
            dateofbirthComboBox1.addItem(i); 
        }
        dateofbirthComboBox1.setBounds(510,100,100,40);   
        dropoutpanel.add(dateofbirthComboBox1);
        dropoutpanel.add(dateofbirthLabel1);

        dateofenrollmentLabel1=new JLabel("Date Of Enrollment");
        dateofenrollmentLabel1.setBounds(120,180,150,40);
        dateofenrollmentComboBox1=new JComboBox();
        for(int i=1990;i<=2022;i++)
        {
            dateofenrollmentComboBox1.addItem(i);
        }
        dateofenrollmentComboBox1.setBounds(260,180,100,40);
        dropoutpanel.add(dateofenrollmentComboBox1);
        dropoutpanel.add(dateofenrollmentLabel1);

        dateofdropoutLabel1=new JLabel("Date Of dropout");
        dateofdropoutLabel1.setBounds(400,300,100,40);
        dateofdropoutComboBox1=new JComboBox();
        for(int i=1990;i<=2022;i++)
        {
            dateofdropoutComboBox1.addItem(i);
        }
        dateofdropoutComboBox1.setBounds(500,300,100,40);
        dropoutpanel.add(dateofdropoutComboBox1);
        dropoutpanel.add(dateofdropoutLabel1);

        addadropoutstudent=new JButton("Add dropout student");
        addadropoutstudent.setBounds(160,340,200,50);
        dropoutpanel.add(addadropoutstudent);
        addadropoutstudent.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e1)
            {
                Dropout studentdropout= dropoutobjectdetails();
                student.add(studentdropout);
                JOptionPane.showMessageDialog(null,"dropout student is added in the list");
                
                
            }
        });

        

        paybills=new JButton("Pay Bills");
        paybills.setBounds(420,340,200,50);
        dropoutpanel.add(paybills);

        removestudent=new JButton("Remove Student");
        removestudent.setBounds(240,400,300,50);
        dropoutpanel.add(removestudent);

        clearrecord1=new JButton("Clear Record");
        clearrecord1.setBounds(260,450,100,50);
        dropoutpanel.add(clearrecord1);
        
        displayButton1=new JButton("DISPLAY");
        displayButton1.setBounds(420,450,100,50);
        dropoutpanel.add(displayButton1);
        displayButton1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e5)
            {
                Dropout studentdropout= dropoutobjectdetails();
                studentdropout.display();
                System.out.println(studentdropout);
            }
        });


        regularButton=new JButton("Go To Regular");
        regularButton.setBounds(310,30,200,40);
        dropoutpanel.add(regularButton);
        regularButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e1)
            {
             regularpanel.setVisible(true); 
             dropoutpanel.setVisible(false); 
             JOptionPane.showMessageDialog(null,"welcome to regular management system");
            }
        });
        

        studentframe.add( dropoutpanel);
        dropoutpanel.setBackground(Color.yellow);
        dropoutpanel.setVisible(false);
        studentframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String []agr){
        
        
    }
}   

      
