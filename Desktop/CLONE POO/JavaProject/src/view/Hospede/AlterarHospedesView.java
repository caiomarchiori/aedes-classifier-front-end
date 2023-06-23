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

import Model.Hospede;
import controller.HospedeController;

public class AlterarHospedesView extends JFrame{

	private JPanel contentPane;
	private JTextField txt_cpf;
	private JTextField txt_tel;
	private JTextField txt_email;
	private JTextField textField_5;

	private HospedeController hospedeController = new HospedeController();
	
	public AlterarHospedesView() {
		setTitle("Editar hospedes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 123, 347, -104);
		contentPane.add(scrollPane);

		JLabel lblCodigo = new JLabel("CPF");
		lblCodigo.setBounds(10, 23, 27, 14);
		txt_cpf = new JTextField();
		txt_cpf.setBounds(38, 20, 145, 20);
		txt_cpf.setColumns(10);
		contentPane.add(txt_cpf);
			
		JButton btnNewButton = new JButton("Editar");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			alterarHospede();
		}
		});
			
		btnNewButton.setBounds(196, 94, 75, 23);
		contentPane.add(btnNewButton);

		contentPane.add(lblCodigo);
			
		JLabel lblCodigo_2 = new JLabel("Telefone");
		lblCodigo_2.setBounds(10, 98, 57, 14);
		contentPane.add(lblCodigo_2);
			
		JLabel lblCodigo_3 = new JLabel("Email");
		lblCodigo_3.setBounds(10, 69, 33, 14);
		contentPane.add(lblCodigo_3);
			
		txt_tel = new JTextField();
		txt_tel.setColumns(10);
		txt_tel.setBounds(63, 94, 120, 20);
		contentPane.add(txt_tel);
			
		txt_email = new JTextField();
		txt_email.setColumns(10);
		txt_email.setBounds(38, 66, 145, 20);
		contentPane.add(txt_email);
			
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionBuscar(txt_cpf.getText());
			}
		});
		btnBuscar.setBounds(193, 19, 78, 23);
		contentPane.add(btnBuscar);	
	}
	
	public void actionBuscar(String cpf) {
		Hospede hospede = hospedeController.buscarHospedeCPF(cpf);
		if(hospede!=null) {
			txt_cpf.setText(""+hospede.getCpf());
			txt_email.setText(hospede.getEmail());
			txt_tel.setText(""+hospede.getTelefone());
		}
	}
	
	public void alterarHospede() {
		
		String cpf = txt_cpf.getText();
		String email = txt_email.getText();
		String telefone = txt_tel.getText();

		hospedeController.editarHospede(cpf,email,telefone);
		
	}
}

