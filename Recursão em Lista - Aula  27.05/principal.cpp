using namespace std;
#include <iostream>
#include "celula.h"
#include <ctime>


int main (){
    Celula *lista = NULL;
    int valor;
    srand (time(NULL));
    for (int i =0 ; i<10 ; i++){
        valor = rand() %50;
        lista = inserir (valor, lista);
    }
    exibir (lista);
    cout << "Digite um valor para pesquisar:";
    
    cin >> valor;

    if (contains (valor, lista)){
    cout << "valor localizado e sendo apagado "<< endl;
    lista = remove(valor,lista);
    }
    else {
        cout << "Valor n localizado" << endl;
    }
    
    cout << "total de pares: " << countPar (lista) << endl;


    return 1;
}