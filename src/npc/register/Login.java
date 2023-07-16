package npc.register;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import javax.swing.*;

/**
 *
 * @author ndach
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel BG;
    private javax.swing.JLabel log;
    private javax.swing.JButton logIn;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mophe;
    private javax.swing.JLabel pWord;
    private javax.swing.JPasswordField passWord;
    private javax.swing.JLabel uName;
    private javax.swing.JTextField userName;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold default-state="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    private static Connection myConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return (Connection) DriverManager.getConnection("jdbc:mysql://localhost"
                    + ":3306/npc_register", "root", "001008186116002");
        } catch (ClassNotFoundException | SQLException ignored) {
        }
        return null;
    }

    private void logInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInMouseEntered
        logIn.setForeground(Color.green);
    }//GEN-LAST:event_logInMouseEntered

    private void logInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInMouseExited
        logIn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_logInMouseExited

    private void logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInActionPerformed
        login(userName, passWord);
    }//GEN-LAST:event_logInActionPerformed

    private void userNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameKeyTyped
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login(userName, passWord);
        }
    }//GEN-LAST:event_userNameKeyTyped

    private void passWordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passWordKeyTyped
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login(userName, passWord);
        }
    }//GEN-LAST:event_passWordKeyTyped

    private void BGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BGKeyTyped
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login(userName, passWord);
        }
    }//GEN-LAST:event_BGKeyTyped

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login(userName, passWord);
        }
    }//GEN-LAST:event_formKeyPressed

    private void userNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login(userName, passWord);
        }
    }//GEN-LAST:event_userNameKeyPressed

    private void passWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passWordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login(userName, passWord);
        }
    }//GEN-LAST:event_passWordKeyPressed
    // End of variables declaration                   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold default-state="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        log = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        uName = new javax.swing.JLabel();
        pWord = new javax.swing.JLabel();
        passWord = new javax.swing.JPasswordField();
        mophe = new javax.swing.JLabel();
        logIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setAlwaysOnTop(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BGKeyTyped(evt);
            }
        });
        BG.setLayout(null);

        log.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        log.setForeground(new java.awt.Color(0, 204, 51));
        log.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        log.setText("Log In");
        BG.add(log);
        log.setBounds(60, 0, 170, 40);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/npc/register/npc.png")))); // NOI18N
        BG.add(logo);
        logo.setBounds(30, 40, 230, 200);

        userName.setBackground(new java.awt.Color(255, 255, 255));
        userName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        userName.setForeground(new java.awt.Color(0, 0, 0));
        userName.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userNameKeyTyped(evt);
            }
        });
        BG.add(userName);
        userName.setBounds(10, 270, 280, 40);

        uName.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        uName.setForeground(new java.awt.Color(0, 0, 0));
        uName.setText("User Name");
        BG.add(uName);
        uName.setBounds(10, 240, 100, 20);

        pWord.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        pWord.setForeground(new java.awt.Color(0, 0, 0));
        pWord.setText("Password");
        BG.add(pWord);
        pWord.setBounds(10, 320, 100, 20);

        passWord.setBackground(new java.awt.Color(255, 255, 255));
        passWord.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        passWord.setForeground(new java.awt.Color(0, 0, 0));
        passWord.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        passWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passWordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passWordKeyTyped(evt);
            }
        });
        BG.add(passWord);
        passWord.setBounds(10, 350, 280, 40);

        mophe.setFont(new java.awt.Font("Segoe UI", Font.ITALIC, 12)); // NOI18N
        mophe.setForeground(new java.awt.Color(204, 204, 204));
        mophe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mophe.setText("Morpheus Softwares");
        BG.add(mophe);
        mophe.setBounds(0, 430, 130, 16);

        logIn.setBackground(new java.awt.Color(255, 255, 255));
        logIn.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        logIn.setForeground(new java.awt.Color(0, 0, 0));
        logIn.setText("Log In");
        logIn.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        logIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logIn.setOpaque(false);
        logIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logInMouseExited(evt);
            }
        });
        logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInActionPerformed(evt);
            }
        });
        BG.add(logIn);
        logIn.setBounds(200, 400, 90, 40);

        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login(JTextField textField, JPasswordField passwordField) {
        String username = textField.getText();
        String password = String.valueOf(passwordField.getPassword());

        try {
            String sql = "SELECT * FROM `login` WHERE username = ?";
            PreparedStatement preparedStatement = (PreparedStatement) Objects.requireNonNull(myConnection()).prepareStatement(sql);
            preparedStatement.setString(1, textField.getText());
            ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("name");
                String uN = resultSet.getString("username");
                String pW = resultSet.getString("password");
                String dept = resultSet.getString("department");
                String id = resultSet.getString("staffid");
                exportLog(dept);
                exportLogs(name, id);

                if (uN.equals(username) && pW.equals(encryptToMD5(password))) {
                    this.dispose();
                    new Register().setVisible(true);
                } else if (!uN.equals(username) || !pW.equals(encryptToMD5(password))) {
                    JOptionPane.showMessageDialog(this, "Invalid login credentials!", "Login error", 1);
                }
            } else if ("".equals(username) && "".equals(password)) {
                JOptionPane.showMessageDialog(this, "Type in username and password to log in, please...", "Login error", 1);
            } else if ("".equals(username)) {
                JOptionPane.showMessageDialog(this, "Type in your username to log in, please...", "Login error", 1);
            } else if ("".equals(password)) {
                JOptionPane.showMessageDialog(this, "Type in your password to log in, please...", "Login error", 1);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid login credentials!", "Login error", 1);
            }

        } catch (SQLException | NoSuchAlgorithmException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", 1);
        }
    }

    private void exportLog(String department) {
        try {
            FileOutputStream fos = new FileOutputStream("_.txt");
            try ( PrintWriter pw = new PrintWriter(fos)) {
                pw.write(department);
                pw.close();
                fos.close();
            } catch (IOException ex) {
            }
        } catch (FileNotFoundException fnfe) {
        }
    }

    private void exportLogs(String name, String id) {
        try {
            FileOutputStream fos = new FileOutputStream("%.txt");
            try ( PrintWriter pw = new PrintWriter(fos)) {
                pw.write(name);
                pw.write("\n");
                pw.write(id);
                pw.close();
                fos.close();
            } catch (IOException ex) {
            }
        } catch (FileNotFoundException fnfe) {
        }
    }

    public static String encryptToMD5(String string) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(string.getBytes(), 0, string.length());
        return new BigInteger(1, md.digest()).toString(16);
    }
}
