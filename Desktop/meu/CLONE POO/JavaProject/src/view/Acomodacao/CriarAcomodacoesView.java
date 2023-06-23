package view.Acomodacao;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CriarAcomodacoesView extends JFrame{
	
	private JPanel contentPane;
	private JTextField txt_tipoAcomodacao;
	private JTextField txt_tarifa;
	private JTextField txt_adicional;
	private JTextField txt_ocupacao;
	private JTextField txt_numero;

	public CriarAcomodacoesView() {
		setTitle("Adicionar acomodacoes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 123, 347, -104);
		contentPane.add(scrollPane);

		txt_tipoAcomodacao = new JTextField();
		txt_tipoAcomodacao.setBounds(33, 36, 86, 20);
		contentPane.add(txt_tipoAcomodacao);
		txt_tipoAcomodacao.setColumns(10);
		
		txt_tarifa = new JTextField();
		txt_tarifa.setBounds(33, 107, 86, 20);
		contentPane.add(txt_tarifa);
		txt_tarifa.setColumns(10);
		
		txt_adicional = new JTextField();
		txt_adicional.setBounds(253, 107, 86, 20);
		contentPane.add(txt_adicional);
		txt_adicional.setColumns(10);
		
		txt_ocupacao = new JTextField();
		txt_ocupacao.setBounds(33, 178, 86, 20);
		contentPane.add(txt_ocupacao);
		txt_ocupacao.setColumns(10);

		
		JLabel lblNewLabel = new JLabel("Tipo Acomodacao");	// STRING
		lblNewLabel.setBounds(33, 15, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tarifa diária");	// DOUBLE
		lblNewLabel_1.setBounds(33, 82, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Adicional por acompanhante");	// DOUBLE
		lblNewLabel_2.setBounds(253, 82, 171, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ocupacao maxima");	// INT
		lblNewLabel_3.setBounds(33, 153, 125, 14);
		contentPane.add(lblNewLabel_3);
		
		txt_numero = new JTextField();
		txt_numero.setColumns(10);
		txt_numero.setBounds(253, 36, 86, 20);
		contentPane.add(txt_numero);
		
		JLabel lblNewLabel_4 = new JLabel("Numero");	// INT
		lblNewLabel_4.setBounds(253, 15, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionInserir();
			}
		});
		btnNewButton.setBounds(253, 177, 89, 23);
		contentPane.add(btnNewButton);
	}
	private void actionInserir() {
		
	}
	
}
