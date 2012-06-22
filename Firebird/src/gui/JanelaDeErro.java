package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaDeErro extends JFrame {

	
	String mensagemErro;
	public JanelaDeErro(String mensagemErro){
		this.mensagemErro = mensagemErro;
		
		this.setBounds(400, 200, 310, 110);
		//Layout null eh pra eu poder colocar componentes onde eu quiser
		this.setLayout(null);
		//muda a cor do fundo
		this.getContentPane().setBackground(Color.WHITE);
		//titulo
		this.setTitle("ERRO");
		this.setFont(new Font("Comic Sans MS", 1, 11));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		JLabel labelErro = new JLabel(this.mensagemErro);		
		labelErro.setBounds(70, 20, 170, 20);
		labelErro.setFont(new Font("Comic Sans MS", 1, 14));
		
		this.add(labelErro);
		
	}
	
	
	
	
}
