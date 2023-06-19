package Marco_2.Atividade15;

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
    
    public Noh busca(int valorBuscado) {
        Noh no = this.raiz;
        while (no != null) {
            if (valorBuscado == no.getValor()) {
                System.out.println("Valor encontrado");
                return no;
            } else if (valorBuscado < no.getValor()) {
                no = no.getEsquerda();
            } else if (valorBuscado > no.getValor()) {
                no = no.getDireita();
            }
        }
        return null; 
    }


    public void imprimir(Noh no) {
        if (no != null) {
            imprimir(no.getEsquerda());
            System.out.println(no.getValor());
            imprimir(no.getDireita());
        }
    }

}