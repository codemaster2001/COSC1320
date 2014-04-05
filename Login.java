/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaProject;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Abraham
 */
 
public class Login extends JFrame{
    
    private JPanel signIn; // Panel for the login page
    private JPanel home; // Panel after login validation
    
    private JLabel accountNo;
    private JLabel passwd;
    private JTextField field1;
    private JTextField field2;
    private JButton login;
    
    // These are the buttons of the second panel after login
    private JButton deposit;
    private JButton balance;
    private JButton changePassword;
    private JButton withdraw;
    private JButton transfer;
    private JButton signOut;
    private final int window_width = 500;
    private final int window_height = 500; 
    private final int window_width2 = 300;
    
    public Login(){
        setTitle("Sign-In"); // Set the login panel title
        setSize(window_width2, window_height); // Set the size of the login page
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel1();
        buildPanel2();
        add(signIn);
        setVisible(true);
        
    }
    
    private void buildPanel1(){
        accountNo = new JLabel("Account Number: ");
        passwd = new JLabel("Password: ");
        login = new JButton("Login");
        field1 = new JTextField();
        field2 = new JTextField();
        
        signIn = new JPanel();
        
        signIn.add(accountNo);
        signIn.add(passwd);
        signIn.add(login);
        signIn.add(field1);
        signIn.add(field2);
    }
    private void buildPanel2(){
        deposit = new JButton();
        balance = new JButton();
        changePassword = new JButton();
        withdraw = new JButton();
        transfer = new JButton();
        signOut = new JButton();
        
        home = new JPanel();
    }
    
    private class LoginAction implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
        }
    }
    
    private class dashBoard implements ActionListener{
        public void actionPerformed1 (ActionEvent e){
            
        }
    }
}
