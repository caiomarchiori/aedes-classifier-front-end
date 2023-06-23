package view.Hospede;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Model.Item;
import controller.HospedeController;
import controller.ItemController;

public class CriarHospedesView extends JFrame{
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextArea textArea;
	
	private HospedeController hospedeController = new HospedeController();
	
	public CriarHospedesView() {

		setTitle("Adicionar hospedes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 123, 347, -104);
		contentPane.add(scrollPane);

		textField = new JTextField();
		textField.setBounds(10, 30, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 79, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 189, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 133, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		
		JLabel lblNewLabel = new JLabel("Nome");	// STRING
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");	// LONG
		lblNewLabel_1.setBounds(10, 61, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");	// STRING
		lblNewLabel_2.setBounds(10, 164, 171, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Telefone");	// LONG
		lblNewLabel_3.setBounds(10, 110, 125, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			hospedeController.adicionarHospede(textField.getText(),textField_1.getText(),textField_3.getText(),textField_2.getText());
		}
		});
		btnNewButton.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton2 = new JButton("Listar hospedes");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListar();
			}
		});
		btnNewButton2.setBounds(210, 52, 145, 23);
		contentPane.add(btnNewButton2);
		
		JScrollPane scrollPane_2 = new JScrollPane(textArea);
		scrollPane_2.setBounds(129, 92, 295, 158);			
		contentPane.add(scrollPane_2);
		
		textArea = new JTextArea();
		scrollPane_2.setViewportView(textArea);
		textArea.setEditable(false);
	}

	private void actionListar() {
		textArea.append("LISTAGEM DE HOSPEDES");
		List<String> lista = hospedeController.getHospedes();
		textArea.setText(null);
		
		for (String strHospede : lista) {
			textArea.append(String.format("%s\n", strHospede));
		}
		
	}
}
