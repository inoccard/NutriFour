package br.com.controle;

import java.util.Date;

public class Paciente extends Perfil implements CalcularVariacaoPeso{
	
	private int idPaciente;
	private double[] peso;
	public static int quantPaciente = 0;
	private double variacao;
	private double somaVariacaoMes = 0;
	
	
	public Paciente(){
		quantPaciente++;
	}
	
	/**
	 * Ao criar um novo paciente talvez seja obrigatorio uma pesagem inicial.
	 * @param date
	 * @param peso
	 */
	public Paciente(Date date,double peso){
		
		quantPaciente++;
	}
	

	

	@Override
	public double monthlyVariation(Date data1, double peso1, Date data2, double peso2)  { return 0; }

	
	
	@Override
	public double monthlyVariation(double peso_1, double peso_2) {
		if(peso_1 < peso_2){
			variacao = peso_2 - peso_1;
		}else if(peso_1 > peso_2){
			variacao = peso_1 - peso_2;
		}else{
			variacao = 0;
		}
		return variacao;
	}
	
	
	public double[] monthlyVariation(double[] peso) {
		this.peso = new double[peso.length / 2];
		
		for(int i = 0, j = 0; i < peso.length - 1;i++){
			if(i % 2 == 0){
				this.peso[j] = peso[i + 1] - peso[i];
				j++;
			}
		}
		
		return this.peso;
	}
	
	
	/**
	 * @param peso_1
	 * @param peso_2
	 */
	public void monthlyVariationLongYear(double peso_1, double peso_2){ }
	
	
	public double monthlyVariationLongYear(){
		return (somaVariacaoMes / 12);
	}
	
	/**
	 * Verifica se o paciente sempre perdeu peso durante os meses.
	 * @return
	 */
	public boolean variationFirstDayMonth(double[] peso){
		for(int i = 0; i <= peso.length -1; i++){
			if(i % 2 == 0){
				if(peso[i + 1] - peso[i] >= 0){
					return false;
				}					
			}
		}
		return true;
	}
	
	
	/**
	 * 
	 */
	public void cancelarServico(){ }
	
	//==============================================================================================================
	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public double[] getPeso() {
		return peso;
	}

	public void setPeso(double[] peso) {
		this.peso = peso;
	}

	public static int getQuantPaciente() {
		return quantPaciente;
	}

	public static void setQuantPaciente(int quantPaciente) {
		Paciente.quantPaciente = quantPaciente;
	}

	public double getVariacao() {
		return variacao;
	}

	public void setVariacao(double variacao) {
		this.variacao = variacao;
	}

	public double getSomaVariacaoMes() {
		return somaVariacaoMes;
	}

	public void setSomaVariacaoMes(double somaVariacaoMes) {
		this.somaVariacaoMes = somaVariacaoMes;
	}
	
	

}
