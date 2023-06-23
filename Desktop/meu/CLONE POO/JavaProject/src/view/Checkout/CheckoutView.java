package view.Checkout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CheckoutView extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	
	public CheckoutView() {
		setTitle("Checkout");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 123, 347, -104);
		contentPane.add(scrollPane);

		textField = new JTextField();
		textField.setBounds(10, 25, 132, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF do titular");
		lblNewLabel.setBounds(10, 5, 113, 14);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Realizar Checkout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("testing");
			}
		});
		btnNewButton.setBounds(184, 24, 147, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton2 = new JButton("Listar consumacao");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionListar();
			}
		});
		btnNewButton2.setBounds(184, 58, 147, 23);
		contentPane.add(btnNewButton2);
		
		JScrollPane scrollPane_2 = new JScrollPane(textArea);
		scrollPane_2.setBounds(129, 92, 295, 158);			
		contentPane.add(scrollPane_2);
		
		textArea = new JTextArea();
		scrollPane_2.setViewportView(textArea);
		textArea.setEditable(false);
		
	}
	
	private void actionListar() {
		/*
		List<String> lista = itemController.getItens();
		textArea.setText(null);

		for (String strItem : lista) {
			textArea.append(String.format("%s\n", strItem));
		}
		*/
		textArea.append("testing\n");
	}
}
