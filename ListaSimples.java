public class ListaSimples {
	NoSimples primeiro, ultimo;

	ListaSimples() {
		primeiro = null;
		ultimo = null;
	}

	void insereNo_inicio(NoSimples novoNo) {
		if (primeiro != null) {
			novoNo.prox = primeiro;
			primeiro = novoNo;
		} else if (primeiro == null) {
			primeiro = novoNo;
			ultimo = novoNo;
		}
	}

	void insereNo_fim(NoSimples novoNo) {
		novoNo.prox = null;
		if (primeiro == null) {
			primeiro = novoNo;
		}
		if (ultimo != null) {
			ultimo.prox = novoNo;
		}
		ultimo = novoNo;
	}

	int ContarNos() {
		int tamanho = 0;
		NoSimples temp_no = primeiro;
		while (temp_no != null) {
			tamanho++;
			temp_no = temp_no.prox;
		}
		return tamanho;
	}

	void excluirNo(int v) {
		NoSimples temp_no = primeiro;
		NoSimples anterior_no = primeiro;
		int posicao = 0;
		int a = 0;
		while (temp_no != null && temp_no.valor != v) {
			temp_no = temp_no.prox;
			posicao++;
		}
		for (int i = 0; i < posicao - 1; i++) {
			anterior_no = anterior_no.prox;
			a++;
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

	void insereNo_posicao(NoSimples novoNo, int posicao) {
		NoSimples temp_no = primeiro;
		int numero_nos = ContarNos();
		int pos_aux;
		if (posicao == 0) {
			novoNo.prox = primeiro;
			if (primeiro == ultimo) {
				ultimo = novoNo;
			}
			primeiro = novoNo;
		} else {
			if (posicao <= numero_nos) {
				pos_aux = 1;
				while (temp_no != null && posicao > pos_aux) {
					temp_no = temp_no.prox;
					pos_aux++;
				}
				novoNo.prox = temp_no.prox;
				temp_no.prox = novoNo;
			} else {
				if (posicao > numero_nos) {
					ultimo.prox = novoNo;
					ultimo = novoNo;
				}
			}
		}
	}

	void exibeLista() {
		NoSimples temp_no = primeiro;
		int i = 0;
		while (temp_no != null) {
			System.out.print("Posição " + i + "\tValor: " + temp_no.valor + "\n");
			temp_no = temp_no.prox;
			i++;
		}
	}
}