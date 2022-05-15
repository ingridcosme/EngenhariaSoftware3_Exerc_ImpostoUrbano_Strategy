package view;

import controller.CalculoBeloHorizonte;
import controller.CalculoCuritiba20A50;
import controller.CalculoCuritiba20Menos;
import controller.CalculoCuritiba50Mais;
import controller.CalculoPortoAlegreComGaragem;
import controller.CalculoPortoAlegreSemGaragem;
import controller.CalculoSaoPaulo;
import controller.ICalculoImposto;
import model.Imovel;
import model.ImovelBuilder;

public class Principal {

	public static void main(String[] args) {
		
		ICalculoImposto imposto;
		double valor;
		
		System.out.println("\n--------------- Imóvel de São Paulo ---------------");
		Imovel imovel1 = ImovelBuilder.builder()
				.addAreaGaragem(25.5d)
				.addAreaTotal(225d)
				.addCidade("São Paulo", "SP")
				.addNumeroEspacos(8, 3)
				.addIdade(30)
				.get();
		
		imposto = new CalculoSaoPaulo();
		valor = imposto.calcularImposto(imovel1);
		System.out.println("O imposto do imóvel é de R$ " + valor);
		System.out.println(imovel1);
		
		
		System.out.println("\n--------------- Imóvel de Belo Horizonte ---------------");
		Imovel imovel2 = ImovelBuilder.builder()
				.addAreaGaragem(50d)
				.addAreaTotal(455.5)
				.addCidade("Belo Horizonte", "MG")
				.addNumeroEspacos(10, 4)
				.addIdade(12)
				.get();
		
		imposto = new CalculoBeloHorizonte();
		valor = imposto.calcularImposto(imovel2);
		System.out.println("O imposto do imóvel é de R$ " + valor);
		System.out.println(imovel2);
		
		
		System.out.println("\n--------------- Imóvel de Porto Alegre COM Garagem ---------------");
		Imovel imovel3 = ImovelBuilder.builder()
				.addAreaGaragem(10d)
				.addAreaTotal(130d)
				.addCidade("Porto Alegre", "RS")
				.addNumeroEspacos(5, 2)
				.addIdade(5)
				.get();
		
		imposto = new CalculoPortoAlegreComGaragem();
		valor = imposto.calcularImposto(imovel3);
		System.out.println("O imposto do imóvel é de R$ " + valor);
		System.out.println(imovel3);
		
		
		System.out.println("\n--------------- Imóvel de Porto Alegre SEM Garagem ---------------");
		Imovel imovel4 = ImovelBuilder.builder()
				.addAreaTotal(1000d)
				.addCidade("Porto Alegre", "RS")
				.addNumeroEspacos(20, 6)
				.addIdade(8)
				.get();
		
		imposto = new CalculoPortoAlegreSemGaragem();
		valor = imposto.calcularImposto(imovel4);
		System.out.println("O imposto do imóvel é de R$ " + valor);
		System.out.println(imovel4);
		
		
		System.out.println("\n--------------- Imóvel de Curitiba com mais de 50 anos ---------------");
		Imovel imovel5 = ImovelBuilder.builder()
				.addAreaTotal(855d)
				.addCidade("Curitiba", "PR")
				.addNumeroEspacos(10, 5)
				.addIdade(80)
				.get();
		
		imposto = new CalculoCuritiba50Mais();
		valor = imposto.calcularImposto(imovel5);
		System.out.println("O imposto do imóvel é de R$ " + valor);
		System.out.println(imovel5);
		
		
		System.out.println("\n--------------- Imóvel de Curitiba com menos de 20 anos ---------------");
		Imovel imovel6 = ImovelBuilder.builder()
				.addAreaTotal(148d)
				.addCidade("Curitiba", "PR")
				.addNumeroEspacos(5, 2)
				.addIdade(15)
				.get();
		
		imposto = new CalculoCuritiba20Menos();
		valor = imposto.calcularImposto(imovel6);
		System.out.println("O imposto do imóvel é de R$ " + valor);
		System.out.println(imovel6);
		
		
		System.out.println("\n--------------- Imóvel de Curitiba entre 20 e 50 anos ---------------");
		Imovel imovel7 = ImovelBuilder.builder()
				.addAreaTotal(650d)
				.addCidade("Curitiba", "PR")
				.addNumeroEspacos(9, 4)
				.addIdade(35)
				.get();
		
		imposto = new CalculoCuritiba20A50();
		valor = imposto.calcularImposto(imovel7);
		System.out.println("O imposto do imóvel é de R$ " + valor);
		System.out.println(imovel7);
		
		
	}
}
