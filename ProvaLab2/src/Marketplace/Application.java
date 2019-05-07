package Marketplace;

import java.util.*;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner string = new Scanner(System.in);
		CFila FilaEsperaParabrisa = new CFila();
		CFila FilaEsperaParaChoque = new CFila();
		CFila FilaEsperaAerofolio = new CFila();

		int qtdeParabrisa = 50;
		int qtdeAerofolio = 50;
		int qtdeParaChoque = 50;
		int opcao;
		int prioridade;
		int itens = 0;
		String nome;
		do {
			System.out.println("\n\n### SISCOM - Sistema Comercial de Controle de Compras e Vendas ###");
			System.out.println("\n                ===========================");
			System.out.println("                  |     1 - Parabrisa       |");
			System.out.println("                  |     2 - Para-Choque     |");
			System.out.println("                  |     3 - Aerofolio       |");
			System.out.println("                  |     4 - Lista de Espera |");
			System.out.println("                  |     5 - Add Pedidos     |");
			System.out.println("                  |     0 - Sair            |");
			System.out.println("                  ===========================\n");
			System.out.println("Opção -> ");
			opcao = scanner.nextInt();
			System.out.print("\n");
			switch (opcao) {
			case 1:
				System.out.println("Informe quantos Parabrisa você deseja comprar");
				itens = scanner.nextInt();
				do {
					System.out.println("Informe a sua prioridade:(1 ou 2)");
					prioridade = scanner.nextInt();
				} while (prioridade != 1 && prioridade != 2);
				System.out.println("Informe seu nome ");
				nome = string.nextLine();
				Cliente parabrisa = new Cliente(nome, prioridade);
				if (qtdeParabrisa >= itens) {
					System.out.println("Temos a quantidade disponivel");
					qtdeParabrisa = qtdeParabrisa - itens;
					System.out.println("Sua compra foi um sucesso!!!");
				} else {
					System.out.println("Nao temos a quantidade disponivel");
					System.out.println(
							"Voce foi colocado na fila de espera e será atendido de acordo com sua prioridade");
					FilaEsperaParabrisa.enfileira(parabrisa);
					FilaEsperaParabrisa.Ordena(parabrisa.getPrioridade(), parabrisa);
					FilaEsperaParabrisa.mostra();
				}
				break;
			case 2:
				System.out.println("Informe quantos ParaChoque você deseja comprar");
				itens = scanner.nextInt();
				do {
					System.out.println("Informe a sua prioridade:(1 ou 2)");
					prioridade = scanner.nextInt();
				} while (prioridade != 1 && prioridade != 2);
				System.out.println("Informe seu nome ");
				nome = string.nextLine();
				Cliente parachoque = new Cliente(nome, prioridade);
				if (qtdeParaChoque >= itens) {
					System.out.println("Temos a quantidade disponivel");
					qtdeParaChoque = qtdeParaChoque - itens;
					System.out.println("Sua compra foi um sucesso!!!");
				} else {
					System.out.println("Nao temos a quantidade disponivel");
					System.out.println(
							"Voce foi colocado na fila de espera e será atendido de acordo com sua prioridade");
					FilaEsperaParabrisa.enfileira(parachoque);
					FilaEsperaParabrisa.Ordena(parachoque.getPrioridade(), parachoque);
					FilaEsperaParabrisa.mostra();
				}
				break;
			case 3:
				System.out.println("Informe quantos Aerofolio você deseja comprar");
				itens = scanner.nextInt();
				do {
					System.out.println("Informe a sua prioridade:(1 ou 2)");
					prioridade = scanner.nextInt();
				} while (prioridade != 1 && prioridade != 2);
				System.out.println("Informe seu nome ");
				nome = string.nextLine();
				Cliente aerofolio = new Cliente(nome, prioridade);
				if (qtdeAerofolio >= itens) {
					System.out.println("Temos a quantidade disponivel");
					qtdeAerofolio = qtdeAerofolio - itens;
					System.out.println("Sua compra foi um sucesso!!!");
				} else {
					System.out.println("Nao temos a quantidade disponivel");
					System.out.println(
							"Voce foi colocado na fila de espera e será atendido de acordo com sua prioridade");
					FilaEsperaParabrisa.enfileira(aerofolio);
					FilaEsperaParabrisa.Ordena(aerofolio.getPrioridade(), aerofolio);
					FilaEsperaParabrisa.mostra();
				}
				break;
			case 4:
				System.out.println("FILA ESPERA PARABRISA:");
				FilaEsperaParabrisa.mostra();
				System.out.println("QUANTIDADE DE PEÇAS PARABRISA:" + qtdeParabrisa);
				System.out.println("FILA ESPERA PARACHOQUE:");
				FilaEsperaParaChoque.mostra();
				System.out.println("QUANTIDADE DE PEÇAS PARACHOQUE:" + qtdeParaChoque);
				System.out.println("FILA ESPERA AEROFOLIO:");
				FilaEsperaAerofolio.mostra();
				System.out.println("QUANTIDADE DE PEÇAS AEROFOLIO:" + qtdeAerofolio);
				break;
			case 5:
				
				int qtdRepos;
				System.out.println("Chegou mais pedidos?");
				String ler = string.nextLine();
				if(ler.equals("sim")) {
					System.out.println("De qual item?");
					String ler2 = string.nextLine();
					if(ler2.equals("parabrisa")) {
					System.out.println("Qual quantidade?");
					qtdRepos = scanner.nextInt();
					qtdeParabrisa = qtdeParabrisa + qtdRepos;
					}
					if (ler2.equals("parachoque")) {
						System.out.println("Qual quantidade?");
						qtdRepos = scanner.nextInt();
						qtdeParaChoque = qtdeParaChoque + qtdRepos;
					}
					if (ler2.equals("aerofolio")) {
						System.out.println("Qual quantidade?");
						qtdRepos = scanner.nextInt();
						qtdeAerofolio = qtdeAerofolio + qtdRepos;
					}
				}
break;			
			case 6:
				
		   System.out.println(FilaEsperaParabrisa.peek());
				
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
		
	}
}