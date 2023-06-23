package view.Checkin;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class CheckinView extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public CheckinView() {
		setTitle("Checkin");
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
		textField.setBounds(33, 36, 132, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(229, 36, 195, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(33, 112, 132, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF do titular"); //TERIA QUE PUXAR A CONTA ASSOCIADA A ELE TB
		lblNewLabel.setBounds(33, 15, 113, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Acomodacao desejada");
		lblNewLabel_1.setBounds(229, 15, 156, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPF dos acompanhantes");
		lblNewLabel_1_1.setBounds(33, 87, 157, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Realizar Checkin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("testing");
			}
		});
		btnNewButton.setBounds(238, 111, 147, 23);
		contentPane.add(btnNewButton);
		
	}
}
