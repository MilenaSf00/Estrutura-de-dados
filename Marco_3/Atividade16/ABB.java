package Marco_3.Atividade16;

public class ABB {
    private Noh raiz;

    public ABB() {
        this.raiz = null;
    }

    public boolean isEmpty() {
        return this.raiz == null;
    }
    public Noh getRaiz() {
        return raiz;
    }      
    public void add(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            Noh aux = this.raiz;
            while (true) {
                if (element < aux.getValor()) {
                    if (aux.getEsquerda() == null) {
                        Noh newNode = new Noh(element);
                        aux.setEsquerda(newNode);
                        newNode.setPai(aux);
                        return;
                    }
                    aux = aux.getEsquerda();
                } else {
                    if (aux.getDireita() == null) {
                        Noh newNode = new Noh(element);
                        aux.setDireita(newNode);
                        newNode.setPai(aux);
                        return;
                    }
                    aux = aux.getDireita();
                }
            }
        }
    }

   
  public void recursiveAdd(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            recursiveAdd(this.raiz, element);
        }
    }

    private void recursiveAdd(Noh node, int element) {
        if (element < node.getValor()) {
            if (node.getEsquerda() == null) {
                Noh newNode = new Noh(element);
                node.setEsquerda(newNode);
                newNode.setPai(node);
            } else {
                recursiveAdd(node.getEsquerda(), element);
            }
        } else {
            if (node.getDireita() == null) {
                Noh newNode = new Noh(element);
                node.setDireita(newNode);
                newNode.setPai(node);
            } else {
                recursiveAdd(node.getDireita(), element);
            }
        }
    }
    
    public Noh buscaIterativa(int element) {
        Noh aux = this.raiz;
        while (aux != null) {
            if (element == aux.getValor()) {
                return aux;
            } else if (element < aux.getValor()) {
                aux = aux.getEsquerda();
            } else {
                aux = aux.getDireita();
            }
        }
        return null;
    }

    public Noh buscaRec(int element) {
        return buscaRecursiva(this.raiz, element);
    }

    private Noh buscaRecursiva(Noh node, int element) {
        if (node == null || element == node.getValor()) {
            return node;
        }
        if (element < node.getValor()) {
            return buscaRecursiva(node.getEsquerda(), element);
        } else {
            return buscaRecursiva(node.getDireita(), element);
        }
    }

   public void preOrdem() {
        preOrdem(this.raiz);
    }

    private void preOrdem(Noh node) {
        if (node != null) {
            System.out.println(node.getValor());
            preOrdem(node.getEsquerda());
            preOrdem(node.getDireita());
        }
    }



    public void emOrdem() {
        emOrdem(this.raiz);
    }

    private void emOrdem(Noh node) {
        if (node != null) {
            emOrdem(node.getEsquerda());
            System.out.println(node.getValor());
            emOrdem(node.getDireita());
        }
    }

    public void posOrdem() {
        posOrdem(this.raiz);
    }

    private void posOrdem(Noh node) {
        if (node != null) {
            posOrdem(node.getEsquerda());
            posOrdem(node.getDireita());
            System.out.println(node.getValor());
        }
    }

    public void imprimeLargura() {
        if (isEmpty()) {
            System.out.println("A árvore está vazia.");
            return;
        }

        FilaVet fila = new FilaVet(100);
        fila.adicionar(this.raiz);

        while (!fila.isEmpty()) {
            Noh atual = (Noh) fila.remover();
            System.out.println(atual.getValor());

            if (atual.getEsquerda() != null) {
                fila.adicionar(atual.getEsquerda());
            }

            if (atual.getDireita() != null) {
                fila.adicionar(atual.getDireita());
            }
        }
    }

    
    public void remove(int element) {
        this.raiz = remove(this.raiz, element);
    }

    private Noh remove(Noh node, int element) {
        if (node == null) {
            return null;
        }

        if (element < node.getValor()) {
            node.setEsquerda(remove(node.getEsquerda(), element));
        } else if (element > node.getValor()) {
            node.setDireita(remove(node.getDireita(), element));
        } else {
            if (node.getEsquerda() == null) {
                return node.getDireita();
            } else if (node.getDireita() == null) {
                return node.getEsquerda();
            } else {
                Noh sucessor = encontraValorMin(node.getDireita());
                node.setValor(sucessor.getValor());
                node.setDireita(remove(node.getDireita(), sucessor.getValor()));
            }
        }
    
        return node;
    }
    
    public Noh encontraValorMin(Noh node) {
        while (node.getEsquerda() != null) {
            node = node.getEsquerda();
        }
        return node;
    }
}



