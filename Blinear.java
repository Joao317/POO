public class Blinear {

	public boolean blinear(int x, int n1, int n2, int n3, int n4) {
		int dados[] = { n1, n2, n3, n4 };

		for (int i = 0; i < dados.length; i++) {
			if (x == dados[i]) {
				System.out.println("Nº encontrado!");
				return true;
			}
		}
		System.out.println("Nº não encontrado!");
		return false;
	}
}