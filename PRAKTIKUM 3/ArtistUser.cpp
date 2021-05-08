/*  Nama    : Nabilah Erfariani
    NIM     : 13519181
    Kelas   : K-04
    Topik   : Praktikum 3
*/

#include "ArtistUser.h"
#include <iostream>
#include <cstring>
using namespace std;

int ArtistUser::num_of_artist = 0;

//ctor, parameter: nama pengguna
ArtistUser::ArtistUser(char *namapengguna) : User(namapengguna){
    this->num_of_music_uploaded = 0;
    this->uploaded_music_list = new char *[255];
    num_of_artist++;
}

// cctor
ArtistUser::ArtistUser(const ArtistUser &other) : User(other.getName()){
    this->num_of_favourite_music = other.num_of_favourite_music;
    this->music_list = new char *[5000];

    for (int i = 0; i < other.num_of_favourite_music; i++)
    {
        this->music_list[i] = new char[strlen(other.music_list[i])];
        strcpy(this->music_list[i], other.music_list[i]);
    }

    this->num_of_music_uploaded = other.num_of_music_uploaded;
    this->uploaded_music_list = new char *[5000];

    for (int i = 0; i < other.num_of_music_uploaded; i++)
    {
        this->uploaded_music_list[i] = new char[strlen(other.uploaded_music_list[i])];
        strcpy(this->uploaded_music_list[i], other.uploaded_music_list[i]);
    }

    num_of_artist++;
}

// dtor
// selain implementasi, print juga "Artist user <nama user> deleted"
// Contoh:
// Artist user A deleted
ArtistUser::~ArtistUser(){
    cout<<"Artist user "<<this->name<<" deleted\n";
}

// Asumsi: musik unik, parameter: judul musik
void ArtistUser::uploadMusic(char *music){
    this->num_of_music_uploaded++;
    this->uploaded_music_list[this->num_of_music_uploaded - 1] = new char[strlen(music)];
    strcpy(this->uploaded_music_list[this->num_of_music_uploaded - 1], music);
}

void ArtistUser::deleteUploadedMusic(char *music){
    if (this->num_of_music_uploaded > 0)
    {
        int deletedmusic = -1;
        for (int i = 0; i < this->num_of_music_uploaded; i++)
        {
            if (strcmp(this->uploaded_music_list[i], music) == 0)
            {
                deletedmusic = i;
                break;
            }
        }
        if (deletedmusic != -1 and deletedmusic < this->num_of_music_uploaded)
        {
            this->num_of_music_uploaded--;
            for (int j = deletedmusic; j < this->num_of_music_uploaded; j++)
            {
                strcpy(this->uploaded_music_list[j], this->uploaded_music_list[j + 1]);
            }
        }
    }
}

// format print:
// <No>. <Judul musik><endl>
// contoh:
// 1. Starship - Nicki Minaj
// 2. To Be Human - Sia, Labrinth
//
// jika tidak ada musik, print: "No music uploaded<endl>"
void ArtistUser::viewUploadedMusicList() const{
    if (this->num_of_music_uploaded > 0)
    {
        for (int i = 0; i < this->num_of_music_uploaded; i++)
        {
            cout << (i + 1) << ". " << this->uploaded_music_list[i] << endl;
        }
    }
    else
    {
        cout << "No music uploaded" << endl;
    }
}

int ArtistUser::getNumOfMusicUploaded() const{
    return this->num_of_music_uploaded;
}

int ArtistUser::getNumOfArtist(){
    return ArtistUser::num_of_artist;
}
