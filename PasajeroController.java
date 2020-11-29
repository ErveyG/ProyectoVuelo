public class PasajeroController {
	private PasajeroView vista;

	public Pasajero creaPasajero(Documentacion documentacion) {
		return new Pasajero(vista.getClaseEntrada(),
				documentacion,
				vista.getEdadEntrada(),
				vista.getNombreEntrada(),
				vista.getSexoEntrada());
	}

	public Pasajero creaPasajero(EnumClase claseVuelo,
								 Documentacion documentacion,
								 int edad,
								 String nombre,
								 String sexo){
		return new Pasajero(claseVuelo,
				documentacion,
				edad,
				nombre,
				sexo);
	}

	public void mostrarVista() throws Exception {
		this.vista = new PasajeroView();
	}
}
