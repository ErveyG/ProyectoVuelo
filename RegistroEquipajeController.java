import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class RegistroEquipajeController {
    private RegistroEquipajeView registroEquipajeView;
    private MaletaController maletaController;
    private Maleta[] maleta;
    private Pasajero pasajero;

    public RegistroEquipajeController(Maleta[] maleta,Pasajero pasajero,RegistroEquipajeView registroEquipajeView){
        this.maleta = maleta;
        this.pasajero = pasajero;
        maletaController = new MaletaController();
        this.registroEquipajeView =  registroEquipajeView;
        this.registroEquipajeView.addEnviarBoton(new EnviarListenerEquipaje());
    }

    class EnviarListenerEquipaje implements ActionListener{
        public void actionPerformed(ActionEvent event){
          try{
                for(int i = 0; i < pasajero.getEquipaje().length; i++){
                    maleta[i] = maletaController.creaMaleta(registroEquipajeView.getMaletaViews()[i].getPesoMaletaEntrada());
                    pasajero.documentarMaleta(maleta[i]);
                    JOptionPane.showMessageDialog(null,maleta[0].toString());
                }
           }
            catch (Exception e){
                System.out.println(e);
                registroEquipajeView.mostrarError(e.getMessage());
            }

        }
    }
}
