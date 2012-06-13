package gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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



public class JanelaEfetuarCadastro extends JFrame{

	JTextField escreverCpf;
	JTextField escreverSenha;
	JTextField escreverEndereco;
	JTextField escreverNome;	
	JLabel CPF;
	JLabel senha;
	JLabel endereco;
	JLabel nome;
	JLabel aviao;
	JButton jButton1;
	JButton jButton2;

	protected MaskFormatter createFormatter(String s) {
		MaskFormatter formatter = null;
		try {
			formatter = new MaskFormatter(s);
		} catch (java.text.ParseException exc) {
			System.err.println("Formato errado: " + exc.getMessage());
			System.exit(-1);
		}
		return formatter;
	}

	public JanelaEfetuarCadastro(){
	
	}


	// construindo janela
	public void setJanelaInicial(){
		//seta tamanho e posicao
		this.setBounds(400, 200, 500,450);
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
		
				escreverCpf = new javax.swing.JFormattedTextField( createFormatter("#########-##"));
				escreverCpf.setBounds(30, 200, 400, 20);
				escreverSenha = new JTextField();
				escreverSenha.setBounds(30, 250, 400, 20);
				escreverEndereco = new JTextField();
				escreverEndereco.setBounds(30, 300, 400, 20);
				escreverNome = new JTextField();
				escreverNome.setBounds(30, 150, 400, 20);
				
				nome = new JLabel("NOME");		
				nome.setBounds(30, 125, 150, 20);
				nome.setFont(new Font("Comic Sans MS", 1, 15));
				
				CPF = new JLabel("CPF");		
				CPF.setBounds(30, 175, 150, 20);
				CPF.setFont(new Font("Comic Sans MS", 1, 15));
				
				senha = new JLabel("SENHA");		
				senha.setBounds(30, 230, 150, 20);
				senha.setFont(new Font("Comic Sans MS", 1, 15));
							
				endereco = new JLabel("ENDERECO");		
				endereco.setBounds(30, 280, 250, 20);
				endereco.setFont(new Font("Comic Sans MS", 1, 15));
				
				aviao = new JLabel(new ImageIcon("img/aviaocadastro.png"));		
				aviao.setBounds(30, 20, 130, 100);
				
				this.jButton1 = new JButton("EFETUAR CADASTRO");
				this.jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
				this.jButton1.setBounds(150, 330, 200, 30);

				jButton1.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButton1ActionPerformed(evt);
					}

					
				});		

				this.jButton2 = new JButton("VOLTAR");
				this.jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
				this.jButton2.setBounds(150, 370, 200, 30);

				jButton2.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButton2ActionPerformed(evt);
					}
				
				});	
		
	}
	
	private void jButton1ActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}
	
	private void jButton2ActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}
  
	    
	public void addComponentes(){
	
		this.add(escreverCpf);
		this.add(escreverSenha);
		this.add(escreverEndereco);
		this.add(escreverNome);
		this.add(nome);
		this.add(endereco);
		this.add(CPF);
		this.add(senha);
		this.add(aviao);
		this.add(jButton1);
		this.add(jButton2);
		
	}


	public static void main(String[] args) {

		JanelaEfetuarCadastro janela = new JanelaEfetuarCadastro();
		janela.setJanelaInicial();
		janela.setComponentes();
		janela.addComponentes();
		janela.setVisible(true);
		
	}


}
