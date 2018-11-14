public class Ordenacao {
	void ordenar(int n1, int n2, int n3, int n4) {
		int[] numeros = { n1, n2, n3, n4 };
		int menor, x;

		for (int i = 0; i < numeros.length - 1; i++) {
			menor = i;
			x = numeros[i];

			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] < x) {
					menor = j;
					x = numeros[j];
				}
			}

			numeros[menor] = numeros[i];
			numeros[i] = x;
		}

		System.out.println("\t ---Ordenação:--- \n");
		System.out.print("Ordem: \t");
		System.out.println("\t1ª \t2ª \t3ª \t4ª ");
		System.out.print("Valores: \t");

		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%5d ", numeros[i]);
		}

		System.out.println("\n");
	}

}