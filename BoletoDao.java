import java.io.*;

class BoletoDao {
	private ObjectOutputStream salida;
	private ObjectInputStream entrada;

	public void guardar (Boleto boleto) throws Exception {
		try {
			String nombrePasajeroBoleto = boleto.getPasajero ()
				.getNombre ()
				.replace (" ", "");
			String tipoVueloBoleto = boleto.getVuelo ()
				.getTipo ()
				.toString ()
				.toLowerCase ();
			String archivo = String.format ("%s_%s.vuelo",
					tipoVueloBoleto,
					nombrePasajeroBoleto);
			this.salida = new ObjectOutputStream (
					new FileOutputStream (archivo));
			this.salida.writeObject (boleto);
			this.salida.close ();
		} catch (IOException e) {
			throw new Exception ("!Error! No se ha podido guardar el archivo.");
		}
	}

	public Boleto cargar (String nombrePasajeroBoleto, EnumVuelo tipoVueloBoleto) throws Exception {
		Boleto boleto;
		String tipoVueloBoletoAux = tipoVueloBoleto.toString ()
			.toLowerCase ();
		nombrePasajeroBoleto = nombrePasajeroBoleto.replace (" ", "");
		String archivo = String.format ("%s_%s.vuelo",
				tipoVueloBoletoAux,
				nombrePasajeroBoleto);
		try {
			this.entrada = new ObjectInputStream (
					new FileInputStream (archivo));
			boleto = (Boleto) this.entrada.readObject ();
			this.entrada.close ();
			return boleto;
		} catch (IOException e) {
			throw new Exception ("¡Error! No se ha podido cargar el archivo.");
		} catch (ClassNotFoundException e) {
			throw new Exception ("¡Error! No se ha podido cargar el archivo.");
		}
	}

	public void eliminar (String nombrePasajeroBoleto, EnumVuelo tipoVueloBoleto) throws Exception {
		String tipoVueloBoletoAux = tipoVueloBoleto.toString ()
			.toLowerCase ();
		nombrePasajeroBoleto = nombrePasajeroBoleto.replace (" ", "");
		String archivo = String.format ("%s_%s.vuelo",
				tipoVueloBoletoAux,
				nombrePasajeroBoleto);
		try {
			File f = new File (archivo);
			f.delete ();
		} catch (Exception e) {
			throw new Exception ("¡Error! No se ha podido eliminar el archivo.");
		}
	}
}
