package br.com.controle;

//=========================================
import java.util.Date;


	public abstract class Pessoa {

		private String nome;
		private String email;
		private Date dataNascimeto;
		private long rg;
		private String cpf;
		public Endereco endereco;
		
		
		public void visualizarDadosDePessoa(){
			System.out.println(endereco.getEstado());
			System.out.println(endereco.getCidade());
			System.out.println(endereco.getBairro());
			System.out.println(endereco.getNomeRua());
			System.out.println(endereco.getCep());
			System.out.println(endereco.getNumeroCasa());
		}
		
//=============================================================================================
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Date getDataNascimeto() {
			return dataNascimeto;
		}
		public void setDataNascimeto(Date dataNascimeto) {
			this.dataNascimeto = dataNascimeto;
		}
		public long getRg() {
			return rg;
		}
		public void setRg(long rg) {
			this.rg = rg;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public Endereco getEndereco() {
			return endereco;
		}
		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}
		
		
		
}
	

