package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Item;
import controller.ItemController;

import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class ItemView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ItemView frame = new ItemView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ItemView() {
		ItemController itemController = new ItemController();
		setTitle("Catalogo de itens");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 123, 347, -104);
		contentPane.add(scrollPane);
		
		JButton btnNewButton = new JButton("Adicionar item");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textField.getText();
				long codigo = Long.parseLong(textField_1.getText());
				String descricao = textField_2.getText();
				double preco = Double.parseDouble(textField_3.getText());
				Item item = new Item(nome,codigo,descricao,preco);
				itemController.adicionarItem(item);
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
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
		
		textField_3 = new JTextField();
		textField_3.setBounds(33, 198, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(33, 15, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo");
		lblNewLabel_1.setBounds(33, 70, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Descrição");
		lblNewLabel_1_1.setBounds(33, 125, 60, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Preço");
		lblNewLabel_1_1_1.setBounds(33, 180, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		
		JButton btnNewButton2 = new JButton("Listar itens");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,itemController.listarItens());
			}
		});
		btnNewButton2.setBounds(198, 80, 145, 23);
		contentPane.add(btnNewButton2);
		
		
		
		//CRIAR UM CONJUNTO DE BOTOES, BOTAO CADASTRO,BOTAO LISTAR...
		JButton btntest = new JButton("Teste botoes separados");
		btntest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("testing");
			}
		});
		btntest.setBounds(198, 190, 175, 23);
		contentPane.add(btntest);
	}
	
	
}
