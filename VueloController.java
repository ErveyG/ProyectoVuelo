public class VueloController {
	private VueloView vista;

	public Vuelo creaVuelo(String aerolinea,
						   String destino,
						   int numAsiento,
						   int numVuelo,
						   EnumVuelo tipoVuelo
						   ) {
		return new Vuelo(aerolinea,
					destino,
					numAsiento,
					numVuelo,
					tipoVuelo);
	}

	public void mostrarVista() throws Exception {
		this.vista = new VueloView();
	}
}
