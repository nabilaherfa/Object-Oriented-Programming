/*  PQElmt.cpp
    Nama    : Nabilah Erfariani
    NIM     : 13519181
    Tanggal : 4 Februari 2021
    Topik   : Responsi minggu-3
*/
#include "PQElmt.hpp"

PQElmt::PQElmt() {
  this->value = 0;
  this->prio = 0;
}

PQElmt::PQElmt(int value, int prio) {
  this->value = value;
  this->prio = prio;
}

PQElmt::PQElmt(const PQElmt& other) {
  this->value = other.value;
  this->prio = other.prio;
}

PQElmt::~PQElmt() {
  //
}

int PQElmt::getValue() const {
  return this->value;
}

int PQElmt::getPrio() const {
  return this->prio;
}

bool PQElmt::operator==(const PQElmt& other) {
  // Implementasikan di sini
  // value dan prio bernilai sama
  return ((this->value == other.value) && (this->prio == other.prio));
}

bool PQElmt::operator<(const PQElmt& other) {
  // Implementasikan di sini
  // mengembalikan true jika elemen ini memiliki prio lebih kecil
  // jika prio sama, mengembalikan true jika elemen ini memiliki value lebih besar
  return ((this->prio < other.prio) || ((this->prio == other.prio) && (this->value > other.value)));
}

bool PQElmt::operator>(const PQElmt& other) {
  // Implementasikan di sini
  // mengembalikan true jika elemen ini memiliki prio lebih besar
  // jika prio sama, mengembalikan true jika elemen ini memiliki value lebih kecil
  return ((this->prio > other.prio) || ((this->prio == other.prio) && (this->value < other.value)));
}
