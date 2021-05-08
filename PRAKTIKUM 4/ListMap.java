/*
    Nama    : Nabilah Erfariani
    NIM     : 13519181
    Kelas   : K04
    Praktikum 10

*/

public class ListMap implements Map {

    private ListMapEntry first;

    @Override
    //setter
    public void set(String key, String value) {
        if (this.first == null){
            this.first = new ListMapEntry(key, value);
        } 
        else {
            ListMapEntry listmap = this.first;
            while (listmap.getNext() != null){
                if (listmap.getKey().equals(key)){
                    listmap.setValue(value);
                    return;
                }
                listmap = listmap.getNext();
            }
            listmap.setNext(new ListMapEntry(key, value));
        }
    }

    @Override
    //getter
    public String get(String key) {
        ListMapEntry listmap = this.first;

        while (listmap != null){
            if (listmap.getKey().equals(key)){
                return listmap.getValue();
            }
            listmap = listmap.getNext();
        }
        return null;
    }

    @Override
    //size of listmapentry
    public int size() {
        ListMapEntry listmap = this.first;
        int cnt = 0;
        while (listmap != null){
            cnt++;
            listmap = listmap.getNext();
        }
        return cnt;
    }
    
}