import java.util.Scanner;

public class Principalporra3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3, n4, n5;
		int opcao1 = 0;
		int opcao2 = 0;
		int opcao3 = 0;
		int posicao;
		int excluirno = 0;

		System.out.println("Inserir 4 n�meros:\n");
		System.out.print("Inserir 1� N�: ");
		n1 = input.nextInt();
		System.out.print("Inserir 2� N�: ");
		n2 = input.nextInt();
		System.out.print("Inserir 3� N�: ");
		n3 = input.nextInt();
		System.out.print("Inserir 4� N�: ");
		n4 = input.nextInt();
		System.out.print("\n");

		while (opcao1 != 6) {
			System.out.println("1- Ordenar");
			System.out.println("2- Procurar");
			System.out.println("3- Lista Simples");
			System.out.println("4- Lista Dupla");
			System.out.println("5- Mostrar Valores");
			System.out.println("6- Encerrar");
			System.out.print("\n");

			System.out.print("Escolha uma op��o: ");
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
				System.out.println("3- Inserir valor na posi��o \n");

				System.out.print("Escolha uma op��o: ");
				opcao2 = input.nextInt();
				System.out.print("\n");

				if (opcao2 == 1) {

					int noSimples1, noSimples2, noSimples3, noSimples4;

					System.out.println("Inserir 4 n�meros da lista simples:\n");
					System.out.print("Inserir 1� N�: ");
					noSimples1 = input.nextInt();
					System.out.print("Inserir 2� N�: ");
					noSimples2 = input.nextInt();
					System.out.print("Inserir 3� N�: ");
					noSimples3 = input.nextInt();
					System.out.print("Inserir 4� N�: ");
					noSimples4 = input.nextInt();
					System.out.print("\n");
					NoSimples listaSimplesNos1 = new NoSimples(noSimples1);
					NoSimples listaSimplesNos2 = new NoSimples(noSimples2);
					NoSimples listaSimplesNos3 = new NoSimples(noSimples3);
					NoSimples listaSimplesNos4 = new NoSimples(noSimples4);
					System.out.println("Inserindo n� no inicio");
					ls.insereNo_inicio(listaSimplesNos1);
					ls.insereNo_inicio(listaSimplesNos2);
					ls.insereNo_inicio(listaSimplesNos3);
					ls.insereNo_inicio(listaSimplesNos4);
					System.out.print("\n");
				}

				if (opcao2 == 2) {
					int noSimples1, noSimples2, noSimples3, noSimples4;

					System.out.println("Inserir 4 n�meros da lista simples:\n");
					System.out.print("Inserir 1� N�: ");
					noSimples1 = input.nextInt();
					System.out.print("Inserir 2� N�: ");
					noSimples2 = input.nextInt();
					System.out.print("Inserir 3� N�: ");
					noSimples3 = input.nextInt();
					System.out.print("Inserir 4� N�: ");
					noSimples4 = input.nextInt();
					System.out.print("\n");
					NoSimples listaSimplesNos1 = new NoSimples(noSimples1);
					NoSimples listaSimplesNos2 = new NoSimples(noSimples2);
					NoSimples listaSimplesNos3 = new NoSimples(noSimples3);
					NoSimples listaSimplesNos4 = new NoSimples(noSimples4);
					System.out.println("Inserindo n� no fim");
					ls.insereNo_fim(listaSimplesNos1);
					ls.insereNo_fim(listaSimplesNos2);
					ls.insereNo_fim(listaSimplesNos3);
					ls.insereNo_fim(listaSimplesNos4);
					System.out.print("\n");
				}

				if (opcao2 == 3) {
					ls.insereNo_inicio(nos1);
					ls.insereNo_inicio(nos2);
					ls.insereNo_inicio(nos3);
					ls.insereNo_inicio(nos4);

					System.out.print("Digite uma posi��o entre 0 e " + (ls.ContarNos() - 1) + ": ");
					posicao = input.nextInt();
					System.out.println();

					System.out.print("Digite o valor do n�: ");
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

					System.out.print("Escolha a op��o: ");
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
						System.out.println("Total de valores: " + ls.ContarNos());
						System.out.print("\n");
						break;

					case 4:
						System.out.println("Saindo do console de lista...");
						System.out.print("\n");
						break;

					default:
						System.out.println("Op��o inv�lida!");
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
				System.out.println("3- Inserir valor na posi��o \n");

				System.out.print("Escolha uma op��o: ");
				opcao2 = input.nextInt();
				System.out.println();

				if (opcao2 == 1) {
					System.out.println("Inserindo n� no inicio.");
					ld.insereNoInicio(nod1);
					ld.insereNoInicio(nod2);
					ld.insereNoInicio(nod3);
					ld.insereNoInicio(nod4);
					System.out.print("\n");
				}

				if (opcao2 == 2) {
					System.out.println("Inserindo n� no fim.");
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

					System.out.print("Digite uma posi��o entre 0 e " + (ld.ContarNos() - 1) + ": ");
					posicao = input.nextInt();
					System.out.println();

					System.out.print("Digite o valor do n�: ");
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

					System.out.print("Escolha a op��o: ");
					opcao3 = input.nextInt();
					System.out.print("\n");

					switch (opcao3) {

					case 1:
						ld.exibeLista();
						System.out.print("\n");
						break;

					case 2:
						System.out.print("Qual valor dessa lista deseja excluir?");
						excluirno = input.nextInt();
						ld.excluirNo(excluirno);
						System.out.print("\n");
						break;

					case 3:
						System.out.println("Total de valores: " + ld.ContarNos());
						System.out.print("\n");
						break;

					case 4:
						System.out.println("Saindo do console de lista...");
						System.out.print("\n");
						break;

					default:
						System.out.println("Op��o inv�lida!");
						System.out.print("\n");
						break;
					}

				}
				break;

			case 5:
				System.out.println("\t---Mostrar Valores:---\n");
				System.out.print("Posi��o:");
				System.out.println("\t1� \t2� \t3� \t4� ");
				System.out.print("Valores:");
				System.out.println("\t" + n1 + "\t" + n2 + "\t" + n3 + "\t" + n4);
				break;

			case 6:
				System.out.println("Encerrado!");
				break;

			default:
				System.out.println("Op��o inv�lida. Digite a op��o correta.\n");

			}

		}

	}

	public double calcularComissao() 

}
