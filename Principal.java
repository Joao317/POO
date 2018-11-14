/*import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n1, n2, n3, n4, n5;
		int opcao1 = 0;

		int opcao2 = 0;
		int opcao3 = 0;
		int posicao;
		int excluirno = 0;
		System.out.println("Inserir 4 números:\n");
		System.out.print("Inserir 1º Nº: ");
		n1 = input.nextInt();
		System.out.print("Inserir 2º Nº: ");
		n2 = input.nextInt();
		System.out.print("Inserir 3º Nº: ");
		n3 = input.nextInt();
		System.out.print("Inserir 4º Nº: ");
		n4 = input.nextInt();
		System.out.print("\n");
		while (opcao1 != 6) {
			System.out.println(
					"1- Ordenar \n2- Procura \n3- Lista Simples \n4- Lista Dupla \n5- Mostra Valores \n6- Encerrar");
			System.out.print("Escolha uma opção: ");
			opcao1 = input.nextInt();
			System.out.print("\n");

			switch (opcao1) {
			case 1:
				Ordenacao ord = new Ordenacao();

				ord.ordenar(n1, n2, n3, n4);
				break;

			case 2:
				System.out.print("Procurar:");
				int x = input.nextInt();

				Blinear b = new Blinear();

				b.blinear(x, n1, n2, n3, n4);

				System.out.print("\n");
				break;

			case 3:
				opcao2 = 0;
				opcao3 = 0;

				NoSimples nos1 = new NoSimples(n1);
				NoSimples nos2 = new NoSimples(n2);
				NoSimples nos3 = new NoSimples(n3);
				NoSimples nos4 = new NoSimples(n4);

				ListaSimples ls = new ListaSimples();

				System.out.println("1- Inserir valor no inicio");
				System.out.println("2- Inserir valor no fim");
				System.out.println("3- Inserir valor na posição \n");

				System.out.print("Escolha a opção: ");
				opcao2 = input.nextInt();
				System.out.print("\n");

				if (opcao2 == 1) {
					System.out.println("Inserindo nó no inicio.");
					ls.insereNo_inicio(nos1);
					ls.insereNo_inicio(nos2);
					ls.insereNo_inicio(nos3);
					ls.insereNo_inicio(nos4);
					System.out.print("\n");
				}

				if (opcao2 == 2) {
					System.out.println("Inserindo nó no fim.");
					ls.insereNo_fim(nos1);
					ls.insereNo_fim(nos2);
					ls.insereNo_fim(nos3);
					ls.insereNo_fim(nos4);
					System.out.print("\n");
				}

				if (opcao2 == 3) {
					ls.insereNo_inicio(nos1);
					ls.insereNo_inicio(nos2);
					ls.insereNo_inicio(nos3);
					ls.insereNo_inicio(nos4);

					System.out.print("Digite uma posição entre 0 e " + (ls.ContarNos() - 1) + ": ");
					posicao = input.nextInt();
					System.out.println();

					System.out.print("Digite o valor do nó: ");
					n5 = input.nextInt();
					System.out.println();

					NoSimples novoNoSimples = new NoSimples(n5);
					ls.insereNo_posicao(novoNoSimples, posicao);
				}

				while (opcao3 != 4) {
					System.out.println("1- Exibir lista");
					System.out.println("2- Excluir valor da lista");
					System.out.println("3- Exibir total de valores da lista");
					System.out.println("4- Sair");
					System.out.print("\n");

					System.out.print("Escolha a opção: ");
					opcao3 = input.nextInt();
					System.out.print("\n");

					switch (opcao3) {

					case 1:
						ls.exibeLista();
						System.out.print("\n");
						break;

					case 2:
						System.out.print("Qual valor dessa lista deseja excluir?");
						excluirno = input.nextInt();
						ls.excluirNo(excluirno);
						System.out.print("\n");
						break;

					case 3:
						System.out.println("Total de valores : " + ls.ContarNos());
						System.out.print("\n");
						break;

					case 4:
						System.out.println("Saindo...");
						System.out.print("\n");
						break;

					default:
						System.out.println("Opção inválida!!!");
						System.out.print("\n");
						break;

					}

				}
				break;

			case 4:
				opcao2 = 0;
				opcao3 = 0;

				NoDuplo nod1 = new NoDuplo(n1);
				NoDuplo nod2 = new NoDuplo(n2);
				NoDuplo nod3 = new NoDuplo(n3);
				NoDuplo nod4 = new NoDuplo(n4);

				ListaDupla ld = new ListaDupla();

				System.out.println("1- Inserir valor no inicio");
				System.out.println("2- Inserir valor no fim");
				System.out.println("3- Inserir valor na posição \n");

				System.out.print("Escolha uma opção: ");
				opcao2 = input.nextInt();
				System.out.println();

				if (opcao2 == 1) {
					System.out.println("Inserindo nó no inicio");
					ld.insereNoInicio(nod1);
					ld.insereNoInicio(nod2);
					ld.insereNoInicio(nod3);
					ld.insereNoInicio(nod4);
					System.out.print("\n");
				}

				if (opcao2 == 2) {
					System.out.println("Inserindo nó no fim");
					ld.insereNoFim(nod1);
					ld.insereNoFim(nod2);
					ld.insereNoFim(nod3);
					ld.insereNoFim(nod4);
					System.out.print("\n");
				}

				if (opcao2 == 3) {
					ld.insereNoFim(nod1);
					ld.insereNoFim(nod2);
					ld.insereNoFim(nod3);
					ld.insereNoFim(nod4);

					System.out.print("Digite uma posição entre 0 e " + (ld.ContarNos() - 1) + ": ");
					posicao = input.nextInt();
					System.out.println();

					System.out.print("Digite o valor do nó: ");
					n5 = input.nextInt();
					System.out.println();

					NoDuplo novoNoDuplo = new NoDuplo(n5);
					ld.incluiNo(novoNoDuplo, posicao);
				}

				while (opcao3 != 4) {
					System.out.println("1- Exibir lista");
					System.out.println("2- Excluir valor da lista");
					System.out.println("3- Exibir total de valores da lista");
					System.out.println("4- Sair");
					System.out.print("\n");

					System.out.print("Escolha a opção: ");
					opcao3 = input.nextInt();
					System.out.print("\n");

					switch (opcao3) {

					case 1:
						ld.exibeLista();
						System.out.print("\n");
						break;

					case 2:
						System.out.print("Qual valor será excluido?");
						excluirno = input.nextInt();
						ld.excluirNo(excluirno);
						System.out.print("\n");
						break;

					case 3:
						System.out.println("Total de valores : " + ld.ContarNos());
						System.out.print("\n");
						break;

					case 4:
						System.out.println("Saindo...");
						System.out.print("\n");
						break;

					default:
						System.out.println("Opção inválida");
						System.out.print("\n");
						break;
					}

				}
				break;

			case 5:
				System.out.println("\t---Mostrar Valores:---\n");
				System.out.print("Posição:");
				System.out.println("\t1ª \t2ª \t3ª \t4ª ");
				System.out.print("Valores:");
				System.out.println("\t" + n1 + "\t" + n2 + "\t" + n3 + "\t" + n4);
				break;

			case 6:
				System.out.println("Encerrado!");
				break;

			default:
				System.out.println("Opção inválida. Digite a opção correta.\n");

			}

		}

	}

}*/