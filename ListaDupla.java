public class ListaDupla {
	NoDuplo primeiro, ultimo;
	int numero_nos;

	ListaDupla() {
		primeiro = ultimo = null;
		numero_nos = 0;
	}

	void insereNoInicio(NoDuplo novoNo) {
		if (primeiro != null) {
			novoNo.prox = primeiro;
			primeiro = novoNo;
			primeiro.ant = null;
		} else if (primeiro == null) {
			primeiro = novoNo;
			ultimo = novoNo;

		}
	}

	void insereNoFim(NoDuplo novoNo) {
		novoNo.prox = null;
		novoNo.ant = ultimo;
		if (primeiro == null) {
			primeiro = novoNo;
		}
		if (ultimo != null) {
			ultimo.prox = novoNo;
		}
		ultimo = novoNo;
		numero_nos++;
	}

	void excluirNo(int v) {
		NoDuplo temp_no = primeiro;
		NoDuplo anterior_no = primeiro;
		int posicao = 0;

		while (temp_no != null && temp_no.valor != v) {
			temp_no = temp_no.prox;
			posicao++;
		}

		for (int i = 0; i < posicao - 1; i++) {
			anterior_no = anterior_no.prox;
		}

		if (primeiro == temp_no) {
			primeiro = temp_no.prox;
		} else {
			anterior_no.prox = anterior_no.prox.prox;
		}
		if (ultimo == temp_no) {
			ultimo = temp_no;
		}
	}

	NoDuplo pegarNo(int indice) {
		NoDuplo temp_no = primeiro;
		for (int i = 0; (i < indice) && (temp_no != null); i++) {
			temp_no = temp_no.prox;
		}
		return temp_no;
	}

	void incluiNo(NoDuplo novoNo, int indice) {
		NoDuplo temp_no = pegarNo(indice);
		novoNo.prox = temp_no;

		if (novoNo.prox != null) {
			novoNo.ant = temp_no.ant;
			novoNo.prox.ant = novoNo;
		} else {
			novoNo.ant = ultimo;
			ultimo = novoNo;
		}
		if (indice == 0) {
			primeiro = novoNo;
		} else {
			novoNo.ant.prox = novoNo;
		}
		numero_nos++;
	}

	int ContarNos() {
		int tamanho = 0;
		NoDuplo temp_no = primeiro;
		while (temp_no != null) {
			tamanho++;
			temp_no = temp_no.prox;
		}
		return tamanho;
	}

	void exibeLista() {
		NoDuplo temp_no = primeiro;
		int i = 0;
		while (temp_no != null) {
			System.out.print("Posição " + i + ": \t Valor " + temp_no.valor + "\n");
			temp_no = temp_no.prox;
			i++;
		}
		System.out.println();
	}
}