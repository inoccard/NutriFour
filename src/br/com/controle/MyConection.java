package br.com.controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class MyConection {

	private static String serverName = "localhost";
	private static String mydatabase = "hortofarmabd";
	private static String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
	private static String username = "root";
	private static String password = "";
	private static Connection conection = null;
	
	public MyConection(){
		
	}
	
	public MyConection(String username,String password){
		MyConection.username  = username;
		MyConection.password = password;
	}
	
	public MyConection(String mydatabase,String username,String password){
		MyConection.mydatabase = mydatabase;
		MyConection.username = username;
		MyConection.password = password;
	}
	
	/**
	 * 
	 * @return
	 */
	public static Connection getConection(){

		String driverName = "com.mysql.jdbc.Driver";
		
		try {
			Class.forName(driverName);
			conection = DriverManager.getConnection(url, username, password);
			System.out.println("conexao");
		} catch (ClassNotFoundException error_driver) {
			error_driver.getMessage();
		} catch (SQLException error_sql){
			error_sql.getMessage();
		}		
		if(conection != null){
			System.out.println("Conexão estabelecida com sucesso!");
		}else{
			JOptionPane.showMessageDialog(null,"Erro ao conectar-se!\nVerifique sua conexao com o banco de dados.");
		}
		
		return conection;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static Boolean fecharConexao(){
		try{
			MyConection.getConection().close();
			return true;
		} catch (SQLException error_conection) {
			error_conection.getMessage();
			return false;
		}
	}
	
	/**
	 * Abre a conexão com o banco de dados, sem a necessidade de criar o
	 * objeto myconection.
	 * @return
	 */
	public static Boolean abrirConexao(){
		try {
			MyConection.getConection();
			return true;
		} catch (Exception e) {
			return false;
		}finally {
			
		}
	}


	//===================================================================================================
	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		MyConection.serverName = serverName;
	}

	public String getMydatabase() {
		return mydatabase;
	}

	public void setMydatabase(String mydatabase) {
		MyConection.mydatabase = mydatabase;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		MyConection.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		MyConection.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		MyConection.password = password;
	}
	
}