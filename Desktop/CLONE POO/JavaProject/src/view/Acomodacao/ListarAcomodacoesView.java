package view.Acomodacao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ListarAcomodacoesView extends JFrame{

	private JPanel contentPane;
	private JTextArea textArea;

	public ListarAcomodacoesView() {
	
		setTitle("Listar Acomodacoes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane_2 = new JScrollPane(textArea);
		scrollPane_2.setBounds(38, 34, 367, 194);			
		contentPane.add(scrollPane_2);
		
		textArea = new JTextArea();
		scrollPane_2.setViewportView(textArea);
		textArea.setEditable(false);
		
		textArea.setText(null);
		textArea.append("LISTAGEM DE HOSPEDAGEM");
	}
	/*
	private void action() {
		List<String> lista = itemController.getItens();
		textArea.setText(null);

		for (String strItem : lista) {
			textArea.append(String.format("%s\n", strItem));
		}
	}
	*/
}
