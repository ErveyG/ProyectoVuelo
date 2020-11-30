public class DocumentacionController {
	private DocumentacionNacionalView nacionalVista;
	private DocumentacionInternacionalView internacionalVista;

	public Documentacion creaDocumentacion(RegistroNacionalView registroNacionalView) {
		return new DocumentacionNacional(
						registroNacionalView.getDocNacionalView().getCurpEntrada());
	}

	public Documentacion creaDocumentacion(RegistroInternacionalView registroInternacionalView) {
		return new DocumentacionInternacional(
						registroInternacionalView.getDocInternacionalView().getNumPasaporteEntrada(),
						registroInternacionalView.getDocInternacionalView().getVisaEntrada(),
						registroInternacionalView.getDocInternacionalView().getVigenciaEntrada());
	}
}