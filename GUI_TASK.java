
////////////////////////////////////ONLINE BOOK READING CORNER/////////////////////////////////////////////////////////

package com.company;
import javax.swing.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import javax.swing.ImageIcon;

public class GUI_TASK {
    ButtonGroup bg;
    JCheckBox jc;
    JButton jb, b,JB2;
    JLabel lb;
    JTextField tf, t;
    JPasswordField ps;
    JRadioButton jr, r1;
    JComboBox bx;

    public void clearfield() {
        tf.setText(null);
        ps.setText(null);
        jr.setSelected(false);
        r1.setSelected(false);
        bg.clearSelection();
        t.setText(null);
        bx.setSelectedIndex(0);
        lb.setText(null);
        jc.setSelected(false);

    }

    GUI_TASK() {

        JFrame first_f=new JFrame("WELLCOME");
        first_f.setSize(2000,2000);
        JLabel lb=new JLabel("ONLINE BOOK READING CORNER");
        lb.setFont(new Font("Algerian",Font.ROMAN_BASELINE,40));
        lb.setBounds(350,0,800,300);
        first_f.getContentPane().add(lb);
        first_f.setLocationRelativeTo(null);
        first_f.setLayout(null);

        first_f.setLayout(new FlowLayout());
        JLabel label=new JLabel(new ImageIcon("E:\\Project Stuff\\fram.png"));
        first_f.setResizable(false);

        first_f.add(label);
        label.setLayout(new FlowLayout());

        JButton jButton=new JButton("BOOK ISSUANCE");
        jButton.setBounds(400,300,150,50);
        label.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame f = new JFrame("Sign Up");
                f.setSize(800, 800);
                f.getContentPane().setBackground(Color.pink);
                f.setVisible(true);
                f.setLocationRelativeTo(null);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLayout(null);


                JLabel l1 = new JLabel("Sign Up!");
                l1.setBounds(150, 0, 400, 300);
                l1.setFont(new Font("Arial",Font.BOLD,30));
                JLabel L = new JLabel("It's Quick And Easy.");
                L.setBounds(150,20,400,300);
                f.getContentPane().add(L);

                f.getContentPane().add(l1);
                JLabel l2 = new JLabel("NAME: ");
                l2.setBounds(120, 350, 100, 30);
                f.getContentPane().add(l2);
                t = new JTextField();
                t.setBounds(250, 350, 150, 30);
                f.getContentPane().add(t);
                JLabel l3 = new JLabel("PASSWORD: ");
                l3.setBounds(120, 400, 100, 30);
                f.getContentPane().add(l3);
                JPasswordField p = new JPasswordField();
                p.setBounds(250, 400, 150, 30);
                f.getContentPane().add(p);
                JLabel l4 = new JLabel("GENDER: ");
                l4.setBounds(120, 450, 100, 30);
                f.getContentPane().add(l4);

                JRadioButton r = new JRadioButton("MALE");
                r.setBounds(250, 450, 100, 30);

                JRadioButton r1 = new JRadioButton("FEMALE");
                r1.setBounds(350, 450, 100, 30);
                ButtonGroup bg = new ButtonGroup();
                bg.add(r);
                bg.add(r1);

                f.getContentPane().add(r);
                f.getContentPane().add(r1);
                JLabel l5 = new JLabel("CITY: ");
                l5.setBounds(120, 500, 100, 30);
                f.getContentPane().add(l5);
                String Select[] = {"None","Hyderabad", "Lahore", "Karachi"};
                JComboBox jc = new JComboBox(Select);
                jc.setBounds(250, 500, 100, 30);
                f.getContentPane().add(jc);
                JLabel l6 = new JLabel("Email: ");
                l6.setBounds(120, 550, 100, 30);
                f.getContentPane().add(l6);
                JTextField tf = new JTextField();
                tf.setBounds(250, 550, 150, 30);
                f.getContentPane().add(tf);

                JButton jb = new JButton("Sign Up");
                jb.setBounds(250, 650, 100, 30);
                f.getContentPane().add(jb);
                JLabel l7 = new JLabel("");
                l7.setBounds(650, 700, 300, 30);
                f.getContentPane().add(l7);
                jb.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {


                        String Name = t.getText(); //Store username entered by the user in the variable "username"
                        String password = p.getText(); //Store password entered by the user in the variable "password"
                        String Email=tf.getText();
                        boolean actualValue =r.isSelected();
                        boolean Value=r1.isSelected();
                        int i=0;

                        if(Name.equals("")) //If username is null
                        {
                            JOptionPane.showMessageDialog(null,"Please enter username","Error Message",JOptionPane.ERROR_MESSAGE); //Display dialog box with the message
                        }
                        else if(password.equals("")) //If password is null
                        {
                            JOptionPane.showMessageDialog(null,"Please enter password","Error Message",JOptionPane.ERROR_MESSAGE); //Display dialog box with the message
                        }

                        else if(Email.equals(""))
                        {
                            JOptionPane.showMessageDialog(null,"Please enter Email","Error Message",JOptionPane.ERROR_MESSAGE);
                        }
                        else if(Email.equals(i)){
                            JOptionPane.showMessageDialog(null,"Characters Required");
                        }
                        else if(e.getSource()==r) {

                        }
                        else if(e.getSource()==r1){

                        }
                        else if(actualValue==false && Value==false){
                            JOptionPane.showMessageDialog(null,"Select Gender");

                        }

                        else{
                            JFrame frame=new JFrame("LOG IN");
                            frame.setSize(400,300);
                            JLabel l1,l2;
                            frame.setLayout(null);
                            //JPanel panel = new JPanel();
                            l1=new JLabel("Username");  //Create label Username
                            l1.setBounds(80,50,60,30); //x axis, y axis, width, height
                            frame.add(l1);

                            JTextField F_user = new JTextField(); //Create text field for username
                            F_user.setBounds(150, 50, 150, 30);
                            frame.add(F_user);


                            l2=new JLabel("Password");  //Create label Password
                            l2.setBounds(80,100, 60,30);
                            frame.add(l2);

                            JPasswordField F_pass=new JPasswordField(); //Create text field for password
                            F_pass.setBounds(150, 100, 150, 30);
                            frame.getContentPane().add(F_pass);

                            JButton login_but=new JButton("Login");//creating instance of JButton for Login Button
                            login_but.setBounds(130,170,100,30);
                            frame.add(login_but);

                            login_but.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    String username = F_user.getText(); //Store username entered by the user in the variable "username"
                                    String password = F_pass.getText(); //Store password entered by the user in the variable "password"

                                    if(username.equals("")) //If username is null
                                    {
                                        JOptionPane.showMessageDialog(null,"Please enter username"); //Display dialog box with the message
                                    }
                                    else if(password.equals("")) //If password is null
                                    {
                                        JOptionPane.showMessageDialog(null,"Please enter password"); //Display dialog box with the message
                                    }
                                    else if(!password.equals(F_pass.getText())){
                                        JOptionPane.showMessageDialog(null,"Incorrect Username Or Password","warn",JOptionPane.WARNING_MESSAGE);
                                    }
                                    else if(!username.equals(F_user.getText())){
                                        JOptionPane.showMessageDialog(null,"incorrect user name )R Password","warning",JOptionPane.ERROR_MESSAGE);
                                    }

                                    else{

                                        JFrame log=new JFrame("BOOKS LIST");
                                        JLabel log_label=new JLabel("Available Books");
                                        log_label.setFont(new Font("Brittney",Font.BOLD,30));
                                        log_label.setBounds(50,30,250,30);
                                        log.setSize(400,700);
                                        log.setResizable(false);

                                        log.setLayout(new FlowLayout());
                                        //JLabel lab=new JLabel(new ImageIcon("E:\\2nd Semester\\OOP\\pic.png"));
                                        //log.add(lab);
                                        // lab.setLayout(new FlowLayout());
                                        log.setLocationRelativeTo(null);
                                        log.setLayout(null);


                                        log.add(log_label);



                                        JButton bk1=new JButton("C++");
                                        bk1.setBounds(120,100,120,40);
                                        log.add(bk1);
                                        bk1.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JFrame frame1=new JFrame("Student's Info");
                                                JLabel label1=new JLabel("Enter Details");
                                                label1.setBounds(50,40,250,30);
                                                label1.setFont(new Font("Brittney",Font.BOLD,30));
                                                frame1.setSize(800,800);
                                                frame1.add(label1);


                                                JLabel l2=new JLabel("NAME:");
                                                l2.setBounds(120,150,150,30);
                                                JTextField t2=new JTextField();
                                                t2.setBounds(250,150,150,30);
                                                frame1.add(l2);
                                                frame1.add(t2);



                                                JLabel l3=new JLabel("ROLL NUMBER:");
                                                l3.setBounds(120,200,150,30);
                                                JTextField t3=new JTextField();
                                                t3.setBounds(250,200,150,30);
                                                frame1.add(l3);
                                                frame1.add(t3);





                                                JLabel l4=new JLabel("DEPARTMENT:");
                                                l4.setBounds(120,250,150,30);
                                                JTextField t4=new JTextField();
                                                t4.setBounds(250,250,150,30);
                                                frame1.add(l4);
                                                frame1.add(t4);

                                                JLabel l5=new JLabel("SEMESTER:");
                                                l5.setBounds(120,300,150,30);
                                                JTextField t5=new JTextField();
                                                t5.setBounds(250,300,150,30);
                                                frame1.add(l5);
                                                frame1.add(t5);

                                                JLabel l6=new JLabel("ISSUANCE PERIOD:");
                                                l6.setBounds(120,350,150,30);
                                                String select[]={"None","10 Days","30 Days","60 Days","Semester"};
                                                JComboBox jc1=new JComboBox(select);
                                                jc1.setBounds(250,350,150,30);
                                                frame1.add(l6);
                                                frame1.add(jc1);

                                                JLabel l7=new JLabel("CITY:");
                                                l7.setBounds(120,400,150,30);
                                                JTextField t7=new JTextField();
                                                t7.setBounds(250,400,150,30);
                                                frame1.add(l7);
                                                frame1.add(t7);

                                                JLabel l8=new JLabel("POSTAL ADDRESS:");
                                                l8.setBounds(120,450,150,30);
                                                JTextField t8=new JTextField();
                                                t8.setBounds(250,450,150,30);
                                                frame1.add(l8);
                                                frame1.add(t8);

                                                JLabel l9=new JLabel("ISSUANCE DATE");
                                                l9.setBounds(120,500,150,30);
                                                JTextField t9=new JTextField();
                                                t9.setBounds(250,500,150,30);
                                                String txtDate=new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH).format(new Date());
                                                t9.setText(txtDate);
                                                frame1.add(l9);
                                                frame1.add(t9);






                                                JButton procced_but=new JButton("Done");
                                                procced_but.setBounds(300,650,150,30);
                                                frame1.add(procced_but);
                                                procced_but.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        String name= t2.getText();
                                                        String roll_num=t3.getText();
                                                        String dept=t4.getText();
                                                        String sem=t5.getText();
                                                        String city=t7.getText();
                                                        String postal_add=t8.getText();



                                                        if (name.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter name");
                                                        }
                                                        else  if(roll_num.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter roll number");

                                                        }
                                                        else if(dept.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter department");

                                                        }
                                                        else if(sem.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter semester");

                                                        }
                                                        else if(city.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter city");
                                                        }
                                                        else if (postal_add.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter postal address");

                                                        }

                                                        else{
                                                            JOptionPane.showMessageDialog(null,"your book is issued");
                                                        }

                                                    }
                                                });
                                                frame1.setLayout(null);
                                                frame1.setLocationRelativeTo(null);
                                                frame1.setVisible(true);





                                            }
                                        });

                                        JButton bk2=new JButton("JAVA");
                                        bk2.setBounds(120,150,120,40);
                                        log.add(bk2);


                                        bk2.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JFrame frame1=new JFrame("Student's Info");
                                                JLabel label1=new JLabel("Enter Details");
                                                label1.setBounds(50,40,250,30);
                                                label1.setFont(new Font("Brittney",Font.BOLD,30));
                                                frame1.setSize(800,800);
                                                frame1.add(label1);


                                                JLabel l2=new JLabel("NAME:");
                                                l2.setBounds(120,150,150,30);
                                                JTextField t2=new JTextField();
                                                t2.setBounds(250,150,150,30);
                                                frame1.add(l2);
                                                frame1.add(t2);



                                                JLabel l3=new JLabel("ROLL NUMBER:");
                                                l3.setBounds(120,200,150,30);
                                                JTextField t3=new JTextField();
                                                t3.setBounds(250,200,150,30);
                                                frame1.add(l3);
                                                frame1.add(t3);





                                                JLabel l4=new JLabel("DEPARTMENT:");
                                                l4.setBounds(120,250,150,30);
                                                JTextField t4=new JTextField();
                                                t4.setBounds(250,250,150,30);
                                                frame1.add(l4);
                                                frame1.add(t4);

                                                JLabel l5=new JLabel("SEMESTER:");
                                                l5.setBounds(120,300,150,30);
                                                JTextField t5=new JTextField();
                                                t5.setBounds(250,300,150,30);
                                                frame1.add(l5);
                                                frame1.add(t5);

                                                JLabel l6=new JLabel("ISSUANCE PERIOD:");
                                                l6.setBounds(120,350,150,30);
                                                String select[]={"None","10 Days","30 Days","60 Days","Semester"};
                                                JComboBox jc1=new JComboBox(select);
                                                jc1.setBounds(250,350,150,30);
                                                frame1.add(l6);
                                                frame1.add(jc1);

                                                JLabel l7=new JLabel("CITY:");
                                                l7.setBounds(120,400,150,30);
                                                JTextField t7=new JTextField();
                                                t7.setBounds(250,400,150,30);
                                                frame1.add(l7);
                                                frame1.add(t7);

                                                JLabel l8=new JLabel("POSTAL ADDRESS:");
                                                l8.setBounds(120,450,150,30);
                                                JTextField t8=new JTextField();
                                                t8.setBounds(250,450,150,30);
                                                frame1.add(l8);
                                                frame1.add(t8);

                                                JLabel l9=new JLabel("ISSUANCE DATE");
                                                l9.setBounds(120,500,150,30);
                                                JTextField t9=new JTextField();
                                                t9.setBounds(250,500,150,30);
                                                String txtDate=new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH).format(new Date());
                                                t9.setText(txtDate);
                                                frame1.add(l9);
                                                frame1.add(t9);






                                                JButton procced_but=new JButton("Done");
                                                procced_but.setBounds(300,650,150,30);
                                                frame1.add(procced_but);
                                                procced_but.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        String name= t2.getText();
                                                        String roll_num=t3.getText();
                                                        String dept=t4.getText();
                                                        String sem=t5.getText();
                                                        String city=t7.getText();
                                                        String postal_add=t8.getText();



                                                        if (name.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter name");
                                                        }
                                                        else  if(roll_num.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter roll number");

                                                        }
                                                        else if(dept.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter department");

                                                        }
                                                        else if(sem.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter semester");

                                                        }
                                                        else if(city.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter city");
                                                        }
                                                        else if (postal_add.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter postal address");

                                                        }

                                                        else{
                                                            JOptionPane.showMessageDialog(null,"your book is issued");
                                                        }

                                                    }
                                                });
                                                frame1.setLayout(null);
                                                frame1.setLocationRelativeTo(null);
                                                frame1.setVisible(true);

                                            }
                                        });

                                        JButton bk3=new JButton("PHP");
                                        bk3.setBounds(120,200,120,40);
                                        log.add(bk3);

                                        bk3.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JFrame frame1=new JFrame("Student's Info");
                                                JLabel label1=new JLabel("Enter Details");
                                                label1.setBounds(50,40,250,30);
                                                label1.setFont(new Font("Brittney",Font.BOLD,30));
                                                frame1.setSize(800,800);
                                                frame1.add(label1);


                                                JLabel l2=new JLabel("NAME:");
                                                l2.setBounds(120,150,150,30);
                                                JTextField t2=new JTextField();
                                                t2.setBounds(250,150,150,30);
                                                frame1.add(l2);
                                                frame1.add(t2);



                                                JLabel l3=new JLabel("ROLL NUMBER:");
                                                l3.setBounds(120,200,150,30);
                                                JTextField t3=new JTextField();
                                                t3.setBounds(250,200,150,30);
                                                frame1.add(l3);
                                                frame1.add(t3);





                                                JLabel l4=new JLabel("DEPARTMENT:");
                                                l4.setBounds(120,250,150,30);
                                                JTextField t4=new JTextField();
                                                t4.setBounds(250,250,150,30);
                                                frame1.add(l4);
                                                frame1.add(t4);

                                                JLabel l5=new JLabel("SEMESTER:");
                                                l5.setBounds(120,300,150,30);
                                                JTextField t5=new JTextField();
                                                t5.setBounds(250,300,150,30);
                                                frame1.add(l5);
                                                frame1.add(t5);

                                                JLabel l6=new JLabel("ISSUANCE PERIOD:");
                                                l6.setBounds(120,350,150,30);
                                                String select[]={"None","10 Days","30 Days","60 Days","Semester"};
                                                JComboBox jc1=new JComboBox(select);
                                                jc1.setBounds(250,350,150,30);
                                                frame1.add(l6);
                                                frame1.add(jc1);

                                                JLabel l7=new JLabel("CITY:");
                                                l7.setBounds(120,400,150,30);
                                                JTextField t7=new JTextField();
                                                t7.setBounds(250,400,150,30);
                                                frame1.add(l7);
                                                frame1.add(t7);

                                                JLabel l8=new JLabel("POSTAL ADDRESS:");
                                                l8.setBounds(120,450,150,30);
                                                JTextField t8=new JTextField();
                                                t8.setBounds(250,450,150,30);
                                                frame1.add(l8);
                                                frame1.add(t8);

                                                JLabel l9=new JLabel("ISSUANCE DATE");
                                                l9.setBounds(120,500,150,30);
                                                JTextField t9=new JTextField();
                                                t9.setBounds(250,500,150,30);
                                                String txtDate=new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH).format(new Date());
                                                t9.setText(txtDate);
                                                frame1.add(l9);
                                                frame1.add(t9);






                                                JButton procced_but=new JButton("Done");
                                                procced_but.setBounds(300,650,150,30);
                                                frame1.add(procced_but);
                                                procced_but.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        String name= t2.getText();
                                                        String roll_num=t3.getText();
                                                        String dept=t4.getText();
                                                        String sem=t5.getText();
                                                        String city=t7.getText();
                                                        String postal_add=t8.getText();



                                                        if (name.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter name");
                                                        }
                                                        else  if(roll_num.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter roll number");

                                                        }
                                                        else if(dept.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter department");

                                                        }
                                                        else if(sem.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter semester");

                                                        }
                                                        else if(city.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter city");
                                                        }
                                                        else if (postal_add.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter postal address");

                                                        }

                                                        else{
                                                            JOptionPane.showMessageDialog(null,"your book is issued");
                                                        }

                                                    }
                                                });
                                                frame1.setLayout(null);
                                                frame1.setLocationRelativeTo(null);
                                                frame1.setVisible(true);

                                            }
                                        });

                                        JButton bk4=new JButton("HTML");
                                        bk4.setBounds(120,250,120,40);
                                        log.add(bk4);

                                        bk4.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JFrame frame1=new JFrame("Student's Info");
                                                JLabel label1=new JLabel("Enter Details");
                                                label1.setBounds(50,40,250,30);
                                                label1.setFont(new Font("Brittney",Font.BOLD,30));
                                                frame1.setSize(800,800);
                                                frame1.add(label1);


                                                JLabel l2=new JLabel("NAME:");
                                                l2.setBounds(120,150,150,30);
                                                JTextField t2=new JTextField();
                                                t2.setBounds(250,150,150,30);
                                                frame1.add(l2);
                                                frame1.add(t2);



                                                JLabel l3=new JLabel("ROLL NUMBER:");
                                                l3.setBounds(120,200,150,30);
                                                JTextField t3=new JTextField();
                                                t3.setBounds(250,200,150,30);
                                                frame1.add(l3);
                                                frame1.add(t3);





                                                JLabel l4=new JLabel("DEPARTMENT:");
                                                l4.setBounds(120,250,150,30);
                                                JTextField t4=new JTextField();
                                                t4.setBounds(250,250,150,30);
                                                frame1.add(l4);
                                                frame1.add(t4);

                                                JLabel l5=new JLabel("SEMESTER:");
                                                l5.setBounds(120,300,150,30);
                                                JTextField t5=new JTextField();
                                                t5.setBounds(250,300,150,30);
                                                frame1.add(l5);
                                                frame1.add(t5);

                                                JLabel l6=new JLabel("ISSUANCE PERIOD:");
                                                l6.setBounds(120,350,150,30);
                                                String select[]={"None","10 Days","30 Days","60 Days","Semester"};
                                                JComboBox jc1=new JComboBox(select);
                                                jc1.setBounds(250,350,150,30);
                                                frame1.add(l6);
                                                frame1.add(jc1);

                                                JLabel l7=new JLabel("CITY:");
                                                l7.setBounds(120,400,150,30);
                                                JTextField t7=new JTextField();
                                                t7.setBounds(250,400,150,30);
                                                frame1.add(l7);
                                                frame1.add(t7);

                                                JLabel l8=new JLabel("POSTAL ADDRESS:");
                                                l8.setBounds(120,450,150,30);
                                                JTextField t8=new JTextField();
                                                t8.setBounds(250,450,150,30);
                                                frame1.add(l8);
                                                frame1.add(t8);

                                                JLabel l9=new JLabel("ISSUANCE DATE");
                                                l9.setBounds(120,500,150,30);
                                                JTextField t9=new JTextField();
                                                t9.setBounds(250,500,150,30);
                                                String txtDate=new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH).format(new Date());
                                                t9.setText(txtDate);
                                                frame1.add(l9);
                                                frame1.add(t9);






                                                JButton procced_but=new JButton("Done");
                                                procced_but.setBounds(300,650,150,30);
                                                frame1.add(procced_but);
                                                procced_but.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        String name= t2.getText();
                                                        String roll_num=t3.getText();
                                                        String dept=t4.getText();
                                                        String sem=t5.getText();
                                                        String city=t7.getText();
                                                        String postal_add=t8.getText();



                                                        if (name.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter name");
                                                        }
                                                        else  if(roll_num.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter roll number");

                                                        }
                                                        else if(dept.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter department");

                                                        }
                                                        else if(sem.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter semester");

                                                        }
                                                        else if(city.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter city");
                                                        }
                                                        else if (postal_add.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter postal address");

                                                        }

                                                        else{
                                                            JOptionPane.showMessageDialog(null,"your book is issued");
                                                        }

                                                    }
                                                });
                                                frame1.setLayout(null);
                                                frame1.setLocationRelativeTo(null);
                                                frame1.setVisible(true);

                                            }
                                        });

                                        JButton bk5=new JButton("CSS");
                                        bk5.setBounds(120,300,120,40);
                                        log.add(bk5);

                                        bk5.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JFrame frame1=new JFrame("Student's Info");
                                                JLabel label1=new JLabel("Enter Details");
                                                label1.setBounds(50,40,250,30);
                                                label1.setFont(new Font("Brittney",Font.BOLD,30));
                                                frame1.setSize(800,800);
                                                frame1.add(label1);


                                                JLabel l2=new JLabel("NAME:");
                                                l2.setBounds(120,150,150,30);
                                                JTextField t2=new JTextField();
                                                t2.setBounds(250,150,150,30);
                                                frame1.add(l2);
                                                frame1.add(t2);



                                                JLabel l3=new JLabel("ROLL NUMBER:");
                                                l3.setBounds(120,200,150,30);
                                                JTextField t3=new JTextField();
                                                t3.setBounds(250,200,150,30);
                                                frame1.add(l3);
                                                frame1.add(t3);





                                                JLabel l4=new JLabel("DEPARTMENT:");
                                                l4.setBounds(120,250,150,30);
                                                JTextField t4=new JTextField();
                                                t4.setBounds(250,250,150,30);
                                                frame1.add(l4);
                                                frame1.add(t4);

                                                JLabel l5=new JLabel("SEMESTER:");
                                                l5.setBounds(120,300,150,30);
                                                JTextField t5=new JTextField();
                                                t5.setBounds(250,300,150,30);
                                                frame1.add(l5);
                                                frame1.add(t5);

                                                JLabel l6=new JLabel("ISSUANCE PERIOD:");
                                                l6.setBounds(120,350,150,30);
                                                String select[]={"None","10 Days","30 Days","60 Days","Semester"};
                                                JComboBox jc1=new JComboBox(select);
                                                jc1.setBounds(250,350,150,30);
                                                frame1.add(l6);
                                                frame1.add(jc1);

                                                JLabel l7=new JLabel("CITY:");
                                                l7.setBounds(120,400,150,30);
                                                JTextField t7=new JTextField();
                                                t7.setBounds(250,400,150,30);
                                                frame1.add(l7);
                                                frame1.add(t7);

                                                JLabel l8=new JLabel("POSTAL ADDRESS:");
                                                l8.setBounds(120,450,150,30);
                                                JTextField t8=new JTextField();
                                                t8.setBounds(250,450,150,30);
                                                frame1.add(l8);
                                                frame1.add(t8);

                                                JLabel l9=new JLabel("ISSUANCE DATE");
                                                l9.setBounds(120,500,150,30);
                                                JTextField t9=new JTextField();
                                                t9.setBounds(250,500,150,30);
                                                String txtDate=new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH).format(new Date());
                                                t9.setText(txtDate);
                                                frame1.add(l9);
                                                frame1.add(t9);






                                                JButton procced_but=new JButton("Done");
                                                procced_but.setBounds(300,650,150,30);
                                                frame1.add(procced_but);
                                                procced_but.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        String name= t2.getText();
                                                        String roll_num=t3.getText();
                                                        String dept=t4.getText();
                                                        String sem=t5.getText();
                                                        String city=t7.getText();
                                                        String postal_add=t8.getText();



                                                        if (name.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter name");
                                                        }
                                                        else  if(roll_num.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter roll number");

                                                        }
                                                        else if(dept.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter department");

                                                        }
                                                        else if(sem.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter semester");

                                                        }
                                                        else if(city.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter city");
                                                        }
                                                        else if (postal_add.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter postal address");

                                                        }

                                                        else{
                                                            JOptionPane.showMessageDialog(null,"your book is issued");
                                                        }

                                                    }
                                                });
                                                frame1.setLayout(null);
                                                frame1.setLocationRelativeTo(null);
                                                frame1.setVisible(true);

                                            }
                                        });

                                        JButton bk6=new JButton("JAVASCRIPT");
                                        bk6.setBounds(120,350,120,40);
                                        log.add(bk6);

                                        bk6.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JFrame frame1=new JFrame("Student's Info");
                                                JLabel label1=new JLabel("Enter Details");
                                                label1.setBounds(50,40,250,30);
                                                label1.setFont(new Font("Brittney",Font.BOLD,30));
                                                frame1.setSize(800,800);
                                                frame1.add(label1);


                                                JLabel l2=new JLabel("NAME:");
                                                l2.setBounds(120,150,150,30);
                                                JTextField t2=new JTextField();
                                                t2.setBounds(250,150,150,30);
                                                frame1.add(l2);
                                                frame1.add(t2);



                                                JLabel l3=new JLabel("ROLL NUMBER:");
                                                l3.setBounds(120,200,150,30);
                                                JTextField t3=new JTextField();
                                                t3.setBounds(250,200,150,30);
                                                frame1.add(l3);
                                                frame1.add(t3);





                                                JLabel l4=new JLabel("DEPARTMENT:");
                                                l4.setBounds(120,250,150,30);
                                                JTextField t4=new JTextField();
                                                t4.setBounds(250,250,150,30);
                                                frame1.add(l4);
                                                frame1.add(t4);

                                                JLabel l5=new JLabel("SEMESTER:");
                                                l5.setBounds(120,300,150,30);
                                                JTextField t5=new JTextField();
                                                t5.setBounds(250,300,150,30);
                                                frame1.add(l5);
                                                frame1.add(t5);

                                                JLabel l6=new JLabel("ISSUANCE PERIOD:");
                                                l6.setBounds(120,350,150,30);
                                                String select[]={"None","10 Days","30 Days","60 Days","Semester"};
                                                JComboBox jc1=new JComboBox(select);
                                                jc1.setBounds(250,350,150,30);
                                                frame1.add(l6);
                                                frame1.add(jc1);

                                                JLabel l7=new JLabel("CITY:");
                                                l7.setBounds(120,400,150,30);
                                                JTextField t7=new JTextField();
                                                t7.setBounds(250,400,150,30);
                                                frame1.add(l7);
                                                frame1.add(t7);

                                                JLabel l8=new JLabel("POSTAL ADDRESS:");
                                                l8.setBounds(120,450,150,30);
                                                JTextField t8=new JTextField();
                                                t8.setBounds(250,450,150,30);
                                                frame1.add(l8);
                                                frame1.add(t8);

                                                JLabel l9=new JLabel("ISSUANCE DATE");
                                                l9.setBounds(120,500,150,30);
                                                JTextField t9=new JTextField();
                                                t9.setBounds(250,500,150,30);
                                                String txtDate=new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH).format(new Date());
                                                t9.setText(txtDate);
                                                frame1.add(l9);
                                                frame1.add(t9);






                                                JButton procced_but=new JButton("Done");
                                                procced_but.setBounds(300,650,150,30);
                                                frame1.add(procced_but);
                                                procced_but.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        String name= t2.getText();
                                                        String roll_num=t3.getText();
                                                        String dept=t4.getText();
                                                        String sem=t5.getText();
                                                        String city=t7.getText();
                                                        String postal_add=t8.getText();



                                                        if (name.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter name");
                                                        }
                                                        else  if(roll_num.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter roll number");

                                                        }
                                                        else if(dept.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter department");

                                                        }
                                                        else if(sem.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter semester");

                                                        }
                                                        else if(city.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter city");
                                                        }
                                                        else if (postal_add.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter postal address");

                                                        }

                                                        else{
                                                            JOptionPane.showMessageDialog(null,"your book is issued");
                                                        }

                                                    }
                                                });
                                                frame1.setLayout(null);
                                                frame1.setLocationRelativeTo(null);
                                                frame1.setVisible(true);

                                            }
                                        });

                                        JButton bk7=new JButton("SQL");
                                        bk7.setBounds(120,400,120,40);
                                        log.add(bk7);

                                        bk7.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JFrame frame1=new JFrame("Student's Info");
                                                JLabel label1=new JLabel("Enter Details");
                                                label1.setBounds(50,40,250,30);
                                                label1.setFont(new Font("Brittney",Font.BOLD,30));
                                                frame1.setSize(800,800);
                                                frame1.add(label1);


                                                JLabel l2=new JLabel("NAME:");
                                                l2.setBounds(120,150,150,30);
                                                JTextField t2=new JTextField();
                                                t2.setBounds(250,150,150,30);
                                                frame1.add(l2);
                                                frame1.add(t2);



                                                JLabel l3=new JLabel("ROLL NUMBER:");
                                                l3.setBounds(120,200,150,30);
                                                JTextField t3=new JTextField();
                                                t3.setBounds(250,200,150,30);
                                                frame1.add(l3);
                                                frame1.add(t3);





                                                JLabel l4=new JLabel("DEPARTMENT:");
                                                l4.setBounds(120,250,150,30);
                                                JTextField t4=new JTextField();
                                                t4.setBounds(250,250,150,30);
                                                frame1.add(l4);
                                                frame1.add(t4);

                                                JLabel l5=new JLabel("SEMESTER:");
                                                l5.setBounds(120,300,150,30);
                                                JTextField t5=new JTextField();
                                                t5.setBounds(250,300,150,30);
                                                frame1.add(l5);
                                                frame1.add(t5);

                                                JLabel l6=new JLabel("ISSUANCE PERIOD:");
                                                l6.setBounds(120,350,150,30);
                                                String select[]={"None","10 Days","30 Days","60 Days","Semester"};
                                                JComboBox jc1=new JComboBox(select);
                                                jc1.setBounds(250,350,150,30);
                                                frame1.add(l6);
                                                frame1.add(jc1);

                                                JLabel l7=new JLabel("CITY:");
                                                l7.setBounds(120,400,150,30);
                                                JTextField t7=new JTextField();
                                                t7.setBounds(250,400,150,30);
                                                frame1.add(l7);
                                                frame1.add(t7);

                                                JLabel l8=new JLabel("POSTAL ADDRESS:");
                                                l8.setBounds(120,450,150,30);
                                                JTextField t8=new JTextField();
                                                t8.setBounds(250,450,150,30);
                                                frame1.add(l8);
                                                frame1.add(t8);

                                                JLabel l9=new JLabel("ISSUANCE DATE");
                                                l9.setBounds(120,500,150,30);
                                                JTextField t9=new JTextField();
                                                t9.setBounds(250,500,150,30);
                                                String txtDate=new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH).format(new Date());
                                                t9.setText(txtDate);
                                                frame1.add(l9);
                                                frame1.add(t9);






                                                JButton procced_but=new JButton("Done");
                                                procced_but.setBounds(300,650,150,30);
                                                frame1.add(procced_but);
                                                procced_but.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        String name= t2.getText();
                                                        String roll_num=t3.getText();
                                                        String dept=t4.getText();
                                                        String sem=t5.getText();
                                                        String city=t7.getText();
                                                        String postal_add=t8.getText();



                                                        if (name.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter name");
                                                        }
                                                        else  if(roll_num.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter roll number");

                                                        }
                                                        else if(dept.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter department");

                                                        }
                                                        else if(sem.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter semester");

                                                        }
                                                        else if(city.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter city");
                                                        }
                                                        else if (postal_add.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter postal address");

                                                        }

                                                        else{
                                                            JOptionPane.showMessageDialog(null,"your book is issued");
                                                        }

                                                    }
                                                });
                                                frame1.setLayout(null);
                                                frame1.setVisible(true);
                                                frame1.setLocationRelativeTo(null);

                                            }
                                        });

                                        JButton bk8=new JButton("C#");
                                        bk8.setBounds(120,450,120,40);
                                        log.add(bk8);

                                        bk8.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JFrame frame1=new JFrame("Student's Info");
                                                JLabel label1=new JLabel("Enter Details");
                                                label1.setBounds(50,40,250,30);
                                                label1.setFont(new Font("Brittney",Font.BOLD,30));
                                                frame1.setSize(800,800);
                                                frame1.add(label1);


                                                JLabel l2=new JLabel("NAME:");
                                                l2.setBounds(120,150,150,30);
                                                JTextField t2=new JTextField();
                                                t2.setBounds(250,150,150,30);
                                                frame1.add(l2);
                                                frame1.add(t2);



                                                JLabel l3=new JLabel("ROLL NUMBER:");
                                                l3.setBounds(120,200,150,30);
                                                JTextField t3=new JTextField();
                                                t3.setBounds(250,200,150,30);
                                                frame1.add(l3);
                                                frame1.add(t3);





                                                JLabel l4=new JLabel("DEPARTMENT:");
                                                l4.setBounds(120,250,150,30);
                                                JTextField t4=new JTextField();
                                                t4.setBounds(250,250,150,30);
                                                frame1.add(l4);
                                                frame1.add(t4);

                                                JLabel l5=new JLabel("SEMESTER:");
                                                l5.setBounds(120,300,150,30);
                                                JTextField t5=new JTextField();
                                                t5.setBounds(250,300,150,30);
                                                frame1.add(l5);
                                                frame1.add(t5);

                                                JLabel l6=new JLabel("ISSUANCE PERIOD:");
                                                l6.setBounds(120,350,150,30);
                                                String select[]={"None","10 Days","30 Days","60 Days","Semester"};
                                                JComboBox jc1=new JComboBox(select);
                                                jc1.setBounds(250,350,150,30);
                                                frame1.add(l6);
                                                frame1.add(jc1);

                                                JLabel l7=new JLabel("CITY:");
                                                l7.setBounds(120,400,150,30);
                                                JTextField t7=new JTextField();
                                                t7.setBounds(250,400,150,30);
                                                frame1.add(l7);
                                                frame1.add(t7);

                                                JLabel l8=new JLabel("POSTAL ADDRESS:");
                                                l8.setBounds(120,450,150,30);
                                                JTextField t8=new JTextField();
                                                t8.setBounds(250,450,150,30);
                                                frame1.add(l8);
                                                frame1.add(t8);

                                                JLabel l9=new JLabel("ISSUANCE DATE");
                                                l9.setBounds(120,500,150,30);
                                                JTextField t9=new JTextField();
                                                t9.setBounds(250,500,150,30);
                                                String txtDate=new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH).format(new Date());
                                                t9.setText(txtDate);
                                                frame1.add(l9);
                                                frame1.add(t9);






                                                JButton procced_but=new JButton("Done");
                                                procced_but.setBounds(300,650,150,30);
                                                frame1.add(procced_but);
                                                procced_but.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        String name= t2.getText();
                                                        String roll_num=t3.getText();
                                                        String dept=t4.getText();
                                                        String sem=t5.getText();
                                                        String city=t7.getText();
                                                        String postal_add=t8.getText();



                                                        if (name.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter name");
                                                        }
                                                        else  if(roll_num.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter roll number");

                                                        }
                                                        else if(dept.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter department");

                                                        }
                                                        else if(sem.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter semester");

                                                        }
                                                        else if(city.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter city");
                                                        }
                                                        else if (postal_add.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter postal address");

                                                        }

                                                        else{
                                                            JOptionPane.showMessageDialog(null,"your book is issued");
                                                        }

                                                    }
                                                });
                                                frame1.setLayout(null);
                                                frame1.setLocationRelativeTo(null);
                                                frame1.setVisible(true);

                                            }
                                        });

                                        JButton bk9=new JButton("PYTHON");
                                        bk9.setBounds(120,500,120,40);
                                        log.add(bk9);

                                        bk9.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JFrame frame1=new JFrame("Student's Info");
                                                JLabel label1=new JLabel("Enter Details");
                                                label1.setBounds(50,40,250,30);
                                                label1.setFont(new Font("Brittney",Font.BOLD,30));
                                                frame1.setSize(800,800);
                                                frame1.add(label1);


                                                JLabel l2=new JLabel("NAME:");
                                                l2.setBounds(120,150,150,30);
                                                JTextField t2=new JTextField();
                                                t2.setBounds(250,150,150,30);
                                                frame1.add(l2);
                                                frame1.add(t2);



                                                JLabel l3=new JLabel("ROLL NUMBER:");
                                                l3.setBounds(120,200,150,30);
                                                JTextField t3=new JTextField();
                                                t3.setBounds(250,200,150,30);
                                                frame1.add(l3);
                                                frame1.add(t3);





                                                JLabel l4=new JLabel("DEPARTMENT:");
                                                l4.setBounds(120,250,150,30);
                                                JTextField t4=new JTextField();
                                                t4.setBounds(250,250,150,30);
                                                frame1.add(l4);
                                                frame1.add(t4);

                                                JLabel l5=new JLabel("SEMESTER:");
                                                l5.setBounds(120,300,150,30);
                                                JTextField t5=new JTextField();
                                                t5.setBounds(250,300,150,30);
                                                frame1.add(l5);
                                                frame1.add(t5);

                                                JLabel l6=new JLabel("ISSUANCE PERIOD:");
                                                l6.setBounds(120,350,150,30);
                                                String select[]={"None","10 Days","30 Days","60 Days","Semester"};
                                                JComboBox jc1=new JComboBox(select);
                                                jc1.setBounds(250,350,150,30);
                                                frame1.add(l6);
                                                frame1.add(jc1);

                                                JLabel l7=new JLabel("CITY:");
                                                l7.setBounds(120,400,150,30);
                                                JTextField t7=new JTextField();
                                                t7.setBounds(250,400,150,30);
                                                frame1.add(l7);
                                                frame1.add(t7);

                                                JLabel l8=new JLabel("POSTAL ADDRESS:");
                                                l8.setBounds(120,450,150,30);
                                                JTextField t8=new JTextField();
                                                t8.setBounds(250,450,150,30);
                                                frame1.add(l8);
                                                frame1.add(t8);

                                                JLabel l9=new JLabel("ISSUANCE DATE");
                                                l9.setBounds(120,500,150,30);
                                                JTextField t9=new JTextField();
                                                t9.setBounds(250,500,150,30);
                                                String txtDate=new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH).format(new Date());
                                                t9.setText(txtDate);
                                                frame1.add(l9);
                                                frame1.add(t9);






                                                JButton procced_but=new JButton("Done");
                                                procced_but.setBounds(300,650,150,30);
                                                frame1.add(procced_but);
                                                procced_but.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        String name= t2.getText();
                                                        String roll_num=t3.getText();
                                                        String dept=t4.getText();
                                                        String sem=t5.getText();
                                                        String city=t7.getText();
                                                        String postal_add=t8.getText();



                                                        if (name.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter name");
                                                        }
                                                        else  if(roll_num.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter roll number");

                                                        }
                                                        else if(dept.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter department");

                                                        }
                                                        else if(sem.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter semester");

                                                        }
                                                        else if(city.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter city");
                                                        }
                                                        else if (postal_add.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter postal address");

                                                        }

                                                        else{
                                                            JOptionPane.showMessageDialog(null,"your book is issued");
                                                        }

                                                    }
                                                });
                                                frame1.setLayout(null);
                                                frame1.setLocationRelativeTo(null);
                                                frame1.setVisible(true);

                                            }
                                        });

                                        JButton bk10=new JButton("LARAVEL");
                                        bk10.setBounds(120,550,120,40);
                                        log.add(bk10);

                                        bk10.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JFrame frame1=new JFrame("Student's Info");
                                                JLabel label1=new JLabel("Enter Details");
                                                label1.setBounds(50,40,250,30);
                                                label1.setFont(new Font("Brittney",Font.BOLD,30));
                                                frame1.setSize(800,800);
                                                frame1.add(label1);


                                                JLabel l2=new JLabel("NAME:");
                                                l2.setBounds(120,150,150,30);
                                                JTextField t2=new JTextField();
                                                t2.setBounds(250,150,150,30);
                                                frame1.add(l2);
                                                frame1.add(t2);



                                                JLabel l3=new JLabel("ROLL NUMBER:");
                                                l3.setBounds(120,200,150,30);
                                                JTextField t3=new JTextField();
                                                t3.setBounds(250,200,150,30);
                                                frame1.add(l3);
                                                frame1.add(t3);





                                                JLabel l4=new JLabel("DEPARTMENT:");
                                                l4.setBounds(120,250,150,30);
                                                JTextField t4=new JTextField();
                                                t4.setBounds(250,250,150,30);
                                                frame1.add(l4);
                                                frame1.add(t4);

                                                JLabel l5=new JLabel("SEMESTER:");
                                                l5.setBounds(120,300,150,30);
                                                JTextField t5=new JTextField();
                                                t5.setBounds(250,300,150,30);
                                                frame1.add(l5);
                                                frame1.add(t5);

                                                JLabel l6=new JLabel("ISSUANCE PERIOD:");
                                                l6.setBounds(120,350,150,30);
                                                String select[]={"None","10 Days","30 Days","60 Days","Semester"};
                                                JComboBox jc1=new JComboBox(select);
                                                jc1.setBounds(250,350,150,30);
                                                frame1.add(l6);
                                                frame1.add(jc1);

                                                JLabel l7=new JLabel("CITY:");
                                                l7.setBounds(120,400,150,30);
                                                JTextField t7=new JTextField();
                                                t7.setBounds(250,400,150,30);
                                                frame1.add(l7);
                                                frame1.add(t7);

                                                JLabel l8=new JLabel("POSTAL ADDRESS:");
                                                l8.setBounds(120,450,150,30);
                                                JTextField t8=new JTextField();
                                                t8.setBounds(250,450,150,30);
                                                frame1.add(l8);
                                                frame1.add(t8);

                                                JLabel l9=new JLabel("ISSUANCE DATE");
                                                l9.setBounds(120,500,150,30);
                                                JTextField t9=new JTextField();
                                                t9.setBounds(250,500,150,30);
                                                String txtDate=new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH).format(new Date());
                                                t9.setText(txtDate);
                                                frame1.add(l9);
                                                frame1.add(t9);






                                                JButton procced_but=new JButton("Done");
                                                procced_but.setBounds(300,650,150,30);
                                                frame1.add(procced_but);
                                                procced_but.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        String name= t2.getText();
                                                        String roll_num=t3.getText();
                                                        String dept=t4.getText();
                                                        String sem=t5.getText();
                                                        String city=t7.getText();
                                                        String postal_add=t8.getText();



                                                        if (name.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter name");
                                                        }
                                                        else  if(roll_num.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter roll number");

                                                        }
                                                        else if(dept.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter department");

                                                        }
                                                        else if(sem.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter semester");

                                                        }
                                                        else if(city.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter city");
                                                        }
                                                        else if (postal_add.equals("")){
                                                            JOptionPane.showMessageDialog(null,"please enter postal address");

                                                        }

                                                        else{
                                                            JOptionPane.showMessageDialog(null,"your book is issued");
                                                        }

                                                    }
                                                });
                                                frame1.setLayout(null);
                                                frame1.setLocationRelativeTo(null);
                                                frame1.setVisible(true);

                                            }
                                        });

                                        log.setLayout(null);
                                        log.setLocationRelativeTo(null);
                                        log.setVisible(true);
                                    }

                                }
                            });
                            frame.setVisible(true);
                        }

                    }
                });

            }
        });

