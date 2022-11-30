package npc.register;

/**
 *
 * @author Ndachimya Edward
 */
public class Splash extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Splash
     */
    public Splash() {
        initComponents();
        bar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bar = new javax.swing.JProgressBar();
        naija = new javax.swing.JLabel();
        npc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        log = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(null);

        bar.setBackground(new java.awt.Color(255, 255, 255));
        bar.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        bar.setForeground(new java.awt.Color(0, 255, 0));
        bar.setBorder(null);
        bar.setBorderPainted(false);
        bg.add(bar);
        bar.setBounds(0, 195, 400, 3);

        naija.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        naija.setIcon(new javax.swing.ImageIcon(getClass().getResource("/npc/register/naija.png"))); // NOI18N
        bg.add(naija);
        naija.setBounds(280, 0, 120, 110);

        npc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        npc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/npc/register/npc_logo.png"))); // NOI18N
        bg.add(npc);
        npc.setBounds(0, 0, 120, 110);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NPC Register");
        bg.add(jLabel1);
        jLabel1.setBounds(40, 80, 320, 90);

        log.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        log.setForeground(new java.awt.Color(204, 204, 204));
        log.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        log.setText("Morpheus Softwares");
        bg.add(log);
        log.setBounds(0, 170, 130, 16);

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 200));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Splash().setVisible(true);
        });
    }

    @SuppressWarnings("SleepWhileInLoop")
    private void bar() {
        Thread thread = new Thread(() -> {
            int i = 0;
            while (i <= 100) {
                i++;
                bar.setValue(i);
                if (i == 100) {
                    this.dispose();
                    new Login().setVisible(true);
                }
                try {
                    Thread.sleep(20);
                } catch (InterruptedException ex) {
                }
            }
        });
        thread.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel log;
    private javax.swing.JLabel naija;
    private javax.swing.JLabel npc;
    // End of variables declaration//GEN-END:variables
}
