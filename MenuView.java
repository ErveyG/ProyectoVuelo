import javax.swing.*;
import java.awt.*;

public class MenuView extends javax.swing.JFrame {

    public MenuView() {
        initComponents();
    }

    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        fondoLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        salirMenuItem = new javax.swing.JMenuItem();
        buscarBoletoMenu = new javax.swing.JMenu();
        imprimirBoletoMenuItem = new javax.swing.JMenuItem();
        registrarBoletoMenu = new javax.swing.JMenu();
        boletoInternacionalMenuItem = new javax.swing.JMenuItem();
        boletoNacionalMenuItem = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido Al Sistema");

        fondoLabel.setIcon(new javax.swing.ImageIcon("Images/RegistrationN3.png")); // NOI18N

        fileMenu.setText("File");

        salirMenuItem.setText("Salir");
        salirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(salirMenuItem);

        jMenuBar1.add(fileMenu);

        buscarBoletoMenu.setText("Buscar Boleto");

        imprimirBoletoMenuItem.setText("Imprimir Boleto");
        imprimirBoletoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirBoletoMenuItemActionPerformed(evt);
            }
        });
        buscarBoletoMenu.add(imprimirBoletoMenuItem);

        jMenuBar1.add(buscarBoletoMenu);

        registrarBoletoMenu.setText("Registrar Boleto");
        registrarBoletoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBoletoMenuActionPerformed(evt);
            }
        });

        boletoInternacionalMenuItem.setText("Internacional");
        boletoInternacionalMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boletoInternacionalMenuItemActionPerformed(evt);
            }
        });
        registrarBoletoMenu.add(boletoInternacionalMenuItem);

        boletoNacionalMenuItem.setText("Nacional");
        boletoNacionalMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boletoNacionalMenuItemActionPerformed(evt);
            }
        });
        registrarBoletoMenu.add(boletoNacionalMenuItem);

        jMenuBar1.add(registrarBoletoMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fondoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fondoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void salirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void boletoInternacionalMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame mainFrame = new JFrame();
        mainFrame.setLayout(new BorderLayout());
        DocumentacionInternacionalView view = new DocumentacionInternacionalView();
        DocumentacionNacionalView view2 = new DocumentacionNacionalView();
        PasajeroView view3 = new PasajeroView();
        VueloView view4 = new VueloView();
        MaletaView view5 = new MaletaView();

        mainFrame.getContentPane().add(view, BorderLayout.WEST);
        mainFrame.getContentPane().add(view2, BorderLayout.EAST);
        mainFrame.getContentPane().add(view3, BorderLayout.CENTER);
        mainFrame.getContentPane().add(view4, BorderLayout.SOUTH);
        mainFrame.getContentPane().add(view5, BorderLayout.NORTH);
        mainFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.pack();
    }

    private void boletoNacionalMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame mainFrame = new JFrame();
        mainFrame.setLayout(new BorderLayout());
        DocumentacionNacionalView view2 = new DocumentacionNacionalView();
        PasajeroView view3 = new PasajeroView();
        VueloView view4 = new VueloView();


        mainFrame.getContentPane().add(view2, BorderLayout.EAST);
        mainFrame.getContentPane().add(view3, BorderLayout.CENTER);
        mainFrame.getContentPane().add(view4, BorderLayout.SOUTH);
        mainFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.pack();
    }

    private void imprimirBoletoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void registrarBoletoMenuActionPerformed(java.awt.event.ActionEvent evt) {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JMenuItem boletoInternacionalMenuItem;
    private javax.swing.JMenuItem boletoNacionalMenuItem;
    private javax.swing.JMenu buscarBoletoMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JMenuItem imprimirBoletoMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu registrarBoletoMenu;
    private javax.swing.JMenuItem salirMenuItem;
    // End of variables declaration
}