/////////////////////////////////////////////        online reading        //////////////////////////////////////
        JButton jButton1=new JButton("ONLINE READING");
        jButton1.setBounds(800,300,150,50);
        label.add(jButton1);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f = new JFrame("Sign Up");
                f.setSize(800, 800);
                f.getContentPane().setBackground(Color.pink);
                f.setVisible(true);
                f.setLocationRelativeTo(null);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLayout(null);


                JLabel l1 = new JLabel("Sign Up!");
                l1.setBounds(150, 0, 400, 300);
                l1.setFont(new Font("Arial",Font.BOLD,30));
                JLabel L = new JLabel("It's Quick And Easy.");
                L.setBounds(150,20,400,300);
                f.getContentPane().add(L);

                f.getContentPane().add(l1);
                JLabel l2 = new JLabel("NAME: ");
                l2.setBounds(120, 350, 100, 30);
                f.getContentPane().add(l2);
                t = new JTextField();
                t.setBounds(250, 350, 150, 30);
                f.getContentPane().add(t);
                JLabel l3 = new JLabel("PASSWORD: ");
                l3.setBounds(120, 400, 100, 30);
                f.getContentPane().add(l3);
                JPasswordField p = new JPasswordField();
                p.setBounds(250, 400, 150, 30);
                f.getContentPane().add(p);
                JLabel l4 = new JLabel("GENDER: ");
                l4.setBounds(120, 450, 100, 30);
                f.getContentPane().add(l4);

                JRadioButton r = new JRadioButton("MALE");
                r.setBounds(250, 450, 100, 30);

                JRadioButton r1 = new JRadioButton("FEMALE");
                r1.setBounds(350, 450, 100, 30);
                ButtonGroup bg = new ButtonGroup();
                bg.add(r);
                bg.add(r1);

                f.getContentPane().add(r);
                f.getContentPane().add(r1);
                JLabel l5 = new JLabel("CITY: ");
                l5.setBounds(120, 500, 100, 30);
                f.getContentPane().add(l5);
                String Select[] = {"None","Hyderabad", "Lahore", "Karachi"};
                JComboBox jc = new JComboBox(Select);
                jc.setBounds(250, 500, 100, 30);
                f.getContentPane().add(jc);
                JLabel l6 = new JLabel("Email: ");
                l6.setBounds(120, 550, 100, 30);
                f.getContentPane().add(l6);
                JTextField tf = new JTextField();
                tf.setBounds(250, 550, 150, 30);
                f.getContentPane().add(tf);

                JButton jb = new JButton("Sign Up");
                jb.setBounds(250, 650, 100, 30);
                f.getContentPane().add(jb);
                JLabel l7 = new JLabel("");
                l7.setBounds(650, 700, 300, 30);
                f.getContentPane().add(l7);
                jb.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {





                        String Name = t.getText(); //Store username entered by the user in the variable "username"
                        String password = p.getText(); //Store password entered by the user in the variable "password"
                        String Email=tf.getText();
                        boolean actualValue =r.isSelected();
                        boolean Value =r1.isSelected();
                        int i=0;

                        if(Name.equals("")) //If username is null
                        {
                            JOptionPane.showMessageDialog(null,"Please enter username","Error Message",JOptionPane.ERROR_MESSAGE); //Display dialog box with the message
                        }
                        else if(password.equals("")) //If password is null
                        {
                            JOptionPane.showMessageDialog(null,"Please enter password","Error Message",JOptionPane.ERROR_MESSAGE); //Display dialog box with the message
                        }

                        else if(Email.equals(""))
                        {
                            JOptionPane.showMessageDialog(null,"Please enter Email","Error Message",JOptionPane.ERROR_MESSAGE);
                        }
                        else if(Email.equals(i)){
                            JOptionPane.showMessageDialog(null,"Characters Required");
                        }
                        else if(e.getSource()==r) {

                        }
                        else if(e.getSource()==r1){

                        }
                        else if(actualValue==false && Value==false){
                            JOptionPane.showMessageDialog(null,"Select Gender");

                        }



                        else{
                            JFrame frame=new JFrame("LOG IN");
                            frame.setSize(400,300);
                            JLabel l1,l2;
                            frame.setLayout(null);
                            //JPanel panel = new JPanel();
                            l1=new JLabel("Username");  //Create label Username
                            l1.setBounds(80,50,60,30); //x axis, y axis, width, height
                            frame.add(l1);

                            JTextField F_user = new JTextField(); //Create text field for username
                            F_user.setBounds(150, 50, 150, 30);
                            frame.add(F_user);


                            l2=new JLabel("Password");  //Create label Password
                            l2.setBounds(80,100, 60,30);
                            frame.add(l2);

                            JPasswordField F_pass=new JPasswordField(); //Create text field for password
                            F_pass.setBounds(150, 100, 150, 30);
                            frame.getContentPane().add(F_pass);

                            JButton login_but=new JButton("Login");//creating instance of JButton for Login Button
                            login_but.setBounds(130,170,100,30);
                            frame.add(login_but);
                            login_but.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    String username = F_user.getText(); //Store username entered by the user in the variable "username"
                                    String password = F_pass.getText(); //Store password entered by the user in the variable "password"

                                    if(username.equals("")) //If username is null
                                    {
                                        JOptionPane.showMessageDialog(null,"Please enter username"); //Display dialog box with the message
                                    }
                                    else if(password.equals("")) //If password is null
                                    {
                                        JOptionPane.showMessageDialog(null,"Please enter password"); //Display dialog box with the message
                                    }
                                    else if(!password.equals(F_pass.getText())){
                                        JOptionPane.showMessageDialog(null,"Incorrect Username Or Password","warn",JOptionPane.WARNING_MESSAGE);
                                    }
                                    else if(!username.equals(F_user.getText())){
                                        JOptionPane.showMessageDialog(null,"incorrect user name )R Password","warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                    else {
                                        JFrame log=new JFrame("BOOKS LIST");
                                        JLabel log_label=new JLabel("Available Books");
                                        log_label.setFont(new Font("Brittney",Font.BOLD,30));
                                        log_label.setBounds(50,30,250,30);
                                        log.setSize(400,700);
                                        log.add(log_label);
                                        log.setLayout(new FlowLayout());
                                        JLabel jLabel=new JLabel(new ImageIcon("E:\\Project Stuff\\pic.png"));
                                        log.add(jLabel);
                                        jLabel.setLayout(new FlowLayout());

                                        JButton bk1=new JButton("C++");
                                        bk1.setBounds(120,100,120,40);
                                        log.add(bk1);
                                        bk1.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                try {

                                                    File f=new File("E:\\Project Stuff\\bk1.pdf");
                                                    Desktop.getDesktop().open(f);



                                                } catch (Exception ex) {
                                                    ex.printStackTrace();
                                                }
                                            }
                                        });

                                        JButton bk2=new JButton("JAVA");
                                        bk2.setBounds(120,150,120,40);
                                        log.add(bk2);
                                        bk2.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                try {

                                                    File f=new File("E:\\Project Stuff\\bk2.pdf");
                                                    Desktop.getDesktop().open(f);

                                                } catch (Exception ex) {
                                                    ex.printStackTrace();
                                                }

                                            }
                                        });

                                        JButton bk3=new JButton("PHP");
                                        bk3.setBounds(120,200,120,40);
                                        log.add(bk3);
                                        bk3.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                try {

                                                    File f=new File("E:\\Project Stuff\\bk3.pdf");
                                                    Desktop.getDesktop().open(f);



                                                } catch (Exception ex) {
                                                    ex.printStackTrace();
                                                }
                                            }
                                        });

                                        JButton bk4=new JButton("HTML");
                                        bk4.setBounds(120,250,120,40);
                                        log.add(bk4);
                                        bk4.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                try {

                                                    File f=new File("E:\\Project Stuff\\bk4.pdf");
                                                    Desktop.getDesktop().open(f);



                                                } catch (Exception ex) {
                                                    ex.printStackTrace();
                                                }
                                            }
                                        });

                                        JButton bk5=new JButton("CSS");
                                        bk5.setBounds(120,300,120,40);
                                        log.add(bk5);
                                        bk5.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                try {

                                                    File f=new File("E:\\Project Stuff\\bk5.pdf");
                                                    Desktop.getDesktop().open(f);



                                                } catch (Exception ex) {
                                                    ex.printStackTrace();
                                                }
                                            }
                                        });

                                        JButton bk6=new JButton("JAVASCRIPT");
                                        bk6.setBounds(120,350,120,40);
                                        log.add(bk6);
                                        bk6.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                try {

                                                    File f=new File("E:\\Project Stuff\\bk6.pdf");
                                                    Desktop.getDesktop().open(f);

                                                } catch (Exception ex) {
                                                    ex.printStackTrace();
                                                }
                                            }
                                        });

                                        JButton bk7=new JButton("SQL");
                                        bk7.setBounds(120,400,120,40);
                                        log.add(bk7);
                                        bk7.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                try {

                                                    File f=new File("E:\\Project Stuff\\bk7.pdf");
                                                    Desktop.getDesktop().open(f);



                                                } catch (Exception ex) {
                                                    ex.printStackTrace();
                                                }
                                            }
                                        });

                                        JButton bk8=new JButton("C#");
                                        bk8.setBounds(120,450,120,40);
                                        log.add(bk8);
                                        bk8.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                try {

                                                    File f=new File("E:\\Project Stuff\\bk8.pdf");
                                                    Desktop.getDesktop().open(f);



                                                } catch (Exception ex) {
                                                    ex.printStackTrace();
                                                }
                                            }
                                        });

                                        JButton bk9=new JButton("PYTHON");
                                        bk9.setBounds(120,500,120,40);
                                        log.add(bk9);
                                        bk9.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                try {

                                                    File f=new File("E:\\Project Stuff\\bk9.pdf");
                                                    Desktop.getDesktop().open(f);



                                                } catch (Exception ex) {
                                                    ex.printStackTrace();
                                                }
                                            }
                                        });

                                        JButton bk10=new JButton("LARAVEL");
                                        bk10.setBounds(120,550,120,40);
                                        log.add(bk10);
                                        bk10.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                try {

                                                    File f=new File("E:\\Project Stuff\\bk10.pdf");
                                                    Desktop.getDesktop().open(f);



                                                } catch (Exception ex) {
                                                    ex.printStackTrace();
                                                }
                                            }
                                        });


                                        log.setLayout(null);
                                        log.setLocationRelativeTo(null);
                                        log.setVisible(true);


                                    }

                                }
                            });
                            frame.setVisible(true);
                        }






                    }
                });



            }
        });
        first_f.setVisible(true);
        first_f.setSize(600,600);

    }

    public static void main(String[] args) {

        GUI_TASK g = new GUI_TASK();
    }


}
