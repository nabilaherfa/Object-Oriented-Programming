/*  Nama    : Nabilah Erfariani
    NIM     : 13519181
    Tanggal : 11 Februari 2021
    Topik   : Praktikum 1
*/

#include "A.hpp"

int main(){

    /*cons 1
cons 2
ccons 1
cassign 1 = 2
show 2
dest 2
dest 2
dest 1
*/
    A * A1 = new A('1');
    A * A2 = new A('2');
    A * A3 = new A(*A1);
    *A3 = *A2;
    A2->show();
    delete A2;
    delete A3;
    delete A1;
    return 0;

}

