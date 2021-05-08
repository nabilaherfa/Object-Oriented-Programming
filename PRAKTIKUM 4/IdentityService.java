/*
    Nama    : Nabilah Erfariani
    NIM     : 13519181
    Kelas   : K04
    Praktikum 10

*/

import java.util.ArrayList;

public class IdentityService extends AbstractService {

    private ArrayList<String> identityList = new ArrayList<String>();

    public IdentityService(String name) {
    //Konstructor memiliki satu parameter yaitu String yang merupakan nama dari service ini. 
    //Lakukan pemanggilan konstruktor parent.
        super(name);
    }

    public ArrayList<String> getIdentity() {
        //Memiliki getter getIdentity()
        return this.identityList;
    }

    public void addIdentity(String servicee){
    //Memiliki setter dalam bentuk addIdentity(String) dan removeIdentity(String). 
    //Buatlah validasi dimana setter ini bisa merubah identityList HANYA jika state dari IdentityService sudah RUNNING.
        if (this.getServiceState() == STATE.RUNNING){
            this.identityList.add(servicee);
        }
    }

    public void removeIdentity(String servicee){
        if (this.getServiceState() == STATE.RUNNING){
            this.identityList.remove(servicee);
        }
    }

    @Override
    public void init() {
    //Implementasi init(), mengubah state IdentityService menjadi INIT.
        this.setServiceState(STATE.INIT);
    }

    @Override
    public void start() {
    //Implementasi start(), mengubah state IdentityService menjadi RUNNING.
        this.setServiceState(STATE.RUNNING);
    }

    @Override
    public void stop() {
    //Implementasi stop(), mengubah state IdentityService menjadi DIE.
        this.setServiceState(STATE.DIE);
    }

    public Boolean isIdentityExist(String x){
    //Memiliki sebuah method isIdentityExist(String) yang mengembalikan Boolean true jika parameter input terdapat pada identityList, dan false sebaliknya. 
    //Buatlah validasi dimana bila method ini dipanggil ketika state IdentityService BUKAN RUNNING maka akan menghasilkan keluaran berupa null.
    if (this.getServiceState() == STATE.RUNNING){
        return Boolean.valueOf(this.identityList.stream().filter(e -> e.equals(x)).findAny().isPresent());
    } else {
        return null;
    }
    }
    
}