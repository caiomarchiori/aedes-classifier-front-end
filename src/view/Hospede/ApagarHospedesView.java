package view.Hospede;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.HospedeController;

public class ApagarHospedesView extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	private HospedeController hospedeController = new HospedeController();
	
	public ApagarHospedesView() {
	
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
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setBounds(91, 95, 44, 14);
		textField = new JTextField();
		textField.setBounds(129, 92, 115, 20);
		textField.setColumns(10);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Apagar hospede");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hospedeController.removerHospede(textField.getText());
				System.out.println("Testing");
			}
		});
		btnNewButton.setBounds(279, 91, 145, 23);
		contentPane.add(btnNewButton);
		contentPane.add(lblCPF);
	}
	
	/*
	public void apagarAcomodacao(String codigo) {
		itemController.removerItem(codigo);
	}
	*/
}
