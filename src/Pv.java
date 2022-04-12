public class Pv extends NNU {
    private PHD drive;
    private VG volumeGroup;

    public Pv(String name,  PHD drive) {
        super(name, drive.getSize());
        this.drive = drive;
    }

    public PHD getDrive(){
        return drive;
    }

    public void setDrive(PHD drive){
        this.drive = drive;
    }

    public VG getVolumeGroup(){
        return volumeGroup;
    }

    public void setVolumeGroup(VG volumeGroup){
        this.volumeGroup = volumeGroup;
    }

    public boolean hasVg() {
        return volumeGroup != null;
    }

    public String toString(){
        return getName();
    }
}
