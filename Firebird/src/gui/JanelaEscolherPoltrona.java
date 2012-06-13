package gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
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
import javax.swing.BoundedRangeModel;
import javax.swing.BoxLayout;



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

	boolean poltrona1Aselecionar;
	boolean poltrona2Aselecionar;
	boolean poltrona3Aselecionar;
	boolean poltrona4Aselecionar;
	boolean poltrona5Aselecionar;
	boolean poltrona6Aselecionar;

	boolean poltrona1Bselecionar;
	boolean poltrona2Bselecionar;
	boolean poltrona3Bselecionar;
	boolean poltrona4Bselecionar;
	boolean poltrona5Bselecionar;
	boolean poltrona6Bselecionar;

	boolean poltrona1Cselecionar;
	boolean poltrona2Cselecionar;
	boolean poltrona3Cselecionar;
	boolean poltrona4Cselecionar;
	boolean poltrona5Cselecionar;
	boolean poltrona6Cselecionar;

	boolean poltrona1Dselecionar;
	boolean poltrona2Dselecionar;
	boolean poltrona3Dselecionar;
	boolean poltrona4Dselecionar;
	boolean poltrona5Dselecionar;
	boolean poltrona6Dselecionar;

	boolean poltrona1Eselecionar;
	boolean poltrona2Eselecionar;
	boolean poltrona3Eselecionar;
	boolean poltrona4Eselecionar;
	boolean poltrona5Eselecionar;
	boolean poltrona6Eselecionar;

	boolean poltrona1Fselecionar;
	boolean poltrona2Fselecionar;
	boolean poltrona3Fselecionar;
	boolean poltrona4Fselecionar;
	boolean poltrona5Fselecionar;
	boolean poltrona6Fselecionar;

	boolean poltrona1Gselecionar;
	boolean poltrona2Gselecionar;
	boolean poltrona3Gselecionar;
	boolean poltrona4Gselecionar;
	boolean poltrona5Gselecionar;
	boolean poltrona6Gselecionar;

	boolean poltrona1Hselecionar;
	boolean poltrona2Hselecionar;
	boolean poltrona3Hselecionar;
	boolean poltrona4Hselecionar;
	boolean poltrona5Hselecionar;
	boolean poltrona6Hselecionar;

	JLabel indice;
	JPanel panel;

	JanelaEscolherPassagem janela;

	public JanelaEscolherPoltrona(){

		
		
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


		poltrona1Aselecionar = true;
		poltrona1A = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona1A.setBounds(360, 300, 30, 30);
		poltrona1A.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona1AActionPerformed(evt); 

			}
		});
		poltrona2Aselecionar = true;
		poltrona2A = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona2A.setBounds(390, 300, 30, 30);
		poltrona2A.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona2AActionPerformed(evt); 

			}
		});
		poltrona3Aselecionar = true;
		poltrona3A = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona3A.setBounds(420, 300, 30, 30);
		poltrona3A.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona3AActionPerformed(evt); 

			}
		});
		poltrona4Aselecionar = true;
		poltrona4A = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona4A.setBounds(480, 300, 30, 30);
		poltrona4A.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona4AActionPerformed(evt); 

			}
		});
		poltrona5Aselecionar = true;
		poltrona5A = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona5A.setBounds(510, 300, 30, 30);
		poltrona5A.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona5AActionPerformed(evt); 

			}
		});
		poltrona6Aselecionar = true;
		poltrona6A = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona6A.setBounds(540, 300, 30, 30);
		poltrona6A.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona6AActionPerformed(evt); 

			}
		});

		poltrona1Bselecionar = true;
		poltrona1B = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona1B.setBounds(360, 330, 30, 30);
		poltrona1B.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona1BActionPerformed(evt); 

			}


		});
		poltrona2Bselecionar = true;
		poltrona2B = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona2B.setBounds(390, 330, 30, 30);
		poltrona2B.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona2BActionPerformed(evt); 

			}


		});
		poltrona3Bselecionar = true;
		poltrona3B = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona3B.setBounds(420, 330, 30, 30);
		poltrona3B.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona3BActionPerformed(evt); 

			}


		});
		poltrona4Bselecionar = true;
		poltrona4B = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona4B.setBounds(480, 330, 30, 30);
		poltrona4B.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona4BActionPerformed(evt); 

			}


		});
		poltrona5Bselecionar = true;
		poltrona5B = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona5B.setBounds(510, 330, 30, 30);
		poltrona5B.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona5BActionPerformed(evt); 

			}


		});
		poltrona6Bselecionar = true;
		poltrona6B = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona6B.setBounds(540, 330, 30, 30);
		poltrona6B.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona6BActionPerformed(evt); 

			}


		});

		poltrona1Cselecionar = true;
		poltrona1C = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona1C.setBounds(360, 360, 30, 30);
		poltrona1C.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona1CActionPerformed(evt); 

			}


		});
		poltrona2Cselecionar = true;
		poltrona2C = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona2C.setBounds(390, 360, 30, 30);
		poltrona2C.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona2CActionPerformed(evt); 

			}


		});
		poltrona3Cselecionar = true;
		poltrona3C = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona3C.setBounds(420, 360, 30, 30);
		poltrona3C.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona3CActionPerformed(evt); 

			}


		});
		poltrona4Cselecionar = true;
		poltrona4C = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona4C.setBounds(480, 360, 30, 30);
		poltrona4C.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona4CActionPerformed(evt); 

			}


		});
		poltrona5Cselecionar = true;
		poltrona5C = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona5C.setBounds(510, 360, 30, 30);
		poltrona5C.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona5CActionPerformed(evt); 

			}


		});
		poltrona6Cselecionar = true;
		poltrona6C = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona6C.setBounds(540, 360, 30, 30);
		poltrona6C.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona6CActionPerformed(evt); 

			}


		});
		poltrona1Dselecionar = true;
		poltrona1D = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona1D.setBounds(360, 390, 30, 30);
		poltrona1D.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona1DActionPerformed(evt); 

			}


		});
		poltrona2Dselecionar = true;
		poltrona2D = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona2D.setBounds(390, 390, 30, 30);
		poltrona2D.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona2DActionPerformed(evt); 

			}


		});
		poltrona3Dselecionar = true;
		poltrona3D = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona3D.setBounds(420, 390, 30, 30);
		poltrona3D.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona3DActionPerformed(evt); 

			}


		});
		poltrona4Dselecionar = true;
		poltrona4D = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona4D.setBounds(480, 390, 30, 30);
		poltrona4D.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona4DActionPerformed(evt); 

			}


		});
		poltrona5Dselecionar = true;
		poltrona5D = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona5D.setBounds(510, 390, 30, 30);
		poltrona5D.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona5DActionPerformed(evt); 

			}


		});
		poltrona6Dselecionar = true;
		poltrona6D = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona6D.setBounds(540, 390, 30, 30);
		poltrona6D.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona6DActionPerformed(evt); 

			}


		});

		poltrona1Eselecionar = true;
		poltrona1E = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona1E.setBounds(360, 420, 30, 30);
		poltrona1E.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona1EActionPerformed(evt); 

			}


		});
		poltrona2Eselecionar = true;
		poltrona2E = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona2E.setBounds(390, 420, 30, 30);
		poltrona2E.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona2EActionPerformed(evt); 

			}


		});
		poltrona3Eselecionar = true;
		poltrona3E = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona3E.setBounds(420, 420, 30, 30);
		poltrona3E.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona3EActionPerformed(evt); 

			}


		});
		poltrona4Eselecionar = true;
		poltrona4E = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona4E.setBounds(480, 420, 30, 30);
		poltrona4E.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona4EActionPerformed(evt); 

			}


		});
		poltrona5Eselecionar = true;
		poltrona5E = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona5E.setBounds(510, 420, 30, 30);
		poltrona5E.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona5EActionPerformed(evt); 

			}


		});
		poltrona6Eselecionar = true;
		poltrona6E = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona6E.setBounds(540, 420, 30, 30);
		poltrona6E.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona6EActionPerformed(evt); 

			}


		});

		poltrona1Fselecionar = true;
		poltrona1F = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona1F.setBounds(360, 450, 30, 30);
		poltrona1F.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona1FActionPerformed(evt); 

			}


		});
		poltrona2Fselecionar = true;
		poltrona2F = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona2F.setBounds(390, 450, 30, 30);
		poltrona2F.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona2FActionPerformed(evt); 

			}


		});
		poltrona3Fselecionar = true;
		poltrona3F = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona3F.setBounds(420, 450, 30, 30);
		poltrona3F.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona3FActionPerformed(evt); 

			}


		});
		poltrona4Fselecionar = true;
		poltrona4F = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona4F.setBounds(480, 450, 30, 30);
		poltrona4F.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona4FActionPerformed(evt); 

			}


		});
		poltrona5Fselecionar = true;
		poltrona5F = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona5F.setBounds(510, 450, 30, 30);
		poltrona5F.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona5FActionPerformed(evt); 

			}


		});
		poltrona6Fselecionar = true;
		poltrona6F = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona6F.setBounds(540, 450, 30, 30);
		poltrona6F.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona6FActionPerformed(evt); 

			}


		});

		poltrona1Gselecionar = true;
		poltrona1G = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona1G.setBounds(360, 480, 30, 30);
		poltrona1G.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona1GActionPerformed(evt); 

			}


		});
		poltrona2Gselecionar = true;
		poltrona2G = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona2G.setBounds(390, 480, 30, 30);
		poltrona2G.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona2GActionPerformed(evt); 

			}


		});
		poltrona3Gselecionar = true;
		poltrona3G = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona3G.setBounds(420, 480, 30, 30);
		poltrona3G.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona3GActionPerformed(evt); 

			}


		});
		poltrona4Gselecionar = true;
		poltrona4G = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona4G.setBounds(480, 480, 30, 30);
		poltrona4G.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona4GActionPerformed(evt); 

			}


		});
		poltrona5Gselecionar = true;
		poltrona5G = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona5G.setBounds(510, 480, 30, 30);
		poltrona5G.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona5GActionPerformed(evt); 

			}


		});
		poltrona6Gselecionar = true;
		poltrona6G = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona6G.setBounds(540, 480, 30, 30);
		poltrona6G.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona6GActionPerformed(evt); 

			}


		});
		poltrona1Hselecionar = true;
		poltrona1H = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona1H.setBounds(360, 510, 30, 30);
		poltrona1H.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona1HActionPerformed(evt); 

			}


		});
		poltrona2Hselecionar = true;
		poltrona2H = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona2H.setBounds(390, 510, 30, 30);
		poltrona2H.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona2HActionPerformed(evt); 

			}


		});	
		poltrona3Hselecionar = true;
		poltrona3H = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona3H.setBounds(420, 510, 30, 30);
		poltrona3H.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona3HActionPerformed(evt); 

			}


		});
		poltrona4Hselecionar = true;
		poltrona4H = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona4H.setBounds(480, 510, 30, 30);
		poltrona4H.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona4HActionPerformed(evt); 

			}


		});
		poltrona5Hselecionar = true;
		poltrona5H = new JLabel(new ImageIcon("img/poltronaVaga.png"));
		poltrona5H.setBounds(510, 510, 30, 30);
		poltrona5H.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(java.awt.event.MouseEvent evt) {  

				poltrona5HActionPerformed(evt); 

			}


		});
		poltrona6Hselecionar = true;
		poltrona6H = new JLabel(new ImageIcon("img/poltronaVaga.png"));
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
		if(poltrona1Aselecionar == true){

			poltrona1A.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona1A.setBounds(360, 300, 30, 30);
			poltrona1Aselecionar = false;

		}else if(poltrona1Aselecionar == false){
			poltrona1A.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona1A.setBounds(360, 300, 30, 30);
			poltrona1Aselecionar = true;
		}

	}
	public void poltrona2AActionPerformed(MouseEvent evt){
		if(poltrona2Aselecionar == true){

			poltrona2A.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona2A.setBounds(390, 300, 30, 30);
			poltrona2Aselecionar = false;

		}else if(poltrona2Aselecionar == false){
			poltrona2A.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona2A.setBounds(390, 300, 30, 30);
			poltrona2Aselecionar = true;
		}

	}
	public void poltrona3AActionPerformed(MouseEvent evt){
		if(poltrona3Aselecionar == true){

			poltrona3A.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona3A.setBounds(420, 300, 30, 30);
			poltrona3Aselecionar = false;

		}else if(poltrona3Aselecionar == false){
			poltrona3A.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona3A.setBounds(420, 300, 30, 30);
			poltrona3Aselecionar = true;
		}

	}
	public void poltrona4AActionPerformed(MouseEvent evt){
		if(poltrona4Aselecionar == true){

			poltrona4A.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona4A.setBounds(480, 300, 30, 30);
			poltrona4Aselecionar = false;

		}else if(poltrona4Aselecionar == false){
			poltrona4A.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona4A.setBounds(480, 300, 30, 30);
			poltrona4Aselecionar = true;
		}

	}
	public void poltrona5AActionPerformed(MouseEvent evt){
		if(poltrona5Aselecionar == true){

			poltrona5A.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona5A.setBounds(510, 300, 30, 30);
			poltrona5Aselecionar = false;

		}else if(poltrona5Aselecionar == false){
			poltrona5A.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona5A.setBounds(510, 300, 30, 30);
			poltrona5Aselecionar = true;
		}

	}
	public void poltrona6AActionPerformed(MouseEvent evt){
		if(poltrona6Aselecionar == true){

			poltrona6A.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona6A.setBounds(540, 300, 30, 30);
			poltrona6Aselecionar = false;

		}else if(poltrona6Aselecionar == false){
			poltrona6A.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona6A.setBounds(540, 300, 30, 30);
			poltrona6Aselecionar = true;
		}

	}


	private void poltrona1BActionPerformed(MouseEvent evt) {
		if(poltrona1Bselecionar == true){

			poltrona1B.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona1B.setBounds(360, 330, 30, 30);
			poltrona1Bselecionar = false;

		}else if(poltrona1Bselecionar == false){
			poltrona1B.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona1B.setBounds(360, 330, 30, 30);
			poltrona1Bselecionar = true;
		}

	}

	private void poltrona2BActionPerformed(MouseEvent evt) {
		if(poltrona2Bselecionar == true){

			poltrona2B.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona2B.setBounds(390, 330, 30, 30);
			poltrona2Bselecionar = false;

		}else if(poltrona2Bselecionar == false){
			poltrona2B.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona2B.setBounds(390, 330, 30, 30);
			poltrona2Bselecionar = true;
		}

	}

	private void poltrona3BActionPerformed(MouseEvent evt) {
		if(poltrona3Bselecionar == true){

			poltrona3B.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona3B.setBounds(420, 330, 30, 30);
			poltrona3Bselecionar = false;

		}else if(poltrona3Bselecionar == false){
			poltrona3B.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona3B.setBounds(420, 330, 30, 30);
			poltrona3Bselecionar = true;
		}

	}

	private void poltrona4BActionPerformed(MouseEvent evt) {
		if(poltrona4Bselecionar == true){

			poltrona4B.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona4B.setBounds(480, 330, 30, 30);
			poltrona4Bselecionar = false;

		}else if(poltrona4Bselecionar == false){
			poltrona4B.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona4B.setBounds(480, 330, 30, 30);
			poltrona4Bselecionar = true;
		}

	}

	private void poltrona5BActionPerformed(MouseEvent evt) {
		if(poltrona5Bselecionar == true){

			poltrona5B.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona5B.setBounds(510, 330, 30, 30);
			poltrona5Bselecionar = false;

		}else if(poltrona5Bselecionar == false){
			poltrona5B.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona5B.setBounds(510, 330, 30, 30);
			poltrona5Bselecionar = true;
		}

	}

	private void poltrona6BActionPerformed(MouseEvent evt) {
		if(poltrona6Bselecionar == true){

			poltrona6B.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona6B.setBounds(540, 330, 30, 30);
			poltrona6Bselecionar = false;

		}else if(poltrona6Bselecionar == false){
			poltrona6B.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona6B.setBounds(540, 330, 30, 30);
			poltrona6Bselecionar = true;
		}

	}

	private void poltrona1CActionPerformed(MouseEvent evt) {
		if(poltrona1Cselecionar == true){

			poltrona1C.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona1C.setBounds(360, 360, 30, 30);
			poltrona1Cselecionar = false;

		}else if(poltrona1Cselecionar == false){
			poltrona1C.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona1C.setBounds(360, 360, 30, 30);
			poltrona1Cselecionar = true;
		}

	}

	private void poltrona2CActionPerformed(MouseEvent evt) {
		if(poltrona2Cselecionar == true){

			poltrona2C.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona2C.setBounds(390, 360, 30, 30);
			poltrona2Cselecionar = false;

		}else if(poltrona2Cselecionar == false){
			poltrona2C.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona2C.setBounds(390, 360, 30, 30);
			poltrona2Cselecionar = true;
		}

	}

	private void poltrona3CActionPerformed(MouseEvent evt) {
		if(poltrona3Cselecionar == true){

			poltrona3C.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona3C.setBounds(420, 360, 30, 30);
			poltrona3Cselecionar = false;

		}else if(poltrona3Cselecionar == false){
			poltrona3C.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona3C.setBounds(420, 360, 30, 30);
			poltrona3Cselecionar = true;
		}

	}

	private void poltrona4CActionPerformed(MouseEvent evt) {
		if(poltrona4Cselecionar == true){

			poltrona4C.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona4C.setBounds(480, 360, 30, 30);
			poltrona4Cselecionar = false;

		}else if(poltrona4Cselecionar == false){
			poltrona4C.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona4C.setBounds(480, 360, 30, 30);
			poltrona4Cselecionar = true;
		}

	}

	private void poltrona5CActionPerformed(MouseEvent evt) {
		if(poltrona5Cselecionar == true){

			poltrona5C.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona5C.setBounds(510, 360, 30, 30);
			poltrona5Cselecionar = false;

		}else if(poltrona5Cselecionar == false){
			poltrona5C.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona5C.setBounds(510, 360, 30, 30);
			poltrona5Cselecionar = true;
		}

	}

	private void poltrona6CActionPerformed(MouseEvent evt) {
		if(poltrona6Cselecionar == true){

			poltrona6C.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona6C.setBounds(540, 360, 30, 30);
			poltrona6Cselecionar = false;

		}else if(poltrona6Cselecionar == false){
			poltrona6C.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona6C.setBounds(540, 360, 30, 30);
			poltrona6Cselecionar = true;
		}

	}

	private void poltrona1DActionPerformed(MouseEvent evt) {
		if(poltrona1Dselecionar == true){

			poltrona1D.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona1D.setBounds(360, 390, 30, 30);
			poltrona1Dselecionar = false;

		}else if(poltrona1Dselecionar == false){
			poltrona1D.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona1D.setBounds(360, 390, 30, 30);
			poltrona1Dselecionar = true;
		}

	}

	private void poltrona2DActionPerformed(MouseEvent evt) {
		if(poltrona2Dselecionar == true){

			poltrona2D.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona2D.setBounds(390, 390, 30, 30);
			poltrona2Dselecionar = false;

		}else if(poltrona2Dselecionar == false){
			poltrona2D.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona2D.setBounds(390, 390, 30, 30);
			poltrona2Dselecionar = true;
		}

	}

	private void poltrona3DActionPerformed(MouseEvent evt) {
		if(poltrona3Dselecionar == true){

			poltrona3D.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona3D.setBounds(420, 390, 30, 30);
			poltrona3Dselecionar = false;

		}else if(poltrona3Dselecionar == false){
			poltrona3D.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona3D.setBounds(420, 390, 30, 30);
			poltrona3Dselecionar = true;
		}

	}

	private void poltrona4DActionPerformed(MouseEvent evt) {
		if(poltrona4Dselecionar == true){

			poltrona4D.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona4D.setBounds(480, 390, 30, 30);
			poltrona4Dselecionar = false;

		}else if(poltrona4Dselecionar == false){
			poltrona4D.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona4D.setBounds(480, 390, 30, 30);
			poltrona4Dselecionar = true;
		}

	}

	private void poltrona5DActionPerformed(MouseEvent evt) {
		if(poltrona5Dselecionar == true){

			poltrona5D.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona5D.setBounds(510, 390, 30, 30);
			poltrona5Dselecionar = false;

		}else if(poltrona5Dselecionar == false){
			poltrona5D.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona5D.setBounds(510, 390, 30, 30);
			poltrona5Dselecionar = true;
		}

	}

	private void poltrona6DActionPerformed(MouseEvent evt) {
		if(poltrona6Dselecionar == true){

			poltrona6D.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona6D.setBounds(540, 390, 30, 30);
			poltrona6Dselecionar = false;

		}else if(poltrona6Dselecionar == false){
			poltrona6D.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona6D.setBounds(540, 390, 30, 30);
			poltrona6Dselecionar = true;
		}

	}

	private void poltrona1EActionPerformed(MouseEvent evt) {
		if(poltrona1Eselecionar == true){

			poltrona1E.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona1E.setBounds(360, 420, 30, 30);
			poltrona1Eselecionar = false;

		}else if(poltrona1Eselecionar == false){
			poltrona1E.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona1E.setBounds(360, 420, 30, 30);
			poltrona1Eselecionar = true;
		}

	}

	private void poltrona2EActionPerformed(MouseEvent evt) {
		if(poltrona2Eselecionar == true){

			poltrona2E.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona2E.setBounds(390, 420, 30, 30);
			poltrona2Eselecionar = false;

		}else if(poltrona2Eselecionar == false){
			poltrona2E.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona2E.setBounds(390, 420, 30, 30);
			poltrona2Eselecionar = true;
		}

	}

	private void poltrona3EActionPerformed(MouseEvent evt) {
		if(poltrona3Eselecionar == true){

			poltrona3E.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona3E.setBounds(420, 420, 30, 30);
			poltrona3Eselecionar = false;

		}else if(poltrona3Eselecionar == false){
			poltrona3E.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona3E.setBounds(420, 420, 30, 30);
			poltrona3Eselecionar = true;
		}

	}

	private void poltrona4EActionPerformed(MouseEvent evt) {
		if(poltrona4Eselecionar == true){

			poltrona4E.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona4E.setBounds(480, 420, 30, 30);
			poltrona4Eselecionar = false;

		}else if(poltrona4Eselecionar == false){
			poltrona4E.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona4E.setBounds(480, 420, 30, 30);
			poltrona4Eselecionar = true;
		}

	}

	private void poltrona5EActionPerformed(MouseEvent evt) {
		if(poltrona5Eselecionar == true){

			poltrona5E.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona5E.setBounds(510, 420, 30, 30);
			poltrona5Eselecionar = false;

		}else if(poltrona5Eselecionar == false){
			poltrona5E.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona5E.setBounds(510, 420, 30, 30);
			poltrona5Eselecionar = true;
		}

	}

	private void poltrona6EActionPerformed(MouseEvent evt) {
		if(poltrona6Eselecionar == true){

			poltrona6E.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona6E.setBounds(540, 420, 30, 30);
			poltrona6Eselecionar = false;

		}else if(poltrona6Eselecionar == false){
			poltrona6E.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona6E.setBounds(540, 420, 30, 30);
			poltrona6Eselecionar = true;
		}

	}

	private void poltrona1FActionPerformed(MouseEvent evt) {
		if(poltrona1Fselecionar == true){

			poltrona1F.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona1F.setBounds(360, 450, 30, 30);
			poltrona1Fselecionar = false;

		}else if(poltrona1Fselecionar == false){
			poltrona1F.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona1F.setBounds(360, 450, 30, 30);
			poltrona1Fselecionar = true;
		}


	}

	private void poltrona2FActionPerformed(MouseEvent evt) {
		if(poltrona2Fselecionar == true){

			poltrona2F.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona2F.setBounds(390, 450, 30, 30);
			poltrona2Fselecionar = false;

		}else if(poltrona2Fselecionar == false){
			poltrona2F.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona2F.setBounds(390, 450, 30, 30);
			poltrona2Fselecionar = true;
		}

	}

	private void poltrona3FActionPerformed(MouseEvent evt) {
		if(poltrona3Fselecionar == true){

			poltrona3F.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona3F.setBounds(420, 450, 30, 30);
			poltrona3Fselecionar = false;

		}else if(poltrona3Fselecionar == false){
			poltrona3F.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona3F.setBounds(420, 450, 30, 30);
			poltrona3Fselecionar = true;
		}

	}

	private void poltrona4FActionPerformed(MouseEvent evt) {
		if(poltrona4Fselecionar == true){

			poltrona4F.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona4F.setBounds(480, 450, 30, 30);
			poltrona4Fselecionar = false;

		}else if(poltrona4Fselecionar == false){
			poltrona4F.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona4F.setBounds(480, 450, 30, 30);
			poltrona4Fselecionar = true;
		}

	}

	private void poltrona5FActionPerformed(MouseEvent evt) {
		if(poltrona5Fselecionar == true){

			poltrona5F.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona5F.setBounds(510, 450, 30, 30);
			poltrona5Fselecionar = false;

		}else if(poltrona5Fselecionar == false){
			poltrona5F.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona5F.setBounds(510, 450, 30, 30);
			poltrona5Fselecionar = true;
		}

	}

	private void poltrona6FActionPerformed(MouseEvent evt) {
		if(poltrona6Fselecionar == true){

			poltrona6F.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona6F.setBounds(540, 450, 30, 30);
			poltrona6Fselecionar = false;

		}else if(poltrona6Fselecionar == false){
			poltrona6F.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona6F.setBounds(540, 450, 30, 30);
			poltrona6Fselecionar = true;
		}

	}

	private void poltrona1GActionPerformed(MouseEvent evt) {
		if(poltrona1Gselecionar == true){

			poltrona1G.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona1G.setBounds(360, 480, 30, 30);
			poltrona1Gselecionar = false;

		}else if(poltrona1Gselecionar == false){
			poltrona1G.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona1G.setBounds(360, 480, 30, 30);
			poltrona1Gselecionar = true;
		}

	}

	private void poltrona2GActionPerformed(MouseEvent evt) {
		if(poltrona2Gselecionar == true){

			poltrona2G.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona2G.setBounds(390, 480, 30, 30);
			poltrona2Gselecionar = false;

		}else if(poltrona2Gselecionar == false){
			poltrona2G.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona2G.setBounds(390, 480, 30, 30);
			poltrona2Gselecionar = true;
		}

	}

	private void poltrona3GActionPerformed(MouseEvent evt) {
		if(poltrona3Gselecionar == true){

			poltrona3G.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona3G.setBounds(420, 480, 30, 30);
			poltrona3Gselecionar = false;

		}else if(poltrona3Gselecionar == false){
			poltrona3G.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona3G.setBounds(420, 480, 30, 30);
			poltrona3Gselecionar = true;
		}

	}

	private void poltrona4GActionPerformed(MouseEvent evt) {
		if(poltrona4Gselecionar == true){

			poltrona4G.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona4G.setBounds(480, 480, 30, 30);
			poltrona4Gselecionar = false;

		}else if(poltrona4Gselecionar == false){
			poltrona4G.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona4G.setBounds(480, 480, 30, 30);
			poltrona4Gselecionar = true;
		}

	}

	private void poltrona5GActionPerformed(MouseEvent evt) {
		if(poltrona5Gselecionar == true){

			poltrona5G.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona5G.setBounds(510, 480, 30, 30);
			poltrona5Gselecionar = false;

		}else if(poltrona5Gselecionar == false){
			poltrona5G.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona5G.setBounds(510, 480, 30, 30);
			poltrona5Gselecionar = true;
		}

	}

	private void poltrona6GActionPerformed(MouseEvent evt) {
		if(poltrona6Gselecionar == true){

			poltrona6G.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona6G.setBounds(540, 480, 30, 30);
			poltrona6Gselecionar = false;

		}else if(poltrona6Gselecionar == false){
			poltrona6G.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona6G.setBounds(540, 480, 30, 30);
			poltrona6Gselecionar = true;
		}

	}

	private void poltrona1HActionPerformed(MouseEvent evt) {
		if(poltrona1Hselecionar == true){

			poltrona1H.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona1H.setBounds(360, 510, 30, 30);
			poltrona1Hselecionar = false;

		}else if(poltrona1Hselecionar == false){
			poltrona1H.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona1H.setBounds(360, 510, 30, 30);
			poltrona1Hselecionar = true;
		}

	}

	private void poltrona2HActionPerformed(MouseEvent evt) {
		if(poltrona2Hselecionar == true){

			poltrona2H.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona2H.setBounds(390, 510, 30, 30);
			poltrona2Hselecionar = false;

		}else if(poltrona2Hselecionar == false){
			poltrona2H.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona2H.setBounds(390, 510, 30, 30);
			poltrona2Hselecionar = true;
		}

	}

	private void poltrona3HActionPerformed(MouseEvent evt) {
		if(poltrona3Hselecionar == true){

			poltrona3H.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona3H.setBounds(420, 510, 30, 30);
			poltrona3Hselecionar = false;

		}else if(poltrona3Hselecionar == false){
			poltrona3H.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona3H.setBounds(420, 510, 30, 30);
			poltrona3Hselecionar = true;
		}

	}

	private void poltrona4HActionPerformed(MouseEvent evt) {
		if(poltrona4Hselecionar == true){

			poltrona4H.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona4H.setBounds(480, 510, 30, 30);
			poltrona4Hselecionar = false;

		}else if(poltrona4Hselecionar == false){
			poltrona4H.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona4H.setBounds(480, 510, 30, 30);
			poltrona4Hselecionar = true;
		}

	}

	private void poltrona5HActionPerformed(MouseEvent evt) {
		if(poltrona5Hselecionar == true){

			poltrona5H.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona5H.setBounds(510, 510, 30, 30);
			poltrona5Hselecionar = false;

		}else if(poltrona5Hselecionar == false){
			poltrona5H.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona5H.setBounds(510, 510, 30, 30);
			poltrona5Hselecionar = true;
		}

	}

	private void poltrona6HActionPerformed(MouseEvent evt) {
		if(poltrona6Hselecionar == true){

			poltrona6H.setIcon(new ImageIcon("img/poltronaSelecionada.png"));
			poltrona6H.setBounds(540, 510, 30, 30);
			poltrona6Hselecionar = false;

		}else if(poltrona6Hselecionar == false){
			poltrona6H.setIcon(new ImageIcon("img/poltronaVaga.png"));
			poltrona6H.setBounds(540, 510, 30, 30);
			poltrona6Hselecionar = true;
		}

	}


	private void jButton1ActionPerformed(ActionEvent evt) {
		//faz a reserva

	}

	private void jButton2ActionPerformed(ActionEvent evt) {
		JanelaEscolherPassagem janelaPassagem = new JanelaEscolherPassagem();
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
