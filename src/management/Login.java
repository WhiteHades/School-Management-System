package management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
    JButton login, Cancel;

    public Login()
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel username = new JLabel("Username");
        username.setBounds(40, 20, 100, 20);
        add(username);

        JTextField usernameinput = new JTextField();
        usernameinput.setBounds(150, 20, 150, 20);
        add(usernameinput);

        JLabel password = new JLabel("Password");
        password.setBounds(40, 70, 100, 20);
        add(password);

        JPasswordField passwordinput = new JPasswordField();
        passwordinput.setBounds(150, 70, 150, 20);
        add(passwordinput);

        login = new JButton("Login");
        login.setBounds(40, 140, 120, 30);
        add(login);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.setFont(new Font("literata", Font.BOLD, 15));
        add(login);
        login.addActionListener(this);

        Cancel = new JButton("Cancel");
        Cancel.setBounds(180, 140, 120, 30);
        add(Cancel);
        Cancel.setBackground(Color.black);
        Cancel.setForeground(Color.white);
        Cancel.setFont(new Font("literata", Font.BOLD, 15));
        add(Cancel);
        Cancel.addActionListener(this);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        setVisible(true);
        setSize(600, 300);
        setLocation(500, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == login) {  }
        else if(e.getSource() == Cancel) { setVisible(false); }
    }

    public static void main(String[] args)
    {
        new Login();
    }
}
