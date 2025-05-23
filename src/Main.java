public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(60);
        arvore.inserir(80);

        System.out.println("Árvore em pré-ordem, em-ordem e pós-ordem:");
        arvore.preOrdem();
        arvore.emOrdem();
        arvore.posOrdem();

        System.out.println("Remover 20 (folha)");
        arvore.remover(20);
        arvore.preOrdem();
        arvore.emOrdem();
        arvore.posOrdem();

        System.out.println("Remover 30 (nó com um filho)");
        arvore.remover(30);
        arvore.preOrdem();
        arvore.emOrdem();
        arvore.posOrdem();

        System.out.println("Remover 50 (nó com dois filhos - raiz)");
        arvore.remover(50);
        arvore.preOrdem();
        arvore.emOrdem();
        arvore.posOrdem();
    }
}
