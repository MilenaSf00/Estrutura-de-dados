package Marco_3.Atividade17;

public class AVL {
    Noh raiz;

    AVL() {
        raiz = null;
    }

    public void insere(int info) {
        raiz = insere(raiz, null, info);
    }


    private Noh insere(Noh no, Noh pai, int info) {
        if (no == null) {
            Noh novoNoh = new Noh(info);
            novoNoh.setPai(pai); 

            if (raiz == null) {
                raiz = novoNoh;
            }
            
            return novoNoh;
        }
    
        if (info < no.getInformacao()) {
            no.setEsquerda(insere(no.getEsquerda(), no, info));
        } else if (info > no.getInformacao()) {
            no.setDireita(insere(no.getDireita(), no, info));
        } else {
            return no;
        }
    
        String rotation = fatorBalanceamento(no);

        if (rotation.equals("RSD")) {
            return rotacaoDireita(no);
        } else if (rotation.equals("RSE")) {
            return rotacaoEsquerda(no);
        } else if (rotation.equals("RDD")) {
            return rotacaoDuplaDireita(no);
        } else if (rotation.equals("RDE")) {
            return rotacaoDuplaEsquerda(no);
        }
    
        return no;
    
    }
    
    private String fatorBalanceamento(Noh no) {
        int direita = altura(no.getDireita());
        int esquerda = altura(no.getEsquerda());
    
        int fb = direita - esquerda;
    
        if (fb > 1) {
            // Verifica se o nó tem filho à esquerda 
            if (no.getEsquerda() != null && altura(no.getEsquerda().getDireita()) > altura(no.getEsquerda().getEsquerda())) {
                return "RDD";
            } else {
                return "RSD";
            }
        } else if (fb < -1) {
            // Verifica se o nó tem filho à direita 
            if (no.getDireita() != null && altura(no.getDireita().getEsquerda()) > altura(no.getDireita().getDireita())) {
                return "RDE";
            } else {
                return "RSE";
            }
        }
        return "BALANCEADA";
    }
    

    private int altura(Noh no) {
        if (no == null) {
            return -1;
        }
        int direita = altura(no.getDireita());
        int esquerda = altura(no.getEsquerda());
        return Math.max(direita, esquerda) + 1;
    }

    private Noh rotacaoDireita(Noh no) {
        if (no == null || no.getEsquerda() == null) {
            return no;
        }
    
        Noh q = no.getEsquerda();
        Noh temp = q.getDireita();
    
        q.setDireita(no);
        no.setEsquerda(temp);
    
        return q;
    }
    
    private Noh rotacaoEsquerda(Noh no) {
        if (no == null || no.getDireita() == null) {
            return no;
        }
    
        Noh q = no.getDireita();
        Noh temp = q.getEsquerda();
    
        q.setEsquerda(no);
        no.setDireita(temp);
    
        return q;
    }
    
    public void mostrarArvoreBalanceada() {
        mostrarArvoreBalanceada(raiz, 0);
    }
    
    private void mostrarArvoreBalanceada(Noh no, int nivel) {
        if (no != null) {
            mostrarArvoreBalanceada(no.getDireita(), nivel + 1);
    
            for (int i = 0; i < nivel; i++) {
                System.out.print("  ");
            }
    
            System.out.println(no.getInformacao());
    
            mostrarArvoreBalanceada(no.getEsquerda(), nivel + 1);
        }
    }
    

    private Noh rotacaoDuplaDireita(Noh no) {
        if (no == null || no.getEsquerda() == null) {
            return no;
        }
    
        no.setEsquerda(rotacaoEsquerda(no.getEsquerda()));
        return rotacaoDireita(no);
    }
    
    private Noh rotacaoDuplaEsquerda(Noh no) {
        if (no == null || no.getDireita() == null) {
            return no;
        }
    
        no.setDireita(rotacaoDireita(no.getDireita()));
        return rotacaoEsquerda(no);
    }
    
}

