import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RegistroNacionalView {
    private JFrame mainFrame;
    DocumentacionNacionalView docNacionalView = new DocumentacionNacionalView();
    PasajeroView pasajeroView = new PasajeroView();
    VueloView vueloView = new VueloView();
    JButton enviarBoton = new JButton("Enviar");

    public DocumentacionNacionalView getDocNacionalView() {
        return docNacionalView;
    }

    public PasajeroView getPasajeroView() {
        return pasajeroView;
    }

    public VueloView getVueloView() {
        return vueloView;
    }

    public RegistroNacionalView(){
        mainFrame = new JFrame();
        mainFrame.setLayout(new BorderLayout());

        JPanel panelEast = new JPanel(new GridLayout(2,1));
        panelEast.add(vueloView);
        panelEast.add(pasajeroView);

        JPanel panelCenter = new JPanel(new GridLayout(2,1));
        panelEast.add(docNacionalView);
        enviarBoton.setHorizontalAlignment(JButton.CENTER);
        panelEast.add(enviarBoton);

        JLabel backgroundLabel = new JLabel(new ImageIcon("Images/RegistrationLoginPic.png"));

        mainFrame.getContentPane().add(panelEast, BorderLayout.EAST);
        mainFrame.getContentPane().add(panelCenter, BorderLayout.CENTER);
        mainFrame.getContentPane().add(backgroundLabel, BorderLayout.WEST);
        mainFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
        mainFrame.pack();
    }

    public JFrame getMainFrame(){
        return mainFrame;
    }

    public void addEnviarBoton(ActionListener listenForEnviarBoton){
        enviarBoton.addActionListener(listenForEnviarBoton);
    }

    public void mostrarError(String mensajeError){
        JOptionPane.showMessageDialog(mainFrame,mensajeError);
    }
}
