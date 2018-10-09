package br.com.controle;

import java.sql.*;
import javax.swing.*;

public class Perfil extends Pessoa{

	private String usuario;
	private String senha;
	private String tipoUsuario;
	
	private Statement stmt;
	private ResultSet rs;
	
	public void logar(){
		
	}
	
	public void logar(String usuario, String senha){
		this.usuario = usuario;
		this.senha = senha;
	}
	
	/**
	 * 
	 * @param sql
	 */
	public Boolean logar(JTextField txtCrn, JTextField txtPassword){
		
		this.usuario = txtCrn.getText();
		this.senha = txtPassword.getText();
		
		try{
			stmt = MyConection.getConection().createStatement();
			rs = stmt.executeQuery("SELECT * FROM FARMACEUTICO WHERE LOGIN = '" + txtCrn.getText() +"' and SENHA = '" + txtPassword.getText() +"'");
			if(rs.next()){
				return true;
			}else{
				JOptionPane.showMessageDialog(null, "Erro ao encontrar usuário!\nCRN ou Senha inválido(s)!");
				txtCrn.setText(null);
				txtPassword.setText(null);
				return false;
			}
		}catch (SQLException e) {
			return false;
		}		
	}
	
	
	public void trocarSenha(){
		
	}
	
	public void trocarSenha(String senha){
		this.senha = senha;
	}
	
	
//=================================================
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
	
}
