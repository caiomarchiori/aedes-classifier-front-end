package view.Acomodacao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TipoAcomodacaoView extends JFrame {

	private JPanel contentPane;;
	
	public TipoAcomodacaoView() {
		setTitle("Tipo de Acomodações");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 123, 347, -104);
		contentPane.add(scrollPane);
		
		JButton btnNewButton = new JButton("Adicionar/Listar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CriarTipoAcomodacaoView criarTipoAcomodacao = new CriarTipoAcomodacaoView();
				criarTipoAcomodacao.setVisible(true);
			}
		});
		btnNewButton.setBounds(127, 45, 145, 23);
		contentPane.add(btnNewButton);

		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarTipoAcomodacaoView alterar = new AlterarTipoAcomodacaoView();
				alterar.setVisible(true);
			}
		});
		btnEditar.setBounds(127, 110, 145, 23);
		contentPane.add(btnEditar);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ApagarTipoAcomodacaoView apagar = new ApagarTipoAcomodacaoView();
				apagar.setVisible(true);
			}
		});
		btnApagar.setBounds(127, 180, 145, 23);
		contentPane.add(btnApagar);
	}
}
