package view.Catalogo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.ItemController;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class ApagarItemView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	ItemController itemController = new ItemController();
	
	public ApagarItemView() {
		setTitle("Apagar itens");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 123, 347, -104);
		contentPane.add(scrollPane);
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(38, 96, 46, 14);
		textField = new JTextField();
		textField.setBounds(90, 93, 116, 20);
		textField.setColumns(10);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Apagar item");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apagarItem(textField.getText());
			}
		});
		btnNewButton.setBounds(267, 92, 145, 23);
		contentPane.add(btnNewButton);
		
		
		contentPane.add(lblCodigo);
		
	}
	
	public void apagarItem(String codigo) {
		itemController.removerItem(codigo);
	}
}
