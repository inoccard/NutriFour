package br.com.controle;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTablePaciente extends AbstractTableModel{

	/**
	 * A vari�vel serialVersionUID Substitui a anota��o '@SuppressWarnings("serial")'
	 */
	private static final long serialVersionUID = 1L;
	private static final int COL_PACIENTE = 0;
	private static final int COL_NAME = 1;
	private static final int COL_RG = 2;
	private static final int COL_EMAIL = 3;
	
	List<Paciente> linha;
	private String[] colunas = {"Id Paciente","Nome Paciente","RG","Email"};
	
	
	public ModelTablePaciente(List<Paciente> paciente){
		this.linha = paciente;
	}
	
	public ModelTablePaciente() {
	
	}
	
	/*O m�todo getRowCount retorna a quantidade total de colunas que a JTable deve usar para montar a tabela.
	 Como os dados est�o armazenados na List linhas, o m�todo retorna o tamanho da mesma.
	*/
	@Override
	public int getRowCount() {
		return this.linha.size();
	}

	/*O m�todo getColumnCount deve retornar a quantidade total de colunas que a JTable deve usar para montar a tabela.
	 * No nosso caso, o cabe�alho das colunas encontra-se armazenado no vetor colunas, desta forma, o m�todo 
	 * retorna o tamanho do vetor colunas.
	 */
	@Override
	public int getColumnCount() {
		return colunas.length;
	}

//	@Override
//	public Object getValueAt(int rowIndex, int columnIndex) {
//		
//		switch(rowIndex){
//			case 0:
//				return this.linha.get(rowIndex).getIdPaciente();
//			
//		
//		}
//		return 0;
//	}
	
	public Object getValueAt(int row, int column) {

		Paciente p = linha.get(row);

		if (column == COL_PACIENTE) {
			return p.getIdPaciente();
		} else if (column == COL_NAME) {
			return p.getNome();
		} else if (column == COL_RG) {
			return p.getRg();
		} else if (column == COL_EMAIL) {
			return p.getEmail();
		}
		return "";
	}
	
	/*O m�todo getColumnName retorna o nome da coluna referente ao �ndice especificado por par�metro. 
	 * Como os nomes das colunas est�o armazenados no vetor colunas, o m�todo retorna a String 
	 * armazenada na posi��o especificada no par�metro.
	 */
	@Override
	public String getColumnName(int columnIndex){
		return this.colunas[columnIndex];
	}


	//================================================================================================

	public void setListaPaciente(ArrayList<Paciente> listaPaciente) {
		this.linha = listaPaciente;
	}

	public String[] getColunas() {
		return colunas;
	}

	public void setColunas(String[] colunas) {
		this.colunas = colunas;
	}
	
	
}
