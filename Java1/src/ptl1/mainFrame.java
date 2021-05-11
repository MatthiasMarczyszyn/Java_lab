package ptl1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainFrame extends  JFrame implements ActionListener {


    public void startFrame()
    {
        JFrame frame = new JFrame("Knapsack Problem");
        frame.setSize(600,600);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        JButton button = new JButton("Solve");
        JLabel label = new JLabel("Enter amount of items and capacity");
        JTextField textFieldCap = new JTextField(5);
        JTextField textFieldAmm = new JTextField(5);

        panel.add(label);
        panel.add(textFieldAmm);
        panel.add(textFieldCap);
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JTextArea textArea = new JTextArea("");
                frame.getContentPane().add(BorderLayout.CENTER, textArea);
                knapsack kp1 = new knapsack(Integer.parseInt(textFieldAmm.getText()),
                        Integer.parseInt(textFieldCap.getText()));
                textArea.setEditable(false);
                textArea.append(kp1.toString());
            }
        });

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
