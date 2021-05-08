/*  Nama     : Nabilah Erfariani
    NIM      : 13519181
    Topik    : Responsi 3
    Tanggal  : 4 Maret 2021
*/

#include "Vehicle.h"
#include "Bike.h"
#include "Carr.h"

int main(){
    Car * c1 = new Car(4);
	Vehicle * v1 = new Car(10);
	Bike * b1 = new Bike();
	Vehicle * v2 = new Vehicle(*b1);
	delete b1;
	v1->drive();
	v2->clean();
	c1->drive();
	v2->park();
	delete v1;
	delete v2;
	delete c1;

	return 0;
}