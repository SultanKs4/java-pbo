package id.natlus.js11.praktikum.percobaan3;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid1841720019Sultan extends JFrame {
    private static final int sFRAME_WIDTH = 600;
    private static final int sFRAME_HEIGHT = 200;
    private JPanel mPanel;

    public Grid1841720019Sultan() {
        mPanel = new JPanel();
        mPanel.setLayout(new GridLayout(4, 2));

        mPanel.add(new JButton("1"));
        mPanel.add(new JButton("2"));
        mPanel.add(new JButton("3"));
        mPanel.add(new JButton("4"));
        mPanel.add(new JButton("5"));
        mPanel.add(new JButton("6"));
        mPanel.add(new JButton("7"));
        mPanel.add(new JButton("8"));

        add(mPanel);
        setSize(sFRAME_WIDTH, sFRAME_HEIGHT);
        setTitle("Grid Layout Demo");

    }
}
