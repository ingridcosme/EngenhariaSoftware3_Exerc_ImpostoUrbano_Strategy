package controller;

import model.Imovel;

public class CalculoBeloHorizonte implements ICalculoImposto {

	@Override
	public double calcularImposto(Imovel imovel) {
		return imovel.getAreaTotal() * 7d + imovel.getNumeroQuartos() * 4d;
	}

}
