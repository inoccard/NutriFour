package br.com.gui;


/**
 * Cria um JFrame para adicionar um novo paciente, assim que o nutricionista clicar em 'Criar novo paciente'.
 * 
 * @author Kairo Rodrigues
 */
@SuppressWarnings("serial")
public class NewPaciente extends javax.swing.JFrame{

	public NewPaciente(){
		definirFrame();
	}
	
	protected void definirFrame(){
		this.setTitle("Novo Paciente");
		this.setSize(500, 500);
		this.setVisible(true);
		getContentPane().setLayout(null);
	}
	
}
