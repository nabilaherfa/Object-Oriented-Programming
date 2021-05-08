// Ini program no 4, buat simulasi gerak parabola
#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>
#include <limits.h>

int isPositiveNumber(char *num);
double getVelocity();
double getAngle(double angle);
void yMaks(double time, double waktulemparan, double Vy, double g);
void xMaks(double time, double waktulemparan, double Vx);

int main() {
    //deklarasi
    double sudut, radian, kecepatan, time, Vx, Vy, waktulemparan, g;
    
    //inisialisasi
    Vx=0;
    g= 9.80665;

    //minta input kecepatan
    printf("Masukkan kecepatan: ");
    kecepatan = getVelocity();

    //minta input derajat
    printf("Masukkan derajat(antara 0 dan 180) aja ya hehe: ");
    sudut = getAngle(180);

    //melakukan pengecekan nilai kecepatan.
    //jika kecepatan <= 0, user harus input ulang.

    radian = (sudut * M_PI) / 180;
    if (sudut != 90) {
        Vx = kecepatan * cos(radian);
    }

    Vy = kecepatan * sin(radian);
    waktulemparan = (Vy * 2) / g;

    //ini buat simulasi waktu dan lintasannya
    printf("\nWaktu lemparannya adalah: %.16lf", waktulemparan);

    //minta input interval waktu
    printf("\nMasukkan interval waktu:");
    time = getAngle(waktulemparan);

    printf("\nNilai Vx yaitu %.16lf.\n"
           "Nilai Vy yaitu %.16lf.\n\n"
           "Tinggi pada %.16lf interval waktu:\n\n"
           "Waktu\t\t\t\tTinggi\n"
           "---------------------------------------\n", Vx, Vy, time);

    yMaks(time, waktulemparan, Vy, g);

    printf("\nX pada %.16lf interval waktu:\n\n"
           "Waktu\t\t\t\tLintasan(x)\n-------------------------------------\n", time);
    xMaks(time, waktulemparan, Vx);
    printf("\nTinggi maksimum yaitu: %.16lf.\n\nX maksimum yaitu %.16lf.", (Vy * Vy) / (2 * g),
           (Vx * waktulemparan) / 2);
    return 0;
}

//method utk dapetin input user
double getVelocity() {

    char *a = (char *) malloc(sizeof(char)), *ptr;
    double b;
    while (1) {
        fgets(a, INT_MAX, stdin);
        if (a[strlen(a) - 1] == '\n') {
            a[strlen(a) - 1] = '\0';
        }
        if (!isPositiveNumber(a)) printf("Kecepatan harus bernilai + cuy. Masukkan lagi!");
        else break;
    }
    b = strtod(a, &ptr);
    free(a);
    return b;
}

//ngecek inputannya positif atau ga
int isPositiveNumber(char *num) {
    int i, pjg; 
    pjg = (int) strlen(num);
    for (i = 0; i < pjg; i++) {
        if (!(isdigit(num[i]) || num[i] == '.' || num[i]=='+')) {
            return 0;
        }
    }
    return 1;
}

//dapetin input sudut dr user
double getAngle(double angle) {
    double a;
    while ((a = getVelocity()) >= angle) {
        printf("Input sudut harus lebih kecil dari");
        if ((double) ((int) angle) == angle) {
            printf("%d", (int) angle);
        } else {
            printf("%.16lf", angle);
        }
        printf("! Masukkan input lagi ye!");
    }
    return a;
}

//method buat dapetin x maks nya, ga harus x maks, pokoknya lintasan pada sb x nya lah
void xMaks(double time, double waktulemparan, double Vx) {
    double j = time;
    while (j <= waktulemparan) {
        printf("%.16lf\t%.16lf\n", j, j * Vx);
        j += time;
    }
}

//method dapetin y maks nya, bukan y maks juga si. H nya itu 
void yMaks(double time, double waktulemparan, double Vy, double g) {
    double j = time;
    while (j <= waktulemparan) {
        printf("%.16lf\t%.16lf\n", j, j * (Vy - (0.5 * g * j)));
        j += time;
    }
}
