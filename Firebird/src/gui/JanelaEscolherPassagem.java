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

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
import javax.swing.BoundedRangeModel;
import javax.swing.BoxLayout;

import org.firebirdsql.jdbc.FirebirdConnection;

import Conexao.Conexao;
import Conexao.Controle;



public class JanelaEscolherPassagem extends JFrame{

	JLabel label1;
	JButton jButton1;
	JButton jButton2;
	JComboBox jComboBox1;
	Conexao conexao = null;
	String destinoSelecionado = null;
	int cpf;
	int senha;


	public JanelaEscolherPassagem(Conexao conexao, int cpf, int senha){
	
		this.conexao = conexao;
		this.cpf = cpf;
		this.senha = senha;
		
	}


	// construindo janela
	public void setJanelaInicial(){
		//seta tamanho e posicao
		this.setBounds(10, 10, 700, 500);
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
		
		label1 = new JLabel(new ImageIcon("img/titulo1.png"));		
		label1.setBounds(20, 20, 650, 75);
		//label1.setFont(new Font("Comic Sans MS", 1, 20));
		
		this.jButton1 = new JButton("ESCOLHER POLTRONA");
		this.jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
		this.jButton1.setBounds(430, 360, 250, 40);

		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}

			
		});		

		this.jButton2 = new JButton("SAIR");
		this.jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
		this.jButton2.setBounds(430, 410, 250, 40);

		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		
		});	
		
		
		//Buscando os destinos existentes no BD
		FirebirdConnection conexaoFirebird = conexao.leituraInicial();
		Vector<String> destinos = new Vector<String>();
		
		try {
			Controle controle = new Controle();
			destinos = controle.lerDestinos(conexaoFirebird);
		} catch (SQLException e) {
			// Erro com relacao ao SQL
			e.printStackTrace();
		}
		
		this.jComboBox1 = new JComboBox(destinos);
		this.jComboBox1.setBounds(40,150, 400, 20);
		this.jComboBox1.setBackground(Color.white);
	//	this.jComboBox1.setModel(new DefaultComboBoxModel(buscaArquivo.RetornarTrasacoes(this.rep.getTransacoes())));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});
							
		
	}

	private void jComboBox1ActionPerformed(ActionEvent evt) {
		
		this.destinoSelecionado = (String) this.jComboBox1.getSelectedItem();
		
	}
	
	private void jButton1ActionPerformed(ActionEvent evt) {
	
		JanelaEscolherPoltrona janela = new JanelaEscolherPoltrona(this.destinoSelecionado, this.conexao, this.cpf, this.senha);
		janela.setJanelaInicial();
		janela.setComponentes();
		janela.setComponentesAviao();
		janela.addComponentes();
		janela.setVisible(true);
		this.dispose();
	}
	
	private void jButton2ActionPerformed(ActionEvent evt) {
		Janelalogar janela = new Janelalogar();
		janela.setJanelaInicial();
		janela.setComponentes();
		janela.addComponentes();
		janela.setVisible(true);
		this.dispose();
		
	}
	    private void MouseActionPerformed(MouseEvent evt) {
			System.out.println("pegou");
			
		}  
	    
	public void addComponentes(){
		this.add(label1);
		this.add(jButton1);
		this.add(jButton2);
		this.add(jComboBox1);
	
	}


	public static void main(String[] args) {

//		JanelaEscolherPassagem janela = new JanelaEscolherPassagem();
//		janela.setJanelaInicial();
//		janela.setComponentes();
//		janela.addComponentes();
//		janela.setVisible(true);
		
	}


}
