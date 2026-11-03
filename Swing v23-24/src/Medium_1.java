import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Medium_1 implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private int WIDTH=800;
    private int HEIGHT=700;

    public Medium_1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Medium_1 swingControlDemo = new Medium_1();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Example with grid inside border layout");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout(10, 10));

        // menu at top
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(2, 3));
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {
        JButton okButton = new JButton("button 1");
        JButton submitButton = new JButton("button 2");
        JButton cancelButton = new JButton("button 3");
        JButton lolButton = new JButton("button 4");
        JButton noButton = new JButton("button 5");
     //   JButton niceButton = new JButton("button 6");
        okButton.setActionCommand("OK");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");
//        okButton.addActionListener(new ButtonClickListener());
//        submitButton.addActionListener(new ButtonClickListener());
//        cancelButton.addActionListener(new ButtonClickListener());

        mainFrame.add(okButton, BorderLayout.NORTH);
        mainFrame.add(cancelButton, BorderLayout.SOUTH);
        controlPanel.add(submitButton);
        controlPanel.add(new JLabel("label 1", JLabel.CENTER));
        controlPanel.add(lolButton);
        controlPanel.add(new JLabel("label 2", JLabel.CENTER));
        controlPanel.add(noButton);
        controlPanel.add(new JLabel(""));
        mainFrame.add(controlPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {}

//    private class ButtonClickListener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            if (command.equals("OK")) {
//                statusLabel.setText("Button 1 clicked.");
//            } else if (command.equals("Submit")) {
//                statusLabel.setText("Button 2 clicked.");
//            } else {
//                statusLabel.setText("Button 3 clicked.");
//            }
        }

