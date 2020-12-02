
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelarViewController implements ActionListener {
    BoletoDao b1 = new BoletoDao();
    private CancelarView vista;
    public CancelarViewController(CancelarView vistaCancelar){
        this.vista = vistaCancelar;
        eventos();
    }
    public void eventos(){
        vista.cancelarBoton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(vista.cancelarBoton)){
            try {
                b1.eliminar(vista.nombrePas.getText(), EnumVuelo.valueOf(vista.tipoPasajeroComboBox.getSelectedItem().toString()));
                JOptionPane.showMessageDialog(null,"Boleto Cancelado");
                vista.dispose();
            }catch (Exception a){
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error!!!");
            }
        }
    }
}
