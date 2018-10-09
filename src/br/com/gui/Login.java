package br.com.gui;

import javax.swing.border.TitledBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import br.com.aplication.Nutrifour;
import br.com.controle.Nutricionista;

@SuppressWarnings("serial")
public class Login extends JFrame{
	
	private Nutricionista nutricionista;
	
	
	private JTextField txtCrn;
	private JPasswordField txtPassword;
	private JPanel jpnLogin; 
	private JButton btnEntrar;
	private JButton btnCancelar;
	
	public Login(){
		carregarFrame();
	}
	
	
	/**
	 * 
	 */
	public void carregarFrame(){
		panelLogin();
		addButton();
		inserirLabels();
		addEntradaTexto();
		definirFrame(400, 400,Color.WHITE,Color.BLACK);
	}
	
	/**
	 * 
	 * @param width
	 * @param height
	 * @param background
	 * @param foregroud
	 */
	public void definirFrame(int width, int height, Color background, Color foregroud){
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("_imagens/icon.png"));
		setResizable(false);
		setTitle("NutriFour");
		setSize(562,401);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(background);
		getContentPane().setForeground(foregroud);
		getContentPane().setLayout(null);
	
	}
	
	/**
	 * 
	 */
	public void addButton(){
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setMnemonic('c');
		btnCancelar.addActionListener(new BtnCancelar());
		btnCancelar.setBounds(291, 111, 90, 25);
		jpnLogin.add(btnCancelar);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setMnemonic('e');
		btnEntrar.addActionListener(new BtnEntrar());
		btnEntrar.setBounds(191, 111, 90, 25);
		jpnLogin.add(btnEntrar);
	}
	
	/**
	 * 
	 */
	public void addEntradaTexto(){
		txtCrn = new JTextField();
		txtCrn.setToolTipText("Carteira de Registro do Nutricionista");
		txtCrn.setBackground(SystemColor.menu);
		txtCrn.setBounds(198, 28, 183, 20);
		jpnLogin.add(txtCrn);
		txtCrn.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setToolTipText("Senha");
		txtPassword.setBackground(SystemColor.menu);
		txtPassword.setBounds(198, 59, 183, 20);
		jpnLogin.add(txtPassword);
		
		txtCrn.grabFocus();
	}
	
	/**
	 * 
	 */
	public void panelLogin(){
		
		jpnLogin = new JPanel();
		jpnLogin.setBackground(Color.WHITE);
		jpnLogin.setForeground(Color.BLACK);
		jpnLogin.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Login", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.desktop));
		jpnLogin.setBounds(10, 174, 536, 186);
		getContentPane().add(jpnLogin);
		jpnLogin.setLayout(null);
		
	}
	
	
	/**
	 * 
	 */
	public void inserirLabels(){
	
		JLabel lblCrn = new JLabel("CRN:");
		lblCrn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrn.setBounds(108, 28, 80, 20);
		jpnLogin.add(lblCrn);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(108, 59, 80, 20);
		jpnLogin.add(lblPassword);
		
		JLabel lblLogo = new JLabel();
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setIcon(new ImageIcon("_imagens/Logo.png"));
		lblLogo.setBounds(10, 11, 536, 152);
		getContentPane().add(lblLogo);
		
		JLabel lblDescricao = new JLabel();
		lblDescricao.setForeground(Color.BLUE);
		lblDescricao.setFont(new Font("Arial", Font.BOLD, 12));
		lblDescricao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescricao.setBounds(10, 346, 246, 14);
		getContentPane().add(lblDescricao);
		
	}
	
	
	/**
	 * Criada a classe de evento para o botão Cancelar.
	 * @author Kairo Rodrigues
	 */
	private class BtnCancelar implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(JFrame.EXIT_ON_CLOSE);
		}
	}
	
	/**
	 * Class que busca no banco os dados passados no txtField e retornar os valores
	 * e caso sejam verdadeiros a tela fechará e retornara uma janela do nutricionista.
	 * @author Kairo Rodrigues
	 */
	private class BtnEntrar implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			nutricionista = new Nutricionista();
			
			if(nutricionista.logar(txtCrn, txtPassword)){
				nutricionista.consultarStatus(txtCrn , txtPassword);
				setVisible(false);
				new Nutrifour(nutricionista);
			}
		}
	}

	
	//====================================================================================================================
	public JButton getBtnEntrar() {
		return btnEntrar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}
	
	public Nutricionista getNutricionista(){
		return nutricionista;
	}
}

