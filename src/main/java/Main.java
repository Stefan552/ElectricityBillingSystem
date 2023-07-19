import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Electricity Billing System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel customerIdLabel = new JLabel("Customer ID:");
        customerIdLabel.setFont ( new Font ( "Arial", Font.BOLD,15 ) );
        JTextField customerIdField = new JTextField(10);

        JLabel customerNameLabel = new JLabel("Customer Name:");
        customerNameLabel.setFont ( new Font ( "Arial", Font.BOLD,15 ) );
        JTextField customerNameField = new JTextField(10);

        JLabel previousReadingLabel = new JLabel("Previous Reading (units):");
        previousReadingLabel.setFont ( new Font ( "Arial", Font.BOLD,15 ) );
        JTextField previousReadingField = new JTextField(10);

        JLabel currentReadingLabel = new JLabel("Current Reading (units):");
        currentReadingLabel.setFont ( new Font ( "Arial", Font.BOLD,15 ) );
        JTextField currentReadingField = new JTextField(10);

        JLabel unitRateLabel = new JLabel("Unit Rate ($ per unit):");
        unitRateLabel.setFont ( new Font ( "Arial", Font.BOLD,15 ) );
        JTextField unitRateField = new JTextField(10);

        JButton calculateButton = new JButton("Calculate Bill");
        JButton refreshButton = new JButton("Refresh information");
        JLabel resultLabel = new JLabel();
        JLabel resultOrErrorLabel = new JLabel();

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (customerIdField.getText().isEmpty()) {
                    resultLabel.setText ("Customer ID is empty!");
                    return;
                }
                if (customerNameField.getText().isEmpty()) {
                    resultLabel.setText ("Customer Name is empty!");
                    return;
                }
                if (previousReadingField.getText().isEmpty()) {
                    resultLabel.setText ("Previous Reading is empty!");
                    return;
                }if (currentReadingField.getText().isEmpty()) {
                    resultLabel.setText ("Current Reading is empty!");
                    return;
                }
                if (unitRateField.getText().isEmpty()) {
                    resultLabel.setText ("Unit Rate is empty!");
                    return;
                }

                try{
                String customerId = customerIdField.getText();
                String customerName = customerNameField.getText();
                Integer previousReading = Integer.valueOf ( previousReadingField.getText() );
                Integer currentReading = Integer.valueOf (currentReadingField.getText());
                Double unitRate = Double.valueOf (unitRateField.getText());

                Customer customer = new Customer(customerId, customerName, previousReading, currentReading);

                ElectricityBill bill = new ElectricityBill(customer, unitRate);
                double totalAmount = bill.calculateTotalAmount();
                resultLabel.setText("Total Amount: $" + totalAmount);

                } catch (NumberFormatException ex) {
                    resultLabel.setText ("Invalid input format! Please enter valid numbers.");
                }


        }});





        refreshButton.addActionListener ( new ActionListener () {
            @Override
            public void actionPerformed ( ActionEvent e ) {
              resultLabel.setText ( "You can type your new data!" );
                customerIdField.setText ( null );
                customerNameField.setText ( null );
                previousReadingField.setText ( null );
                currentReadingField.setText ( null );
                unitRateField.setText ( null );
            }
        } );
        JPanel panel = new ImagePanel("/deloik.jpg");

        panel.setLayout ( new GridBagLayout() );
        GridBagConstraints c = new GridBagConstraints();
        frame.setContentPane(panel);
        c.insets = new Insets(5, 5, 5, 5);

        c.gridx = 0;
        c.gridy = 0;
        panel.add(customerIdLabel, c);

        c.gridx = 1;
        c.gridy = 0;
        panel.add(customerIdField, c);

        c.gridx = 0;
        c.gridy = 1;
        panel.add(customerNameLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        panel.add(customerNameField, c);

        c.gridx = 0;
        c.gridy = 2;
        panel.add(previousReadingLabel, c);

        c.gridx = 1;
        c.gridy = 2;
        panel.add(previousReadingField, c);

        c.gridx = 0;
        c.gridy = 3;
        panel.add(currentReadingLabel, c);

        c.gridx = 1;
        c.gridy = 3;
        panel.add(currentReadingField, c);

        c.gridx = 0;
        c.gridy = 4;
        panel.add(unitRateLabel, c);

        c.gridx = 1;
        c.gridy = 4;
        panel.add(unitRateField, c);

        c.gridx = 1;
        c.gridy = 5;
        panel.add(calculateButton, c);

        c.gridx = 0;
        c.gridy = 10;
        c.gridwidth = 2;
        panel.add(resultLabel, c);

        c.gridx = 0;
        c.gridy = 10;
        c.gridwidth = 2;
        panel.add(resultOrErrorLabel, c);

        c.gridx = 1;
        c.gridy = 7;
        c.gridwidth = 2;
        panel.add(refreshButton, c);




        frame.setPreferredSize(new Dimension(500, 350));
        frame.pack();
        frame.setVisible(true);
    }
}
