import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("=========================");
            System.out.println("==        Menu:        ==");
            System.out.println("== 1 - Inserir valores ==");
            System.out.println("== 2 - Remover valor   ==");
            System.out.println("== 3 - Finalizar       ==");
            System.out.println("=========================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantos valores deseja inserir?: ");
                    int quantidade = scanner.nextInt();

                    for (int i = 0; i < quantidade; i++) {
                        System.out.print("Digite o valor " + (i + 1) + ": ");
                        int valorInserir = scanner.nextInt();
                        arvore.inserir(valorInserir);
                    }
                    System.out.println("Valores inseridos");
                    break;

                case 2:
                    System.out.print("Digite o valor para remover: ");
                    int valorRemover = scanner.nextInt();
                    boolean removido = arvore.remover(valorRemover);
                    if (removido) {
                        System.out.println("Valor removido da árvore");
                    } else {
                        System.out.println("Valor não encontrado na árvore");
                    }
                    break;

                case 3:
                    System.out.println("Finalizando...");
                    break;

                default:
                    System.out.println("Essa opção não existe");
            }

            if (opcao != 3) {
                System.out.println("\nÁrvore em pré-ordem:");
                arvore.preOrdem();
                System.out.println("Árvore em em-ordem:");
                arvore.emOrdem();
                System.out.println("Árvore em pós-ordem:");
                arvore.posOrdem();
            }
        }
    }
}