package model;

public class ImovelBuilder {
	
	private Imovel imovel;
	
	public ImovelBuilder() {
		this.imovel = new Imovel();
	}
	
	public static ImovelBuilder builder() {
		return new ImovelBuilder();
	}
	
	public ImovelBuilder addCidade(String cidade, String estado) {
		this.imovel.setCidade(cidade);
		this.imovel.setEstado(estado);
		return this;
	}
	
	public ImovelBuilder addAreaTotal(double areaTotal) {
		this.imovel.setAreaTotal(areaTotal);
		return this;
	}
	
	public ImovelBuilder addAreaGaragem(double areaGaragem) {
		this.imovel.setAreaGaragem(areaGaragem);
		return this;
	}
	
	public ImovelBuilder addNumeroEspacos(int numeroComodos, int numeroQuartos) {
		this.imovel.setNumeroComodos(numeroComodos);
		this.imovel.setNumeroQuartos(numeroQuartos);
		return this;
	}
	
	public ImovelBuilder addIdade(int idadeImovel) {
		this.imovel.setIdadeImovel(idadeImovel);
		return this;
	}
	
	public Imovel get() {
		return this.imovel;
	}

}
