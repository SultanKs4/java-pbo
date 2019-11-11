package id.natlus.js11.praktikum.percobaan2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyInputForm1841720019Sultan extends JFrame {
    private static final int sFRAME_WIDTH = 600;
    private static final int sFRAME_HEIGHT = 200;
    private JLabel mALabel;
    private JLabel mBLabel;
    private JLabel mCLabel;
    private JLabel mDLabel;
    private JTextField mAField;
    private JTextField mBField;
    private JButton mButton;
    private JButton mAButton;
    private JPanel mPanel;

    public MyInputForm1841720019Sultan() {
        createTextFieldSultan();
        createButtonSultan();
        createPanelSultan();
        setSize(sFRAME_WIDTH, sFRAME_WIDTH);
    }

    private void createTextFieldSultan() {
        mALabel = new JLabel("Nilai A");
        mBLabel = new JLabel("Nilai B");
        mCLabel = new JLabel("Nilai C");
        mDLabel = new JLabel("Nilai D");

        final int FIELD_WIDTH = 10;
        mAField = new JTextField(FIELD_WIDTH);
        mAField.setText("0");
        mBField = new JTextField(FIELD_WIDTH);
        mBField.setText("0");
    }

    private void createButtonSultan() {
        mButton = new JButton("Calculate");
        class AddInterestListenerSultan implements ActionListener {

            String opt = "kali";

            public AddInterestListenerSultan(String opt) {
                this.opt = opt;
            }

            public AddInterestListenerSultan() {
            }

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (this.opt.equalsIgnoreCase("kali")) {
                    int a = Integer.parseInt(mAField.getText());
                    int b = Integer.parseInt(mBField.getText());
                    int c = a * b;
                    mCLabel.setText("Hasil: " + c);
                } else if (this.opt.equalsIgnoreCase("tambah")) {
                    int d = Integer.parseInt(mAField.getText());
                    int e = Integer.parseInt(mBField.getText());
                    int f = d + e;
                    mDLabel.setText("Hasil: " + f);
                }
            }
        }
        ActionListener listener = new AddInterestListenerSultan();
        mButton.addActionListener(listener);

        mAButton = new JButton("Hitung +");
        ActionListener listener2 = new AddInterestListenerSultan("tambah");
        mAButton.addActionListener(listener2);
    }

    private void createPanelSultan() {
        mPanel = new JPanel();
        mPanel.add(mALabel);
        mPanel.add(mAField);
        mPanel.add(mBLabel);
        mPanel.add(mBField);
        mPanel.add(mButton);
        mPanel.add(mCLabel);
        mPanel.add(mAButton);
        mPanel.add(mDLabel);
        add(mPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new MyInputForm1841720019Sultan();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
