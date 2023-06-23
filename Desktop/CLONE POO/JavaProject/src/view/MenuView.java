package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.Acomodacao.AcomodacoesView;
import view.Catalogo.CatalogoView;
import view.Checkin.CheckinView;
import view.Checkout.CheckoutView;
import view.Hospede.HospedesView;

import javax.swing.JLabel;
import javax.swing.JButton;
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
				CheckinView checkin = new CheckinView();
				checkin.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 59, 139, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Escolha sua opcao");
		lblNewLabel.setBounds(163, 23, 128, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnCheckout = new JButton("Checkout"); // PODERIA LEVAR PARA O PAGAMENTO ANTES DE FAZER O CHEKCIN
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckoutView checkout = new CheckoutView();
				checkout.setVisible(true);
			}
		});
		btnCheckout.setBounds(283, 59, 139, 23);
		contentPane.add(btnCheckout);
		
		JButton btnCheckout_1 = new JButton("Acomodacoes");
		btnCheckout_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcomodacoesView acomodacao = new AcomodacoesView();
				acomodacao.setVisible(true);
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