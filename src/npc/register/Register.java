package npc.register;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Ndachimya Edward
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel aTittleInwardFile;
    private javax.swing.JLabel aTittleInwardMail;
    private javax.swing.JLabel aTittleOutwardFile;
    private javax.swing.JLabel aTittleOutwardMail;
    private javax.swing.JButton addInwardFile;
    private javax.swing.JButton addInwardMail;
    private javax.swing.JButton addOutwardFile;
    private javax.swing.JButton addOutwardMail;
    private javax.swing.JLabel attachInwardFile;
    private javax.swing.JLabel attachInwardMail;
    private javax.swing.JLabel attachOutwardFile;
    private javax.swing.JLabel attachOutwardMail;
    private javax.swing.JLabel dat;
    private javax.swing.JLabel dat1;
    private javax.swing.JLabel dat2;
    private javax.swing.JLabel dat3;
    private javax.swing.JTextField dateInwardFile;
    private javax.swing.JTextField dateInwardMail;
    private javax.swing.JTextField dateOutwardFile;
    private javax.swing.JTextField dateOutwardMail;
    private javax.swing.JButton deleteInwardFile;
    private javax.swing.JButton deleteInwardMail;
    private javax.swing.JButton deleteOutwardFile;
    private javax.swing.JButton deleteOutwardMail;
    private javax.swing.JLabel emblem;
    private javax.swing.JButton export;
    private javax.swing.JLabel id;
    private javax.swing.JButton importRecords;
    private javax.swing.JScrollPane inFileScroll;
    private javax.swing.JTable inFileTable;
    private javax.swing.JPanel inFiles;
    private javax.swing.JScrollPane inMailScroll;
    private javax.swing.JTable inMailTable;
    private javax.swing.JPanel inMails;
    private javax.swing.JButton inwardFileButton;
    private javax.swing.JButton inwardMailButton;
    private javax.swing.JLabel issue;
    private javax.swing.JLabel issue1;
    private javax.swing.JLabel issue2;
    private javax.swing.JLabel issue3;
    private javax.swing.JTextField issueNoInwardFile;
    private javax.swing.JTextField issueNoInwardMail;
    private javax.swing.JTextField issueNoOutwardFile;
    private javax.swing.JTextField issueNoOutwardMail;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel marquee;
    private javax.swing.JLabel note;
    private javax.swing.JLabel note1;
    private javax.swing.JLabel note2;
    private javax.swing.JLabel note3;
    private javax.swing.JPanel outFIles;
    private javax.swing.JScrollPane outFileScroll;
    private javax.swing.JTable outFileTable;
    private javax.swing.JScrollPane outMailScroll;
    private javax.swing.JTable outMailTable;
    private javax.swing.JPanel outMails;
    private javax.swing.JButton outwardFileButton;
    private javax.swing.JButton outwardMailButton;
    private javax.swing.JTextArea purposeInwardFile;
    private javax.swing.JTextArea purposeInwardMail;
    private javax.swing.JTextArea purposeOutwardFile;
    private javax.swing.JTextArea purposeOutwardMail;
    private javax.swing.JLabel rec;
    private javax.swing.JLabel rec1;
    private javax.swing.JLabel rec2;
    private javax.swing.JLabel rec3;
    private javax.swing.JTextField searchInwardFile;
    private javax.swing.JTextField searchInwardMail;
    private javax.swing.JTextField searchOutwardFile;
    private javax.swing.JTextField searchOutwardMail;
    private javax.swing.JPanel sideBar;
    private javax.swing.JLabel staff;
    private javax.swing.JLabel sub;
    private javax.swing.JLabel sub1;
    private javax.swing.JLabel sub2;
    private javax.swing.JLabel sub3;
    private javax.swing.JTextArea subjectInwardFile;
    private javax.swing.JTextArea subjectInwardMail;
    private javax.swing.JTextArea subjectOutwardFile;
    private javax.swing.JTextArea subjectOutwardMail;
    private javax.swing.JButton syncInwardFile;
    private javax.swing.JButton syncInwardMail;
    private javax.swing.JButton syncOutwardFile;
    private javax.swing.JButton syncOutwardMail;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JLabel title;
    private javax.swing.JLabel trans;
    private javax.swing.JLabel trans1;
    private javax.swing.JLabel trans2;
    private javax.swing.JLabel trans3;
    private javax.swing.JLabel trans4;
    private javax.swing.JLabel trans5;
    private javax.swing.JLabel trans6;
    private javax.swing.JLabel trans7;
    private javax.swing.JTextField transitionInwardFile;
    private javax.swing.JTextField transitionInwardMail;
    private javax.swing.JTextField transitionOutwardFile;
    private javax.swing.JTextField transitionOutwardMail;
    private javax.swing.JButton updateInwardFile;
    private javax.swing.JButton updateInwardMail;
    private javax.swing.JButton updateOutwardFile;
    private javax.swing.JButton updateOutwardMail;
    private javax.swing.JLabel whoF;
    private javax.swing.JLabel whoF1;
    private javax.swing.JLabel whoF2;
    private javax.swing.JLabel whoF3;
    private javax.swing.JComboBox<String> whoFromInwardFile;
    private javax.swing.JComboBox<String> whoFromInwardMail;
    private javax.swing.JComboBox<String> whoToOutwardFile;
    private javax.swing.JComboBox<String> whoToOutwardMail;
    private javax.swing.JTextField yourDeptInwardFile;
    private javax.swing.JTextField yourDeptInwardMail;
    private javax.swing.JTextField yourDeptOutwardFile;
    private javax.swing.JTextField yourDeptOutwardMail;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
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

    private void inwardMailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inwardMailButtonActionPerformed
        tab.setSelectedIndex(0);
        refreshTime();
    }//GEN-LAST:event_inwardMailButtonActionPerformed

    private void outwardMailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outwardMailButtonActionPerformed
        tab.setSelectedIndex(1);
        refreshTime();
    }//GEN-LAST:event_outwardMailButtonActionPerformed

    private void inwardFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inwardFileButtonActionPerformed
        tab.setSelectedIndex(2);
        refreshTime();
    }//GEN-LAST:event_inwardFileButtonActionPerformed

    private void outwardFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outwardFileButtonActionPerformed
        tab.setSelectedIndex(3);
        refreshTime();
    }//GEN-LAST:event_outwardFileButtonActionPerformed

    private void addInwardMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInwardMailActionPerformed
        add(issueNoInwardMail, dateInwardMail, transitionInwardMail, subjectInwardMail,
                purposeInwardMail, whoFromInwardMail, yourDeptInwardMail, attachInwardMail,
                aTittleInwardMail, inMailTable);
        autoSave();
    }//GEN-LAST:event_addInwardMailActionPerformed

    private void syncInwardMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syncInwardMailActionPerformed
        syncRecords(inMailTable, "inmailtable");
        autoSave();
    }//GEN-LAST:event_syncInwardMailActionPerformed

    private void deleteInwardMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInwardMailActionPerformed
        delete(issueNoInwardMail, transitionInwardMail, subjectInwardMail, purposeInwardMail,
                whoFromInwardMail, aTittleInwardMail, aTittleInwardMail, inMailTable);
        autoSave();
    }//GEN-LAST:event_deleteInwardMailActionPerformed

    private void updateInwardMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInwardMailActionPerformed
        update(issueNoInwardMail, dateInwardMail, transitionInwardMail, subjectInwardMail,
                purposeInwardMail, whoFromInwardMail, yourDeptInwardMail, attachInwardMail,
                aTittleInwardMail, inMailTable);
        autoSave();
    }//GEN-LAST:event_updateInwardMailActionPerformed

    private void inMailTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inMailTableMouseClicked
        showRecord(issueNoInwardMail, dateInwardMail, transitionInwardMail, subjectInwardMail,
                purposeInwardMail, whoFromInwardMail, yourDeptInwardMail, attachInwardMail,
                aTittleInwardMail, inMailTable);
    }//GEN-LAST:event_inMailTableMouseClicked

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        Export(inMailTable, inFileTable, outMailTable, outFileTable, yourDeptInwardMail);
        autoSave();
    }//GEN-LAST:event_exportActionPerformed

    private void inwardMailButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inwardMailButtonMouseEntered
        inwardMailButton.setForeground(Color.white);
    }//GEN-LAST:event_inwardMailButtonMouseEntered

    private void inwardMailButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inwardMailButtonMouseExited
        inwardMailButton.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_inwardMailButtonMouseExited

    private void outwardMailButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outwardMailButtonMouseEntered
        outwardMailButton.setForeground(Color.white);
    }//GEN-LAST:event_outwardMailButtonMouseEntered

    private void outwardMailButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outwardMailButtonMouseExited
        outwardMailButton.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_outwardMailButtonMouseExited

    private void inwardFileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inwardFileButtonMouseEntered
        inwardFileButton.setForeground(Color.white);
    }//GEN-LAST:event_inwardFileButtonMouseEntered

    private void inwardFileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inwardFileButtonMouseExited
        inwardFileButton.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_inwardFileButtonMouseExited

    private void outwardFileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outwardFileButtonMouseEntered
        outwardFileButton.setForeground(Color.white);
    }//GEN-LAST:event_outwardFileButtonMouseEntered

    private void outwardFileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outwardFileButtonMouseExited
        outwardFileButton.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_outwardFileButtonMouseExited

    private void exportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportMouseEntered
        export.setForeground(Color.white);
    }//GEN-LAST:event_exportMouseEntered

    private void exportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportMouseExited
        export.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_exportMouseExited

    private void addInwardMailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addInwardMailMouseEntered
        addInwardMail.setForeground(Color.green);
    }//GEN-LAST:event_addInwardMailMouseEntered

    private void addInwardMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addInwardMailMouseExited
        addInwardMail.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_addInwardMailMouseExited

    private void deleteInwardMailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteInwardMailMouseEntered
        deleteInwardMail.setForeground(Color.red);
    }//GEN-LAST:event_deleteInwardMailMouseEntered

    private void deleteInwardMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteInwardMailMouseExited
        deleteInwardMail.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_deleteInwardMailMouseExited

    private void updateInwardMailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateInwardMailMouseEntered
        updateInwardMail.setForeground(Color.green);
    }//GEN-LAST:event_updateInwardMailMouseEntered

    private void updateInwardMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateInwardMailMouseExited
        updateInwardMail.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_updateInwardMailMouseExited

    private void syncInwardMailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncInwardMailMouseEntered
        syncInwardMail.setForeground(Color.green);
    }//GEN-LAST:event_syncInwardMailMouseEntered

    private void syncInwardMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncInwardMailMouseExited
        syncInwardMail.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_syncInwardMailMouseExited

    private void searchInwardMailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchInwardMailMouseEntered
        searchInwardMail.setForeground(Color.black);
    }//GEN-LAST:event_searchInwardMailMouseEntered

    private void searchInwardMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchInwardMailMouseExited
        searchInwardMail.setForeground(new Color(187, 187, 187));
    }//GEN-LAST:event_searchInwardMailMouseExited

    private void searchInwardMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInwardMailActionPerformed

    }//GEN-LAST:event_searchInwardMailActionPerformed

    private void searchInwardMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchInwardMailMouseClicked

    }//GEN-LAST:event_searchInwardMailMouseClicked

    private void searchInwardMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchInwardMailFocusLost
        if ("".equals(searchInwardMail.getText())) {
            searchInwardMail.setText("Search with any field...");
        }
    }//GEN-LAST:event_searchInwardMailFocusLost

    private void searchInwardMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchInwardMailFocusGained
        if ("Search with any field...".equals(searchInwardMail.getText())) {
            searchInwardMail.setText(null);
        } else {
            searchInwardMail.setText(searchInwardMail.getText());
        }
    }//GEN-LAST:event_searchInwardMailFocusGained

    private void searchInwardMailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInwardMailKeyTyped

    }//GEN-LAST:event_searchInwardMailKeyTyped

    private void searchInwardMailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInwardMailKeyReleased
        filter(searchInwardMail, inMailTable);
    }//GEN-LAST:event_searchInwardMailKeyReleased

    private void outMailTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outMailTableMouseClicked
        showRecord(issueNoOutwardMail, dateOutwardMail, transitionOutwardMail, subjectOutwardMail,
                purposeOutwardMail, whoToOutwardMail, yourDeptOutwardMail, attachOutwardMail,
                aTittleOutwardMail, outMailTable);
    }//GEN-LAST:event_outMailTableMouseClicked

    private void addOutwardMailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addOutwardMailMouseEntered
        addOutwardMail.setForeground(Color.green);
    }//GEN-LAST:event_addOutwardMailMouseEntered

    private void addOutwardMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addOutwardMailMouseExited
        addOutwardMail.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_addOutwardMailMouseExited

    private void addOutwardMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOutwardMailActionPerformed
        add(issueNoOutwardMail, dateOutwardMail, transitionOutwardMail, subjectOutwardMail,
                purposeOutwardMail, whoToOutwardMail, yourDeptOutwardMail, attachOutwardMail,
                aTittleOutwardMail, outMailTable);
        autoSave();
    }//GEN-LAST:event_addOutwardMailActionPerformed

    private void deleteOutwardMailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteOutwardMailMouseEntered
        deleteOutwardMail.setForeground(Color.red);
    }//GEN-LAST:event_deleteOutwardMailMouseEntered

    private void deleteOutwardMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteOutwardMailMouseExited
        deleteOutwardMail.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_deleteOutwardMailMouseExited

    private void deleteOutwardMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOutwardMailActionPerformed
        delete(issueNoOutwardMail, transitionOutwardMail, subjectOutwardMail, purposeOutwardMail,
                whoToOutwardMail, attachOutwardMail, aTittleOutwardMail, outMailTable);
        autoSave();
    }//GEN-LAST:event_deleteOutwardMailActionPerformed

    private void updateOutwardMailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateOutwardMailMouseEntered
        updateOutwardMail.setForeground(Color.green);
    }//GEN-LAST:event_updateOutwardMailMouseEntered

    private void updateOutwardMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateOutwardMailMouseExited
        updateOutwardMail.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_updateOutwardMailMouseExited

    private void updateOutwardMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOutwardMailActionPerformed
        update(issueNoOutwardMail, dateOutwardMail, transitionOutwardMail, subjectOutwardMail,
                purposeOutwardMail, whoToOutwardMail, yourDeptOutwardMail, attachOutwardMail,
                aTittleOutwardMail, outMailTable);
        autoSave();
    }//GEN-LAST:event_updateOutwardMailActionPerformed

    private void syncOutwardMailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncOutwardMailMouseEntered
        syncOutwardMail.setForeground(Color.green);
    }//GEN-LAST:event_syncOutwardMailMouseEntered

    private void syncOutwardMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncOutwardMailMouseExited
        syncOutwardMail.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_syncOutwardMailMouseExited

    private void syncOutwardMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syncOutwardMailActionPerformed
        syncRecords(outMailTable, "outmailtable");
        autoSave();
    }//GEN-LAST:event_syncOutwardMailActionPerformed

    private void searchOutwardMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchOutwardMailFocusGained
        if ("Search with any field...".equals(searchOutwardMail.getText())) {
            searchOutwardMail.setText(null);
        } else {
            searchOutwardMail.setText(searchOutwardMail.getText());
        }
    }//GEN-LAST:event_searchOutwardMailFocusGained

    private void searchOutwardMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchOutwardMailFocusLost
        if ("".equals(searchOutwardMail.getText())) {
            searchOutwardMail.setText("Search with any field...");
        }
    }//GEN-LAST:event_searchOutwardMailFocusLost

    private void searchOutwardMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchOutwardMailMouseClicked

    }//GEN-LAST:event_searchOutwardMailMouseClicked

    private void searchOutwardMailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchOutwardMailMouseEntered
        searchOutwardMail.setForeground(Color.black);
    }//GEN-LAST:event_searchOutwardMailMouseEntered

    private void searchOutwardMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchOutwardMailMouseExited
        searchOutwardMail.setForeground(new Color(187, 187, 187));
    }//GEN-LAST:event_searchOutwardMailMouseExited

    private void searchOutwardMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchOutwardMailActionPerformed

    }//GEN-LAST:event_searchOutwardMailActionPerformed

    private void searchOutwardMailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchOutwardMailKeyReleased
        filter(searchOutwardMail, outMailTable);
    }//GEN-LAST:event_searchOutwardMailKeyReleased

    private void searchOutwardMailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchOutwardMailKeyTyped

    }//GEN-LAST:event_searchOutwardMailKeyTyped

    private void inFileTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inFileTableMouseClicked
        showRecord(issueNoInwardFile, dateInwardFile, transitionInwardFile, subjectInwardFile,
                purposeInwardFile, whoFromInwardFile, yourDeptInwardFile, attachInwardFile,
                aTittleInwardFile, inFileTable);
    }//GEN-LAST:event_inFileTableMouseClicked

    private void addInwardFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addInwardFileMouseEntered
        addInwardFile.setForeground(Color.green);
    }//GEN-LAST:event_addInwardFileMouseEntered

    private void addInwardFileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addInwardFileMouseExited
        addInwardFile.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_addInwardFileMouseExited

    private void addInwardFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInwardFileActionPerformed
        add(issueNoInwardFile, dateInwardFile, transitionInwardFile, subjectInwardFile,
                purposeInwardFile, whoFromInwardFile, yourDeptInwardFile, attachInwardFile,
                aTittleInwardFile, inFileTable);
        autoSave();
    }//GEN-LAST:event_addInwardFileActionPerformed

    private void deleteInwardFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteInwardFileMouseEntered
        deleteInwardFile.setForeground(Color.red);
    }//GEN-LAST:event_deleteInwardFileMouseEntered

    private void deleteInwardFileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteInwardFileMouseExited
        deleteInwardFile.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_deleteInwardFileMouseExited

    private void deleteInwardFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInwardFileActionPerformed
        delete(issueNoInwardFile, transitionInwardFile, subjectInwardFile, purposeInwardFile,
                whoFromInwardFile, attachInwardFile, aTittleInwardFile, inFileTable);
        autoSave();
    }//GEN-LAST:event_deleteInwardFileActionPerformed

    private void updateInwardFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateInwardFileMouseEntered
        updateInwardFile.setForeground(Color.green);
    }//GEN-LAST:event_updateInwardFileMouseEntered

    private void updateInwardFileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateInwardFileMouseExited
        deleteInwardFile.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_updateInwardFileMouseExited

    private void updateInwardFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInwardFileActionPerformed
        update(issueNoInwardFile, dateInwardFile, transitionInwardFile, subjectInwardFile,
                purposeInwardFile, whoFromInwardFile, yourDeptInwardFile, attachInwardFile,
                aTittleInwardFile, inFileTable);
        autoSave();
    }//GEN-LAST:event_updateInwardFileActionPerformed

    private void syncInwardFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncInwardFileMouseEntered
        syncInwardFile.setForeground(Color.green);
    }//GEN-LAST:event_syncInwardFileMouseEntered

    private void syncInwardFileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncInwardFileMouseExited
        syncInwardFile.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_syncInwardFileMouseExited

    private void syncInwardFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syncInwardFileActionPerformed
        syncRecords(inFileTable, "infiletable");
        autoSave();
    }//GEN-LAST:event_syncInwardFileActionPerformed

    private void searchInwardFileFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchInwardFileFocusGained
        if ("Search with any field...".equals(searchInwardFile.getText())) {
            searchInwardFile.setText(null);
        } else {
            searchInwardFile.setText(searchInwardFile.getText());
        }
    }//GEN-LAST:event_searchInwardFileFocusGained

    private void searchInwardFileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchInwardFileFocusLost
        if ("".equals(searchInwardFile.getText())) {
            searchInwardFile.setText("Search with any field...");
        }
    }//GEN-LAST:event_searchInwardFileFocusLost

    private void searchInwardFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchInwardFileMouseClicked

    }//GEN-LAST:event_searchInwardFileMouseClicked

    private void searchInwardFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchInwardFileMouseEntered
        searchInwardFile.setForeground(Color.black);
    }//GEN-LAST:event_searchInwardFileMouseEntered

    private void searchInwardFileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchInwardFileMouseExited
        searchInwardFile.setForeground(new Color(187, 187, 187));
    }//GEN-LAST:event_searchInwardFileMouseExited

    private void searchInwardFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInwardFileActionPerformed

    }//GEN-LAST:event_searchInwardFileActionPerformed

    private void searchInwardFileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInwardFileKeyReleased
        filter(searchInwardFile, inFileTable);
    }//GEN-LAST:event_searchInwardFileKeyReleased

    private void searchInwardFileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInwardFileKeyTyped

    }//GEN-LAST:event_searchInwardFileKeyTyped

    private void outFileTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outFileTableMouseClicked
        showRecord(issueNoOutwardFile, dateOutwardFile, transitionOutwardFile, subjectOutwardFile,
                purposeOutwardFile, whoToOutwardFile, yourDeptOutwardFile, attachOutwardFile,
                aTittleOutwardFile, outFileTable);
    }//GEN-LAST:event_outFileTableMouseClicked

    private void addOutwardFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addOutwardFileMouseEntered
        addOutwardFile.setForeground(Color.green);
    }//GEN-LAST:event_addOutwardFileMouseEntered

    private void addOutwardFileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addOutwardFileMouseExited
        addOutwardFile.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_addOutwardFileMouseExited

    private void addOutwardFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOutwardFileActionPerformed
        add(issueNoOutwardFile, dateOutwardFile, transitionOutwardFile, subjectOutwardFile,
                purposeOutwardFile, whoToOutwardFile, yourDeptOutwardFile, attachOutwardFile,
                aTittleOutwardFile, outFileTable);
        autoSave();
    }//GEN-LAST:event_addOutwardFileActionPerformed

    private void deleteOutwardFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteOutwardFileMouseEntered
        deleteOutwardFile.setForeground(Color.red);
    }//GEN-LAST:event_deleteOutwardFileMouseEntered

    private void deleteOutwardFileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteOutwardFileMouseExited
        deleteOutwardFile.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_deleteOutwardFileMouseExited

    private void deleteOutwardFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOutwardFileActionPerformed
        delete(issueNoOutwardFile, transitionOutwardFile, subjectOutwardFile, purposeOutwardFile,
                whoToOutwardFile, attachOutwardFile, aTittleOutwardFile, outFileTable);
        autoSave();
    }//GEN-LAST:event_deleteOutwardFileActionPerformed

    private void updateOutwardFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateOutwardFileMouseEntered
        updateOutwardFile.setForeground(Color.green);
    }//GEN-LAST:event_updateOutwardFileMouseEntered

    private void updateOutwardFileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateOutwardFileMouseExited
        updateOutwardFile.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_updateOutwardFileMouseExited

    private void updateOutwardFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOutwardFileActionPerformed
        update(issueNoOutwardFile, dateOutwardFile, transitionOutwardFile, subjectOutwardFile,
                purposeOutwardFile, whoToOutwardFile, yourDeptOutwardFile, attachOutwardFile,
                aTittleOutwardFile, outFileTable);
        autoSave();
    }//GEN-LAST:event_updateOutwardFileActionPerformed

    private void syncOutwardFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncOutwardFileMouseEntered
        syncOutwardFile.setForeground(Color.green);
    }//GEN-LAST:event_syncOutwardFileMouseEntered

    private void syncOutwardFileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncOutwardFileMouseExited
        syncOutwardFile.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_syncOutwardFileMouseExited

    private void syncOutwardFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syncOutwardFileActionPerformed
        syncRecords(outFileTable, "outfiletable");
        autoSave();
    }//GEN-LAST:event_syncOutwardFileActionPerformed

    private void searchOutwardFileFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchOutwardFileFocusGained
        if ("Search with any field...".equals(searchOutwardFile.getText())) {
            searchOutwardFile.setText(null);
        } else {
            searchOutwardFile.setText(searchOutwardFile.getText());
        }
    }//GEN-LAST:event_searchOutwardFileFocusGained

    private void searchOutwardFileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchOutwardFileFocusLost
        if ("".equals(searchOutwardFile.getText())) {
            searchOutwardFile.setText("Search with any field...");
        }
    }//GEN-LAST:event_searchOutwardFileFocusLost

    private void searchOutwardFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchOutwardFileMouseClicked

    }//GEN-LAST:event_searchOutwardFileMouseClicked

    private void searchOutwardFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchOutwardFileMouseEntered
        searchOutwardFile.setForeground(Color.black);
    }//GEN-LAST:event_searchOutwardFileMouseEntered

    private void searchOutwardFileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchOutwardFileMouseExited
        searchOutwardFile.setForeground(new Color(187, 187, 187));
    }//GEN-LAST:event_searchOutwardFileMouseExited

    private void searchOutwardFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchOutwardFileActionPerformed

    }//GEN-LAST:event_searchOutwardFileActionPerformed

    private void searchOutwardFileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchOutwardFileKeyReleased
        filter(searchOutwardFile, outFileTable);
    }//GEN-LAST:event_searchOutwardFileKeyReleased

    private void searchOutwardFileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchOutwardFileKeyTyped

    }//GEN-LAST:event_searchOutwardFileKeyTyped

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        refreshTime();
    }//GEN-LAST:event_tabMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        refreshTime();
    }//GEN-LAST:event_formWindowActivated

    private void importRecordsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importRecordsMouseEntered
        importRecords.setForeground(Color.white);
    }//GEN-LAST:event_importRecordsMouseEntered

    private void importRecordsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importRecordsMouseExited
        importRecords.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_importRecordsMouseExited

    private void importRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importRecordsActionPerformed
        Import(inMailTable, inFileTable, outMailTable, outFileTable);
        autoSave();
    }//GEN-LAST:event_importRecordsActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        importLog(yourDeptInwardMail);
        importLog(yourDeptOutwardMail);
        importLog(yourDeptInwardFile);
        importLog(yourDeptOutwardFile);
        importRecordz();
        importLogs(title, id);
    }//GEN-LAST:event_formWindowOpened

    private void attachInwardMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attachInwardMailMouseClicked
        attach(attachInwardMail, aTittleInwardMail);
    }//GEN-LAST:event_attachInwardMailMouseClicked

    private void attachOutwardMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attachOutwardMailMouseClicked
        attach(attachOutwardMail, aTittleOutwardMail);
    }//GEN-LAST:event_attachOutwardMailMouseClicked

    private void attachInwardFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attachInwardFileMouseClicked
        attach(attachInwardFile, aTittleInwardFile);
    }//GEN-LAST:event_attachInwardFileMouseClicked

    private void attachOutwardFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attachOutwardFileMouseClicked
        attach(attachOutwardFile, aTittleOutwardFile);
    }//GEN-LAST:event_attachOutwardFileMouseClicked

    private void inMailTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inMailTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            showRecord(issueNoInwardMail, dateInwardMail, transitionInwardMail, subjectInwardMail,
                    purposeInwardMail, whoFromInwardMail, yourDeptInwardMail, attachInwardMail,
                    aTittleInwardMail, inMailTable);
            delete(issueNoInwardMail, transitionInwardMail, subjectInwardMail, purposeInwardMail,
                    whoFromInwardMail, aTittleInwardMail, aTittleInwardMail, inMailTable);
            autoSave();
        }
    }//GEN-LAST:event_inMailTableKeyPressed

    private void outMailTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outMailTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            showRecord(issueNoOutwardMail, dateOutwardMail, transitionOutwardMail, subjectOutwardMail,
                    purposeOutwardMail, whoToOutwardMail, yourDeptOutwardMail, attachOutwardMail,
                    aTittleOutwardMail, outMailTable);
            delete(issueNoOutwardMail, transitionOutwardMail, subjectOutwardMail, purposeOutwardMail,
                    whoToOutwardMail, aTittleOutwardMail, aTittleOutwardMail, outMailTable);
            autoSave();
        }
    }//GEN-LAST:event_outMailTableKeyPressed

    private void inFileTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inFileTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            showRecord(issueNoInwardFile, dateInwardFile, transitionInwardFile, subjectInwardFile,
                    purposeInwardFile, whoFromInwardFile, yourDeptInwardFile, attachInwardFile,
                    aTittleInwardFile, inFileTable);
            delete(issueNoInwardFile, transitionInwardFile, subjectInwardFile, purposeInwardFile,
                    whoFromInwardFile, aTittleInwardFile, aTittleInwardFile, inFileTable);
            autoSave();
        }
    }//GEN-LAST:event_inFileTableKeyPressed

    private void outFileTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outFileTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            showRecord(issueNoOutwardFile, dateOutwardFile, transitionOutwardFile, subjectOutwardFile,
                    purposeOutwardFile, whoToOutwardFile, yourDeptOutwardFile, attachOutwardFile,
                    aTittleOutwardFile, outFileTable);
            delete(issueNoOutwardFile, transitionOutwardFile, subjectOutwardFile, purposeOutwardFile,
                    whoToOutwardFile, aTittleOutwardFile, aTittleOutwardFile, outFileTable);
            autoSave();
        }
    }//GEN-LAST:event_outFileTableKeyPressed
    // End of variables declaration                   

    private void clearFields(JTextField issueNo, JTextField transition, JTextArea subject,
                             JTextArea notes, JComboBox<String> whoFrom, JLabel picLabel, JLabel file) {
        issueNo.requestFocusInWindow();
        issueNo.setText(null);
        transition.setText(null);
        subject.setText(null);
        notes.setText(null);
        whoFrom.setSelectedIndex(0);
        picLabel.setIcon(null);
        picLabel.setText("Click to attach document here...");
        file.setText(null);

        refreshTime();
    }

    private void add(JTextField issueNo, JTextField date, JTextField transition, JTextArea subject,
                     JTextArea notes, JComboBox<String> whoFrom, JTextField yourDept, JLabel picLabel, JLabel file, JTable table) {
        String num = issueNo.getText();
        String dat = date.getText();
        String trans = transition.getText();
        String sub = subject.getText();
        String note = notes.getText();
        String whoF = whoFrom.getSelectedItem().toString();
        String whoT = yourDept.getText();
        String doc = file.getText();
        String sign = id.getText();

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object[] obj = new Object[]{num, dat, whoF, whoT, sub, trans, note, sign, doc};
        if ("".equals(num) || "".equals(sub) || "".equals(trans) || "".equals(note) || "".equals(dat)) {
            JOptionPane.showMessageDialog(this, "Review all fields and make sure no field is empty!", "Add Error", 2);
        } else if (whoF.equalsIgnoreCase(whoT)) {
            JOptionPane.showMessageDialog(this, "A department can't send/receive a document to/from itself!", "Add Error", 2);
        } else {
            model.insertRow(model.getRowCount(), obj);
            clearFields(issueNo, transition, subject, notes, whoFrom, picLabel, file);
        }

    }

    private void delete(JTextField issueNo, JTextField transition, JTextArea subject,
                        JTextArea notes, JComboBox<String> whoFrom, JLabel picLabel, JLabel file, JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        if (table.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Select a row to delete!", "Delete Error", 2);
        } else {
            int dR = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this data?", "Delete", JOptionPane.YES_NO_OPTION);
            if (dR == 0) {
                model.removeRow(table.getSelectedRow());
                JOptionPane.showMessageDialog(this, "Row daleted successfully...", "Success", 1);
                clearFields(issueNo, transition, subject, notes, whoFrom, picLabel, file);
            }
        }
    }

    private void update(JTextField issueNo, JTextField date, JTextField transition, JTextArea subject,
                        JTextArea notes, JComboBox<String> whoFrom, JTextField yourDept, JLabel picLabel, JLabel file, JTable table) {
        String upNum = issueNo.getText();
        String upDat = date.getText();
        String upTrans = transition.getText();
        String upSub = subject.getText();
        String upNote = notes.getText();
        String upWhoF = whoFrom.getSelectedItem().toString();
        String upWhoT = yourDept.getText();
        String doc = file.getText();

        DefaultTableModel model = (DefaultTableModel) table.getModel();

        Object[] obj = {upNum, upDat, upWhoF, upWhoT, upSub, upTrans, upNote, "", doc};

        if (table.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Select a row to update!", "Update Error", 2);
        } else {
            for (int i = 0; i < obj.length; i++) {
                model.setValueAt(obj[i], table.getSelectedRow(), i);
            }
            JOptionPane.showMessageDialog(this, "Record updated successfully...", "Success", 1);
            clearFields(issueNo, transition, subject, notes, whoFrom, picLabel, file);
        }
    }

    private void showRecord(JTextField issueNo, JTextField date, JTextField transition, JTextArea subject,
                            JTextArea notes, JComboBox<String> whoFrom, JTextField yourDept, JLabel picLabel, JLabel file, JTable table) {
        int row = inMailTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String fileName = String.valueOf(model.getValueAt(row, 8));

        issueNo.setText(model.getValueAt(row, 0).toString());
        date.setText(model.getValueAt(row, 1).toString());
        yourDept.setText(model.getValueAt(row, 3).toString());
        subject.setText(model.getValueAt(row, 4).toString());
        transition.setText(model.getValueAt(row, 5).toString());
        notes.setText(model.getValueAt(row, 6).toString());
        file.setText(fileName);

        ImageIcon icon = new ImageIcon(fileName);
        Image image = icon.getImage().getScaledInstance(picLabel.getWidth(),
                picLabel.getHeight(), Image.SCALE_SMOOTH);
        picLabel.setText(null);
        picLabel.setIcon(new ImageIcon(image));

        String from = model.getValueAt(row, 2).toString();
        for (int i = 0; i < whoFrom.getItemCount(); i++) {
            if (whoFrom.getItemAt(i).equalsIgnoreCase(from)) {
                whoFrom.setSelectedIndex(i);
            }
        }
    }

    private void filter(JTextField textField, JTable table) {
        String search = textField.getText();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(search));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideBar = new javax.swing.JPanel();
        inwardMailButton = new javax.swing.JButton();
        outwardMailButton = new javax.swing.JButton();
        inwardFileButton = new javax.swing.JButton();
        outwardFileButton = new javax.swing.JButton();
        export = new javax.swing.JButton();
        importRecords = new javax.swing.JButton();
        emblem = new javax.swing.JLabel();
        marquee = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        staff = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        tab = new javax.swing.JTabbedPane();
        inMails = new javax.swing.JPanel();
        inMailScroll = new javax.swing.JScrollPane();
        inMailTable = new javax.swing.JTable();
        issueNoInwardMail = new javax.swing.JTextField();
        issue = new javax.swing.JLabel();
        dat = new javax.swing.JLabel();
        dateInwardMail = new javax.swing.JTextField();
        whoF = new javax.swing.JLabel();
        trans = new javax.swing.JLabel();
        transitionInwardMail = new javax.swing.JTextField();
        note = new javax.swing.JLabel();
        sub = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        purposeInwardMail = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        subjectInwardMail = new javax.swing.JTextArea();
        addInwardMail = new javax.swing.JButton();
        deleteInwardMail = new javax.swing.JButton();
        updateInwardMail = new javax.swing.JButton();
        whoFromInwardMail = new javax.swing.JComboBox<>();
        rec = new javax.swing.JLabel();
        syncInwardMail = new javax.swing.JButton();
        searchInwardMail = new javax.swing.JTextField();
        yourDeptInwardMail = new javax.swing.JTextField();
        attachInwardMail = new javax.swing.JLabel();
        aTittleInwardMail = new javax.swing.JLabel();
        trans4 = new javax.swing.JLabel();
        outMails = new javax.swing.JPanel();
        issue1 = new javax.swing.JLabel();
        sub1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        subjectOutwardMail = new javax.swing.JTextArea();
        issueNoOutwardMail = new javax.swing.JTextField();
        dateOutwardMail = new javax.swing.JTextField();
        whoF1 = new javax.swing.JLabel();
        note1 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        purposeOutwardMail = new javax.swing.JTextArea();
        trans1 = new javax.swing.JLabel();
        transitionOutwardMail = new javax.swing.JTextField();
        dat3 = new javax.swing.JLabel();
        whoToOutwardMail = new javax.swing.JComboBox<>();
        rec1 = new javax.swing.JLabel();
        outMailScroll = new javax.swing.JScrollPane();
        outMailTable = new javax.swing.JTable();
        addOutwardMail = new javax.swing.JButton();
        deleteOutwardMail = new javax.swing.JButton();
        updateOutwardMail = new javax.swing.JButton();
        syncOutwardMail = new javax.swing.JButton();
        searchOutwardMail = new javax.swing.JTextField();
        yourDeptOutwardMail = new javax.swing.JTextField();
        aTittleOutwardMail = new javax.swing.JLabel();
        attachOutwardMail = new javax.swing.JLabel();
        trans7 = new javax.swing.JLabel();
        inFiles = new javax.swing.JPanel();
        issue2 = new javax.swing.JLabel();
        sub2 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        subjectInwardFile = new javax.swing.JTextArea();
        issueNoInwardFile = new javax.swing.JTextField();
        dateInwardFile = new javax.swing.JTextField();
        whoF2 = new javax.swing.JLabel();
        note2 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        purposeInwardFile = new javax.swing.JTextArea();
        trans2 = new javax.swing.JLabel();
        transitionInwardFile = new javax.swing.JTextField();
        dat2 = new javax.swing.JLabel();
        whoFromInwardFile = new javax.swing.JComboBox<>();
        rec2 = new javax.swing.JLabel();
        inFileScroll = new javax.swing.JScrollPane();
        inFileTable = new javax.swing.JTable();
        addInwardFile = new javax.swing.JButton();
        deleteInwardFile = new javax.swing.JButton();
        updateInwardFile = new javax.swing.JButton();
        syncInwardFile = new javax.swing.JButton();
        searchInwardFile = new javax.swing.JTextField();
        yourDeptInwardFile = new javax.swing.JTextField();
        aTittleInwardFile = new javax.swing.JLabel();
        attachInwardFile = new javax.swing.JLabel();
        trans6 = new javax.swing.JLabel();
        outFIles = new javax.swing.JPanel();
        issue3 = new javax.swing.JLabel();
        sub3 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        subjectOutwardFile = new javax.swing.JTextArea();
        issueNoOutwardFile = new javax.swing.JTextField();
        dateOutwardFile = new javax.swing.JTextField();
        whoF3 = new javax.swing.JLabel();
        note3 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        purposeOutwardFile = new javax.swing.JTextArea();
        trans3 = new javax.swing.JLabel();
        transitionOutwardFile = new javax.swing.JTextField();
        dat1 = new javax.swing.JLabel();
        whoToOutwardFile = new javax.swing.JComboBox<>();
        rec3 = new javax.swing.JLabel();
        outFileScroll = new javax.swing.JScrollPane();
        outFileTable = new javax.swing.JTable();
        addOutwardFile = new javax.swing.JButton();
        deleteOutwardFile = new javax.swing.JButton();
        updateOutwardFile = new javax.swing.JButton();
        syncOutwardFile = new javax.swing.JButton();
        searchOutwardFile = new javax.swing.JTextField();
        yourDeptOutwardFile = new javax.swing.JTextField();
        aTittleOutwardFile = new javax.swing.JLabel();
        attachOutwardFile = new javax.swing.JLabel();
        trans5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NPC Register");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBar.setBackground(new java.awt.Color(204, 204, 204));
        sideBar.setLayout(null);

        inwardMailButton.setBackground(new java.awt.Color(255, 255, 255));
        inwardMailButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        inwardMailButton.setForeground(new java.awt.Color(0, 0, 0));
        inwardMailButton.setText("Inward Mails");
        inwardMailButton.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        inwardMailButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inwardMailButton.setOpaque(false);
        inwardMailButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inwardMailButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inwardMailButtonMouseExited(evt);
            }
        });
        inwardMailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inwardMailButtonActionPerformed(evt);
            }
        });
        sideBar.add(inwardMailButton);
        inwardMailButton.setBounds(30, 260, 190, 40);

        outwardMailButton.setBackground(new java.awt.Color(255, 255, 255));
        outwardMailButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        outwardMailButton.setForeground(new java.awt.Color(0, 0, 0));
        outwardMailButton.setText("Outward Mails");
        outwardMailButton.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        outwardMailButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        outwardMailButton.setOpaque(false);
        outwardMailButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                outwardMailButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                outwardMailButtonMouseExited(evt);
            }
        });
        outwardMailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outwardMailButtonActionPerformed(evt);
            }
        });
        sideBar.add(outwardMailButton);
        outwardMailButton.setBounds(30, 320, 190, 40);

        inwardFileButton.setBackground(new java.awt.Color(255, 255, 255));
        inwardFileButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        inwardFileButton.setForeground(new java.awt.Color(0, 0, 0));
        inwardFileButton.setText("Inward Files");
        inwardFileButton.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        inwardFileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inwardFileButton.setOpaque(false);
        inwardFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inwardFileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inwardFileButtonMouseExited(evt);
            }
        });
        inwardFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inwardFileButtonActionPerformed(evt);
            }
        });
        sideBar.add(inwardFileButton);
        inwardFileButton.setBounds(30, 380, 190, 40);

        outwardFileButton.setBackground(new java.awt.Color(255, 255, 255));
        outwardFileButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        outwardFileButton.setForeground(new java.awt.Color(0, 0, 0));
        outwardFileButton.setText("Outward Files");
        outwardFileButton.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        outwardFileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        outwardFileButton.setOpaque(false);
        outwardFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                outwardFileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                outwardFileButtonMouseExited(evt);
            }
        });
        outwardFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outwardFileButtonActionPerformed(evt);
            }
        });
        sideBar.add(outwardFileButton);
        outwardFileButton.setBounds(30, 440, 190, 40);

        export.setBackground(new java.awt.Color(255, 255, 255));
        export.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        export.setForeground(new java.awt.Color(0, 0, 0));
        export.setText("Export");
        export.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        export.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        export.setOpaque(false);
        export.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exportMouseExited(evt);
            }
        });
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });
        sideBar.add(export);
        export.setBounds(130, 520, 90, 40);

        importRecords.setBackground(new java.awt.Color(255, 255, 255));
        importRecords.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        importRecords.setForeground(new java.awt.Color(0, 0, 0));
        importRecords.setText("Import");
        importRecords.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        importRecords.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        importRecords.setOpaque(false);
        importRecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                importRecordsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                importRecordsMouseExited(evt);
            }
        });
        importRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importRecordsActionPerformed(evt);
            }
        });
        sideBar.add(importRecords);
        importRecords.setBounds(30, 520, 90, 40);

        emblem.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        emblem.setForeground(new java.awt.Color(153, 153, 153));
        emblem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emblem.setText("Morpheus Softwares");
        sideBar.add(emblem);
        emblem.setBounds(0, 630, 120, 16);

        marquee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marquee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/npc/register/npc.png"))); // NOI18N
        sideBar.add(marquee);
        marquee.setBounds(10, 50, 230, 200);

        title.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        title.setForeground(java.awt.Color.black);
        sideBar.add(title);
        title.setBounds(10, 570, 230, 20);

        staff.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        staff.setForeground(java.awt.Color.black);
        staff.setText("Staff ID:");
        sideBar.add(staff);
        staff.setBounds(10, 600, 60, 20);

        logo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(0, 204, 51));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setText("NPC Register");
        sideBar.add(logo);
        logo.setBounds(30, 0, 190, 50);

        id.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        id.setForeground(java.awt.Color.black);
        sideBar.add(id);
        id.setBounds(70, 600, 170, 20);

        getContentPane().add(sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 650));

        tab.setBackground(new java.awt.Color(255, 255, 255));
        tab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });

        inMails.setBackground(new java.awt.Color(255, 255, 255));
        inMails.setForeground(new java.awt.Color(0, 0, 0));
        inMails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inMails.setLayout(null);

        inMailScroll.setBackground(new java.awt.Color(255, 255, 255));
        inMailScroll.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green));
        inMailScroll.setForeground(new java.awt.Color(0, 0, 0));
        inMailScroll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        inMailTable.setAutoCreateRowSorter(true);
        inMailTable.setBackground(new java.awt.Color(255, 255, 255));
        inMailTable.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green));
        inMailTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inMailTable.setForeground(new java.awt.Color(0, 0, 0));
        inMailTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "ISSUE NO OF ISSUING DEPARTMENT", "DATE OF RECEIPT", "WHO FROM", "RECEIVER", "SUBJECT", "TRANSITION COLUMN", "PURPOSE", "SIGN", "FILE"
                }
        ) {
            final Class[] types = new Class[]{
                    java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            final boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        inMailTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        inMailTable.setGridColor(java.awt.Color.green);
        inMailTable.setRowHeight(24);
        inMailTable.setShowGrid(true);
        inMailTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inMailTableMouseClicked(evt);
            }
        });
        inMailTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inMailTableKeyPressed(evt);
            }
        });
        inMailScroll.setViewportView(inMailTable);

        inMails.add(inMailScroll);
        inMailScroll.setBounds(0, 393, 950, 230);

        issueNoInwardMail.setBackground(new java.awt.Color(255, 255, 255));
        issueNoInwardMail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        issueNoInwardMail.setForeground(new java.awt.Color(0, 0, 0));
        issueNoInwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        inMails.add(issueNoInwardMail);
        issueNoInwardMail.setBounds(20, 40, 330, 40);

        issue.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        issue.setForeground(new java.awt.Color(0, 0, 0));
        issue.setText("Issue No of Issuing Department");
        inMails.add(issue);
        issue.setBounds(20, 10, 330, 20);

        dat.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        dat.setForeground(new java.awt.Color(0, 0, 0));
        dat.setText("Date");
        inMails.add(dat);
        dat.setBounds(20, 90, 330, 20);

        dateInwardMail.setBackground(new java.awt.Color(255, 255, 255));
        dateInwardMail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dateInwardMail.setForeground(new java.awt.Color(0, 0, 0));
        dateInwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        dateInwardMail.setEnabled(false);
        inMails.add(dateInwardMail);
        dateInwardMail.setBounds(20, 120, 330, 40);

        whoF.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        whoF.setForeground(new java.awt.Color(0, 0, 0));
        whoF.setText("Who From");
        inMails.add(whoF);
        whoF.setBounds(20, 170, 330, 20);

        trans.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        trans.setForeground(new java.awt.Color(0, 0, 0));
        trans.setText("Attachment");
        inMails.add(trans);
        trans.setBounds(750, 10, 180, 20);

        transitionInwardMail.setBackground(new java.awt.Color(255, 255, 255));
        transitionInwardMail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        transitionInwardMail.setForeground(new java.awt.Color(0, 0, 0));
        transitionInwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        inMails.add(transitionInwardMail);
        transitionInwardMail.setBounds(400, 40, 330, 40);

        note.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        note.setForeground(new java.awt.Color(0, 0, 0));
        note.setText("Purpose");
        inMails.add(note);
        note.setBounds(400, 210, 330, 20);

        sub.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        sub.setForeground(new java.awt.Color(0, 0, 0));
        sub.setText("Subject");
        inMails.add(sub);
        sub.setBounds(400, 90, 330, 20);

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        jScrollPane5.setForeground(java.awt.Color.green);
        jScrollPane5.setToolTipText("");

        purposeInwardMail.setBackground(new java.awt.Color(255, 255, 255));
        purposeInwardMail.setColumns(20);
        purposeInwardMail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        purposeInwardMail.setForeground(new java.awt.Color(0, 0, 0));
        purposeInwardMail.setLineWrap(true);
        purposeInwardMail.setRows(5);
        purposeInwardMail.setWrapStyleWord(true);
        jScrollPane5.setViewportView(purposeInwardMail);

        inMails.add(jScrollPane5);
        jScrollPane5.setBounds(400, 240, 330, 80);

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        jScrollPane6.setForeground(java.awt.Color.green);
        jScrollPane6.setToolTipText("");

        subjectInwardMail.setBackground(new java.awt.Color(255, 255, 255));
        subjectInwardMail.setColumns(20);
        subjectInwardMail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        subjectInwardMail.setForeground(new java.awt.Color(0, 0, 0));
        subjectInwardMail.setLineWrap(true);
        subjectInwardMail.setRows(5);
        subjectInwardMail.setWrapStyleWord(true);
        jScrollPane6.setViewportView(subjectInwardMail);

        inMails.add(jScrollPane6);
        jScrollPane6.setBounds(400, 120, 330, 80);

        addInwardMail.setBackground(new java.awt.Color(255, 255, 255));
        addInwardMail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        addInwardMail.setForeground(new java.awt.Color(0, 0, 0));
        addInwardMail.setText("Add");
        addInwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        addInwardMail.setOpaque(false);
        addInwardMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addInwardMailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addInwardMailMouseExited(evt);
            }
        });
        addInwardMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInwardMailActionPerformed(evt);
            }
        });
        inMails.add(addInwardMail);
        addInwardMail.setBounds(20, 330, 110, 50);

        deleteInwardMail.setBackground(new java.awt.Color(255, 255, 255));
        deleteInwardMail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        deleteInwardMail.setForeground(new java.awt.Color(0, 0, 0));
        deleteInwardMail.setText("Delete");
        deleteInwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        deleteInwardMail.setOpaque(false);
        deleteInwardMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteInwardMailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteInwardMailMouseExited(evt);
            }
        });
        deleteInwardMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInwardMailActionPerformed(evt);
            }
        });
        inMails.add(deleteInwardMail);
        deleteInwardMail.setBounds(170, 330, 110, 50);

        updateInwardMail.setBackground(new java.awt.Color(255, 255, 255));
        updateInwardMail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        updateInwardMail.setForeground(new java.awt.Color(0, 0, 0));
        updateInwardMail.setText("Update");
        updateInwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        updateInwardMail.setOpaque(false);
        updateInwardMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateInwardMailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateInwardMailMouseExited(evt);
            }
        });
        updateInwardMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInwardMailActionPerformed(evt);
            }
        });
        inMails.add(updateInwardMail);
        updateInwardMail.setBounds(320, 330, 110, 50);

        whoFromInwardMail.setBackground(new java.awt.Color(255, 255, 255));
        whoFromInwardMail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        whoFromInwardMail.setForeground(new java.awt.Color(0, 0, 0));
        whoFromInwardMail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chairman's_Office", "DG's_Office", "Admin", "Cartography", "Census", "Commission's_Secretariat", "DFA", "General_Services", "ICT", "Internal_Audit", "Legal", "Planning_&_Research", "Population_Management", "Population_Studies", "Procurement", "PAD", "Special_Duties", "VRD" }));
        whoFromInwardMail.setAutoscrolls(true);
        whoFromInwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        whoFromInwardMail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inMails.add(whoFromInwardMail);
        whoFromInwardMail.setBounds(20, 196, 330, 40);

        rec.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        rec.setForeground(new java.awt.Color(0, 0, 0));
        rec.setText("Receiving Department");
        inMails.add(rec);
        rec.setBounds(20, 250, 330, 20);

        syncInwardMail.setBackground(new java.awt.Color(255, 255, 255));
        syncInwardMail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        syncInwardMail.setForeground(new java.awt.Color(0, 0, 0));
        syncInwardMail.setText("Synchronize");
        syncInwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        syncInwardMail.setOpaque(false);
        syncInwardMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                syncInwardMailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                syncInwardMailMouseExited(evt);
            }
        });
        syncInwardMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syncInwardMailActionPerformed(evt);
            }
        });
        inMails.add(syncInwardMail);
        syncInwardMail.setBounds(470, 330, 130, 50);

        searchInwardMail.setBackground(new java.awt.Color(255, 255, 255));
        searchInwardMail.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        searchInwardMail.setText("Search with any field...");
        searchInwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        searchInwardMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchInwardMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchInwardMailFocusLost(evt);
            }
        });
        searchInwardMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchInwardMailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchInwardMailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchInwardMailMouseExited(evt);
            }
        });
        searchInwardMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInwardMailActionPerformed(evt);
            }
        });
        searchInwardMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchInwardMailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchInwardMailKeyTyped(evt);
            }
        });
        inMails.add(searchInwardMail);
        searchInwardMail.setBounds(650, 330, 280, 40);

        yourDeptInwardMail.setBackground(new java.awt.Color(255, 255, 255));
        yourDeptInwardMail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        yourDeptInwardMail.setForeground(new java.awt.Color(0, 0, 0));
        yourDeptInwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        yourDeptInwardMail.setEnabled(false);
        inMails.add(yourDeptInwardMail);
        yourDeptInwardMail.setBounds(20, 280, 330, 40);

        attachInwardMail.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        attachInwardMail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attachInwardMail.setText("Click to attach document here...");
        attachInwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        attachInwardMail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        attachInwardMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attachInwardMailMouseClicked(evt);
            }
        });
        inMails.add(attachInwardMail);
        attachInwardMail.setBounds(750, 40, 180, 240);

        aTittleInwardMail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        aTittleInwardMail.setForeground(new java.awt.Color(0, 0, 0));
        aTittleInwardMail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inMails.add(aTittleInwardMail);
        aTittleInwardMail.setBounds(750, 286, 180, 30);

        trans4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        trans4.setForeground(new java.awt.Color(0, 0, 0));
        trans4.setText("Transition Column");
        inMails.add(trans4);
        trans4.setBounds(400, 10, 330, 20);

        tab.addTab("Inward Mails", inMails);

        outMails.setBackground(new java.awt.Color(255, 255, 255));
        outMails.setForeground(new java.awt.Color(0, 0, 0));
        outMails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        outMails.setLayout(null);

        issue1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        issue1.setForeground(new java.awt.Color(0, 0, 0));
        issue1.setText("Issue No of Issuing Department");
        outMails.add(issue1);
        issue1.setBounds(20, 10, 330, 20);

        sub1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        sub1.setForeground(new java.awt.Color(0, 0, 0));
        sub1.setText("Subject");
        outMails.add(sub1);
        sub1.setBounds(400, 90, 330, 20);

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        jScrollPane7.setForeground(java.awt.Color.green);
        jScrollPane7.setToolTipText("");

        subjectOutwardMail.setBackground(new java.awt.Color(255, 255, 255));
        subjectOutwardMail.setColumns(20);
        subjectOutwardMail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        subjectOutwardMail.setForeground(new java.awt.Color(0, 0, 0));
        subjectOutwardMail.setLineWrap(true);
        subjectOutwardMail.setRows(5);
        subjectOutwardMail.setWrapStyleWord(true);
        jScrollPane7.setViewportView(subjectOutwardMail);

        outMails.add(jScrollPane7);
        jScrollPane7.setBounds(400, 120, 330, 80);

        issueNoOutwardMail.setBackground(new java.awt.Color(255, 255, 255));
        issueNoOutwardMail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        issueNoOutwardMail.setForeground(new java.awt.Color(0, 0, 0));
        issueNoOutwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        outMails.add(issueNoOutwardMail);
        issueNoOutwardMail.setBounds(20, 40, 330, 40);

        dateOutwardMail.setBackground(new java.awt.Color(255, 255, 255));
        dateOutwardMail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dateOutwardMail.setForeground(new java.awt.Color(0, 0, 0));
        dateOutwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        dateOutwardMail.setEnabled(false);
        outMails.add(dateOutwardMail);
        dateOutwardMail.setBounds(20, 120, 330, 40);

        whoF1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        whoF1.setForeground(new java.awt.Color(0, 0, 0));
        whoF1.setText("Who To");
        outMails.add(whoF1);
        whoF1.setBounds(20, 170, 330, 20);

        note1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        note1.setForeground(new java.awt.Color(0, 0, 0));
        note1.setText("Purpose");
        outMails.add(note1);
        note1.setBounds(400, 210, 330, 20);

        jScrollPane8.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        jScrollPane8.setForeground(java.awt.Color.green);
        jScrollPane8.setToolTipText("");

        purposeOutwardMail.setBackground(new java.awt.Color(255, 255, 255));
        purposeOutwardMail.setColumns(20);
        purposeOutwardMail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        purposeOutwardMail.setForeground(new java.awt.Color(0, 0, 0));
        purposeOutwardMail.setLineWrap(true);
        purposeOutwardMail.setRows(5);
        purposeOutwardMail.setWrapStyleWord(true);
        jScrollPane8.setViewportView(purposeOutwardMail);

        outMails.add(jScrollPane8);
        jScrollPane8.setBounds(400, 240, 330, 80);

        trans1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        trans1.setForeground(new java.awt.Color(0, 0, 0));
        trans1.setText("Transition Column");
        outMails.add(trans1);
        trans1.setBounds(400, 10, 330, 20);

        transitionOutwardMail.setBackground(new java.awt.Color(255, 255, 255));
        transitionOutwardMail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        transitionOutwardMail.setForeground(new java.awt.Color(0, 0, 0));
        transitionOutwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        outMails.add(transitionOutwardMail);
        transitionOutwardMail.setBounds(400, 40, 330, 40);

        dat3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        dat3.setForeground(new java.awt.Color(0, 0, 0));
        dat3.setText("Date");
        outMails.add(dat3);
        dat3.setBounds(20, 90, 330, 20);

        whoToOutwardMail.setBackground(new java.awt.Color(255, 255, 255));
        whoToOutwardMail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        whoToOutwardMail.setForeground(new java.awt.Color(0, 0, 0));
        whoToOutwardMail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chairman's_Office", "DG's_Office", "Admin", "Cartography", "Census", "Commission's_Secretariat", "DFA", "General_Services", "ICT", "Internal_Audit", "Legal", "Planning_&_Research", "Population_Management", "Population_Studies", "Procurement", "PAD", "Special_Duties", "VRD" }));
        whoToOutwardMail.setAutoscrolls(true);
        whoToOutwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        whoToOutwardMail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        outMails.add(whoToOutwardMail);
        whoToOutwardMail.setBounds(20, 196, 330, 40);

        rec1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        rec1.setForeground(new java.awt.Color(0, 0, 0));
        rec1.setText("Sending Department");
        outMails.add(rec1);
        rec1.setBounds(20, 250, 330, 20);

        outMailScroll.setBackground(new java.awt.Color(255, 255, 255));
        outMailScroll.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green));
        outMailScroll.setForeground(new java.awt.Color(0, 0, 0));
        outMailScroll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        outMailTable.setAutoCreateRowSorter(true);
        outMailTable.setBackground(new java.awt.Color(255, 255, 255));
        outMailTable.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green));
        outMailTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        outMailTable.setForeground(new java.awt.Color(0, 0, 0));
        outMailTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "ISSUE NO OF ISSUING DEPARTMENT", "DATE OF RECEIPT", "WHO TO", "SENDER", "SUBJECT", "TRANSITION COLUMN", "PURPOSE", "SIGN", "FILE"
                }
        ) {
            final Class[] types = new Class[]{
                    java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };
            final boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        outMailTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        outMailTable.setGridColor(java.awt.Color.green);
        outMailTable.setRowHeight(24);
        outMailTable.setShowGrid(true);
        outMailTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outMailTableMouseClicked(evt);
            }
        });
        outMailTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                outMailTableKeyPressed(evt);
            }
        });
        outMailScroll.setViewportView(outMailTable);

        outMails.add(outMailScroll);
        outMailScroll.setBounds(0, 393, 950, 230);

        addOutwardMail.setBackground(new java.awt.Color(255, 255, 255));
        addOutwardMail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        addOutwardMail.setForeground(new java.awt.Color(0, 0, 0));
        addOutwardMail.setText("Add");
        addOutwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        addOutwardMail.setOpaque(false);
        addOutwardMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addOutwardMailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addOutwardMailMouseExited(evt);
            }
        });
        addOutwardMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOutwardMailActionPerformed(evt);
            }
        });
        outMails.add(addOutwardMail);
        addOutwardMail.setBounds(20, 330, 110, 50);

        deleteOutwardMail.setBackground(new java.awt.Color(255, 255, 255));
        deleteOutwardMail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        deleteOutwardMail.setForeground(new java.awt.Color(0, 0, 0));
        deleteOutwardMail.setText("Delete");
        deleteOutwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        deleteOutwardMail.setOpaque(false);
        deleteOutwardMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteOutwardMailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteOutwardMailMouseExited(evt);
            }
        });
        deleteOutwardMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOutwardMailActionPerformed(evt);
            }
        });
        outMails.add(deleteOutwardMail);
        deleteOutwardMail.setBounds(170, 330, 110, 50);

        updateOutwardMail.setBackground(new java.awt.Color(255, 255, 255));
        updateOutwardMail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        updateOutwardMail.setForeground(new java.awt.Color(0, 0, 0));
        updateOutwardMail.setText("Update");
        updateOutwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        updateOutwardMail.setOpaque(false);
        updateOutwardMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateOutwardMailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateOutwardMailMouseExited(evt);
            }
        });
        updateOutwardMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOutwardMailActionPerformed(evt);
            }
        });
        outMails.add(updateOutwardMail);
        updateOutwardMail.setBounds(320, 330, 110, 50);

        syncOutwardMail.setBackground(new java.awt.Color(255, 255, 255));
        syncOutwardMail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        syncOutwardMail.setForeground(new java.awt.Color(0, 0, 0));
        syncOutwardMail.setText("Synchronize");
        syncOutwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        syncOutwardMail.setOpaque(false);
        syncOutwardMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                syncOutwardMailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                syncOutwardMailMouseExited(evt);
            }
        });
        syncOutwardMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syncOutwardMailActionPerformed(evt);
            }
        });
        outMails.add(syncOutwardMail);
        syncOutwardMail.setBounds(470, 330, 130, 50);

        searchOutwardMail.setBackground(new java.awt.Color(255, 255, 255));
        searchOutwardMail.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        searchOutwardMail.setText("Search with any field...");
        searchOutwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        searchOutwardMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchOutwardMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchOutwardMailFocusLost(evt);
            }
        });
        searchOutwardMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchOutwardMailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchOutwardMailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchOutwardMailMouseExited(evt);
            }
        });
        searchOutwardMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchOutwardMailActionPerformed(evt);
            }
        });
        searchOutwardMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchOutwardMailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchOutwardMailKeyTyped(evt);
            }
        });
        outMails.add(searchOutwardMail);
        searchOutwardMail.setBounds(650, 330, 280, 40);

        yourDeptOutwardMail.setBackground(new java.awt.Color(255, 255, 255));
        yourDeptOutwardMail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        yourDeptOutwardMail.setForeground(new java.awt.Color(0, 0, 0));
        yourDeptOutwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        yourDeptOutwardMail.setEnabled(false);
        outMails.add(yourDeptOutwardMail);
        yourDeptOutwardMail.setBounds(20, 280, 330, 40);

        aTittleOutwardMail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        aTittleOutwardMail.setForeground(new java.awt.Color(0, 0, 0));
        aTittleOutwardMail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outMails.add(aTittleOutwardMail);
        aTittleOutwardMail.setBounds(750, 286, 180, 30);

        attachOutwardMail.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        attachOutwardMail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attachOutwardMail.setText("Click to attach document here...");
        attachOutwardMail.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        attachOutwardMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attachOutwardMailMouseClicked(evt);
            }
        });
        outMails.add(attachOutwardMail);
        attachOutwardMail.setBounds(750, 40, 180, 240);

        trans7.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        trans7.setForeground(new java.awt.Color(0, 0, 0));
        trans7.setText("Attachment");
        outMails.add(trans7);
        trans7.setBounds(750, 10, 180, 20);

        tab.addTab("Outward Mails", outMails);

        inFiles.setBackground(new java.awt.Color(255, 255, 255));
        inFiles.setForeground(new java.awt.Color(0, 0, 0));
        inFiles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inFiles.setLayout(null);

        issue2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        issue2.setForeground(new java.awt.Color(0, 0, 0));
        issue2.setText("File Number");
        inFiles.add(issue2);
        issue2.setBounds(20, 10, 330, 20);

        sub2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        sub2.setForeground(new java.awt.Color(0, 0, 0));
        sub2.setText("Subject");
        inFiles.add(sub2);
        sub2.setBounds(400, 90, 330, 20);

        jScrollPane9.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane9.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        jScrollPane9.setForeground(java.awt.Color.green);
        jScrollPane9.setToolTipText("");

        subjectInwardFile.setBackground(new java.awt.Color(255, 255, 255));
        subjectInwardFile.setColumns(20);
        subjectInwardFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        subjectInwardFile.setForeground(new java.awt.Color(0, 0, 0));
        subjectInwardFile.setLineWrap(true);
        subjectInwardFile.setRows(5);
        subjectInwardFile.setWrapStyleWord(true);
        jScrollPane9.setViewportView(subjectInwardFile);

        inFiles.add(jScrollPane9);
        jScrollPane9.setBounds(400, 120, 330, 80);

        issueNoInwardFile.setBackground(new java.awt.Color(255, 255, 255));
        issueNoInwardFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        issueNoInwardFile.setForeground(new java.awt.Color(0, 0, 0));
        issueNoInwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        inFiles.add(issueNoInwardFile);
        issueNoInwardFile.setBounds(20, 40, 330, 40);

        dateInwardFile.setBackground(new java.awt.Color(255, 255, 255));
        dateInwardFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dateInwardFile.setForeground(new java.awt.Color(0, 0, 0));
        dateInwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        dateInwardFile.setEnabled(false);
        inFiles.add(dateInwardFile);
        dateInwardFile.setBounds(20, 120, 330, 40);

        whoF2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        whoF2.setForeground(new java.awt.Color(0, 0, 0));
        whoF2.setText("Who From");
        inFiles.add(whoF2);
        whoF2.setBounds(20, 170, 330, 20);

        note2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        note2.setForeground(new java.awt.Color(0, 0, 0));
        note2.setText("Purpose");
        inFiles.add(note2);
        note2.setBounds(400, 210, 330, 20);

        jScrollPane10.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane10.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        jScrollPane10.setForeground(java.awt.Color.green);
        jScrollPane10.setToolTipText("");

        purposeInwardFile.setBackground(new java.awt.Color(255, 255, 255));
        purposeInwardFile.setColumns(20);
        purposeInwardFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        purposeInwardFile.setForeground(new java.awt.Color(0, 0, 0));
        purposeInwardFile.setLineWrap(true);
        purposeInwardFile.setRows(5);
        purposeInwardFile.setWrapStyleWord(true);
        jScrollPane10.setViewportView(purposeInwardFile);

        inFiles.add(jScrollPane10);
        jScrollPane10.setBounds(400, 240, 330, 80);

        trans2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        trans2.setForeground(new java.awt.Color(0, 0, 0));
        trans2.setText("Transition Column");
        inFiles.add(trans2);
        trans2.setBounds(400, 10, 330, 20);

        transitionInwardFile.setBackground(new java.awt.Color(255, 255, 255));
        transitionInwardFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        transitionInwardFile.setForeground(new java.awt.Color(0, 0, 0));
        transitionInwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        inFiles.add(transitionInwardFile);
        transitionInwardFile.setBounds(400, 40, 330, 40);

        dat2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        dat2.setForeground(new java.awt.Color(0, 0, 0));
        dat2.setText("Date");
        inFiles.add(dat2);
        dat2.setBounds(20, 90, 330, 20);

        whoFromInwardFile.setBackground(new java.awt.Color(255, 255, 255));
        whoFromInwardFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        whoFromInwardFile.setForeground(new java.awt.Color(0, 0, 0));
        whoFromInwardFile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chairman's_Office", "DG's_Office", "Admin", "Cartography", "Census", "Commission's_Secretariat", "DFA", "General_Services", "ICT", "Internal_Audit", "Legal", "Planning_&_Research", "Population_Management", "Population_Studies", "Procurement", "PAD", "Special_Duties", "VRD" }));
        whoFromInwardFile.setAutoscrolls(true);
        whoFromInwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        whoFromInwardFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inFiles.add(whoFromInwardFile);
        whoFromInwardFile.setBounds(20, 196, 330, 40);

        rec2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        rec2.setForeground(new java.awt.Color(0, 0, 0));
        rec2.setText("Receiving Department");
        inFiles.add(rec2);
        rec2.setBounds(20, 250, 330, 20);

        inFileScroll.setBackground(new java.awt.Color(255, 255, 255));
        inFileScroll.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green));
        inFileScroll.setForeground(new java.awt.Color(0, 0, 0));
        inFileScroll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        inFileTable.setAutoCreateRowSorter(true);
        inFileTable.setBackground(new java.awt.Color(255, 255, 255));
        inFileTable.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green));
        inFileTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inFileTable.setForeground(new java.awt.Color(0, 0, 0));
        inFileTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "ISSUE NO OF ISSUING DEPARTMENT", "DATE OF RECEIPT", "WHO FROM", "RECEIVER", "SUBJECT", "TRANSITION COLUMN", "PURPOSE", "SIGN", "FILE"
                }
        ) {
            final Class[] types = new Class[]{
                    java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };
            final boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        inFileTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        inFileTable.setGridColor(java.awt.Color.green);
        inFileTable.setRowHeight(24);
        inFileTable.setShowGrid(true);
        inFileTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inFileTableMouseClicked(evt);
            }
        });
        inFileTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inFileTableKeyPressed(evt);
            }
        });
        inFileScroll.setViewportView(inFileTable);

        inFiles.add(inFileScroll);
        inFileScroll.setBounds(0, 393, 950, 230);

        addInwardFile.setBackground(new java.awt.Color(255, 255, 255));
        addInwardFile.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        addInwardFile.setForeground(new java.awt.Color(0, 0, 0));
        addInwardFile.setText("Add");
        addInwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        addInwardFile.setOpaque(false);
        addInwardFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addInwardFileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addInwardFileMouseExited(evt);
            }
        });
        addInwardFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInwardFileActionPerformed(evt);
            }
        });
        inFiles.add(addInwardFile);
        addInwardFile.setBounds(20, 330, 110, 50);

        deleteInwardFile.setBackground(new java.awt.Color(255, 255, 255));
        deleteInwardFile.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        deleteInwardFile.setForeground(new java.awt.Color(0, 0, 0));
        deleteInwardFile.setText("Delete");
        deleteInwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        deleteInwardFile.setOpaque(false);
        deleteInwardFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteInwardFileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteInwardFileMouseExited(evt);
            }
        });
        deleteInwardFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInwardFileActionPerformed(evt);
            }
        });
        inFiles.add(deleteInwardFile);
        deleteInwardFile.setBounds(170, 330, 110, 50);

        updateInwardFile.setBackground(new java.awt.Color(255, 255, 255));
        updateInwardFile.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        updateInwardFile.setForeground(new java.awt.Color(0, 0, 0));
        updateInwardFile.setText("Update");
        updateInwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        updateInwardFile.setOpaque(false);
        updateInwardFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateInwardFileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateInwardFileMouseExited(evt);
            }
        });
        updateInwardFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInwardFileActionPerformed(evt);
            }
        });
        inFiles.add(updateInwardFile);
        updateInwardFile.setBounds(320, 330, 110, 50);

        syncInwardFile.setBackground(new java.awt.Color(255, 255, 255));
        syncInwardFile.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        syncInwardFile.setForeground(new java.awt.Color(0, 0, 0));
        syncInwardFile.setText("Synchronize");
        syncInwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        syncInwardFile.setOpaque(false);
        syncInwardFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                syncInwardFileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                syncInwardFileMouseExited(evt);
            }
        });
        syncInwardFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syncInwardFileActionPerformed(evt);
            }
        });
        inFiles.add(syncInwardFile);
        syncInwardFile.setBounds(470, 330, 130, 50);

        searchInwardFile.setBackground(new java.awt.Color(255, 255, 255));
        searchInwardFile.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        searchInwardFile.setText("Search with any field...");
        searchInwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        searchInwardFile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchInwardFileFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchInwardFileFocusLost(evt);
            }
        });
        searchInwardFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchInwardFileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchInwardFileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchInwardFileMouseExited(evt);
            }
        });
        searchInwardFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInwardFileActionPerformed(evt);
            }
        });
        searchInwardFile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchInwardFileKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchInwardFileKeyTyped(evt);
            }
        });
        inFiles.add(searchInwardFile);
        searchInwardFile.setBounds(650, 330, 280, 40);

        yourDeptInwardFile.setBackground(new java.awt.Color(255, 255, 255));
        yourDeptInwardFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        yourDeptInwardFile.setForeground(new java.awt.Color(0, 0, 0));
        yourDeptInwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        yourDeptInwardFile.setEnabled(false);
        inFiles.add(yourDeptInwardFile);
        yourDeptInwardFile.setBounds(20, 280, 330, 40);

        aTittleInwardFile.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        aTittleInwardFile.setForeground(new java.awt.Color(0, 0, 0));
        aTittleInwardFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inFiles.add(aTittleInwardFile);
        aTittleInwardFile.setBounds(750, 286, 180, 30);

        attachInwardFile.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        attachInwardFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attachInwardFile.setText("Click to attach document here...");
        attachInwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        attachInwardFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attachInwardFileMouseClicked(evt);
            }
        });
        inFiles.add(attachInwardFile);
        attachInwardFile.setBounds(750, 40, 180, 240);

        trans6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        trans6.setForeground(new java.awt.Color(0, 0, 0));
        trans6.setText("Attachment");
        inFiles.add(trans6);
        trans6.setBounds(750, 10, 180, 20);

        tab.addTab("Inward Files", inFiles);

        outFIles.setBackground(new java.awt.Color(255, 255, 255));
        outFIles.setForeground(new java.awt.Color(0, 0, 0));
        outFIles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        outFIles.setLayout(null);

        issue3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        issue3.setForeground(new java.awt.Color(0, 0, 0));
        issue3.setText("File Number");
        outFIles.add(issue3);
        issue3.setBounds(20, 10, 330, 20);

        sub3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        sub3.setForeground(new java.awt.Color(0, 0, 0));
        sub3.setText("Subject");
        outFIles.add(sub3);
        sub3.setBounds(400, 90, 330, 20);

        jScrollPane11.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane11.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        jScrollPane11.setForeground(java.awt.Color.green);
        jScrollPane11.setToolTipText("");

        subjectOutwardFile.setBackground(new java.awt.Color(255, 255, 255));
        subjectOutwardFile.setColumns(20);
        subjectOutwardFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        subjectOutwardFile.setForeground(new java.awt.Color(0, 0, 0));
        subjectOutwardFile.setLineWrap(true);
        subjectOutwardFile.setRows(5);
        subjectOutwardFile.setWrapStyleWord(true);
        jScrollPane11.setViewportView(subjectOutwardFile);

        outFIles.add(jScrollPane11);
        jScrollPane11.setBounds(400, 120, 330, 80);

        issueNoOutwardFile.setBackground(new java.awt.Color(255, 255, 255));
        issueNoOutwardFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        issueNoOutwardFile.setForeground(new java.awt.Color(0, 0, 0));
        issueNoOutwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        outFIles.add(issueNoOutwardFile);
        issueNoOutwardFile.setBounds(20, 40, 330, 40);

        dateOutwardFile.setBackground(new java.awt.Color(255, 255, 255));
        dateOutwardFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dateOutwardFile.setForeground(new java.awt.Color(0, 0, 0));
        dateOutwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        dateOutwardFile.setEnabled(false);
        outFIles.add(dateOutwardFile);
        dateOutwardFile.setBounds(20, 120, 330, 40);

        whoF3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        whoF3.setForeground(new java.awt.Color(0, 0, 0));
        whoF3.setText("Who To");
        outFIles.add(whoF3);
        whoF3.setBounds(20, 170, 330, 20);

        note3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        note3.setForeground(new java.awt.Color(0, 0, 0));
        note3.setText("Purpose");
        outFIles.add(note3);
        note3.setBounds(400, 210, 330, 20);

        jScrollPane12.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane12.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        jScrollPane12.setForeground(java.awt.Color.green);
        jScrollPane12.setToolTipText("");

        purposeOutwardFile.setBackground(new java.awt.Color(255, 255, 255));
        purposeOutwardFile.setColumns(20);
        purposeOutwardFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        purposeOutwardFile.setForeground(new java.awt.Color(0, 0, 0));
        purposeOutwardFile.setLineWrap(true);
        purposeOutwardFile.setRows(5);
        purposeOutwardFile.setWrapStyleWord(true);
        jScrollPane12.setViewportView(purposeOutwardFile);

        outFIles.add(jScrollPane12);
        jScrollPane12.setBounds(400, 240, 330, 80);

        trans3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        trans3.setForeground(new java.awt.Color(0, 0, 0));
        trans3.setText("Transition Column");
        outFIles.add(trans3);
        trans3.setBounds(400, 10, 330, 20);

        transitionOutwardFile.setBackground(new java.awt.Color(255, 255, 255));
        transitionOutwardFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        transitionOutwardFile.setForeground(new java.awt.Color(0, 0, 0));
        transitionOutwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        outFIles.add(transitionOutwardFile);
        transitionOutwardFile.setBounds(400, 40, 330, 40);

        dat1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        dat1.setForeground(new java.awt.Color(0, 0, 0));
        dat1.setText("Date");
        outFIles.add(dat1);
        dat1.setBounds(20, 90, 330, 20);

        whoToOutwardFile.setBackground(new java.awt.Color(255, 255, 255));
        whoToOutwardFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        whoToOutwardFile.setForeground(new java.awt.Color(0, 0, 0));
        whoToOutwardFile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chairman's_Office", "DG's_Office", "Admin", "Cartography", "Census", "Commission's_Secretariat", "DFA", "General_Services", "ICT", "Internal_Audit", "Legal", "Planning_&_Research", "Population_Management", "Population_Studies", "Procurement", "PAD", "Special_Duties", "VRD" }));
        whoToOutwardFile.setAutoscrolls(true);
        whoToOutwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        whoToOutwardFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        outFIles.add(whoToOutwardFile);
        whoToOutwardFile.setBounds(20, 196, 330, 40);

        rec3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        rec3.setForeground(new java.awt.Color(0, 0, 0));
        rec3.setText("Sending Department");
        outFIles.add(rec3);
        rec3.setBounds(20, 250, 330, 20);

        outFileScroll.setBackground(new java.awt.Color(255, 255, 255));
        outFileScroll.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green));
        outFileScroll.setForeground(new java.awt.Color(0, 0, 0));
        outFileScroll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        outFileTable.setAutoCreateRowSorter(true);
        outFileTable.setBackground(new java.awt.Color(255, 255, 255));
        outFileTable.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green));
        outFileTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        outFileTable.setForeground(new java.awt.Color(0, 0, 0));
        outFileTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "ISSUE NO OF ISSUING DEPARTMENT", "DATE OF RECEIPT", "WHO TO", "SENDER", "SUBJECT", "TRANSITION COLUMN", "PURPOSE", "SIGN", "FILE"
                }
        ) {
            final Class[] types = new Class[]{
                    java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };
            final boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        outFileTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        outFileTable.setGridColor(java.awt.Color.green);
        outFileTable.setRowHeight(24);
        outFileTable.setShowGrid(true);
        outFileTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outFileTableMouseClicked(evt);
            }
        });
        outFileTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                outFileTableKeyPressed(evt);
            }
        });
        outFileScroll.setViewportView(outFileTable);

        outFIles.add(outFileScroll);
        outFileScroll.setBounds(0, 393, 950, 230);

        addOutwardFile.setBackground(new java.awt.Color(255, 255, 255));
        addOutwardFile.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        addOutwardFile.setForeground(new java.awt.Color(0, 0, 0));
        addOutwardFile.setText("Add");
        addOutwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        addOutwardFile.setOpaque(false);
        addOutwardFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addOutwardFileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addOutwardFileMouseExited(evt);
            }
        });
        addOutwardFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOutwardFileActionPerformed(evt);
            }
        });
        outFIles.add(addOutwardFile);
        addOutwardFile.setBounds(20, 330, 110, 50);

        deleteOutwardFile.setBackground(new java.awt.Color(255, 255, 255));
        deleteOutwardFile.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        deleteOutwardFile.setForeground(new java.awt.Color(0, 0, 0));
        deleteOutwardFile.setText("Delete");
        deleteOutwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        deleteOutwardFile.setOpaque(false);
        deleteOutwardFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteOutwardFileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteOutwardFileMouseExited(evt);
            }
        });
        deleteOutwardFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOutwardFileActionPerformed(evt);
            }
        });
        outFIles.add(deleteOutwardFile);
        deleteOutwardFile.setBounds(170, 330, 110, 50);

        updateOutwardFile.setBackground(new java.awt.Color(255, 255, 255));
        updateOutwardFile.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        updateOutwardFile.setForeground(new java.awt.Color(0, 0, 0));
        updateOutwardFile.setText("Update");
        updateOutwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        updateOutwardFile.setOpaque(false);
        updateOutwardFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateOutwardFileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateOutwardFileMouseExited(evt);
            }
        });
        updateOutwardFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOutwardFileActionPerformed(evt);
            }
        });
        outFIles.add(updateOutwardFile);
        updateOutwardFile.setBounds(320, 330, 110, 50);

        syncOutwardFile.setBackground(new java.awt.Color(255, 255, 255));
        syncOutwardFile.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        syncOutwardFile.setForeground(new java.awt.Color(0, 0, 0));
        syncOutwardFile.setText("Synchronize");
        syncOutwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        syncOutwardFile.setOpaque(false);
        syncOutwardFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                syncOutwardFileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                syncOutwardFileMouseExited(evt);
            }
        });
        syncOutwardFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syncOutwardFileActionPerformed(evt);
            }
        });
        outFIles.add(syncOutwardFile);
        syncOutwardFile.setBounds(470, 330, 130, 50);

        searchOutwardFile.setBackground(new java.awt.Color(255, 255, 255));
        searchOutwardFile.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        searchOutwardFile.setText("Search with any field...");
        searchOutwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        searchOutwardFile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchOutwardFileFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchOutwardFileFocusLost(evt);
            }
        });
        searchOutwardFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchOutwardFileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchOutwardFileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchOutwardFileMouseExited(evt);
            }
        });
        searchOutwardFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchOutwardFileActionPerformed(evt);
            }
        });
        searchOutwardFile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchOutwardFileKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchOutwardFileKeyTyped(evt);
            }
        });
        outFIles.add(searchOutwardFile);
        searchOutwardFile.setBounds(650, 330, 280, 40);

        yourDeptOutwardFile.setBackground(new java.awt.Color(255, 255, 255));
        yourDeptOutwardFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        yourDeptOutwardFile.setForeground(new java.awt.Color(0, 0, 0));
        yourDeptOutwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        yourDeptOutwardFile.setEnabled(false);
        outFIles.add(yourDeptOutwardFile);
        yourDeptOutwardFile.setBounds(20, 280, 330, 40);

        aTittleOutwardFile.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        aTittleOutwardFile.setForeground(new java.awt.Color(0, 0, 0));
        aTittleOutwardFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outFIles.add(aTittleOutwardFile);
        aTittleOutwardFile.setBounds(750, 286, 180, 30);

        attachOutwardFile.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        attachOutwardFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attachOutwardFile.setText("Click to attach document here...");
        attachOutwardFile.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        attachOutwardFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attachOutwardFileMouseClicked(evt);
            }
        });
        outFIles.add(attachOutwardFile);
        attachOutwardFile.setBounds(750, 40, 180, 240);

        trans5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        trans5.setForeground(new java.awt.Color(0, 0, 0));
        trans5.setText("Attachment");
        outFIles.add(trans5);
        trans5.setBounds(750, 10, 180, 20);

        tab.addTab("Outward Files", outFIles);

        getContentPane().add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 950, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void syncRecords(JTable table, String tableName) {
        String num, dat, trans, sub, purpose, whoF, whoT, sign, directory;

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No records to synchronize", "Sync Error", 2);
        } else {
            int surety = JOptionPane.showConfirmDialog(this, "Upload table records to cloud database?", "Cloud upload", JOptionPane.YES_NO_OPTION);

            if (surety == 0) {
                try {
                    for (int i = 0; i < model.getRowCount(); i++) {
                        num = String.valueOf(model.getValueAt(i, 0));
                        dat = String.valueOf(model.getValueAt(i, 1));
                        whoF = String.valueOf(model.getValueAt(i, 2));
                        whoT = String.valueOf(model.getValueAt(i, 3));
                        sub = String.valueOf(table.getValueAt(i, 4));
                        trans = String.valueOf(model.getValueAt(i, 5));
                        purpose = String.valueOf(model.getValueAt(i, 6));
                        sign = String.valueOf(model.getValueAt(i, 7));
                        directory = String.valueOf(model.getValueAt(i, 8));

                        String query = "INSERT INTO `" + tableName + "` (id,issueno,date,whofrom,whoto,"
                                + "subject,transition,purpose,sign,file ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                        PreparedStatement statement = (PreparedStatement) myConnection().prepareStatement(query);
                        statement.setString(1, "");
                        statement.setString(2, num);
                        statement.setString(3, dat);
                        statement.setString(4, whoF);
                        statement.setString(5, whoT);
                        statement.setString(6, sub);
                        statement.setString(7, trans);
                        statement.setString(8, purpose);
                        statement.setString(9, sign);
                        statement.setString(10, directory);

                        statement.execute();
                    }
                } catch (SQLException e) {
                    System.out.println(e);
                    JOptionPane.showMessageDialog(this, "Couldn't synchronize records!\n" + e.getMessage(), "Sync error", JOptionPane.YES_NO_OPTION);
                }
                JOptionPane.showMessageDialog(this, "Records synchronized successfully...!");
                model.setRowCount(0);
            }
        }
    }

    private void dateField(JTextField textField) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");
        String formatDateTime = now.format(format);
        textField.setText(formatDateTime);
    }

    private void refreshTime() {
        dateField(dateInwardMail);
        dateField(dateOutwardMail);
        dateField(dateInwardFile);
        dateField(dateOutwardFile);
    }

    private void exportRecordz() {
        DefaultTableModel model1 = (DefaultTableModel) inMailTable.getModel();
        DefaultTableModel model2 = (DefaultTableModel) outMailTable.getModel();
        DefaultTableModel model3 = (DefaultTableModel) inFileTable.getModel();
        DefaultTableModel model4 = (DefaultTableModel) outFileTable.getModel();

        XSSFWorkbook workbook = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        String fileName1 = yourDeptInwardMail.getText() + "Inward Mails";
        String fileName2 = yourDeptOutwardMail.getText() + "Outward Mails";
        String fileName3 = yourDeptInwardFile.getText() + "Inward Files";
        String fileName4 = yourDeptOutwardFile.getText() + "Outward Files";

        workbook = new XSSFWorkbook();
        XSSFSheet worksheet1 = workbook.createSheet(fileName1);
        XSSFSheet worksheet2 = workbook.createSheet(fileName2);
        XSSFSheet worksheet3 = workbook.createSheet(fileName3);
        XSSFSheet worksheet4 = workbook.createSheet(fileName4);

        for (int row = 0; row < inMailTable.getRowCount(); row++) {
            XSSFRow rows = worksheet1.createRow(row);
            for (int column = 0; column < inMailTable.getColumnCount(); column++) {
                XSSFCell cells = rows.createCell(column);
                cells.setCellValue((String.valueOf(model1.getValueAt(row, column))));
            }
        }

        for (int row = 0; row < outMailTable.getRowCount(); row++) {
            XSSFRow rows = worksheet2.createRow(row);
            for (int column = 0; column < outMailTable.getColumnCount(); column++) {
                XSSFCell cells = rows.createCell(column);
                cells.setCellValue((String.valueOf(model2.getValueAt(row, column))));
            }
        }

        for (int row = 0; row < inFileTable.getRowCount(); row++) {
            XSSFRow rows = worksheet3.createRow(row);
            for (int column = 0; column < inFileTable.getColumnCount(); column++) {
                XSSFCell cells = rows.createCell(column);
                cells.setCellValue((String.valueOf(model3.getValueAt(row, column))));
            }
        }

        for (int row = 0; row < outFileTable.getRowCount(); row++) {
            XSSFRow rows = worksheet4.createRow(row);
            for (int column = 0; column < outFileTable.getColumnCount(); column++) {
                XSSFCell cells = rows.createCell(column);
                cells.setCellValue((String.valueOf(model4.getValueAt(row, column))));
            }
        }

        try {
            fos = new FileOutputStream("Logs.xlsx");
            bos = new BufferedOutputStream(fos);
            workbook.write(bos);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
                if (fos != null) {
                    fos.close();
                }
                workbook.close();
            } catch (IOException io) {
                System.out.println(io.getMessage());
            }
        }
    }

    private void importRecordz() {
        DefaultTableModel model1 = (DefaultTableModel) inMailTable.getModel();
        DefaultTableModel model2 = (DefaultTableModel) outMailTable.getModel();
        DefaultTableModel model3 = (DefaultTableModel) inFileTable.getModel();
        DefaultTableModel model4 = (DefaultTableModel) outFileTable.getModel();

        XSSFWorkbook workbook = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;

        try {
            fis = new FileInputStream(new File("Logs.xlsx"));
            bis = new BufferedInputStream(fis);
            workbook = new XSSFWorkbook(bis);
            XSSFSheet worksheet1 = workbook.getSheetAt(0);
            XSSFSheet worksheet2 = workbook.getSheetAt(1);
            XSSFSheet worksheet3 = workbook.getSheetAt(2);
            XSSFSheet worksheet4 = workbook.getSheetAt(3);

            for (int row = 0; row <= worksheet1.getLastRowNum(); row++) {
                XSSFRow rows = worksheet1.getRow(row);
                XSSFCell number = rows.getCell(0);
                XSSFCell date = rows.getCell(1);
                XSSFCell from = rows.getCell(2);
                XSSFCell to = rows.getCell(3);
                XSSFCell subject = rows.getCell(4);
                XSSFCell transition = rows.getCell(5);
                XSSFCell purpose = rows.getCell(6);
                XSSFCell sign = rows.getCell(7);
                XSSFCell doc = rows.getCell(8);
                model1.addRow(new Object[]{number, date, from, to, subject, transition, purpose, sign, doc});
            }

            for (int row = 0; row <= worksheet2.getLastRowNum(); row++) {
                XSSFRow rows = worksheet2.getRow(row);
                XSSFCell number = rows.getCell(0);
                XSSFCell date = rows.getCell(1);
                XSSFCell from = rows.getCell(2);
                XSSFCell to = rows.getCell(3);
                XSSFCell subject = rows.getCell(4);
                XSSFCell transition = rows.getCell(5);
                XSSFCell purpose = rows.getCell(6);
                XSSFCell sign = rows.getCell(7);
                XSSFCell doc = rows.getCell(8);
                model2.addRow(new Object[]{number, date, from, to, subject, transition, purpose, sign, doc});
            }

            for (int row = 0; row <= worksheet3.getLastRowNum(); row++) {
                XSSFRow rows = worksheet3.getRow(row);
                XSSFCell number = rows.getCell(0);
                XSSFCell date = rows.getCell(1);
                XSSFCell from = rows.getCell(2);
                XSSFCell to = rows.getCell(3);
                XSSFCell subject = rows.getCell(4);
                XSSFCell transition = rows.getCell(5);
                XSSFCell purpose = rows.getCell(6);
                XSSFCell sign = rows.getCell(7);
                XSSFCell doc = rows.getCell(8);
                model3.addRow(new Object[]{number, date, from, to, subject, transition, purpose, sign, doc});
            }

            for (int row = 0; row <= worksheet4.getLastRowNum(); row++) {
                XSSFRow rows = worksheet4.getRow(row);
                XSSFCell number = rows.getCell(0);
                XSSFCell date = rows.getCell(1);
                XSSFCell from = rows.getCell(2);
                XSSFCell to = rows.getCell(3);
                XSSFCell subject = rows.getCell(4);
                XSSFCell transition = rows.getCell(5);
                XSSFCell purpose = rows.getCell(6);
                XSSFCell sign = rows.getCell(7);
                XSSFCell doc = rows.getCell(8);
                model4.addRow(new Object[]{number, date, from, to, subject, transition, purpose, sign, doc});
            }

            refreshTime();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (fis != null) {
                    fis.close();
                }
                if (workbook != null) {
                    workbook.close();
                }
            } catch (IOException io) {
                System.out.println(io.getMessage());
            }
        }
    }

    private void importLog(JTextField textField) {
        try {
            FileReader fr = new FileReader(new File("_.txt"));
            BufferedReader br = new BufferedReader(fr);
            String department;

            while ((department = br.readLine()) != null) {
                textField.setText(department);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException fnfe) {
        } catch (IOException ex) {
        }
    }

    private void importLogs(JLabel name, JLabel id) {
        String path = "%.txt";
        try {
            FileReader fr = new FileReader(new File(path));
            BufferedReader br = new BufferedReader(fr);
            Object[] lines = br.lines().toArray();
            name.setText("Name: " + lines[0]);
            id.setText(String.valueOf(lines[1]));
            br.close();
            fr.close();
        } catch (FileNotFoundException fnfe) {
        } catch (IOException ex) {
        }
    }

    private void autoSave() {
        deleteLogs();
        exportRecordz();
    }

    private void attach(JLabel fileHolder, JLabel fileTitleHolder) {
        JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView());
        chooser.setApproveButtonText("Attach");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Picture file", "jpg", "jpeg", "png");
        chooser.showOpenDialog(null);
        chooser.addChoosableFileFilter(filter);
        File file = chooser.getSelectedFile();
        String fileName = file.getAbsolutePath();
        fileTitleHolder.setText(fileName);
        ImageIcon icon = new ImageIcon(fileName);
        Image image = icon.getImage().getScaledInstance(fileHolder.getWidth(),
                fileHolder.getHeight(), Image.SCALE_SMOOTH);
        fileHolder.setText(null);
        fileHolder.setIcon(new ImageIcon(image));
    }

    private void Export(JTable table1, JTable table2, JTable table3, JTable table4, JTextField field) {
        DefaultTableModel model1 = (DefaultTableModel) table1.getModel();
        DefaultTableModel model2 = (DefaultTableModel) table2.getModel();
        DefaultTableModel model3 = (DefaultTableModel) table3.getModel();
        DefaultTableModel model4 = (DefaultTableModel) table4.getModel();
        File desktop = FileSystemView.getFileSystemView().getHomeDirectory();

        XSSFWorkbook workbook = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        JFileChooser fc = new JFileChooser(desktop.getAbsolutePath());
        fc.setDialogTitle("Export all records:");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Excel file", "xls", "xlsx", "xlsm");
        fc.setFileFilter(fnef);
        String fileName1 = field.getText() + "Inward Mails";
        String fileName2 = field.getText() + "Outward Mails";
        String fileName3 = field.getText() + "Inward Files";
        String fileName4 = field.getText() + "Outward Files";
        int option = JOptionPane.showConfirmDialog(this, "You are about to export all unsynchronized records to local storage, continue?", "Export", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (option == 0) {
            int status = fc.showSaveDialog(null);

            if (status == JFileChooser.APPROVE_OPTION) {
                workbook = new XSSFWorkbook();
                XSSFSheet worksheet1 = workbook.createSheet(fileName1);
                XSSFSheet worksheet2 = workbook.createSheet(fileName2);
                XSSFSheet worksheet3 = workbook.createSheet(fileName3);
                XSSFSheet worksheet4 = workbook.createSheet(fileName4);

                for (int row = 0; row < table1.getRowCount(); row++) {
                    XSSFRow rows = worksheet1.createRow(row);
                    for (int column = 0; column < table1.getColumnCount(); column++) {
                        XSSFCell cells = rows.createCell(column);
                        cells.setCellValue((String.valueOf(model1.getValueAt(row, column))));
                    }
                }

                for (int row = 0; row < table2.getRowCount(); row++) {
                    XSSFRow rows = worksheet2.createRow(row);
                    for (int column = 0; column < table2.getColumnCount(); column++) {
                        XSSFCell cells = rows.createCell(column);
                        cells.setCellValue((String.valueOf(model2.getValueAt(row, column))));
                    }
                }

                for (int row = 0; row < table3.getRowCount(); row++) {
                    XSSFRow rows = worksheet3.createRow(row);
                    for (int column = 0; column < table3.getColumnCount(); column++) {
                        XSSFCell cells = rows.createCell(column);
                        cells.setCellValue((String.valueOf(model3.getValueAt(row, column))));
                    }
                }

                for (int row = 0; row < table4.getRowCount(); row++) {
                    XSSFRow rows = worksheet4.createRow(row);
                    for (int column = 0; column < table4.getColumnCount(); column++) {
                        XSSFCell cells = rows.createCell(column);
                        cells.setCellValue((String.valueOf(model4.getValueAt(row, column))));
                    }
                }

                try {
                    fos = new FileOutputStream(fc.getSelectedFile() + ".xlsx");
                    bos = new BufferedOutputStream(fos);
                    workbook.write(bos);

                    JOptionPane.showMessageDialog(this, "Records exported to " + fc.getSelectedFile().getPath() + " successfully...!");
                    refreshTime();
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                } finally {
                    try {
                        if (bos != null) {
                            bos.close();
                        }
                        if (fos != null) {
                            fos.close();
                        }
                        if (workbook != null) {
                            workbook.close();
                        }
                    } catch (IOException io) {
                        JOptionPane.showMessageDialog(this, io.getMessage());
                    }
                }
            }
        }
    }

    private void Import(JTable table1, JTable table2, JTable table3, JTable table4) {
        DefaultTableModel model1 = (DefaultTableModel) table1.getModel();
        DefaultTableModel model2 = (DefaultTableModel) table2.getModel();
        DefaultTableModel model3 = (DefaultTableModel) table3.getModel();
        DefaultTableModel model4 = (DefaultTableModel) table4.getModel();
        File desktop = FileSystemView.getFileSystemView().getHomeDirectory(), file;

        XSSFWorkbook workbook = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;

        JFileChooser fc = new JFileChooser(desktop.getAbsolutePath());
        fc.setDialogTitle("Import all records:");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Excel file", "xls", "xlsx", "xlsm");
        fc.setFileFilter(fnef);
        int option = JOptionPane.showConfirmDialog(this, "You are about to import all unsynchronized records\ninitially saved to local storage, continue?", "Import", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (option == 0) {
            int status = fc.showOpenDialog(null);
            if (status == JFileChooser.APPROVE_OPTION) {

                try {
                    file = fc.getSelectedFile();
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    workbook = new XSSFWorkbook(bis);
                    XSSFSheet worksheet1 = workbook.getSheetAt(0);
                    XSSFSheet worksheet2 = workbook.getSheetAt(1);
                    XSSFSheet worksheet3 = workbook.getSheetAt(2);
                    XSSFSheet worksheet4 = workbook.getSheetAt(3);

                    for (int row = 0; row <= worksheet1.getLastRowNum(); row++) {
                        XSSFRow rows = worksheet1.getRow(row);
                        XSSFCell number = rows.getCell(0);
                        XSSFCell date = rows.getCell(1);
                        XSSFCell from = rows.getCell(2);
                        XSSFCell to = rows.getCell(3);
                        XSSFCell subject = rows.getCell(4);
                        XSSFCell transition = rows.getCell(5);
                        XSSFCell purpose = rows.getCell(6);
                        XSSFCell sign = rows.getCell(7);
                        XSSFCell doc = rows.getCell(8);
                        model1.addRow(new Object[]{number, date, from, to, subject, transition, purpose, sign, doc});
                    }

                    for (int row = 0; row <= worksheet2.getLastRowNum(); row++) {
                        XSSFRow rows = worksheet2.getRow(row);
                        XSSFCell number = rows.getCell(0);
                        XSSFCell date = rows.getCell(1);
                        XSSFCell from = rows.getCell(2);
                        XSSFCell to = rows.getCell(3);
                        XSSFCell subject = rows.getCell(4);
                        XSSFCell transition = rows.getCell(5);
                        XSSFCell purpose = rows.getCell(6);
                        XSSFCell sign = rows.getCell(7);
                        XSSFCell doc = rows.getCell(8);
                        model2.addRow(new Object[]{number, date, from, to, subject, transition, purpose, sign, doc});
                    }

                    for (int row = 0; row <= worksheet3.getLastRowNum(); row++) {
                        XSSFRow rows = worksheet3.getRow(row);
                        XSSFCell number = rows.getCell(0);
                        XSSFCell date = rows.getCell(1);
                        XSSFCell from = rows.getCell(2);
                        XSSFCell to = rows.getCell(3);
                        XSSFCell subject = rows.getCell(4);
                        XSSFCell transition = rows.getCell(5);
                        XSSFCell purpose = rows.getCell(6);
                        XSSFCell sign = rows.getCell(7);
                        XSSFCell doc = rows.getCell(8);
                        model3.addRow(new Object[]{number, date, from, to, subject, transition, purpose, sign, doc});
                    }

                    for (int row = 0; row <= worksheet4.getLastRowNum(); row++) {
                        XSSFRow rows = worksheet4.getRow(row);
                        XSSFCell number = rows.getCell(0);
                        XSSFCell date = rows.getCell(1);
                        XSSFCell from = rows.getCell(2);
                        XSSFCell to = rows.getCell(3);
                        XSSFCell subject = rows.getCell(4);
                        XSSFCell transition = rows.getCell(5);
                        XSSFCell purpose = rows.getCell(6);
                        XSSFCell sign = rows.getCell(7);
                        XSSFCell doc = rows.getCell(8);
                        model4.addRow(new Object[]{number, date, from, to, subject, transition, purpose, sign, doc});
                    }

                    JOptionPane.showMessageDialog(this, "Records imported successfully...!");
                    refreshTime();
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                } finally {
                    try {
                        if (bis != null) {
                            bis.close();
                        }
                        if (fis != null) {
                            fis.close();
                        }
                        if (workbook != null) {
                            workbook.close();
                        }
                    } catch (IOException io) {
                        JOptionPane.showMessageDialog(this, io.getMessage());
                    }
                }
            }
        }
    }

    private void deleteLogs() {
        try {
            Files.deleteIfExists(Paths.get("Logs.xlsx"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
