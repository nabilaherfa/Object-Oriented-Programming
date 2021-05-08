#include "A1.hpp"

using namespace std;

A::A(int d) {
    data = d;
    cout << "cons " << d << endl;
}

A::A(const A& other) {
    data = other.data;
    cout << "ccons " << data << endl;
}

A::~A() {
    cout << "dest " << data << endl;
}

A& A::operator=(const A& other) {
    cout << "cassign " << data << " = " << other.data << endl;
    data = other.data;
}

void A::show() {
    cout << "show " << data << endl;
}