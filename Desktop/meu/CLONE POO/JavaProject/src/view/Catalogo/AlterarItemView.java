package view.Catalogo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Item;
import controller.ItemController;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class AlterarItemView extends JFrame{

	private JPanel contentPane;
	private JTextField textField;

	ItemController itemController = new ItemController();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public AlterarItemView(){

		setTitle("Edicao de itens");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(33, 46, 46, 14);
		textField = new JTextField();
		textField.setBounds(104, 43, 116, 20);
		textField.setColumns(10);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Editar item");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alterarItem();
			}
		});
		
		btnNewButton.setBounds(279, 118, 145, 23);
		contentPane.add(btnNewButton);
		
		
		contentPane.add(lblCodigo);
		
		JLabel lblCodigo_1 = new JLabel("Nome");
		lblCodigo_1.setBounds(33, 93, 46, 14);
		contentPane.add(lblCodigo_1);
		
		JLabel lblCodigo_2 = new JLabel("Descricao");
		lblCodigo_2.setBounds(33, 141, 46, 14);
		contentPane.add(lblCodigo_2);
		
		JLabel lblCodigo_3 = new JLabel("Preco");
		lblCodigo_3.setBounds(33, 187, 46, 14);
		contentPane.add(lblCodigo_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(104, 90, 116, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(104, 138, 116, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(104, 184, 116, 20);
		contentPane.add(textField_3);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Item item = itemController.buscarItemCodigo(textField.getText());
				if(item!=null) {
					textField_1.setText(item.getNome());
					textField_2.setText(item.getDescricao());
					textField_3.setText(""+item.getPreco());
				}
			}
		});
		btnBuscar.setBounds(279, 71, 145, 23);
		contentPane.add(btnBuscar);
	}

	public void alterarItem() {
		String codigo = textField.getText();
		String nome = textField_1.getText();
		String descricao = textField_2.getText();
		String preco = textField_3.getText();

		itemController.editarItem(codigo,nome,descricao,preco);
	}
}
