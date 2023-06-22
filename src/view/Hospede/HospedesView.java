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

public class HospedesView extends JFrame{

	private JPanel contentPane;
	private JPanel contentPane2;
	
	public HospedesView() {

		setTitle("Menu de hospedes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 123, 347, -104);
		contentPane.add(scrollPane);
		
		JButton btnNewButton = new JButton("Adicionar/Listar Hospedes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CriarHospedesView criar = new CriarHospedesView();
				criar.setVisible(true);

			}
		});
		btnNewButton.setBounds(127, 45, 145, 23);
		contentPane.add(btnNewButton);

		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarHospedesView alterar = new AlterarHospedesView();
				alterar.setVisible(true);
			}
		});
		btnEditar.setBounds(127, 110, 145, 23);
		contentPane.add(btnEditar);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ApagarHospedesView apagar = new ApagarHospedesView();
				apagar.setVisible(true);
			}
		});
		btnApagar.setBounds(127, 180, 145, 23);
		contentPane.add(btnApagar);
	}

}
