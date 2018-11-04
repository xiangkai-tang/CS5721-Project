/*
 * Created by JFormDesigner on Sat Oct 20 15:49:37 BST 2018
 */

package view;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author xiangkai22
 */
public class StaffRemoveAccountInfoView extends JFrame {
    private long staffId;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton btn_accept;
    private JButton btn_decline;
    private JButton btn_back;

    public StaffRemoveAccountInfoView(long staffId) {
        initComponents();
        setStaffId(staffId);
    }

    private void btn_backActionPerformed(ActionEvent e) {
        this.dispose();
        new StaffMainView(staffId).run();
    }

    public void run() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        btn_accept = new JButton();
        btn_decline = new JButton();
        btn_back = new JButton();

        //======== this ========
        setTitle("Remove Account Request Info");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[100:n,fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[100:n,fill]",
                // rows
                "[50:n]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[100:n]"));

        //---- btn_accept ----
        btn_accept.setText("Accept");
        contentPane.add(btn_accept, "cell 1 2 3 1");

        //---- btn_decline ----
        btn_decline.setText("Decline");
        contentPane.add(btn_decline, "cell 1 3 3 1");

        //---- btn_back ----
        btn_back.setText("Back");
        btn_back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn_backActionPerformed(e);
            }
        });
        contentPane.add(btn_back, "cell 1 4 3 1");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private void setStaffId(long staffId) {
        this.staffId = staffId;
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
