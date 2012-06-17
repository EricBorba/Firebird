package gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import javax.swing.BoundedRangeModel;
import javax.swing.BoxLayout;

import org.firebirdsql.jdbc.FirebirdConnection;

import Conexao.Conexao;
import Conexao.Controle;



public class Janelalogar extends JFrame {

	JTextField escreverCPF;
	JPasswordField escreverSenha;
	JLabel CPF;
	JLabel senha;
	JLabel aviao;
	JButton jButton1;
	JButton jButton2;
	
	


	public Janelalogar(){
	
	}
	
	
//	public MaskFormatter createFormatter(String s) {
//		MaskFormatter formatter = null;
//		try {
//			formatter = new MaskFormatter(s);
//		} catch (java.text.ParseException exc) {
//			System.err.println("Formato errado: " + exc.getMessage());
//			System.exit(-1);
//		}
//		return formatter;
//	}
	


	// construindo janela
	public void setJanelaInicial(){
		//seta tamanho e posicao
		this.setBounds(400, 200, 300, 360);
		//Layout null eh pra eu poder colocar componentes onde eu quiser
		this.setLayout(null);
		//muda a cor do fundo
		this.getContentPane().setBackground(Color.WHITE);
		//titulo
		this.setTitle("SISTEMA DE RESERVA DE PASSAGEM AEREA");
		this.setFont(new Font("Comic Sans MS", 1, 11));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

	}
	// componentes da janela
	public void setComponentes(){
		
				escreverCPF = new JTextField();
				escreverCPF.setDocument(new RestringeCaracteres("0123456789",11));
				escreverSenha = new JPasswordField();
				escreverSenha.setDocument(new RestringeCaracteres("0123456789",8));
				escreverSenha.setBounds(75, 200, 150, 20);
				escreverCPF.setBounds(75, 150, 150, 20);
				
				CPF = new JLabel("CPF");		
				CPF.setBounds(75, 120, 150, 20);
				CPF.setFont(new Font("Comic Sans MS", 1, 20));
				
				senha = new JLabel("SENHA");		
				senha.setBounds(75, 175, 150, 20);
				senha.setFont(new Font("Comic Sans MS", 1, 20));
				
				aviao = new JLabel(new ImageIcon("Desenhos/desenhoaviao.png"));		
				aviao.setBounds(80, 20, 130, 77);
				
				this.jButton1 = new JButton("ENTRAR");
				this.jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
				this.jButton1.setBounds(75, 230, 150, 40);

				jButton1.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButton1ActionPerformed(evt, Integer.parseInt(escreverCPF.getText()), Integer.parseInt(escreverSenha.getText()));
					}

					
				});		

				this.jButton2 = new JButton("CADASTRAR");
				this.jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
				this.jButton2.setBounds(75, 280, 150, 40);

				jButton2.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButton2ActionPerformed(evt);
					}
				
				});	
		
	}
	
	private void jButton1ActionPerformed(ActionEvent evt, int cpf, int senha) {
		// verifica no banco se existe o usuario se existir acessa sua parte no banco e entra
		//na janela abaixo
		
		Boolean existeCadastro = false;
		Conexao conexao = new Conexao();
		FirebirdConnection conexaoFirebird = conexao.leituraInicial();
		
		try {
			Controle controle = new Controle();
			existeCadastro = controle.logar(conexaoFirebird,cpf,senha);
		} catch (SQLException e) {
			// Erro com relacao ao SQL
			e.printStackTrace();
		}
		
		if(existeCadastro){
		
		JanelaEscolherPassagem janelaPassagem = new JanelaEscolherPassagem(conexao, cpf, senha);
		janelaPassagem.setJanelaInicial();
		janelaPassagem.setComponentes();
		janelaPassagem.addComponentes();
		janelaPassagem.setVisible(true);
		this.dispose();
		}else{
			
			// Janela dizendo que o usu‡rio n‹o est‡ cadastrado
			
		}
		
	}
	
	private void jButton2ActionPerformed(ActionEvent evt) {
		JanelaEfetuarCadastro janela = new JanelaEfetuarCadastro();
		janela.setJanelaInicial();
		janela.setComponentes();
		janela.addComponentes();
		janela.setVisible(true);
		
	}
  
	    
	public void addComponentes(){
	
	
		this.add(CPF);
		this.add(senha);
		this.add(aviao);
		this.add(escreverCPF);
		this.add(escreverSenha);
		this.add(jButton1);
		this.add(jButton2);
		
	}


	public static void main(String[] args) {

		Janelalogar janela = new Janelalogar();
		janela.setJanelaInicial();
		janela.setComponentes();
		janela.addComponentes();
		janela.setVisible(true);
		
	}


}
