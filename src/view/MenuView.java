package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuView extends JFrame {

	private JPanel contentPane;

	public MenuView() {
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Checkin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botao de checkin");
			}
		});
		btnNewButton.setBounds(10, 59, 139, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Escolha sua opcao");
		lblNewLabel.setBounds(163, 23, 128, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnCheckout = new JButton("Checkout");
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botao de checkout");
			}
		});
		btnCheckout.setBounds(283, 59, 139, 23);
		contentPane.add(btnCheckout);
		
		JButton btnCheckout_1 = new JButton("Acomodacoes");
		btnCheckout_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				AcomodacoesView acomodacao = new AcomodacoesView();
				acomodacao.setVisible(true);
=======
				TipoAcomodacaoView tipoAcomodacaoView = new TipoAcomodacaoView();
				tipoAcomodacaoView.setVisible(true);
>>>>>>> 9ae4267cdb33570a97af8a95189ac6c5d333c2fa
			}
		});
		btnCheckout_1.setBounds(10, 118, 139, 23);
		contentPane.add(btnCheckout_1);
		
		JButton btnCheckout_1_1 = new JButton("Catalogo");
		btnCheckout_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CatalogoView catalogo = new CatalogoView();
				catalogo.setVisible(true);
			}
		});
		btnCheckout_1_1.setBounds(283, 118, 139, 23);
		contentPane.add(btnCheckout_1_1);
		
		JButton btnCheckout_1_2 = new JButton("Conta");
		btnCheckout_1_2.setBounds(10, 189, 139, 23);
		contentPane.add(btnCheckout_1_2);
		
		JButton btnCheckout_1_2_1 = new JButton("Hospedes");
		btnCheckout_1_2_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			HospedesView hospedesView = new HospedesView();
			hospedesView.setVisible(true);
		}
		});
		btnCheckout_1_2_1.setBounds(283, 189, 139, 23);
		contentPane.add(btnCheckout_1_2_1);
	}
}
