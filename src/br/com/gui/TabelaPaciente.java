package br.com.gui;

import javax.swing.JPanel;
import br.com.controle.ModelTablePaciente;
import br.com.dao.PacienteDao;

import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

@SuppressWarnings("serial")
public class TabelaPaciente extends JPanel {
	
	private javax.swing.JTable table;
	public ModelTablePaciente modelTablePaciente;
	
	public TabelaPaciente() {
		setSize(630,300);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(23, 11, 577, 278);
		add(scrollPane);
		
		PacienteDao paciente = new PacienteDao();
		modelTablePaciente = new ModelTablePaciente(paciente.getPaciente());
		table = new javax.swing.JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setEnabled(false);
		table.setBackground(new Color(255, 250, 240));
		table.setBorder(new LineBorder(new Color(255, 250, 205)));
		table.setFillsViewportHeight(true);
		table.setGridColor(Color.BLUE);
		scrollPane.setViewportView(table);
		setVisible(true);
	}
}
