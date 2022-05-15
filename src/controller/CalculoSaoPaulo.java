package controller;

import model.Imovel;

public class CalculoSaoPaulo implements ICalculoImposto {

	@Override
	public double calcularImposto(Imovel imovel) {
		return imovel.getAreaTotal() * 10d + imovel.getNumeroComodos() * 2d;
	}

	
	
}
