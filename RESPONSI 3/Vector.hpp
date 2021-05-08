/*  Nama     : Nabilah Erfariani
    NIM      : 13519181
    Topik    : Responsi 3
    Tanggal  : 4 Maret 2021
*/

#ifndef _VECTOR_HPP_
#define _VECTOR_HPP_
#include <iostream>
using namespace std;

template<class V, int n>
class Vector {
private:
    V* elements;

public:
    Vector() {
        this->elements = new V[n];
    }

    Vector(const Vector<V, n>& other) {
        this->elements = new V[n];
        for (int i = 0; i < n; ++i) {
           this->elements[i] = other.elements[i];
        }
    }

    ~Vector() {
        delete[] this->elements;
    }

    V& operator[](int idx) {
        return this->elements[idx];
    }

    Vector<V, n> operator+(const Vector<V, n>& other) {
        Vector result;
        for (int i = 0; i < n; ++i) {
           result.elements[i] = elements[i] + other.elements[i];
        }
        return result;
    }

    Vector<V, n> operator-(const Vector<V, n>& other) {
        Vector result;
        for (int i = 0; i < n; ++i) {
           result.elements[i] = elements[i] - other.elements[i];
        }
        return result;
    }

    bool operator<(const Vector<V, n>& other) {
        for (int i = 0; i < n; ++i) {
            if (this->elements[i] != other.elements[i]) {
                return this->elements[i] < other.elements[i];
            }
        }
        return false;
    }

    bool operator>(const Vector<V, n>& other) {
        for (int i = 0; i < n; ++i) {
            if (this->elements[i] != other.elements[i]) {
                return this->elements[i] > other.elements[i];
            }
        }
        return false;
    }

    friend std::ostream& operator<<(ostream& os, Vector<V,n> vector) {
        os << "<";
        for (int i = 0; i < n; ++i) {
            os << vector.elements[i];
            if (i != n - 1) {
                os << ",";
            }
        }
        os << ">";
        return os;
    }

    friend std::istream& operator>>(istream& is, Vector<V, n>& vector) {
        for (int i = 0; i < n; ++i) {
            is >> vector.elements[i];
        }
        return is;
    }
};

#endif