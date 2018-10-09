package br.com.aplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.controle.*;
import br.com.dao.PacienteDao;
import br.com.gui.Login;

public class Principal {

	public static void main(String[] args) {
		new Login();
//		
//		Paciente paciente = new Paciente();
//		paciente.setNome("Kairo Rodrigues dos Santos");
//		paciente.setDataNascimeto(new Date());
//		
//		Endereco endereco = new Endereco();
//		endereco.setEstado(Estado.SP);
		
		
//		double[] c = {45.0, 56.0, 78.0, 90.0,87.34,103.50,95.4,87.89,90,90};
//		
//		double []d = paciente.monthlyVariation(c);
//		
//		for(int i = 0; i < d.length; i++)
//			System.out.println(d[i]);
		
//		if(paciente.variationFirstDayMonth(c)){
//			System.out.println("O paciente sempre perdeu peso durando o ano.");
//		}
//
//		System.out.println(String.format("%.2f", paciente.monthlyVariationLongYear()));

		
		PacienteDao pacientes = new PacienteDao();
		List<Paciente> list = pacientes.getPaciente();
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).getNome());
		}
		
	}
}

