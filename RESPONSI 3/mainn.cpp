/*  Nama     : Nabilah Erfariani
    NIM      : 13519181
    Topik    : Responsi 3
    Tanggal  : 4 Maret 2021
*/

#include "A.hpp"
#include "B.hpp"

int main() {
  B b; /** ANDA HARUS MENGGUNAKAN DEFAULT CONSTRUCTOR */

  // Your code goes here :)
  A* a;
  a = &b;
  a->setValue(888);
  b.setValue(10888);
  
  b.print(); // OUTPUT: (888, 10888)
  return 0;
}