package View;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {

	private JFrame frame;
	private JPanel panel;
	private JButton btn;
	private JLabel[] label = new JLabel[2];
	private JLabel rezLabel;
	private JTextField textPol1, textPol2;
	private static final String comboBoxItems[] = {"Adunare", "Scadere", "Inmultire", "Derivare", "Integrare"};
	private JComboBox cb;
	
	
	public GUI() {
		frame = new JFrame("Polinoame");
		panel = new JPanel();
		btn = new JButton("Calculeaza rezultat");
		cb = new JComboBox(comboBoxItems);
		rezLabel = new JLabel();
		textPol1 = new JTextField(30);
		textPol2 = new JTextField(30);
		label[0] = new JLabel("P1:");
		label[1] = new JLabel("P2:");
		
		
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.add(panel);
		
		panel.add(label[0]);
		panel.add(textPol1);
		panel.add(label[1]);
		panel.add(textPol2);
		panel.add(cb);
		panel.add(btn);
		panel.add(rezLabel);
	}
	
	
	public JComboBox getCombo() {
		return this.cb;
	}
	
	public JButton getBtn() {
		return this.btn;
	}
	
	public JTextField getText1() {
		return this.textPol1;
	}
	
	public JTextField getText2() {
		return this.textPol2;
	}
	
	public JLabel getRezLabel() {
		return this.rezLabel;
	}
	
	public void resetTextFields() {
		this.textPol1.setText("");
		this.textPol2.setText("");
	}
	
}
