//Write a program which shows the combo box which includes list of T.Y.B.Sc.(Comp. Sci)
//subjects. Display the selected subject in a text field.



import javax.swing.*;
import java.awt.event.*;

class SubjectSelector extends JFrame {
    JComboBox<String> subjectComboBox;
    JTextField selectedSubjectField;

    SubjectSelector() {
        String[] subjects = {"Data Science", "Artificial Intelligence", "Web Development", "Mobile App Development", "Cyber Security", "Machine Learning", "Big Data", "Cloud Computing"};

        subjectComboBox = new JComboBox<>(subjects);
        subjectComboBox.setBounds(150, 20, 200, 30);

        selectedSubjectField = new JTextField();
        selectedSubjectField.setBounds(150, 70, 200, 30);
        selectedSubjectField.setEditable(false);

        subjectComboBox.addActionListener(e -> selectedSubjectField.setText((String) subjectComboBox.getSelectedItem()));

        add(new JLabel("Select a subject:")).setBounds(20, 20, 150, 30);
        add(subjectComboBox);
        add(selectedSubjectField);

        setSize(400, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class Slip19_b{
    public static void main(String[] args) {
        new SubjectSelector();
    }
}


