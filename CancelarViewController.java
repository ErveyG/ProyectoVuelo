import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class CancelarViewController implements ActionListener {
    File archivoEliminar;
    private CancelarView vista;
    public CancelarViewController(CancelarView vistaCancelar){
        this.vista = vistaCancelar;
        eventos();
    }
    public void eventos(){
        vista.buscarBoton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(vista.buscarBoton)){
            String nombre = vista.tipoPasajeroComboBox.getSelectedItem().toString()+"_"+vista.textoArchivo.getText().replace(" ","")+".vuelo";
            archivoEliminar = new File(nombre);
            if (archivoEliminar.delete()){
                JOptionPane.showMessageDialog(null,"El boleto fue cancelado exitosamente");
                vista.dispose();
            }
            else
                JOptionPane.showMessageDialog(null,"No se encontro el boleto");
        }
    }
}
