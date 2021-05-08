/*  Nama    : Nabilah Erfariani
    NIM		: 13519181
    Tanggal	: 4 Februari 2021
    Topik	: Responsi minggu-3
*/

#include "Box.hpp"
using namespace std;

int main()
{
    //new empty box 2
	Box * B1 = new Box(2);
    //new empty box with default id 0
	Box * B2 = new Box();
    //new empty box 1
	Box * B3 = new Box(1);
    //assign box 0 <- 2
	(*B2) = (*B1);
    //copy box 1
	Box * B4 = new Box(*B3);
    //box 2
	B1->peek();
    //box 1
	B3->peek();
    //destroy box 2
	B1->~Box();
    //destroy box 1
	B3->~Box();
    //destroy box 1
	B4->~Box();
    //destroy box 2
	B2->~Box();
	return 0;
}