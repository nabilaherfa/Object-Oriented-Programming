/*  Nama    : Nabilah Erfariani
    NIM     : 13519181
    Tanggal : 11 Februari 2021
    Topik   : Praktikum 1
*/

#include <iostream>
#include "Polinom.hpp"
using namespace std;


// ctor, cctor, dtor, op=
// untuk konstruktor, inisialisasi seluruh nilai koefisien dengan 0.
Polinom :: Polinom(){   // ctor Polinom dengan orde = 0
    int i;
    this->derajat = 0;
    koef = new int[this->derajat];
    for(i=0; i<this->derajat;i++){
        koef[i] = 0;
    }
}

Polinom :: Polinom(int n)
// ctor Polinom dengan orde = n (sesuai parameter)
{
    int i;
    this->derajat = n;
    koef = new int[this->derajat];
    for (i = 0; i <= n; ++i) {
        this->koef[i] = 0;
    }
} 

Polinom :: Polinom (const Polinom& X){
    int i;

    this->derajat = X.derajat;
    koef = new int[this->derajat];
    for (i = 0; i <= this->derajat; ++i) {
        this->koef[i] = X.koef[i];
    }
}

Polinom :: ~Polinom() {}

Polinom& Polinom :: operator=(const Polinom& X){
    int i;

    this->derajat = X.derajat;
    koef = new int[this->derajat];
    for (i=0; i<=this->derajat; i++){
        koef[i] = X.koef[i];
    }

    return *this;
}


// getter, setter
int Polinom :: getKoefAt(int idx) const{
    
    return this->koef[idx];
}

int Polinom :: getDerajat() const{
    return this->derajat;
}

void Polinom :: setKoefAt(int idx, int val){
    this->koef[idx] = val;
}

void Polinom :: setDerajat(int der){
    this->derajat = der;
}

// member function
// Melakukan pembacaan koefisien sejumlah derajat Polinom, dimulai dari x^0 (konstanta)
void Polinom :: input() {
    int i;

    for (i = 0; i<=this->derajat; ++i){
        cin >> this->koef[i];
    }
}

// Mencetak seluruh koefisien polinom. Untuk setiap koefisien akhiri dengan end-of-line
// Cetaklah apa adanya dari koefisien ke-0 hingga derajat tertinggi (termasuk apabila koefisien = 0)
void Polinom :: printKoef(){
    int i;

    for (i = 0; i<=this->derajat; ++i) {
        cout << this->koef[i] << endl;
    }
}

 // Menghitung hasil substitusi x dengan sebuah bilangan ke dalam polinom
int Polinom :: substitute(int x) {
    int i;
    int currKoef = this->getKoefAt(this->derajat);

    for (i = this->derajat-1; i>=0; i--) {
        currKoef = currKoef*x + this->getKoefAt(i);
    }

    return currKoef;
}

// Mencetak polinom dengan format: A+Bx^1+Cx^2+Dx^3...dst (diakhiri dengan end-of-line)
// Apabila suatu koefisien bernilai < 0, gunakan tanda "-" untuk menggantikan tanda "+"
// Apabila suatu koefisien bernilai 0, lewati koefisien tersebut dan lanjutkan ke koefisien selanjutnya
// Jika seluruh koefisien bernilai 0, keluarkan "0"
void Polinom :: print() {
    int i;
    bool tidaknol = false;

    for (i = 0; i<=this->derajat; i++){
        if (getKoefAt(i) != 0) {
            if (getKoefAt(i) > 0){
                cout << "+";
            }
        
        if (getKoefAt(i) < 0){
            cout << "-";
        }

        if (i == 0) {
            cout << (getKoefAt(i));
        }else{ 
            if (getKoefAt(i) != 1){
                cout << (getKoefAt(i));
                cout << "x^" << i;
            }
        }
    }
    tidaknol = true;
  }
    if (!tidaknol) {
        cout << "0" <<endl;
    }
}