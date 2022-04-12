import java.util.*;

public class Control {
    private Map<String, Pv> pvList;
    private Map<String, Lv> lvList;
    private Map<String, VG> vgList;
    private Map<String, PHD> phdList;

    public Control() {
        pvList = new HashMap<>();
        lvList = new HashMap<>();
        vgList = new HashMap<>();
        phdList = new HashMap<>();
    }

}