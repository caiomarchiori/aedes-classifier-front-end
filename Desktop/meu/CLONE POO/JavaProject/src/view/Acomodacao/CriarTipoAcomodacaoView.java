package view.Acomodacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AcomodacaoController;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class CriarTipoAcomodacaoView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextArea textArea;

	AcomodacaoController AcomodacaoController = new AcomodacaoController();
	
	public CriarTipoAcomodacaoView() {
		setTitle("Tipos de acomodacoes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 123, 347, -104);
		contentPane.add(scrollPane);
		
		JButton btnNewButton = new JButton("Adicionar Tipo de acomodacao");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarTipoAcomodacao();
				limparCampos();
			}
		});
		btnNewButton.setBounds(198, 30, 145, 23);
		contentPane.add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(33, 36, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(33, 92, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(33, 145, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(33, 15, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tarifa Diaria");
		lblNewLabel_1.setBounds(33, 70, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Adicional Acompanhante");
		lblNewLabel_1_1.setBounds(33, 125, 60, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton2 = new JButton("Listar os Tipode de acomodacoes");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListar();
			}
		});
		btnNewButton2.setBounds(198, 64, 145, 23);
		contentPane.add(btnNewButton2);
		
		JScrollPane scrollPane_2 = new JScrollPane(textArea);
		scrollPane_2.setBounds(129, 92, 295, 158);			
		contentPane.add(scrollPane_2);
		
		textArea = new JTextArea();
		scrollPane_2.setViewportView(textArea);
		textArea.setEditable(false);
		
	}
	
	public void adicionarTipoAcomodacao() {
		AcomodacaoController.adicionarTipoAcomodacao(textField.getText(),textField_1.getText(),textField_2.getText());
		limparCampos();
	}
	
	
	private void actionListar() {
		List<String> lista = AcomodacaoController.getTiposAcomodacao();
		textArea.setText(null);

		for (String strTipoAcomodacao : lista) {
			textArea.append(String.format("%s\n", strTipoAcomodacao));
		}
	}
	
	public void limparCampos() {
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
	}
	
}
