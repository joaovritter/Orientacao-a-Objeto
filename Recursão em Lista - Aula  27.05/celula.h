typedef struct no {
    int dado;
    struct no *prox;
    
}Celula;

void exibir (Celula *lista){
    if (lista){
        cout << lista->dado << endl;
        exibir (lista->prox);
    }
}

Celula *inserir (int valor, Celula *lista){
    if (lista&& valor > lista->dado){
        //avancar na lista a procura do lugar ideal para valor
        lista->prox = inserir (valor, lista->prox);
        return lista;
    }
    else {
        //alocar memoria 
        Celula *novo = (Celula *)malloc(sizeof(Celula));

        //depositar valores
        novo->dado = valor;

        novo->prox = lista;

        //retornar o elemento criado
        return novo;
    }

}

bool contains (int valor, Celula *lista){
    if (lista){
        if (valor == lista->dado){
            return true;
        }
        return contains (valor, lista->prox);
    }
    return false;
}

int countPar (Celula *lista){
    if (lista){
        if (lista->dado%2==0){
            return 1 + countPar (lista->prox);
        }
        return countPar(lista->prox);
    }
    return 0;
}

Celula *remove (int valor, Celula *lista){
    if (lista){
        if (valor == lista->dado){
            //codigo de remocao
            Celula *paraRetorno = lista -> prox;
            free (lista);
            return paraRetorno;
        }
        lista->prox = remove (valor, lista->prox);
        return lista;
    }
    return NULL;
}

int indexOf (int valor, Celula *lista){
    if (lista){
        if (valor==lista->dado){
            return 0;
        }
        int resposta = indexOf (valor, lista->prox);
        if (resposta == -27){
            return -27;
        }
        return resposta + 1;
    }
    else {
        //valor nao localizado
        return -27; //tanto faz o valor negativo
    }
}