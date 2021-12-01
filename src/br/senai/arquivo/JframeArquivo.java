package br.senai.arquivo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JframeArquivo extends JFrame {

	private JPanel contentPane;

	public JframeArquivo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 25, 372, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblArquivo = new JLabel("Arquivo");
		lblArquivo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblArquivo.setBounds(171, 11, 64, 22);
		panel.add(lblArquivo);
		
		JLabel lblTexto = new JLabel("Texto:");
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTexto.setBounds(10, 36, 46, 14);
		panel.add(lblTexto);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(23, 92, 372, 92);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTextPane txtpnTexto = new JTextPane();
		panel_1.add(txtpnTexto, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(23, 195, 372, 55);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Arquivo objArquivo = new Arquivo();
				String conteudo = txtpnTexto.getText();
				String caminho = "C:\\Users\\21276663\\Desktop\\Teste\\aula.txt";
				
				String conteudoArquivo = objArquivo.ler(caminho);
				conteudoArquivo += conteudo;
				
				objArquivo.escrever(caminho, conteudoArquivo);
				
			}
		});
		
		btnGravar.setBounds(46, 11, 123, 33);
		panel_2.add(btnGravar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(212, 11, 123, 33);
		panel_2.add(btnLimpar);
	}
}
