package gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
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
import javax.swing.BoundedRangeModel;
import javax.swing.BoxLayout;

import org.firebirdsql.jdbc.FirebirdConnection;

import Conexao.Conexao;
import Conexao.Controle;




public class JanelaEscolherPoltrona extends JFrame{

	JButton jButton1;
	JButton jButton2;

	JLabel label1;
	JLabel bicoAviao;
	JLabel fundo;
	JLabel lateralEsquerda;
	JLabel lateralDireita;
	JLabel poltrona1A;
	JLabel poltrona2A;
	JLabel poltrona3A;
	JLabel poltrona4A;
	JLabel poltrona5A;
	JLabel poltrona6A;

	JLabel poltrona1B;
	JLabel poltrona2B;
	JLabel poltrona3B;
	JLabel poltrona4B;
	JLabel poltrona5B;
	JLabel poltrona6B;

	JLabel poltrona1C;
	JLabel poltrona2C;
	JLabel poltrona3C;
	JLabel poltrona4C;
	JLabel poltrona5C;
	JLabel poltrona6C;

	JLabel poltrona1D;
	JLabel poltrona2D;
	JLabel poltrona3D;
	JLabel poltrona4D;
	JLabel poltrona5D;
	JLabel poltrona6D;

	JLabel poltrona1E;
	JLabel poltrona2E;
	JLabel poltrona3E;
	JLabel poltrona4E;
	JLabel poltrona5E;
	JLabel poltrona6E;

	JLabel poltrona1F;
	JLabel poltrona2F;
	JLabel poltrona3F;
	JLabel poltrona4F;
	JLabel poltrona5F;
	JLabel poltrona6F;

	JLabel poltrona1G;
	JLabel poltrona2G;
	JLabel poltrona3G;
	JLabel poltrona4G;
	JLabel poltrona5G;
	JLabel poltrona6G;

	JLabel poltrona1H;
	JLabel poltrona2H;
	JLabel poltrona3H;
	JLabel poltrona4H;
	JLabel poltrona5H;
	JLabel poltrona6H;

	/* Firebird Connection */

	FirebirdConnection poltrona1AFirebirdConnection;
	FirebirdConnection poltrona2AFirebirdConnection;
	FirebirdConnection poltrona3AFirebirdConnection;
	FirebirdConnection poltrona4AFirebirdConnection;
	FirebirdConnection poltrona5AFirebirdConnection;
	FirebirdConnection poltrona6AFirebirdConnection;

	FirebirdConnection poltrona1BFirebirdConnection;
	FirebirdConnection poltrona2BFirebirdConnection;
	FirebirdConnection poltrona3BFirebirdConnection;
	FirebirdConnection poltrona4BFirebirdConnection;
	FirebirdConnection poltrona5BFirebirdConnection;
	FirebirdConnection poltrona6BFirebirdConnection;

	FirebirdConnection poltrona1CFirebirdConnection;
	FirebirdConnection poltrona2CFirebirdConnection;
	FirebirdConnection poltrona3CFirebirdConnection;
	FirebirdConnection poltrona4CFirebirdConnection;
	FirebirdConnection poltrona5CFirebirdConnection;
	FirebirdConnection poltrona6CFirebirdConnection;

	FirebirdConnection poltrona1DFirebirdConnection;
	FirebirdConnection poltrona2DFirebirdConnection;
	FirebirdConnection poltrona3DFirebirdConnection;
	FirebirdConnection poltrona4DFirebirdConnection;
	FirebirdConnection poltrona5DFirebirdConnection;
	FirebirdConnection poltrona6DFirebirdConnection;

	FirebirdConnection poltrona1EFirebirdConnection;
	FirebirdConnection poltrona2EFirebirdConnection;
	FirebirdConnection poltrona3EFirebirdConnection;
	FirebirdConnection poltrona4EFirebirdConnection;
	FirebirdConnection poltrona5EFirebirdConnection;
	FirebirdConnection poltrona6EFirebirdConnection;

	FirebirdConnection poltrona1FFirebirdConnection;
	FirebirdConnection poltrona2FFirebirdConnection;
	FirebirdConnection poltrona3FFirebirdConnection;
	FirebirdConnection poltrona4FFirebirdConnection;
	FirebirdConnection poltrona5FFirebirdConnection;
	FirebirdConnection poltrona6FFirebirdConnection;

	FirebirdConnection poltrona1GFirebirdConnection;
	FirebirdConnection poltrona2GFirebirdConnection;
	FirebirdConnection poltrona3GFirebirdConnection;
	FirebirdConnection poltrona4GFirebirdConnection;
	FirebirdConnection poltrona5GFirebirdConnection;
	FirebirdConnection poltrona6GFirebirdConnection;

	FirebirdConnection poltrona1HFirebirdConnection;
	FirebirdConnection poltrona2HFirebirdConnection;
	FirebirdConnection poltrona3HFirebirdConnection;
	FirebirdConnection poltrona4HFirebirdConnection;
	FirebirdConnection poltrona5HFirebirdConnection;
	FirebirdConnection poltrona6HFirebirdConnection;

	/* Fim das Firebird Connection*/

	Integer poltrona1Aselecionar;
	Integer poltrona2Aselecionar;
	Integer poltrona3Aselecionar;
	Integer poltrona4Aselecionar;
	Integer poltrona5Aselecionar;
	Integer poltrona6Aselecionar;

	Integer poltrona1Bselecionar;
	Integer poltrona2Bselecionar;
	Integer poltrona3Bselecionar;
	Integer poltrona4Bselecionar;
	Integer poltrona5Bselecionar;
	Integer poltrona6Bselecionar;

	Integer poltrona1Cselecionar;
	Integer poltrona2Cselecionar;
	Integer poltrona3Cselecionar;
	Integer poltrona4Cselecionar;
	Integer poltrona5Cselecionar;
	Integer poltrona6Cselecionar;

	Integer poltrona1Dselecionar;
	Integer poltrona2Dselecionar;
	Integer poltrona3Dselecionar;
	Integer poltrona4Dselecionar;
	Integer poltrona5Dselecionar;
	Integer poltrona6Dselecionar;

