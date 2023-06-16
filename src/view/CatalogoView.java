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

public class CatalogoView extends JFrame {

	private JPanel contentPane;
	
	private JPanel contentPane2;

	ItemController itemController = new ItemController();
	
	public CatalogoView() {
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
		
		JButton btnNewButton = new JButton("Adicionar/Listar item");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CriarItemView criarItem = new CriarItemView();
				criarItem.setVisible(true);
			}
		});
		btnNewButton.setBounds(127, 30, 145, 23);
		contentPane.add(btnNewButton);
		
		
		
		//CRIAR UM CONJUNTO DE BOTOES, BOTAO CADASTRO,BOTAO LISTAR...
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("testing");
			}
		});
		btnEditar.setBounds(127, 64, 145, 23);
		contentPane.add(btnEditar);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ApagarItemView apagar = new ApagarItemView();
				apagar.setVisible(true);
			}
		});
		btnApagar.setBounds(127, 98, 145, 23);
		contentPane.add(btnApagar);
	}	
}
