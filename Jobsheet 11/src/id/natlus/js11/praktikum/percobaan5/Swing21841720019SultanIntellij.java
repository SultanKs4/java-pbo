package id.natlus.js11.praktikum.percobaan5;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing21841720019SultanIntellij {
    private JTabbedPane mTabbedPane;
    private JPanel mPanel;
    private JPanel mPanelHal1;
    private JPanel mPanelHal2;
    private JPanel mPanelHal3;
    private JTree mTree;
    private JTextField mTxtFieldTurunan;
    private JButton mBtnTambah;
    private JScrollPane mScroolPane;
    private JLabel mLabelTurunan;
    private JTable mTabelHal2;
    private JTable mTableHal1;

    public Swing21841720019SultanIntellij() {
        initComponents();
    }

    private void initComponents() {
        mBtnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DefaultMutableTreeNode admin = new DefaultMutableTreeNode(mTxtFieldTurunan.getText());
                DefaultMutableTreeNode set = (DefaultMutableTreeNode) mTree.getLastSelectedPathComponent();
                DefaultTreeModel dt = (DefaultTreeModel) mTree.getModel();
                dt.insertNodeInto(admin, set, set.getChildCount());
            }
        });

        mTableHal1.setModel(new DefaultTableModel(
                new Object[][]{
                        {1, "Sultan Achmad", 1841720019, "TI-2C"},
                        {2, "Qum Masykuro", 1841720022, "TI-2Z"}
                },
                new String[]{
                        "No", "Nama", "NIM", "Kelas"
                }
        ));
    }

    private void createUIComponents() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
        mTree = new JTree(root);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing21841720019SultanIntellij");
        frame.setContentPane(new Swing21841720019SultanIntellij().mPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
