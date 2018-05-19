import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Main {
    public static void main(String[] args) {
        int hourlyWageInDollars = 20;
        
        // Set hourly and yearly salary.
        JLabel wageLabel = new JLabel("Hourly wage: ");
        JLabel salaryLabel = new JLabel("Yearly salary: ");
        
        JTextField wageTextField = new JTextField(15);
        wageTextField.setEditable(false);
        wageTextField.setText( Integer.toString(hourlyWageInDollars) );
        
        JTextField salaryTextField = new JTextField(15);
        salaryTextField.setEditable(false);
        salaryTextField.setText( Integer.toString(hourlyWageInDollars * 40 * 50) );
        
        // create the frame and set its title
        JFrame appFrame = new JFrame("Salary");
        
        // use a grid bag layout
        appFrame.setLayout(new GridBagLayout() );
        
        
        
    }
}