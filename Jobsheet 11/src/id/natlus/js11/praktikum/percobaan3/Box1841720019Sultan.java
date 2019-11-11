package id.natlus.js11.praktikum.percobaan3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;


public class Box1841720019Sultan extends JFrame {
    private static final int sFRAME_WIDTH = 600;
    private static final int sFRAME_HEIGHT = 200;
    private JPanel mPanel;

    public Box1841720019Sultan() {
        mPanel = new JPanel();
        mPanel.setLayout(new BoxLayout(mPanel, BoxLayout.Y_AXIS));
        mPanel.add(new JButton("1"));
        mPanel.add(new JButton("2"));
        mPanel.add(new JButton("3"));
        mPanel.add(new JButton("4"));
        mPanel.add(new JButton("5"));
        add(mPanel);
        setSize(sFRAME_WIDTH, sFRAME_HEIGHT);
        setTitle("Box Layout Demo");
    }
}
