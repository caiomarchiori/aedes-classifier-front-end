package view.Acomodacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Item;
import controller.ItemController;
import controller.AcomodacaoController;

import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JScrollBar;

public class ApagarTipoAcomodacaoView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	private AcomodacaoController AcomodacaoController = new AcomodacaoController();
	
	public ApagarTipoAcomodacaoView() {
		setTitle("Apagar Tipo acomodação");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 123, 347, -104);
		contentPane.add(scrollPane);
		JLabel lblCodigo = new JLabel("Nome");
		lblCodigo.setBounds(38, 96, 46, 14);
		textField = new JTextField();
		textField.setBounds(90, 93, 116, 20);
		textField.setColumns(10);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Apagar Tipo Acomodacao");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apagarTipoAcomodacao(textField.getText());
			}
		});
		btnNewButton.setBounds(267, 92, 145, 23);
		contentPane.add(btnNewButton);
		
		
		contentPane.add(lblCodigo);
		
	}
	
	public void apagarTipoAcomodacao(String nome) {
		AcomodacaoController.apagarTipoAcomodacao(nome);
	}
}
