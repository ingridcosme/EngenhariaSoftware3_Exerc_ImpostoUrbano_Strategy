package controller;

import model.Imovel;

public class CalculoPortoAlegreComGaragem implements ICalculoImposto {

	@Override
	public double calcularImposto(Imovel imovel) {
		return imovel.getAreaTotal() * 7.5d + imovel.getAreaGaragem() * 2.5d;
	}

}
