package br.com.aplication;

import javax.swing.JFrame;

import br.com.controle.Nutricionista;
import br.com.gui.TabelaPaciente;

import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class Nutrifour extends JFrame{
	
	private JTextField txtBuscar;
	
	private JMenuBar jmbMenuNutricionista;
	private JMenu jmnNutricionista;
	private JMenuItem jmiConfiguracoes;
	
	private JButton btnPesquisar;
	private JButton btnSair;
	private JButton btnAdicionarPaciente;
	private JButton btnAtualizarPaciente;
	private JButton btnOpcao;
	private JButton btnDeletarPaciente;
	
	public Nutrifour(Nutricionista nutricionista) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kairo Rodrigues\\Documents\\Faculdade\\5\u00B0 Semestre\\Projeto Integrador\\Projeto Integrador\\Projeto Nutricionista\\NutriFour\\_imagens\\icon.png"));
		setTitle(nutricionista.getNome() + " - Bem Vindo ao NutriFour!");
		setSize(904,700);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel jpnBarraPesquisa = new JPanel();
		jpnBarraPesquisa.setBackground(new Color(255, 250, 240));
		jpnBarraPesquisa.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Campo de Pesquisa de Pacientes", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(143, 188, 143)));
		getContentPane().add(jpnBarraPesquisa, BorderLayout.EAST);
		
		btnPesquisar = new javax.swing.JButton();
		btnPesquisar.setIcon(new ImageIcon("C:\\Users\\Kairo Rodrigues\\Documents\\Faculdade\\5\u00B0 Semestre\\Projeto Integrador\\Projeto Integrador\\Projeto Nutricionista\\NutriFour\\_imagens\\search.png"));
		btnPesquisar.setToolTipText("Pesquisar unico paciente");
		
		txtBuscar = new JTextField();
		txtBuscar.setColumns(10);
		
		
		btnSair = new javax.swing.JButton("Sair");
		btnSair.addActionListener(new BtnSair());
		
		btnAdicionarPaciente = new javax.swing.JButton();
		btnAdicionarPaciente.setIcon(new ImageIcon("C:\\Users\\Kairo Rodrigues\\Documents\\Faculdade\\5\u00B0 Semestre\\Projeto Integrador\\Projeto Integrador\\Projeto Nutricionista\\NutriFour\\_imagens\\user2.png"));
		btnAdicionarPaciente.setToolTipText("Criar um novo paciente");
		
		btnAtualizarPaciente = new javax.swing.JButton();
		btnAtualizarPaciente.setIcon(new ImageIcon("C:\\Users\\Kairo Rodrigues\\Documents\\Faculdade\\5\u00B0 Semestre\\Projeto Integrador\\Projeto Integrador\\Projeto Nutricionista\\NutriFour\\_imagens\\Update.png"));
		btnAtualizarPaciente.setToolTipText("Atualizar dados de Paciente");
		
		btnOpcao = new javax.swing.JButton();
		btnOpcao.setEnabled(false);
		
		btnDeletarPaciente = new javax.swing.JButton();
		btnDeletarPaciente.setIcon(new ImageIcon("C:\\Users\\Kairo Rodrigues\\Documents\\Faculdade\\5\u00B0 Semestre\\Projeto Integrador\\Projeto Integrador\\Projeto Nutricionista\\NutriFour\\_imagens\\Delete.png"));
		btnDeletarPaciente.setToolTipText("Excluir Paciente");
		
		JCheckBox cxbNome = new JCheckBox("Nome");
		cxbNome.setBackground(new Color(255, 250, 240));
		cxbNome.setHorizontalAlignment(SwingConstants.LEFT);
		
		JCheckBox cxbCpf = new JCheckBox("CPF");
		cxbCpf.setBackground(new Color(255, 250, 240));
		cxbCpf.setHorizontalAlignment(SwingConstants.LEFT);
		
		JCheckBox cxbRg = new JCheckBox("RG");
		cxbRg.setBackground(new Color(255, 250, 240));
		cxbRg.setHorizontalAlignment(SwingConstants.LEFT);
		
		JCheckBox cxbIdPaciente = new JCheckBox("ID Paciente");
		cxbIdPaciente.setBackground(new Color(255, 250, 240));
		cxbIdPaciente.setHorizontalAlignment(SwingConstants.LEFT);
		
		GroupLayout gl_jpnBarraPesquisa = new GroupLayout(jpnBarraPesquisa);
		gl_jpnBarraPesquisa.setHorizontalGroup(
			gl_jpnBarraPesquisa.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_jpnBarraPesquisa.createSequentialGroup()
					.addGroup(gl_jpnBarraPesquisa.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpnBarraPesquisa.createSequentialGroup()
							.addGap(35)
							.addGroup(gl_jpnBarraPesquisa.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnOpcao, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnAdicionarPaciente, GroupLayout.PREFERRED_SIZE, 91, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_jpnBarraPesquisa.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnAtualizarPaciente, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
								.addComponent(btnDeletarPaciente, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
							.addGap(20))
						.addGroup(gl_jpnBarraPesquisa.createSequentialGroup()
							.addGap(20)
							.addGroup(gl_jpnBarraPesquisa.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtBuscar, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_jpnBarraPesquisa.createSequentialGroup()
									.addComponent(cxbNome, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(cxbCpf, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_jpnBarraPesquisa.createSequentialGroup()
									.addComponent(cxbRg, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(cxbIdPaciente, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnPesquisar, Alignment.TRAILING))))
					.addGap(13))
				.addGroup(gl_jpnBarraPesquisa.createSequentialGroup()
					.addContainerGap(197, Short.MAX_VALUE)
					.addComponent(btnSair)
					.addContainerGap())
		);
		gl_jpnBarraPesquisa.setVerticalGroup(
			gl_jpnBarraPesquisa.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpnBarraPesquisa.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_jpnBarraPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(cxbNome)
						.addComponent(cxbCpf))
					.addGap(18)
					.addGroup(gl_jpnBarraPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(cxbRg)
						.addComponent(cxbIdPaciente))
					.addGap(19)
					.addComponent(txtBuscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnPesquisar)
					.addGap(113)
					.addGroup(gl_jpnBarraPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAtualizarPaciente, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAdicionarPaciente, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jpnBarraPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDeletarPaciente, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOpcao, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
					.addGap(134)
					.addComponent(btnSair)
					.addContainerGap())
		);
		gl_jpnBarraPesquisa.setAutoCreateContainerGaps(true);
		
		
		
		jpnBarraPesquisa.setLayout(gl_jpnBarraPesquisa);
		
		JPanel jpnPaciente = new JPanel();
		jpnPaciente.setBackground(new Color(255, 250, 240));
		getContentPane().add(jpnPaciente, BorderLayout.CENTER);
		jpnPaciente.setLayout(new BorderLayout(0, 0));
		
		TabelaPaciente tabelaPaciente = new TabelaPaciente();
		tabelaPaciente.setBackground(new Color(255, 250, 240));
		jpnPaciente.add(tabelaPaciente, BorderLayout.CENTER);
		
		jmbMenuNutricionista = new JMenuBar();
		getContentPane().add(jmbMenuNutricionista, BorderLayout.NORTH);
		
		jmnNutricionista = new JMenu("Nutricionista");
		jmbMenuNutricionista.add(jmnNutricionista);
		
		jmiConfiguracoes = new JMenuItem("Configuracoes");
		jmiConfiguracoes.setIcon(new ImageIcon("C:\\Users\\Kairo Rodrigues\\Documents\\Faculdade\\5\u00B0 Semestre\\Projeto Integrador\\Projeto Integrador\\Projeto Nutricionista\\NutriFour\\_imagens\\conf.png"));
		jmnNutricionista.add(jmiConfiguracoes);
		
		txtBuscar.grabFocus();
	}

	
	
	

	private class BtnSair implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(EXIT_ON_CLOSE);
		}
	}
}
