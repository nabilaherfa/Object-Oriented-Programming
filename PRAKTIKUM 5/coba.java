interface Member {
    void setID (int ID);
    void setName (String name);
    int getID();
    String getName();
}

public class MemberSilver implements Member {
    private int id;
    private int name;
    public void setID (int ID);{
        this.id = ID;
    }

    public void setName (String name){
        this.name = name;
    }
    
    public int getID(){

    }
}