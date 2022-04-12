import java.util.UUID;

public class NNU{
    private String name;
    private String uuid;
    private int storage;

    public NNU(String name, int storage) {
        this.name = name;
        this.storage= storage;
        UUID u = UUID.randomUUID();
        this.uuid = u.toString();
    }

    public String getName(){
        return name;
    }

    public String getUuid(){
        return uuid;
    }

    public int getStorage(){
        return storage;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setStorage(int storage){
        this.storage = storage;
    }

}
