/*  Nama 	: Nabilah Erfariani
    NIM		: 13519181
    Tanggal	: 18 Februari 2021
    Topik 	: Responsi 2
*/

#include <iostream>
#include "Vehicle.h"
#include "Car.h"
#include "Bike.h"

using namespace std;

int main()
{
	Vehicle * V1 = new Vehicle(3, 2);
	Vehicle * V2 = new Vehicle(*V1);
	Vehicle * V3 = new Vehicle(6, 50);
	Car * V4 = new Car(8);
	Car * V5 = new Car(*V4);
	Car * V6 = new Car(6);
	Bike *V7 = new Bike();
	V6->drive();
	V7->show();
	V7->ride();
	delete V7;
	delete V6;
	delete V5;
	delete V4;
	delete V3;
	delete V2;
	delete V1;
	return 0;
}