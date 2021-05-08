/*  Nama	: Nabilah Erfariani
    NIM		: 13519181
    Tanggal	: 4 Februari 2021
    Topik	: Responsi minggu-3
*/

#include "Bottle.hpp"
using namespace std;

int Bottle::numOfBottle = 0;

Bottle::Bottle() : id(numOfBottle + 1)
/* Ctor default Bottle kosong dengan tinggi = 10.00 dan radius = 10.00 */
{
    this->waterHeight = 0.00;
	this->height = 10.00;
	this->radius = 10.00;
	numOfBottle = numOfBottle + 1;
}

Bottle::Bottle(float height, float radius) : id(numOfBottle + 1) 
/* Ctor Bottle jika diketahui nilai tinggi dan radius, Bottle kosong*/
{
	this->height = height;
	this->radius = radius;
	this->waterHeight = 0.00;
	numOfBottle += 1;
}

Bottle::Bottle(const Bottle& bottle) : id(bottle.id)
/* Cctor Bottle. id juga dicopy dan numOfBottle tidak bertambah */
{
    this->waterHeight = bottle.waterHeight;
	this->height = bottle.height;
	this->radius = bottle.radius;
}

Bottle::~Bottle() {
}

/* Destruktor Bottle */

int Bottle::getId() const 
/* Mengembalikan id Bottle */
{
	return this->id;
}

float Bottle::getWaterVolume() const
/* Mengembalikan volume air dalam botol */
{
	return (PI * this->radius * this->radius * this->waterHeight);
}

float Bottle::getBottleVolume() const
 /* Mengembalikan volume botol */
{
	return (PI * this->radius * this->radius * this->height);
}

void Bottle::setHeight(float height)
 /*
   * Mengubah tinggi Bottle. Jika tinggi baru kurang dari tinggi air,
   * maka tinggi air = tinggi yang baru.
   */
{
	this->height = height;
	if (this->height < this->waterHeight) {
		this->waterHeight = this->height;
	}
}

void Bottle::addWater(float waterVolume)
 /*
   * Menambahkan air ke dalam botol. Jika botol tidak muat, biarkan
   * botol penuh.
   */
{
	float deltaHeight = waterVolume / (PI * this->radius * this->radius);
	if (this->waterHeight + deltaHeight > this->height) {
		this->waterHeight = this->height;
	} else {
		this->waterHeight = this->waterHeight + deltaHeight;
	}
}

void Bottle::substractWater(float waterVolume)
 /*
   * Mengurangi air dari botol. Jika air yang tersedia kurang, biarkan
   * botol kosong.
   */
{
	float deltaHeight = waterVolume / (PI * this->radius * this->radius);
	if (this->waterHeight - deltaHeight < 0) {
		this->waterHeight = 0.00;
	} else {
		this->waterHeight = this->waterHeight - deltaHeight;
	}
}

float Bottle::getWaterHeightIfVolume(float waterVolume) const 
  /*
   * Mengembalikan tinggi air dari botol jika diketahui suatu volume air.
   * Tinggi botol diabaikan, dianggap tidak akan terlalu penuh.
   */
{
	return (waterVolume / (PI * this->radius * this->radius));
}


void Bottle::pourWaterTo(Bottle& other) 
 /*
   * Menuang isi botol ini ke botol lain sampai botol ini kosong.
   * Jika botol lain penuh sebelum semua air pindah, maka penuangan
   * berhenti dan terdapat sisa air di botol ini.
   */
{
	float thisWaterVolume = PI * this->radius * this->radius * this->waterHeight;
	float otherWaterVolume = other.getWaterVolume();
	float otherBottleVolume = other.getBottleVolume();
	if (thisWaterVolume > otherBottleVolume - otherWaterVolume) {
		this->substractWater(otherBottleVolume - otherWaterVolume);
		other.waterHeight = other.height;
	} else {
		this->waterHeight = 0.00;
		other.addWater(thisWaterVolume);
	}
}

int main(){
	Bottle * B2 = new Bottle(7,8);
	Bottle * B1 = new Bottle(3,5);
	B1->getWaterHeightIfVolume(10);
	B1->pourWaterTo(*B2);
	return 0;
}
