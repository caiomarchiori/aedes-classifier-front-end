package view.Acomodacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;


public class AcomodacoesView extends JFrame{

	private JPanel contentPane;

	public AcomodacoesView() {
		setTitle("Acomodacoes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 123, 347, -104);
		contentPane.add(scrollPane);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Botao de adicionar");
			CriarAcomodacoesView criar = new CriarAcomodacoesView();
			criar.setVisible(true);
		}
		});
		btnNewButton.setBounds(146, 30, 145, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Deletar");
		btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ApagarAcomodacoesView apagar = new ApagarAcomodacoesView();
			apagar.setVisible(true);
		}
		});
		btnNewButton_1.setBounds(146, 134, 145, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Editar");
		btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AlterarAcomodacoesView alterar = new AlterarAcomodacoesView();
			alterar.setVisible(true);
		}
		});
		btnNewButton_2.setBounds(146, 98, 145, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Listar");
		btnNewButton_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ListarAcomodacoesView listar = new ListarAcomodacoesView();
			listar.setVisible(true);
		}
		});
		btnNewButton_3.setBounds(146, 64, 145, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("Tipos Acomodações");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoAcomodacaoView tipoAcomodacaoView = new TipoAcomodacaoView();
				tipoAcomodacaoView.setVisible(true);
			}
		});
		btnNewButton_1_1.setBounds(146, 168, 145, 23);
		contentPane.add(btnNewButton_1_1);
	}
}

