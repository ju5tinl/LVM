import java.util.*;
public class VG extends NNU {

    private int storageUsed;
    private ArrayList <Pv> pvs = new ArrayList<Pv>();
    private ArrayList<Lv> lvs = new ArrayList<>();

    public VG(String name,Pv pv) {
        super(name, pv.getStorage());
        pvs = new ArrayList<>();
        lvs = new ArrayList<>();
        storageUsed = 0;
        pvs.add(pv);
    }

    public int getStorageUsed(){
        return storageUsed;
    }

    public void extendVg(Pv pv) {
        pvs.add(pv);
        setStorage(pv.getStorage() + getStorage());
    }

    public boolean addLv(Lv lv){
        int lvStore = lv.getStorage();
        if(storageUsed + lvStore > getStorage()) {
            return false;
        }
        lvs.add(lv);
        storageUsed += lvStore;
        return true;
    }

    public ArrayList<Pv> getPvs (){
      return pvs;
    }

    public ArrayList<Lv> getLvs(){
        return lvs;
    }

}


