package controller;

import model.Imovel;

public class CalculoCuritiba20A50 implements ICalculoImposto {

	@Override
	public double calcularImposto(Imovel imovel) {
		return imovel.getAreaTotal() * 8d + imovel.getIdadeImovel() * 2.5d;
	}

}
