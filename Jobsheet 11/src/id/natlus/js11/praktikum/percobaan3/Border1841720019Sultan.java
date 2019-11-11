package id.natlus.js11.praktikum.percobaan3;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border1841720019Sultan extends JFrame {
    private static final int sFRAME_WIDTH = 600;
    private static final int sFRAME_HEIGHT = 200;
    private JPanel mPanel;

    public Border1841720019Sultan() {
        mPanel = new JPanel();
        mPanel.setLayout(new BorderLayout());

        mPanel.add(new JButton("1"), BorderLayout.NORTH);
        mPanel.add(new JButton("2"), BorderLayout.WEST);
        mPanel.add(new JButton("3"), BorderLayout.CENTER);
        mPanel.add(new JButton("4"), BorderLayout.EAST);
        mPanel.add(new JButton("5"), BorderLayout.SOUTH);

        add(mPanel);
        setSize(sFRAME_WIDTH, sFRAME_HEIGHT);
        setTitle("Border Layout Demo");
    }
}
