package controller;

import model.Imovel;

public class CalculoCuritiba50Mais implements ICalculoImposto {

	@Override
	public double calcularImposto(Imovel imovel) {
		return imovel.getAreaTotal() * 8d + imovel.getIdadeImovel() * 3d;
	}

}
