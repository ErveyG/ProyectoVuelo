import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.nio.ByteOrder;
import java.util.Scanner;

public class DocumentacionInternacionalView extends JPanel {
	private JLabel numPasaporteLabel = new JLabel("Número de Pasaporte: ");
	private JLabel tipoVisaLabel = new JLabel("Tipo de Visa: ");
	private JLabel vigenciaLabel = new JLabel("Vigencia: ");
	private JTextField numPasaporteTextField = new JTextField(20);
	private JComboBox<String> tipoVisaComboBox = new JComboBox<>();
	private JTextField vigenciaTextField = new JTextField(20);

	private int numPasaporteEntrada;
	private EnumVisa visaEntrada;
	private int vigenciaEntrada;

	public int getVigenciaEntrada() {
		return vigenciaEntrada = Integer.parseInt(vigenciaTextField.getText()) ;
	}

	public EnumVisa getVisaEntrada() {
		return visaEntrada = EnumVisa.valueOf((String)tipoVisaComboBox.getSelectedItem());
	}

	public int getNumPasaporteEntrada(){
		return numPasaporteEntrada = Integer.parseInt(numPasaporteTextField.getText());
	}


	public DocumentacionInternacionalView(){
		this.setLayout(new GridBagLayout());
		this.setBackground(Color.decode("#2299f0"));
		tipoVisaComboBox.setModel(new DefaultComboBoxModel<>(
				new String[] { "TURISTA", "TRABAJO", "ATENCION_MEDICA" }));

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(10, 10, 10, 10);

		constraints.gridx = 0;
		constraints.gridy = 0;
		this.add(numPasaporteLabel,constraints);

		constraints.gridx = 1;
		this.add(numPasaporteTextField,constraints);

		constraints.gridx = 0;
		constraints.gridy = 1;
		this.add(vigenciaLabel,constraints);

		constraints.gridx = 1;
		this.add(vigenciaTextField,constraints);

		constraints.gridx = 0;
		constraints.gridy = 2;
		this.add(tipoVisaLabel,constraints);

		constraints.gridx = 1;
		this.add(tipoVisaComboBox,constraints);

		this.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "DocumentacionInternacionalView"));
	}
}