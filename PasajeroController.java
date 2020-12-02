public class PasajeroController {
	private PasajeroView vista;

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
}
