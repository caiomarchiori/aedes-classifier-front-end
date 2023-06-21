package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AlterarHospedesView extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;

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
		lblCodigo.setBounds(253, 23, 27, 14);
		textField = new JTextField();
		textField.setBounds(290, 20, 46, 20);
		textField.setColumns(10);
		contentPane.add(textField);
			
		JButton btnNewButton = new JButton("Editar");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//alterarItem();
			System.out.println("testing");
		}
		});
			
		btnNewButton.setBounds(261, 123, 145, 23);
		contentPane.add(btnNewButton);

		contentPane.add(lblCodigo);
			
		JLabel lblCodigo_1 = new JLabel("Nome");
		lblCodigo_1.setBounds(10, 82, 33, 14);
		contentPane.add(lblCodigo_1);
			
		JLabel lblCodigo_2 = new JLabel("Telefone");
		lblCodigo_2.setBounds(10, 120, 57, 14);
		contentPane.add(lblCodigo_2);
			
		JLabel lblCodigo_3 = new JLabel("Email");
		lblCodigo_3.setBounds(10, 46, 33, 14);
		contentPane.add(lblCodigo_3);
			
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(59, 79, 116, 20);
		contentPane.add(textField_1);
			
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(81, 117, 116, 20);
		contentPane.add(textField_2);
			
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(48, 43, 116, 20);
		contentPane.add(textField_3);
			
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				Item item = itemController.buscarItemCodigo(textField.getText());
				if(item!=null) {
					textField_1.setText(item.getNome());
					textField_2.setText(item.getDescricao());
					textField_3.setText(""+item.getPreco());
				}
				*/
				System.out.println("testing");
			}
		});
		btnBuscar.setBounds(346, 19, 78, 23);
		contentPane.add(btnBuscar);	
	}
	
	public void alterarAcomodacao() {
		/*
		String codigo = textField.getText();
		String nome = textField_1.getText();
		String descricao = textField_2.getText();
		String preco = textField_3.getText();

		itemController.editarItem(codigo,nome,descricao,preco);
		*/
		System.out.println("testing");
	}
}

