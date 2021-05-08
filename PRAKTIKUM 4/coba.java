interface Member {
    void setID (int ID);
    void setName (String name);
    int getID();
    String getName();
}

interface Member{
    public void setID (int ID);
    public void setName (String name);
    public int getID();
    public String getName();
}

interface MemberSilver extends Member{
    public void setIDSilver(int ID);
    
    public int getIDSilver();
}

interface MemberGold extends Member{
    public void setIDGold (int ID);

    public int getIDGold();
}

public class Antrean {
    private int IDAntrian;
    public void setIDAntrian(int ID){
        this.IDAntrian = ID;
    }

    public int getIDAntrian(){
        return IDAntrian;
    }
}

public class AntreanMember implements Member {
    private ArrayList<Member> member = new ArrayList<Member>();
    void getMember(){

    }
    void addMember(Member x){

    }
    void removeMember(Member x){

    }
    
    void removeMemberGold(MemberGold x){

    }

    public void setIDGold (int ID){

    }

    public int getIDGold(){

    }

}

public class AntreanMemberGold implements MemberGold {
    private ArrayList<MemberGold> membergold = new ArrayList<MemberGold>();
    void getMemberGold(){

    }
    void addMemberGold(Member x){

    }
    void removeMemberGold(Member x){

    }

    public void setIDGold (int ID){

    }

    public int getIDGold(){
        
    }

}

public class Kasir extends Antrean{
   void setIDKasir(int IDKasir){

   } 
   int getIDKasir(){

   } 
   int getCurrentAntrian(){

   }
}

public class Main {
    public static void main(String[] args){
        Kasir kasir = new Kasir();
        Antrian antrian = new Antrian()
    }
}