	Integer poltrona1Eselecionar;
	Integer poltrona2Eselecionar;
	Integer poltrona3Eselecionar;
	Integer poltrona4Eselecionar;
	Integer poltrona5Eselecionar;
	Integer poltrona6Eselecionar;

	Integer poltrona1Fselecionar;
	Integer poltrona2Fselecionar;
	Integer poltrona3Fselecionar;
	Integer poltrona4Fselecionar;
	Integer poltrona5Fselecionar;
	Integer poltrona6Fselecionar;

	Integer poltrona1Gselecionar;
	Integer poltrona2Gselecionar;
	Integer poltrona3Gselecionar;
	Integer poltrona4Gselecionar;
	Integer poltrona5Gselecionar;
	Integer poltrona6Gselecionar;

	Integer poltrona1Hselecionar;
	Integer poltrona2Hselecionar;
	Integer poltrona3Hselecionar;
	Integer poltrona4Hselecionar;
	Integer poltrona5Hselecionar;
	Integer poltrona6Hselecionar;

	JLabel indice;
	JPanel panel;

	JanelaEscolherPassagem janela;
	String destino;
	Conexao conexao;
	Controle controle;
	ArrayList<Integer> poltronasSelecionadas;
	ArrayList<FirebirdConnection> listaDeFirebirdConnection;
	//FirebirdConnection firebirdConexao;
	int cpf;
	int senha;

	public JanelaEscolherPoltrona(String destino, Conexao conexao, int cpf, int senha){

		this.destino = destino;
		this.conexao = conexao;
		this.cpf = cpf;
		this.senha = senha;
		this.controle = new Controle();
		poltronasSelecionadas = new ArrayList<Integer>();
		listaDeFirebirdConnection = new ArrayList<FirebirdConnection>();
		//this.firebirdConexao = this.conexao.selecionandoAssento();

		poltrona1AFirebirdConnection= this.conexao.selecionandoAssento();

		poltrona2AFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona3AFirebirdConnection=  this.conexao.selecionandoAssento() ;

		poltrona4AFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona5AFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona6AFirebirdConnection=  this.conexao.selecionandoAssento();


		poltrona1BFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona2BFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona3BFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona4BFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona5BFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona6BFirebirdConnection=  this.conexao.selecionandoAssento();


		poltrona1CFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona2CFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona3CFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona4CFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona5CFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona6CFirebirdConnection=  this.conexao.selecionandoAssento();


		poltrona1DFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona2DFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona3DFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona4DFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona5DFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona6DFirebirdConnection=  this.conexao.selecionandoAssento();


		poltrona1EFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona2EFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona3EFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona4EFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona5EFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona6EFirebirdConnection=  this.conexao.selecionandoAssento();


		poltrona1FFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona2FFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona3FFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona4FFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona5FFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona6FFirebirdConnection=  this.conexao.selecionandoAssento();


		poltrona1GFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona2GFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona3GFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona4GFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona5GFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona6GFirebirdConnection=  this.conexao.selecionandoAssento();


		poltrona1HFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona2HFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona3HFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona4HFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona5HFirebirdConnection=  this.conexao.selecionandoAssento();

		poltrona6HFirebirdConnection=  this.conexao.selecionandoAssento();



	}


	// construindo janela
	public void setJanelaInicial(){
		//seta tamanho e posicao
		this.setBounds(10, 10, 900, 700);
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

		label1 = new JLabel(new ImageIcon("img/titulo2.png"));		
		label1.setBounds(20, 20, 650, 75);
		label1.setFont(new Font("Comic Sans MS", 1, 20));

	}

