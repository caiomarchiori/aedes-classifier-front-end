package view.Acomodacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ApagarAcomodacoesView extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	
	public ApagarAcomodacoesView() {
	
		setTitle("Apagar acomodacoes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 123, 347, -104);
		contentPane.add(scrollPane);
		JLabel lblNumero = new JLabel("Numero da acomodacao");
		lblNumero.setBounds(10, 95, 142, 14);
		textField = new JTextField();
		textField.setBounds(162, 92, 71, 20);
		textField.setColumns(10);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Apagar item");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//apagarItem(textField.getText());
				System.out.println("Testing");
			}
		});
		btnNewButton.setBounds(279, 91, 145, 23);
		contentPane.add(btnNewButton);
		
		
		contentPane.add(lblNumero);
	}
	
	/*
	public void apagarAcomodacao(String codigo) {
		itemController.removerItem(codigo);
	}
	*/
}
