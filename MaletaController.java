public class MaletaController {
	private MaletaView vista;

	public Maleta creaMaleta(double peso){
		return new Maleta(peso);
	}

	public Maleta creaMaleta() {
		return new Maleta(this.vista.getPesoMaletaEntrada());
	}
	public void mostrarVista() throws Exception {
		this.vista = new MaletaView();
	}
}
