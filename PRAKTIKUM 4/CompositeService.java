/*
    Nama    : Nabilah Erfariani
    NIM     : 13519181
    Kelas   : K04
    Praktikum 10

*/

import java.util.ArrayList;
import java.util.stream.Collectors;

//import java.util.ArrayList;
//import java.util.stream.Collectors;

public class CompositeService extends AbstractService{

    private ArrayList<AbstractService> serviceList = new ArrayList<AbstractService>();

    public CompositeService(String name) {
        //Konstructor memiliki satu parameter yaitu String yang merupakan nama dari service ini
        super(name);
    }

    public ArrayList<AbstractService> getServices(){
        return this.serviceList;
    }

    public void addService(AbstractService x){
        //Memiliki setter dalam bentuk addService(AbstractService) dan removeService(AbstractService). 
        //Buatlah validasi dimana setter ini bisa merubah serviceList HANYA jika state dari CompositeService BUKAN DIE.
        if (this.getServiceState() != STATE.DIE){
            this.serviceList.add(x);
        }
    }

    public void removeService(AbstractService x){
        if (this.getServiceState() != STATE.DIE){
            this.serviceList.remove(x);
        }
    }

    @Override
    public void init() {
    // Implementasi init(), memanggil fungsi init() pada setiap service yang 
    //ada pada serviceList dan mengubah state CompositeService menjadi INIT.
        this.serviceList.forEach(servicee -> servicee.init());
        this.setServiceState(STATE.INIT);
    }

    @Override
    public void start() {
    //Implementasi start(), memanggil fungsi start() pada setiap service yang ada 
    //pada serviceList dan mengubah state CompositeService menjadi RUNNING. 
        this.serviceList.forEach(servicee -> servicee.start());
        this.setServiceState(STATE.RUNNING);
    }

    @Override
    public void stop() {
    //Implementasi stop(), memanggil fungsi stop() pada setiap service yang ada pada serviceList 
    //dan mengubah state dari CompositeService menjadi DIE
        this.setServiceState(STATE.DIE);
        int running = this.serviceList.stream().filter(x-> x.getServiceState() == STATE.RUNNING).collect(Collectors.toList()).size();
        this.serviceList.forEach(x -> x.stop());
        System.out.println("RUNNING service total : " + running);
    }
    
}