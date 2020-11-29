import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroNacionalController {
    private RegistroNacionalView registroNacionalView;
    private VueloController vueloController = new VueloController();
    private DocumentacionController documentacionController = new DocumentacionController();
    private PasajeroController pasajeroController = new PasajeroController();
    private MaletaController maletaController = new MaletaController();

    Vuelo vuelo;
    Documentacion documentacion;
    Pasajero pasajero;
    Maleta maleta;
    Boleto boleto;

    public RegistroNacionalController(RegistroNacionalView registroNacionalView){
        this.registroNacionalView = registroNacionalView;
        this.registroNacionalView.addEnviarBoton(new EnviarListener());
    }

    class EnviarListener implements ActionListener{
        public void actionPerformed(ActionEvent event){

            try{
                vuelo = vueloController.creaVuelo(registroNacionalView.getVueloView().getAerolineaVueloEntrada(),
                        registroNacionalView.getVueloView().getDestinoVueloEntrada(),
                        registroNacionalView.getVueloView().getNumAsientoVueloEntrada(),
                        registroNacionalView.getVueloView().getNumeroVueloEntrada(),
                        registroNacionalView.getVueloView().getTipoVueloEntrada());

                documentacion = documentacionController.creaDocumentacion(registroNacionalView);

                pasajero = pasajeroController.creaPasajero(documentacion);

                boleto = new Boleto(pasajero,vuelo);

                JOptionPane.showMessageDialog(null,"success");

            }
            catch (Exception e){
                System.out.println(e);
                registroNacionalView.mostrarError("Algún error ocurrió...");
            }
        }
    }
}
