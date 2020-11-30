import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteOrder;

public class MenuView extends JFrame {

    public MenuView() {
        initComponents();
    }

    private void initComponents() {

        jMenuItem4 = new JMenuItem();
        fondoLabel = new JLabel();
        jMenuBar1 = new JMenuBar();
        fileMenu = new JMenu();
        salirMenuItem = new JMenuItem();
        buscarBoletoMenu = new JMenu();
        imprimirBoletoMenuItem = new JMenuItem();
        registrarBoletoMenu = new JMenu();
        boletoInternacionalMenuItem = new JMenuItem();
        boletoNacionalMenuItem = new JMenuItem();
        this.setResizable(false);
        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido Al Sistema");

        fondoLabel.setIcon(new javax.swing.ImageIcon("Images/RegistrationN3.png"));

        fileMenu.setText("File");

        salirMenuItem.setText("Salir");
        salirMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                salirMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(salirMenuItem);

        jMenuBar1.add(fileMenu);

        buscarBoletoMenu.setText("Buscar Boleto");

        imprimirBoletoMenuItem.setText("Imprimir Boleto");
        imprimirBoletoMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirBoletoMenuItemActionPerformed(evt);
            }
        });
        buscarBoletoMenu.add(imprimirBoletoMenuItem);

        jMenuBar1.add(buscarBoletoMenu);

        registrarBoletoMenu.setText("Registrar Boleto");
        registrarBoletoMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                registrarBoletoMenuActionPerformed(evt);
            }
        });

        boletoInternacionalMenuItem.setText("Internacional");
        boletoInternacionalMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                boletoInternacionalMenuItemActionPerformed(evt);
            }
        });
        registrarBoletoMenu.add(boletoInternacionalMenuItem);

        boletoNacionalMenuItem.setText("Nacional");
        boletoNacionalMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                boletoNacionalMenuItemActionPerformed(evt);
            }
        });
        registrarBoletoMenu.add(boletoNacionalMenuItem);

        jMenuBar1.add(registrarBoletoMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(fondoLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(fondoLabel, GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void salirMenuItemActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    private void boletoInternacionalMenuItemActionPerformed(ActionEvent evt) {
        RegistroInternacionalView registroInternacionalView = new RegistroInternacionalView();
        RegistroInternacionalController registroInternacionalController =
                new RegistroInternacionalController(registroInternacionalView);
    }

    private void boletoNacionalMenuItemActionPerformed(ActionEvent evt) {
        RegistroNacionalView registroNacionalView = new RegistroNacionalView();
        RegistroNacionalController registroNacionalController =
                new RegistroNacionalController(registroNacionalView);
    }

    private void imprimirBoletoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null,"Not available yet.");
    }

    private void registrarBoletoMenuActionPerformed(java.awt.event.ActionEvent evt) {

    }

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
    private JMenuItem boletoInternacionalMenuItem;
    private JMenuItem boletoNacionalMenuItem;
    private JMenu buscarBoletoMenu;
    private JMenu fileMenu;
    private JLabel fondoLabel;
    private JMenuItem imprimirBoletoMenuItem;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem4;
    private JMenu registrarBoletoMenu;
    private JMenuItem salirMenuItem;
}