	public void setComponentesAviao(){

		indice = new JLabel(new ImageIcon("img/indice.png"));
		indice.setBounds(60, 150, 230, 230);

		fundo = new JLabel(new ImageIcon("img/fundo.png"));
		fundo.setBounds(50, 110, 600, 500);
		bicoAviao = new JLabel(new ImageIcon("img/bicoAviao.png"));
		bicoAviao.setBounds(345, 110, 250, 200);
		lateralEsquerda = new JLabel(new ImageIcon("img/lateralesquerda.png"));
		lateralEsquerda.setBounds(345, 150, 20, 390);
		lateralDireita = new JLabel(new ImageIcon("img/lateraldireita.png"));
		lateralDireita.setBounds(565, 150, 20, 390);

		this.jButton1 = new JButton("RESERVAR POLTRONA");
		this.jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
		this.jButton1.setBounds(650, 520, 225,40);

		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}


		});		

		this.jButton2 = new JButton("VOLTAR");
		this.jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
		this.jButton2.setBounds(650, 570, 225,40);

		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}

		});		



		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "1A")){
				poltrona1A = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona1Aselecionar = 1;
			}else{
				poltrona1A = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona1Aselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona1A.setBounds(360, 300, 30, 30);
		poltrona1A.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona1AActionPerformed(evt); 

			}
		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "2A")){
				poltrona2A = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona2Aselecionar = 1;
			}else{
				poltrona2A = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona2Aselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona2A.setBounds(390, 300, 30, 30);
		poltrona2A.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona2AActionPerformed(evt); 

			}
		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "3A")){
				poltrona3A = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona3Aselecionar = 1;
			}else{
				poltrona3A = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona3Aselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona3A.setBounds(420, 300, 30, 30);
		poltrona3A.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona3AActionPerformed(evt); 

			}
		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "4A")){
				poltrona4A = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona4Aselecionar = 1;
			}else{
				poltrona4A = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona4Aselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona4A.setBounds(480, 300, 30, 30);
		poltrona4A.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona4AActionPerformed(evt); 

			}
		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "5A")){
				poltrona5A = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona5Aselecionar = 1;
			}else{
				poltrona5A = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona5Aselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona5A.setBounds(510, 300, 30, 30);
		poltrona5A.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona5AActionPerformed(evt); 

			}
		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "6A")){
				poltrona6A = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona6Aselecionar = 1;
			}else{
				poltrona6A = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona6Aselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona6A.setBounds(540, 300, 30, 30);
		poltrona6A.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona6AActionPerformed(evt); 

			}
		});


		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "1B")){
				poltrona1B = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona1Bselecionar = 1;
			}else{
				poltrona1B = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona1Bselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona1B.setBounds(360, 330, 30, 30);
		poltrona1B.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona1BActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "2B")){
				poltrona2B = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona2Bselecionar = 1;
			}else{
				poltrona2B = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona2Bselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona2B.setBounds(390, 330, 30, 30);
		poltrona2B.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona2BActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "3B")){
				poltrona3B = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona3Bselecionar = 1;
			}else{
				poltrona3B = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona3Bselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona3B.setBounds(420, 330, 30, 30);
		poltrona3B.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona3BActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "4B")){
				poltrona4B = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona4Bselecionar = 1;
			}else{
				poltrona4B = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona4Bselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona4B.setBounds(480, 330, 30, 30);
		poltrona4B.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona4BActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "5B")){
				poltrona5B = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona5Bselecionar = 1;
			}else{
				poltrona5B = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona5Bselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona5B.setBounds(510, 330, 30, 30);
		poltrona5B.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona5BActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "6B")){
				poltrona6B = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona6Bselecionar = 1;
			}else{
				poltrona6B = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona6Bselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona6B.setBounds(540, 330, 30, 30);
		poltrona6B.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona6BActionPerformed(evt); 

			}


		});


		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "1C")){
				poltrona1C = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona1Cselecionar = 1;
			}else{
				poltrona1C = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona1Cselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona1C.setBounds(360, 360, 30, 30);
		poltrona1C.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona1CActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "2C")){
				poltrona2C = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona2Cselecionar = 1;
			}else{
				poltrona2C = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona2Cselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona2C.setBounds(390, 360, 30, 30);
		poltrona2C.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona2CActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "3C")){
				poltrona3C = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona3Cselecionar = 1;
			}else{
				poltrona3C = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona3Cselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona3C.setBounds(420, 360, 30, 30);
		poltrona3C.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona3CActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "4C")){
				poltrona4C = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona4Cselecionar = 1;
			}else{
				poltrona4C = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona4Cselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona4C.setBounds(480, 360, 30, 30);
		poltrona4C.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona4CActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "5C")){
				poltrona5C = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona5Cselecionar = 1;
			}else{
				poltrona5C = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona5Cselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona5C.setBounds(510, 360, 30, 30);
		poltrona5C.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona5CActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "6C")){
				poltrona6C = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona6Cselecionar = 1;
			}else{
				poltrona6C = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona6Cselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona6C.setBounds(540, 360, 30, 30);
		poltrona6C.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona6CActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "1D")){
				poltrona1D = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona1Dselecionar = 1;
			}else{
				poltrona1D = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona1Dselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona1D.setBounds(360, 390, 30, 30);
		poltrona1D.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona1DActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "2D")){
				poltrona2D = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona2Dselecionar = 1;
			}else{
				poltrona2D = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona2Dselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona2D.setBounds(390, 390, 30, 30);
		poltrona2D.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona2DActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "3D")){
				poltrona3D = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona3Dselecionar = 1;
			}else{
				poltrona3D = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona3Dselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona3D.setBounds(420, 390, 30, 30);
		poltrona3D.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona3DActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "4D")){
				poltrona4D = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona4Dselecionar = 1;
			}else{
				poltrona4D = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona4Dselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona4D.setBounds(480, 390, 30, 30);
		poltrona4D.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona4DActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "5D")){
				poltrona5D = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona5Dselecionar = 1;
			}else{
				poltrona5D = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona5Dselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona5D.setBounds(510, 390, 30, 30);
		poltrona5D.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona5DActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "6D")){
				poltrona6D = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona6Dselecionar = 1;
			}else{
				poltrona6D = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona6Dselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona6D.setBounds(540, 390, 30, 30);
		poltrona6D.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona6DActionPerformed(evt); 

			}


		});


		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "1E")){
				poltrona1E = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona1Eselecionar = 1;
			}else{
				poltrona1E = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona1Eselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona1E.setBounds(360, 420, 30, 30);
		poltrona1E.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona1EActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "2E")){
				poltrona2E = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona2Eselecionar = 1;
			}else{
				poltrona2E = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona2Eselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona2E.setBounds(390, 420, 30, 30);
		poltrona2E.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona2EActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "3E")){
				poltrona3E = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona3Eselecionar = 1;
			}else{
				poltrona3E = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona3Eselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona3E.setBounds(420, 420, 30, 30);
		poltrona3E.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona3EActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "4E")){
				poltrona4E = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona4Eselecionar = 1;
			}else{
				poltrona4E = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona4Eselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona4E.setBounds(480, 420, 30, 30);
		poltrona4E.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona4EActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "5E")){
				poltrona5E = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona5Eselecionar = 1;
			}else{
				poltrona5E = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona5Eselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona5E.setBounds(510, 420, 30, 30);
		poltrona5E.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona5EActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "6E")){
				poltrona6E = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona6Eselecionar = 1;
			}else{
				poltrona6E = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona6Eselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona6E.setBounds(540, 420, 30, 30);
		poltrona6E.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona6EActionPerformed(evt); 

			}


		});


		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "1F")){
				poltrona1F = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona1Fselecionar = 1;
			}else{
				poltrona1F = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona1Fselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona1F.setBounds(360, 450, 30, 30);
		poltrona1F.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona1FActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "2F")){
				poltrona2F = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona2Fselecionar = 1;
			}else{
				poltrona2F = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona2Fselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona2F.setBounds(390, 450, 30, 30);
		poltrona2F.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona2FActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "3F")){
				poltrona3F = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona3Fselecionar = 1;
			}else{
				poltrona3F = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona3Fselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona3F.setBounds(420, 450, 30, 30);
		poltrona3F.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona3FActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "4F")){
				poltrona4F = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona4Fselecionar = 1;
			}else{
				poltrona4F = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona4Fselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona4F.setBounds(480, 450, 30, 30);
		poltrona4F.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona4FActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "5F")){
				poltrona5F = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona5Fselecionar = 1;
			}else{
				poltrona5F = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona5Fselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona5F.setBounds(510, 450, 30, 30);
		poltrona5F.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona5FActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "6F")){
				poltrona6F = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona6Fselecionar = 1;
			}else{
				poltrona6F = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona6Fselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona6F.setBounds(540, 450, 30, 30);
		poltrona6F.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona6FActionPerformed(evt); 

			}


		});


		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "1G")){
				poltrona1G = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona1Gselecionar = 1;
			}else{
				poltrona1G = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona1Gselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona1G.setBounds(360, 480, 30, 30);
		poltrona1G.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona1GActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "2G")){
				poltrona2G = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona2Gselecionar = 1;
			}else{
				poltrona2G = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona2Gselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona2G.setBounds(390, 480, 30, 30);
		poltrona2G.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona2GActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "3G")){
				poltrona3G = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona3Gselecionar = 1;
			}else{
				poltrona3G = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona3Gselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona3G.setBounds(420, 480, 30, 30);
		poltrona3G.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona3GActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "4G")){
				poltrona4G = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona4Gselecionar = 1;
			}else{
				poltrona4G = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona4Gselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona4G.setBounds(480, 480, 30, 30);
		poltrona4G.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona4GActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "5G")){
				poltrona5G = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona5Gselecionar = 1;
			}else{
				poltrona5G = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona5Gselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona5G.setBounds(510, 480, 30, 30);
		poltrona5G.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona5GActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "6G")){
				poltrona6G = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona6Gselecionar = 1;
			}else{
				poltrona6G = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona6Gselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona6G.setBounds(540, 480, 30, 30);
		poltrona6G.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona6GActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "1H")){
				poltrona1H = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona1Hselecionar = 1;
			}else{
				poltrona1H = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona1Hselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona1H.setBounds(360, 510, 30, 30);
		poltrona1H.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona1HActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "2H")){
				poltrona2H = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona2Hselecionar = 1;
			}else{
				poltrona2H = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona2Hselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona2H.setBounds(390, 510, 30, 30);
		poltrona2H.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona2HActionPerformed(evt); 

			}


		});	

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "3H")){
				poltrona3H = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona3Hselecionar = 1;
			}else{
				poltrona3H = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona3Hselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona3H.setBounds(420, 510, 30, 30);
		poltrona3H.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona3HActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "4H")){
				poltrona4H = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona4Hselecionar = 1;
			}else{
				poltrona4H = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona4Hselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona4H.setBounds(480, 510, 30, 30);
		poltrona4H.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona4HActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "5H")){
				poltrona5H = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona5Hselecionar = 1;
			}else{
				poltrona5H = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona5Hselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona5H.setBounds(510, 510, 30, 30);
		poltrona5H.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona5HActionPerformed(evt); 

			}


		});

		try {
			if(!this.controle.poltronaReservada(this.conexao, this.destino, "6H")){
				poltrona6H = new JLabel(new ImageIcon("img/poltronaVaga.png"));
				poltrona6Hselecionar = 1;
			}else{
				poltrona6H = new JLabel(new ImageIcon("img/poltronaSelecionada.png"));
				poltrona6Hselecionar = 3;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		poltrona6H.setBounds(540, 510, 30, 30);
		poltrona6H.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona6HActionPerformed(evt); 

			}


		});


	}

	private void MouseActionPerformed(MouseEvent evt) {
		System.out.println("pegou");

	}  

	public void poltrona1AActionPerformed(MouseEvent evt){
		if(poltrona1Aselecionar == 1){
			try {

				if(controle.selecionarPoltrona(this.poltrona1AFirebirdConnection, "1A", this.cpf, this.destino)){
					poltrona1A.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona1A.setBounds(360, 300, 30, 30);
					this.poltrona1Aselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona1AFirebirdConnection);

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}else if(poltrona1Aselecionar == 2){
			try {
				this.controle.desfazerSelecao(this.poltrona1AFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona1A.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona1A.setBounds(360, 300, 30, 30);
			poltrona1Aselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona1AFirebirdConnection);

		}

	}
	public void poltrona2AActionPerformed(MouseEvent evt){
		if(poltrona2Aselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona2AFirebirdConnection, "2A", this.cpf, this.destino)){
					poltrona2A.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona2A.setBounds(390, 300, 30, 30);
					poltrona2Aselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona2AFirebirdConnection);

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona2Aselecionar == 2){

			try {
				this.controle.desfazerSelecao(this.poltrona2AFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona2A.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona2A.setBounds(390, 300, 30, 30);
			poltrona2Aselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona2AFirebirdConnection);

		}

	}
	public void poltrona3AActionPerformed(MouseEvent evt){
		if(poltrona3Aselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona3AFirebirdConnection, "3A", this.cpf, this.destino)){
					poltrona3A.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona3A.setBounds(420, 300, 30, 30);
					poltrona3Aselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona3AFirebirdConnection);

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona3Aselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona3AFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona3A.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona3A.setBounds(420, 300, 30, 30);
			poltrona3Aselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona3AFirebirdConnection);

		}

	}
	public void poltrona4AActionPerformed(MouseEvent evt){
		if(poltrona4Aselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona4AFirebirdConnection, "4A", this.cpf, this.destino)){
					poltrona4A.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona4A.setBounds(480, 300, 30, 30);
					poltrona4Aselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona4AFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona4Aselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona4AFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona4A.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona4A.setBounds(480, 300, 30, 30);
			poltrona4Aselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona4AFirebirdConnection);
		}

	}
	public void poltrona5AActionPerformed(MouseEvent evt){
		if(poltrona5Aselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona5AFirebirdConnection, "5A", this.cpf, this.destino)){
					poltrona5A.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona5A.setBounds(510, 300, 30, 30);
					poltrona5Aselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona5AFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona5Aselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona5AFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona5A.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona5A.setBounds(510, 300, 30, 30);
			poltrona5Aselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona5AFirebirdConnection);
		}

	}
	public void poltrona6AActionPerformed(MouseEvent evt){
		if(poltrona6Aselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona6AFirebirdConnection, "6A", this.cpf, this.destino)){
					poltrona6A.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona6A.setBounds(540, 300, 30, 30);
					poltrona6Aselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona6AFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona6Aselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona6AFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona6A.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona6A.setBounds(540, 300, 30, 30);
			poltrona6Aselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona6AFirebirdConnection);
		}

	}


	private void poltrona1BActionPerformed(MouseEvent evt) {
		if(poltrona1Bselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona1BFirebirdConnection, "1B", this.cpf, this.destino)){
					poltrona1B.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona1B.setBounds(360, 330, 30, 30);
					poltrona1Bselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona1BFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona1Bselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona1BFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona1B.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona1B.setBounds(360, 330, 30, 30);
			poltrona1Bselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona1BFirebirdConnection);
		}

	}

	private void poltrona2BActionPerformed(MouseEvent evt) {
		if(poltrona2Bselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona2BFirebirdConnection, "2B", this.cpf, this.destino)){
					poltrona2B.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona2B.setBounds(390, 330, 30, 30);
					poltrona2Bselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona2BFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona2Bselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona2BFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona2B.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona2B.setBounds(390, 330, 30, 30);
			poltrona2Bselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona2BFirebirdConnection);
		}

	}

	private void poltrona3BActionPerformed(MouseEvent evt) {
		if(poltrona3Bselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona3BFirebirdConnection, "3B", this.cpf, this.destino)){
					poltrona3B.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona3B.setBounds(420, 330, 30, 30);
					poltrona3Bselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona3BFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona3Bselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona3BFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona3B.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona3B.setBounds(420, 330, 30, 30);
			poltrona3Bselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona3BFirebirdConnection);
		}

	}

	private void poltrona4BActionPerformed(MouseEvent evt) {
		if(poltrona4Bselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona4BFirebirdConnection, "4B", this.cpf, this.destino)){
					poltrona4B.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona4B.setBounds(480, 330, 30, 30);
					poltrona4Bselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona4BFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona4Bselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona4BFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona4B.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona4B.setBounds(480, 330, 30, 30);
			poltrona4Bselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona4BFirebirdConnection);
		}

	}

	private void poltrona5BActionPerformed(MouseEvent evt) {
		if(poltrona5Bselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona5BFirebirdConnection, "5B", this.cpf, this.destino)){
					poltrona5B.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona5B.setBounds(510, 330, 30, 30);
					poltrona5Bselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona5BFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona5Bselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona5BFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona5B.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona5B.setBounds(510, 330, 30, 30);
			poltrona5Bselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona5BFirebirdConnection);
		}

	}

	private void poltrona6BActionPerformed(MouseEvent evt) {
		if(poltrona6Bselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona6BFirebirdConnection, "6B", this.cpf, this.destino)){
					poltrona6B.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona6B.setBounds(540, 330, 30, 30);
					poltrona6Bselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona6BFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona6Bselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona6BFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona6B.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona6B.setBounds(540, 330, 30, 30);
			poltrona6Bselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona6BFirebirdConnection);
		}

	}

	private void poltrona1CActionPerformed(MouseEvent evt) {
		if(poltrona1Cselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona1CFirebirdConnection, "1C", this.cpf, this.destino)){
					poltrona1C.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona1C.setBounds(360, 360, 30, 30);
					poltrona1Cselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona1CFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona1Cselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona1CFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona1C.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona1C.setBounds(360, 360, 30, 30);
			poltrona1Cselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona1CFirebirdConnection);
		}

	}

	private void poltrona2CActionPerformed(MouseEvent evt) {
		if(poltrona2Cselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona2CFirebirdConnection, "2C", this.cpf, this.destino)){
					poltrona2C.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona2C.setBounds(390, 360, 30, 30);
					poltrona2Cselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona2CFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona2Cselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona2CFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona2C.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona2C.setBounds(390, 360, 30, 30);
			poltrona2Cselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona2CFirebirdConnection);
		}

	}

	private void poltrona3CActionPerformed(MouseEvent evt) {
		if(poltrona3Cselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona3CFirebirdConnection, "3C", this.cpf, this.destino)){
					poltrona3C.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona3C.setBounds(420, 360, 30, 30);
					poltrona3Cselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona3CFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona3Cselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona3CFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona3C.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona3C.setBounds(420, 360, 30, 30);
			poltrona3Cselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona3CFirebirdConnection);
		}

	}

	private void poltrona4CActionPerformed(MouseEvent evt) {
		if(poltrona4Cselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona4CFirebirdConnection, "4C", this.cpf, this.destino)){
					poltrona4C.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona4C.setBounds(480, 360, 30, 30);
					poltrona4Cselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona4CFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona4Cselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona4CFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona4C.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona4C.setBounds(480, 360, 30, 30);
			poltrona4Cselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona4CFirebirdConnection);
		}

	}

	private void poltrona5CActionPerformed(MouseEvent evt) {
		if(poltrona5Cselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona5CFirebirdConnection, "5C", this.cpf, this.destino)){
					poltrona5C.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona5C.setBounds(510, 360, 30, 30);
					poltrona5Cselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona5CFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona5Cselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona5CFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona5C.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona5C.setBounds(510, 360, 30, 30);
			poltrona5Cselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona5CFirebirdConnection);
		}

	}

	private void poltrona6CActionPerformed(MouseEvent evt) {
		if(poltrona6Cselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona6CFirebirdConnection, "6C", this.cpf, this.destino)){
					poltrona6C.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona6C.setBounds(540, 360, 30, 30);
					poltrona6Cselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona6CFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona6Cselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona6CFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona6C.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona6C.setBounds(540, 360, 30, 30);
			poltrona6Cselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona6CFirebirdConnection);
		}

	}

	private void poltrona1DActionPerformed(MouseEvent evt) {
		if(poltrona1Dselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona1DFirebirdConnection, "1D", this.cpf, this.destino)){
					poltrona1D.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona1D.setBounds(360, 390, 30, 30);
					poltrona1Dselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona1DFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona1Dselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona1DFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona1D.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona1D.setBounds(360, 390, 30, 30);
			poltrona1Dselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona1DFirebirdConnection);
		}

	}

	private void poltrona2DActionPerformed(MouseEvent evt) {
		if(poltrona2Dselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona2DFirebirdConnection, "2D", this.cpf, this.destino)){
					poltrona2D.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona2D.setBounds(390, 390, 30, 30);
					poltrona2Dselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona2DFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona2Dselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona2DFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona2D.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona2D.setBounds(390, 390, 30, 30);
			poltrona2Dselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona2DFirebirdConnection);
		}

	}

	private void poltrona3DActionPerformed(MouseEvent evt) {
		if(poltrona3Dselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona3DFirebirdConnection, "3D", this.cpf, this.destino)){
					poltrona3D.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona3D.setBounds(420, 390, 30, 30);
					poltrona3Dselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona3DFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona3Dselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona3DFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona3D.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona3D.setBounds(420, 390, 30, 30);
			poltrona3Dselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona3DFirebirdConnection);
		}

	}

	private void poltrona4DActionPerformed(MouseEvent evt) {
		if(poltrona4Dselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona4DFirebirdConnection, "4D", this.cpf, this.destino)){
					poltrona4D.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona4D.setBounds(480, 390, 30, 30);
					poltrona4Dselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona4DFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona4Dselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona4DFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona4D.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona4D.setBounds(480, 390, 30, 30);
			poltrona4Dselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona4DFirebirdConnection);
		}

	}

	private void poltrona5DActionPerformed(MouseEvent evt) {
		if(poltrona5Dselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona5DFirebirdConnection, "5D", this.cpf, this.destino)){
					poltrona5D.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona5D.setBounds(510, 390, 30, 30);
					poltrona5Dselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona5DFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona5Dselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona5DFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona5D.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona5D.setBounds(510, 390, 30, 30);
			poltrona5Dselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona5DFirebirdConnection);
		}

	}

	private void poltrona6DActionPerformed(MouseEvent evt) {
		if(poltrona6Dselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona6DFirebirdConnection, "6D", this.cpf, this.destino)){
					poltrona6D.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona6D.setBounds(540, 390, 30, 30);
					poltrona6Dselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona6DFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona6Dselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona6DFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona6D.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona6D.setBounds(540, 390, 30, 30);
			poltrona6Dselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona6DFirebirdConnection);
		}

	}

	private void poltrona1EActionPerformed(MouseEvent evt) {
		if(poltrona1Eselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona1EFirebirdConnection, "1E", this.cpf, this.destino)){
					poltrona1E.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona1E.setBounds(360, 420, 30, 30);
					poltrona1Eselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona1EFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona1Eselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona1EFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona1E.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona1E.setBounds(360, 420, 30, 30);
			poltrona1Eselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona1EFirebirdConnection);
		}

	}

	private void poltrona2EActionPerformed(MouseEvent evt) {
		if(poltrona2Eselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona2EFirebirdConnection, "2E", this.cpf, this.destino)){
					poltrona2E.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona2E.setBounds(390, 420, 30, 30);
					poltrona2Eselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona2EFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona2Eselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona2EFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona2E.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona2E.setBounds(390, 420, 30, 30);
			poltrona2Eselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona2EFirebirdConnection);
		}

	}

	private void poltrona3EActionPerformed(MouseEvent evt) {
		if(poltrona3Eselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona3EFirebirdConnection, "3E", this.cpf, this.destino)){
					poltrona3E.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona3E.setBounds(420, 420, 30, 30);
					poltrona3Eselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona3EFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona3Eselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona3EFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona3E.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona3E.setBounds(420, 420, 30, 30);
			poltrona3Eselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona3EFirebirdConnection);
		}

	}

	private void poltrona4EActionPerformed(MouseEvent evt) {
		if(poltrona4Eselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona4EFirebirdConnection, "4E", this.cpf, this.destino)){
					poltrona4E.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona4E.setBounds(480, 420, 30, 30);
					poltrona4Eselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona4EFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona4Eselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona4EFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona4E.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona4E.setBounds(480, 420, 30, 30);
			poltrona4Eselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona4EFirebirdConnection);
		}

	}

	private void poltrona5EActionPerformed(MouseEvent evt) {
		if(poltrona5Eselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona5EFirebirdConnection, "5E", this.cpf, this.destino)){
					poltrona5E.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona5E.setBounds(510, 420, 30, 30);
					poltrona5Eselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona5EFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona5Eselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona5EFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona5E.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona5E.setBounds(510, 420, 30, 30);
			poltrona5Eselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona5EFirebirdConnection);
		}

	}

	private void poltrona6EActionPerformed(MouseEvent evt) {
		if(poltrona6Eselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona6EFirebirdConnection, "6E", this.cpf, this.destino)){
					poltrona6E.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona6E.setBounds(540, 420, 30, 30);
					poltrona6Eselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona6EFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona6Eselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona6EFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona6E.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona6E.setBounds(540, 420, 30, 30);
			poltrona6Eselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona6EFirebirdConnection);
		}

	}

	private void poltrona1FActionPerformed(MouseEvent evt) {
		if(poltrona1Fselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona1FFirebirdConnection, "1F", this.cpf, this.destino)){
					poltrona1F.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona1F.setBounds(360, 450, 30, 30);
					poltrona1Fselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona1FFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona1Fselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona1FFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona1F.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona1F.setBounds(360, 450, 30, 30);
			poltrona1Fselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona1FFirebirdConnection);
		}


	}

	private void poltrona2FActionPerformed(MouseEvent evt) {
		if(poltrona2Fselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona2FFirebirdConnection, "2F", this.cpf, this.destino)){
					poltrona2F.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona2F.setBounds(390, 450, 30, 30);
					poltrona2Fselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona2FFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona2Fselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona2FFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona2F.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona2F.setBounds(390, 450, 30, 30);
			poltrona2Fselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona2FFirebirdConnection);
		}

	}

	private void poltrona3FActionPerformed(MouseEvent evt) {
		if(poltrona3Fselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona3FFirebirdConnection, "3F", this.cpf, this.destino)){
					poltrona3F.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona3F.setBounds(420, 450, 30, 30);
					poltrona3Fselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona3FFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona3Fselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona3FFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona3F.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona3F.setBounds(420, 450, 30, 30);
			poltrona3Fselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona3FFirebirdConnection);
		}

	}

	private void poltrona4FActionPerformed(MouseEvent evt) {
		if(poltrona4Fselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona4FFirebirdConnection, "4F", this.cpf, this.destino)){
					poltrona4F.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona4F.setBounds(480, 450, 30, 30);
					poltrona4Fselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona4FFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona4Fselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona4FFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona4F.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona4F.setBounds(480, 450, 30, 30);
			poltrona4Fselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona4FFirebirdConnection);
		}

	}

	private void poltrona5FActionPerformed(MouseEvent evt) {
		if(poltrona5Fselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona5FFirebirdConnection, "5F", this.cpf, this.destino)){
					poltrona5F.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona5F.setBounds(510, 450, 30, 30);
					poltrona5Fselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona5FFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona5Fselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona5FFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona5F.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona5F.setBounds(510, 450, 30, 30);
			poltrona5Fselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona5FFirebirdConnection);
		}

	}

	private void poltrona6FActionPerformed(MouseEvent evt) {
		if(poltrona6Fselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona6FFirebirdConnection, "6F", this.cpf, this.destino)){
					poltrona6F.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona6F.setBounds(540, 450, 30, 30);
					poltrona6Fselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona6FFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona6Fselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona6FFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona6F.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona6F.setBounds(540, 450, 30, 30);
			poltrona6Fselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona6FFirebirdConnection);
		}

	}

	private void poltrona1GActionPerformed(MouseEvent evt) {
		if(poltrona1Gselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona1GFirebirdConnection, "1G", this.cpf, this.destino)){
					poltrona1G.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona1G.setBounds(360, 480, 30, 30);
					poltrona1Gselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona1GFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona1Gselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona1GFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona1G.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona1G.setBounds(360, 480, 30, 30);
			poltrona1Gselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona1GFirebirdConnection);
		}

	}

	private void poltrona2GActionPerformed(MouseEvent evt) {
		if(poltrona2Gselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona2GFirebirdConnection, "2G", this.cpf, this.destino)){
					poltrona2G.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona2G.setBounds(390, 480, 30, 30);
					poltrona2Gselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona2GFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona2Gselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona2GFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona2G.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona2G.setBounds(390, 480, 30, 30);
			poltrona2Gselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona2GFirebirdConnection);
		}

	}

	private void poltrona3GActionPerformed(MouseEvent evt) {
		if(poltrona3Gselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona3GFirebirdConnection, "3G", this.cpf, this.destino)){
					poltrona3G.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona3G.setBounds(420, 480, 30, 30);
					poltrona3Gselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona3GFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona3Gselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona3GFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona3G.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona3G.setBounds(420, 480, 30, 30);
			poltrona3Gselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona3GFirebirdConnection);
		}

	}

	private void poltrona4GActionPerformed(MouseEvent evt) {
		if(poltrona4Gselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona4GFirebirdConnection, "4G", this.cpf, this.destino)){
					poltrona4G.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona4G.setBounds(480, 480, 30, 30);
					poltrona4Gselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona4GFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona4Gselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona4GFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona4G.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona4G.setBounds(480, 480, 30, 30);
			poltrona4Gselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona4GFirebirdConnection);
		}

	}

	private void poltrona5GActionPerformed(MouseEvent evt) {
		if(poltrona5Gselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona5GFirebirdConnection, "5G", this.cpf, this.destino)){
					poltrona5G.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona5G.setBounds(510, 480, 30, 30);
					poltrona5Gselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona5GFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona5Gselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona5GFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona5G.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona5G.setBounds(510, 480, 30, 30);
			poltrona5Gselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona5GFirebirdConnection);
		}

	}

	private void poltrona6GActionPerformed(MouseEvent evt) {
		if(poltrona6Gselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona6GFirebirdConnection, "6G", this.cpf, this.destino)){
					poltrona6G.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona6G.setBounds(540, 480, 30, 30);
					this.listaDeFirebirdConnection.add(poltrona6GFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona6Gselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona6GFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona6G.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona6G.setBounds(540, 480, 30, 30);
			poltrona6Gselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona6GFirebirdConnection);
		}

	}

	private void poltrona1HActionPerformed(MouseEvent evt) {
		if(poltrona1Hselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona1HFirebirdConnection, "1H", this.cpf, this.destino)){
					poltrona1H.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona1H.setBounds(360, 510, 30, 30);
					poltrona1Hselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona1HFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona1Hselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona1HFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona1H.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona1H.setBounds(360, 510, 30, 30);
			poltrona1Hselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona1HFirebirdConnection);
		}

	}

	private void poltrona2HActionPerformed(MouseEvent evt) {
		if(poltrona2Hselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona2HFirebirdConnection, "2H", this.cpf, this.destino)){
					poltrona2H.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona2H.setBounds(390, 510, 30, 30);
					poltrona2Hselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona2HFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona2Hselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona2HFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona2H.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona2H.setBounds(390, 510, 30, 30);
			poltrona2Hselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona2HFirebirdConnection);
		}

	}

	private void poltrona3HActionPerformed(MouseEvent evt) {
		if(poltrona3Hselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona3HFirebirdConnection, "3H", this.cpf, this.destino)){
					poltrona3H.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona3H.setBounds(420, 510, 30, 30);
					poltrona3Hselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona3HFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona3Hselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona3HFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona3H.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona3H.setBounds(420, 510, 30, 30);
			poltrona3Hselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona3HFirebirdConnection);
		}

	}

	private void poltrona4HActionPerformed(MouseEvent evt) {
		if(poltrona4Hselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona4HFirebirdConnection, "4H", this.cpf, this.destino)){
					poltrona4H.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona4H.setBounds(480, 510, 30, 30);
					poltrona4Hselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona4HFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona4Hselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona4HFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona4H.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona4H.setBounds(480, 510, 30, 30);
			poltrona4Hselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona4HFirebirdConnection);
		}

	}

	private void poltrona5HActionPerformed(MouseEvent evt) {
		if(poltrona5Hselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona5HFirebirdConnection, "5H", this.cpf, this.destino)){
					poltrona5H.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona5H.setBounds(510, 510, 30, 30);
					poltrona5Hselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona5HFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona5Hselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona5HFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona5H.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona5H.setBounds(510, 510, 30, 30);
			poltrona5Hselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona5HFirebirdConnection);
		}

	}

	private void poltrona6HActionPerformed(MouseEvent evt) {
		if(poltrona6Hselecionar == 1){

			try {

				if(controle.selecionarPoltrona(this.poltrona6HFirebirdConnection, "6H", this.cpf, this.destino)){
					poltrona6H.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
					poltrona6H.setBounds(540, 510, 30, 30);
					poltrona6Hselecionar = 2;
					this.listaDeFirebirdConnection.add(poltrona6HFirebirdConnection);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(poltrona6Hselecionar == 2){

			try {
				this.controle.desfazerSelecao(poltrona6HFirebirdConnection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			poltrona6H.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona6H.setBounds(540, 510, 30, 30);
			poltrona6Hselecionar = 1;
			this.listaDeFirebirdConnection.remove(poltrona6HFirebirdConnection);
		}

	}


	private void jButton1ActionPerformed(ActionEvent evt) {


		try {

			this.controle.reservarPoltrona(this.listaDeFirebirdConnection);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton2ActionPerformed(ActionEvent evt) {

		// fechando conexao quando retorna para a janela anterior pras cadeiras que estao "presas" serem liberadas.
		try {

			this.controle.fecharVariasFirebirdConnection(this.listaDeFirebirdConnection);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JanelaEscolherPassagem janelaPassagem = new JanelaEscolherPassagem(this.conexao, this.cpf, this.senha);
		janelaPassagem.setJanelaInicial();
		janelaPassagem.setComponentes();
		janelaPassagem.addComponentes();
		janelaPassagem.setVisible(true);
		this.dispose();

	}


	public void addComponentes(){

		this.add(jButton1);
		this.add(jButton2);
		this.add(label1);

		//this.add(panel);
		this.add(bicoAviao);
		this.add(lateralEsquerda);
		this.add(lateralDireita);
		this.add(poltrona1A);
		this.add(poltrona2A);
		this.add(poltrona3A);
		this.add(poltrona4A);
		this.add(poltrona5A);
		this.add(poltrona6A);

		this.add(poltrona1B);
		this.add(poltrona2B);
		this.add(poltrona3B);
		this.add(poltrona4B);
		this.add(poltrona5B);
		this.add(poltrona6B);

		this.add(poltrona1C);
		this.add(poltrona2C);
		this.add(poltrona3C);
		this.add(poltrona4C);
		this.add(poltrona5C);
		this.add(poltrona6C);

		this.add(poltrona1D);
		this.add(poltrona2D);
		this.add(poltrona3D);
		this.add(poltrona4D);
		this.add(poltrona5D);
		this.add(poltrona6D);

		this.add(poltrona1E);
		this.add(poltrona2E);
		this.add(poltrona3E);
		this.add(poltrona4E);
		this.add(poltrona5E);
		this.add(poltrona6E);

		this.add(poltrona1F);
		this.add(poltrona2F);
		this.add(poltrona3F);
		this.add(poltrona4F);
		this.add(poltrona5F);
		this.add(poltrona6F);

		this.add(poltrona1G);
		this.add(poltrona2G);
		this.add(poltrona3G);
		this.add(poltrona4G);
		this.add(poltrona5G);
		this.add(poltrona6G);

		this.add(poltrona1H);
		this.add(poltrona2H);
		this.add(poltrona3H);
		this.add(poltrona4H);
		this.add(poltrona5H);
		this.add(poltrona6H);
		this.add(indice);

		this.add(fundo);

	}


	public static void main(String[] args) {

		//		JanelaEscolherPoltrona janela = new JanelaEscolherPoltrona();
		//		janela.setJanelaInicial();
		//		janela.setComponentes();
		//		janela.setComponentesAviao();
		//		janela.addComponentes();
		//		janela.setVisible(true);

	}


}
