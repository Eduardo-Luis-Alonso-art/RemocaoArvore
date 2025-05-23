public class ArvoreBinaria {
    No raiz;

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.valor) {
            atual.esquerdo = inserirRecursivo(atual.esquerdo, valor);
        } else if (valor > atual.valor) {
            atual.direito = inserirRecursivo(atual.direito, valor);
        }

        return atual;
    }

    public void remover(int valor) {
        raiz = removerRecursivo(raiz, valor);
    }

    private No removerRecursivo(No atual, int valor) {
        if (atual == null) {
            return null;
        }

        if (valor < atual.valor) {
            atual.esquerdo = removerRecursivo(atual.esquerdo, valor);
        } else if (valor > atual.valor) {
            atual.direito = removerRecursivo(atual.direito, valor);
        } else {
            if (atual.esquerdo == null && atual.direito == null) {
                return null;
            }
            else if (atual.esquerdo == null) {
                return atual.direito;
            } else if (atual.direito == null) {
                return atual.esquerdo;
            }
            else {
                int menorValor = encontrarMenorValor(atual.direito);
                atual.valor = menorValor;
                atual.direito = removerRecursivo(atual.direito, menorValor);
            }
        }

        return atual;
    }

    private int encontrarMenorValor(No no) {
        int menor = no.valor;
        while (no.esquerdo != null) {
            menor = no.esquerdo.valor;
            no = no.esquerdo;
        }
        return menor;
    }

    public void preOrdem() {
        preOrdemRecursivo(raiz);
        System.out.println();
    }

    private void preOrdemRecursivo(No atual) {
        if (atual != null) {
            System.out.print(atual.valor + " ");
            preOrdemRecursivo(atual.esquerdo);
            preOrdemRecursivo(atual.direito);
        }
    }

    public void emOrdem() {
        emOrdemRecursivo(raiz);
        System.out.println();
    }

    private void emOrdemRecursivo(No atual) {
        if (atual != null) {
            emOrdemRecursivo(atual.esquerdo);
            System.out.print(atual.valor + " ");
            emOrdemRecursivo(atual.direito);
        }
    }

    public void posOrdem() {
        posOrdemRecursivo(raiz);
        System.out.println();
    }

    private void posOrdemRecursivo(No atual) {
        if (atual != null) {
            posOrdemRecursivo(atual.esquerdo);
            posOrdemRecursivo(atual.direito);
            System.out.print(atual.valor + " ");
        }
    }
}