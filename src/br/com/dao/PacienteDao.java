package br.com.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.controle.MyConection;
import br.com.controle.Paciente;

public class PacienteDao {
	
	private final String INSERT = "INSERT INTO tblpaciente (nomePaciente, usuarioPaciente, senhaPaciente, dataNasc,CPF,RG,email) VALUES (?,?,?,?,?,?,?)";
	private final String SELECT = "SELECT * FROM Paciente";
	private final String UPDATE = "UPDATE tblpaciente set nomePaciente = ?, usuarioPaciente = ?, senhaPaciente = ?, dataNasc = ?, CPF = ?, RG = ?, email = ?";
	private final String DELETE = "DELETE FROM tblpaciente WHERE idPaciente = ?";
	private final String LISTBYID = "SELECT * FROM tblpaciente WHERE idPaciente = ?";
	
	
	public void inserir(Paciente paciente){
		if(paciente != null){
			Connection con = null;
			PreparedStatement pstm;
			try{
				con = MyConection.getConection();
				pstm = con.prepareStatement(INSERT);
				
				pstm.setInt(0, paciente.getIdPaciente());
				pstm.setString(1, paciente.getNome());
				pstm.setString(2, paciente.getUsuario());
				pstm.setString(3, paciente.getSenha());
				pstm.setDate(4,(Date) paciente.getDataNascimeto());
				pstm.setInt(5, Integer.parseInt(paciente.getCpf()));
//				pstm.setInt(6, Integer.parseInt(paciente.getRg()));
				pstm.setString(7, paciente.getEmail());
				
				pstm.execute();
				
			}catch(Exception e){
				
			}
		}	
	}
	
	
	public List<Paciente> getPaciente(){
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		try{
			con = MyConection.getConection();
			pstm = con.prepareStatement(SELECT);
			rs = pstm.executeQuery();
			while(rs.next()){
				Paciente paciente = new Paciente();
				
				paciente.setIdPaciente(rs.getInt("idPaciente"));
				paciente.setNome(rs.getString("nomePaciente"));
				paciente.setUsuario(rs.getString("usuarioPaciente"));
				paciente.setSenha(rs.getString("senhaPaciente"));
				paciente.setDataNascimeto(rs.getDate("dataNasc"));
				paciente.setCpf(rs.getString("CPF"));
				paciente.setRg(rs.getLong("RG"));
				paciente.setEmail(rs.getString("email"));
				pacientes.add(paciente);
			}
		}catch (Exception e) {
			
		}
		return pacientes;
	}
	
	
	
}
