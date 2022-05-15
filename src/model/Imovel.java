package model;

public class Imovel {
	
	private String cidade;
	private String estado;
	private double areaTotal;
	private double areaGaragem;
	private int numeroComodos;
	private int numeroQuartos;
	private int idadeImovel;
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public double getAreaTotal() {
		return areaTotal;
	}
	
	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}
	
	public double getAreaGaragem() {
		return areaGaragem;
	}
	
	public void setAreaGaragem(double areaGaragem) {
		this.areaGaragem = areaGaragem;
	}
	
	public int getNumeroComodos() {
		return numeroComodos;
	}
	
	public void setNumeroComodos(int numeroComodos) {
		this.numeroComodos = numeroComodos;
	}
	
	public int getNumeroQuartos() {
		return numeroQuartos;
	}
	
	public void setNumeroQuartos(int numeroQuartos) {
		this.numeroQuartos = numeroQuartos;
	}
	
	public int getIdadeImovel() {
		return idadeImovel;
	}
	
	public void setIdadeImovel(int idadeImovel) {
		this.idadeImovel = idadeImovel;
	}

	@Override
	public String toString() {
		return "Im�vel:"
				+ "\n cidade " + cidade
				+ "\n estado " + estado
				+ "\n �rea totoal " + areaTotal + "m^2"
				+ "\n �rea garagem " + areaGaragem + "m^2"
				+ "\n n�mero de c�modos " + numeroComodos
				+ "\n n�mero de quartos " + numeroQuartos
				+ "\n idade do im�vel " + idadeImovel + " anos";
	}
	
}
