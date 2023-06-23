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

public class AlterarAcomodacoesView extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;

	public AlterarAcomodacoesView() {
		setTitle("Editar Acomodacoes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 123, 347, -104);
		contentPane.add(scrollPane);

		JLabel lblCodigo = new JLabel("Numero");
		lblCodigo.setBounds(10, 23, 46, 14);
		textField = new JTextField();
		textField.setBounds(58, 20, 46, 20);
		textField.setColumns(10);
		contentPane.add(textField);
			
		JButton btnNewButton = new JButton("Editar");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//alterarItem();
			System.out.println("testing");
		}
		});
			
		btnNewButton.setBounds(279, 206, 145, 23);
		contentPane.add(btnNewButton);

		contentPane.add(lblCodigo);
			
		JLabel lblCodigo_1 = new JLabel("Nome");
		lblCodigo_1.setBounds(10, 74, 46, 14);
		contentPane.add(lblCodigo_1);
			
		JLabel lblCodigo_2 = new JLabel("Tarifa diária");
		lblCodigo_2.setBounds(10, 123, 94, 14);
		contentPane.add(lblCodigo_2);
			
		JLabel lblCodigo_3 = new JLabel("Adicional por pessoa");
		lblCodigo_3.setBounds(187, 74, 122, 14);
		contentPane.add(lblCodigo_3);
			
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(48, 71, 116, 20);
		contentPane.add(textField_1);
			
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(91, 120, 73, 20);
		contentPane.add(textField_2);
			
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(318, 71, 116, 20);
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
		btnBuscar.setBounds(115, 19, 78, 23);
		contentPane.add(btnBuscar);
		
		JLabel lblCodigo_1_1 = new JLabel("Ocupacao maxima");
		lblCodigo_1_1.setBounds(187, 123, 110, 14);
		contentPane.add(lblCodigo_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(307, 120, 78, 20);
		contentPane.add(textField_5);
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
