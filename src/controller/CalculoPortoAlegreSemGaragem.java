package controller;

import model.Imovel;

public class CalculoPortoAlegreSemGaragem implements ICalculoImposto {

	@Override
	public double calcularImposto(Imovel imovel) {
		return imovel.getAreaTotal() * 8d;
	}

}
