package view.Acomodacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.TipoAcomodacao;
import controller.AcomodacaoController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class AlterarTipoAcomodacaoView extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	AcomodacaoController AcomodacaoController = new AcomodacaoController();
	
	public AlterarTipoAcomodacaoView(){

		setTitle("Edicao de itens");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Nome");
		lblCodigo.setBounds(33, 46, 46, 14);
		textField = new JTextField();
		textField.setBounds(104, 43, 116, 20);
		textField.setColumns(10);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Editar tipo acomodação");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alterarTipoAcomodacao();
			}
		});
		
		btnNewButton.setBounds(279, 118, 145, 23);
		contentPane.add(btnNewButton);
		
		
		contentPane.add(lblCodigo);
		
		JLabel lblCodigo_1 = new JLabel("Tarifa Diaria");
		lblCodigo_1.setBounds(33, 93, 46, 14);
		contentPane.add(lblCodigo_1);
		
		JLabel lblCodigo_2 = new JLabel("Adicional Acompanhante");
		lblCodigo_2.setBounds(33, 141, 46, 14);
		contentPane.add(lblCodigo_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(104, 90, 116, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(104, 138, 116, 20);
		contentPane.add(textField_2);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoAcomodacao tipoAcomodacao = AcomodacaoController.buscarTipoAcomodacao(textField.getText());
				if(tipoAcomodacao!=null) {
					textField_1.setText(""+tipoAcomodacao.getTarifaDiaria());
					textField_2.setText(""+tipoAcomodacao.getAdicionalAcompanhante());
				}
			}
		});
		btnBuscar.setBounds(279, 71, 145, 23);
		contentPane.add(btnBuscar);
	}

	public void alterarTipoAcomodacao() {
		String nome = textField.getText();
		String tarifaDiaria = textField_1.getText();
		String adicionalAcompanhante = textField_2.getText();
		AcomodacaoController.editarTipoAcomodacao(nome,tarifaDiaria,adicionalAcompanhante);
	}
}
