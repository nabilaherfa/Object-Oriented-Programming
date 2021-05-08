/*  Nama     : Nabilah Erfariani
    NIM      : 13519181
    Topik    : Responsi 3
    Tanggal  : 4 Maret 2021
*/

#ifndef _VECTOR_HPP_
#define _VECTOR_HPP_

#include <iostream>

using namespace std;

template<class V, int jml>
class Vector {
private:
    V* elements;

public:
    Vector() {
        this->elements = new V[jml];
    }

    Vector(const Vector<V, jml>& other) {
        this->elements = new V[jml];
        for (int i = 0; i < jml; ++i) {
           this->elements[i] = other.elements[i];
        }
    }

    ~Vector() {
        delete[] this->elements;
    }

    T& operator[](int idx) {
        return this->elements[idx];
    }

    Vector<V, jml> operator+(const Vector<V, jml>& other) {
        Vector result;
        for (int i = 0; i < jml; ++i) {
           result.elements[i] = elements[i] + other.elements[i];
        }
        return result;
    }

    Vector<V, jml> operator-(const Vector<V, jml>& other) {
        Vector result;
        for (int i = 0; i < jml; ++i) {
           result.elements[i] = elements[i] - other.elements[i];
        }
        return result;
    }

    bool operator<(const Vector<V, jml>& other) {
        for (int i = 0; i < jml; ++i) {
            if (this->elements[i] != other.elements[i]) {
                return this->elements[i] < other.elements[i];
            }
        }
        return false;
    }

    bool operator>(const Vector<V, jml>& other) {
        for (int i = 0; i < jml; ++i) {
            if (this->elements[i] != other.elements[i]) {
                return this->elements[i] > other.elements[i];
            }
        }
        return false;
    }

    friend std::ostream& operator<<(ostream& os, Vector<V, jml> vector) {
        os << "<";
        for (int i = 0; i < jml; ++i) {
            os << vector.elements[i];
            if (i != jml - 1) {
                os << ",";
            }
        }
        os << ">";
        return os;
    }

    friend std::istream& operator>>(istream& is, Vector<V, jml>& vector) {
        for (int i = 0; i < jml; ++i) {
            is >> vector.elements[i];
        }
        return is;
    }
};

#endif