package id.natlus.js11.praktikum.percobaan4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing1841720019SultanIntellij extends JFrame {
    private JPanel mPanel;
    private JTextField mTxtFieldName;
    private JRadioButton mRdJkL;
    private JRadioButton mRdJkP;
    private JCheckBox mCbMk1;
    private JCheckBox mCbMk2;
    private JList mListJurusan;
    private JComboBox mComboBoxSemester;
    private JTextField mTxtFieldNim;
    private JButton mBtnClear;
    private JButton mBtnTampil;
    private JLabel mLabelName;
    private JLabel mLabelNim;
    private JLabel mLabelJk;
    private JLabel mLabelMk;
    private JLabel mLabelJurusan;
    private JLabel mLabelTitle;
    private JLabel mLabelSemester;
    private JTextArea mTxtArea;
    private JLabel mLabelAlamat;
    private JTextField mTxtFieldAlamat;
    private String mNama;
    private String mNim;
    private String mAlamat;
    private String mJenisKelamin = "";
    private String mInfo;
    private String mJurusan;
    private String mMataKuliah = "";
    private String mSemester;

    public Swing1841720019SultanIntellij() {
        mBtnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mTxtFieldName.setText("");
                mTxtFieldNim.setText("");
                mRdJkP.setSelected(false);
                mRdJkL.setSelected(false);
                mCbMk1.setSelected(false);
                mCbMk2.setSelected(false);
                mListJurusan.clearSelection();
                mTxtArea.setText("");
                mTxtFieldAlamat.setText("");
                mComboBoxSemester.setSelectedIndex(0);
            }
        });
        mBtnTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mNama = mTxtFieldName.getText();
                mNim = mTxtFieldNim.getText();

                if (mCbMk1.isSelected()) {
                    mMataKuliah = mCbMk1.getText();
                }
                if (mCbMk2.isSelected()) {
                    mMataKuliah += mCbMk2.getText();
                }

                if (mRdJkL.isSelected()) {
                    mJenisKelamin = mRdJkL.getText();
                }
                if (mRdJkP.isSelected()) {
                    mJenisKelamin += mRdJkP.getText();
                }
                mJurusan = mListJurusan.getSelectedValue().toString();
                mSemester = mComboBoxSemester.getSelectedItem().toString();

                mAlamat = mTxtFieldAlamat.getText();
                if (mAlamat.equalsIgnoreCase("")) {
                    String alamatInfo = "Alamat masih kosong mohon diisi terlebih dahulu";
                    JOptionPane.showMessageDialog(null, alamatInfo);
                } else {
                    mInfo = "Nama\t: " + mNama + "\n";
                    mInfo += "NIM\t: " + mNim + "\n";
                    mInfo += "Alamat\t: " + mAlamat + "\n";
                    mInfo += "Jenis Kelamin\t: " + mJenisKelamin + "\n";
                    mInfo += "Jurusan\t: " + mJurusan + "\n";
                    mInfo += "Semester\t: " + mSemester + "\n";
                    mInfo += "Mata Kuliah\t: " + mMataKuliah;
                    mTxtArea.setText(mInfo);
                    JOptionPane.showMessageDialog(null, mInfo);
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing");
        frame.setContentPane(new Swing1841720019SultanIntellij().mPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setMinimumSize(frame.getSize());
        frame.setVisible(true);
    }
}
