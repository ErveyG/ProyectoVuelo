import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ImprimirController implements ActionListener {
    BoletoDao boleto = new BoletoDao();
    private ImprimirView vista;

    public ImprimirController(ImprimirView vistaImprimir) {
        this.vista = vistaImprimir;
        this.eventos();
    }

    public void eventos() {
        this.vista.imprimirBoton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        if (evt.equals(this.vista.imprimirBoton)) {
            try {
                this.boleto.cargar(this.vista.nombrePas.getText(), EnumVuelo.valueOf(this.vista.tipoPasajeroComboBox.getSelectedItem().toString()));
                JOptionPane.showMessageDialog((Component)null, ImprimirController.this.boleto.toString());
                this.vista.dispose();
            } catch (Exception var4) {
                JOptionPane.showMessageDialog((Component)null, "Ha ocurrido un error");
            }
        }

    }
}
