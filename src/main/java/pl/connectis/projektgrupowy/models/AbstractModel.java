package pl.connectis.projektgrupowy.models;

public abstract class AbstractModel {

    protected static int lastId = 0;

    protected int id;

    protected AbstractModel(){

        lastId++;
        this.id = lastId;

    }

    public int getId(){

        return id;
    }

    public void setLastId(int id) {

        this.id = id;
    }
}
