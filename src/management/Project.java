package management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener
{
    public Project()
    {
        setSize(1540, 900);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        JMenuBar menubar = new JMenuBar();

        // new info
        JMenu info = new JMenu("New Information");
        info.setForeground(Color.black);
        menubar.add(info);

        JMenuItem faculty_info = new JMenuItem("New Faculty");
        faculty_info.setBackground(Color.white);
        info.add(faculty_info);

        JMenuItem student_info = new JMenuItem("New Student");
        student_info.setBackground(Color.white);
        info.add(student_info);

        // details
        JMenu details = new JMenu("Details");
        details.setForeground(Color.black);
        menubar.add(details);

        JMenuItem faculty_details = new JMenuItem("Faculty");
        faculty_details.setBackground(Color.white);
        details.add(faculty_details);

        JMenuItem student_details = new JMenuItem("Student");
        student_details.setBackground(Color.white);
        details.add(student_details);

        // for leave
        JMenu leave = new JMenu("Leave");
        leave.setForeground(Color.black);
        menubar.add(leave);

        JMenuItem faculty_leave = new JMenuItem("Faculty");
        faculty_leave.setBackground(Color.white);
        leave.add(faculty_leave);

        JMenuItem student_leave = new JMenuItem("Student");
        student_leave.setBackground(Color.white);
        leave.add(student_leave);

        // details for leave
        JMenu leave_details = new JMenu("Leave Details");
        leave_details.setForeground(Color.black);
        menubar.add(leave_details);

        JMenuItem faculty_leave_details = new JMenuItem("Faculty");
        faculty_leave_details.setBackground(Color.white);
        leave_details.add(faculty_leave_details);

        JMenuItem student_leave_details = new JMenuItem("Student");
        student_leave_details.setBackground(Color.white);
        leave_details.add(student_leave_details);

        // exams
        JMenu exam = new JMenu("Exam");
        exam.setForeground(Color.black);
        menubar.add(exam);

        JMenuItem exam_details = new JMenuItem("Results");
        exam_details.setBackground(Color.white);
        exam.add(exam_details);

        JMenuItem student_marks = new JMenuItem("Marks");
        student_marks.setBackground(Color.white);
        exam.add(student_marks);

        // update info
        JMenu update_info = new JMenu("Update");
        update_info.setForeground(Color.black);
        menubar.add(update_info);

        JMenuItem update_faculty_info = new JMenuItem("Faculty");
        update_faculty_info.setBackground(Color.white);
        update_info.add(update_faculty_info);

        JMenuItem update_student_info = new JMenuItem("Student");
        update_student_info.setBackground(Color.white);
        update_info.add(update_student_info);

        // fee
        JMenu fee = new JMenu("Fee");
        fee.setForeground(Color.black);
        menubar.add(fee);

        JMenuItem fee_structure = new JMenuItem("Structure");
        fee_structure.setBackground(Color.white);
        fee.add(fee_structure);

        JMenuItem fee_form = new JMenuItem("Form");
        fee_form.setBackground(Color.white);
        fee.add(fee_form);

        // utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.black);
        menubar.add(utility);

        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.white);
        notepad.addActionListener(this);
        utility.add(notepad);

        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setBackground(Color.white);
        calculator.addActionListener(this);
        utility.add(calculator);

        // exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.black);
        menubar.add(exit);

        JMenuItem exit2 = new JMenuItem("Exit");
        exit2.setBackground(Color.white);
        exit2.addActionListener(this);
        exit.add(exit2);

        setJMenuBar(menubar);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        String message = e.getActionCommand();
        if(message.equals("Exit")) setVisible(false);
        else if(message.equals("Calculator"))
            try { Runtime.getRuntime().exec("Calc.exe"); }
            catch (Exception ex) {}
        else if(message.equals("Notepad"))
            try { Runtime.getRuntime().exec("notepad.exe"); }
            catch (Exception ex) {}
    }

    public static void main(String[] args)
    {
        new Project();
    }
}
