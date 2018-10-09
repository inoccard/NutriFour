package br.com.controle;

import java.util.Date;

public interface CalcularVariacaoPeso {

	/**
	 * Calcular a variação mensal de peso de cada paciente.
	 * @param data1
	 * @param peso1
	 * @param data2
	 * @param peso2
	 * @return
	 */
	double monthlyVariation(Date data1,double peso1,Date data2,double peso2);
	double monthlyVariation(double peso1, double peso2);
	double[] monthlyVariation(double[] peso);
	
	
	
	
}
