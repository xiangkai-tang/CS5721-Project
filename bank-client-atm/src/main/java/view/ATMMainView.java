/*
 * Created by JFormDesigner on Wed Oct 17 10:47:22 BST 2018
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author xiangkai22
 */
public class ATMMainView extends JFrame {
    public ATMMainView() {
        initComponents();
    }

    private void btn_exitActionPerformed(ActionEvent e) {
        this.dispose();
        new ATMLoginView().run();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        btn_withdraw = new JButton();
        btn_deposit = new JButton();
        btn_exit = new JButton();

        //======== this ========
        setTitle("ATM Main View");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[100:n,fill]" +
            "[fill]" +
            "[100:n,fill]",
            // rows
            "[50:n]" +
            "[]" +
            "[30:n]" +
            "[]" +
            "[30:n]0" +
            "[]" +
            "[50:n]"));

        //---- btn_withdraw ----
        btn_withdraw.setText("Withdraw");
        btn_withdraw.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        btn_withdraw.setMinimumSize(new Dimension(120, 40));
        contentPane.add(btn_withdraw, "cell 1 1");

        //---- btn_deposit ----
        btn_deposit.setText("Deposit");
        btn_deposit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        btn_deposit.setMinimumSize(new Dimension(200, 40));
        contentPane.add(btn_deposit, "cell 1 3");

        //---- btn_exit ----
        btn_exit.setText("Exit");
        btn_exit.setMinimumSize(new Dimension(200, 40));
        btn_exit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        btn_exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn_exitActionPerformed(e);
            }
        });
        contentPane.add(btn_exit, "cell 1 5");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public void run() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton btn_withdraw;
    private JButton btn_deposit;
    private JButton btn_exit;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}