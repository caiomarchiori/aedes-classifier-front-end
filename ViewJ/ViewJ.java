package ViewJ;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewJ extends JFrame {
	public ViewJ() {
		initialize();
	}
	
	private JPanel panel1;
	private JButton b1;
	private JButton b2;
	private TextField tf;
	private Label label;
	private TextArea ta;
	
	public void initialize() {
		setTitle("MyFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		setLayout(new BorderLayout());
		setVisible(true);
		
		panel1 = new JPanel();
		
		label = new Label("Nome");
		b1 = new JButton("Salvar");
		tf = new TextField("");
		tf.setColumns(20);
		ta = new TextArea();
		b2 = new JButton("Listar");
		
		panel1.add(label);
		panel1.add(tf);
		panel1.add(b1,BorderLayout.LINE_END);
		panel1.setLayout(new FlowLayout());
		this.add(ta);
		this.add(b2,BorderLayout.LINE_END);
		this.add(panel1,BorderLayout.PAGE_START);
		this.setVisible(true);
	}
	
}
