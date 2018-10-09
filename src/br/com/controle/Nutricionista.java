package br.com.controle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Nutricionista extends Perfil{

	private String crn;
	private int idNutricionista;
	private char[] estadoCrn = new char[2];
	
	public ArrayList<Paciente> listaPaciente = new ArrayList<>();
	
	private ResultSet rs;
	private Statement stmt;
	
	@SuppressWarnings("unused")
	private void rmPaciente(){
		
	}
	
	@SuppressWarnings("unused")
	private void rmPaciente(Paciente paciente){
		
	}
	
	@SuppressWarnings("unused")
	private void addPaciente(Paciente paciente){
		Paciente.quantPaciente++;
	}
	
	/**
	 * O objeto paciente criado pode acessar seus dados no sistema u cancelar seu serviço.
	 * Está ideia ainda entra como opcional. Assim que todas as funcionalidade apresentada
	 * no requisito do sistema forem feitas.
	 */
	public void consultarPaciente(){
		try {
			stmt = MyConection.getConection().createStatement();
		} catch (SQLException er) {
			er.printStackTrace();
			System.out.println("erro ao encontrar stmt");
		}
		
		try {
			rs = stmt.executeQuery("select * from tblpaciente");
			rs.next();
			System.out.println(rs.getString("nomeAluno"));
			System.out.println(rs.getString("registroAluno"));
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Erro ao fazer consulta ao banco!");
		}
	}
	
	
	
	public void visualizarListaPacientes(){
		
		
		
	}
	
	public void consultarStatus(JTextField crn, JTextField password){
		try {
			stmt = MyConection.getConection().createStatement();
			rs = stmt.executeQuery("SELECT * FROM FARMACEUTICO WHERE LOGIN = '"+ crn.getText() +"' AND SENHA = '" + password.getText() + "'");
			rs.next();
			
			setIdNutricionista(Integer.parseInt(rs.getString("CODFARMACEUTICO")));
			setNome(rs.getString("EMAIL"));
			setCrn(rs.getString("LOGIN"));
			setSenha(rs.getString("SENHA"));

			
		} catch (SQLException e) {
			e.getMessage();
			JOptionPane.showMessageDialog(null,"Erro ao buscar status!");
		}
	}
	
	//=========================================================================================
	public ArrayList<Paciente> getListaPaciente() {
		return listaPaciente;
	}

	public void setListaPaciente(ArrayList<Paciente> listaPaciente) {
		this.listaPaciente = listaPaciente;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public Statement getStmt() {
		return stmt;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	public String getCrn() {
		return crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}

	public int getIdNutricionista() {
		return idNutricionista;
	}

	public void setIdNutricionista(int idNutricionista) {
		this.idNutricionista = idNutricionista;
	}

	public char[] getEstadoCrn() {
		return estadoCrn;
	}

	public void setEstadoCrn(char[] estadoCrn) {
		this.estadoCrn = estadoCrn;
	}
	
	

	
}
