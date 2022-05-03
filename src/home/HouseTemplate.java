package home;

public abstract class HouseTemplate{

    public abstract void buildFoundation();
    public abstract void buildPillars();
    public abstract void buildWalls();
    public abstract void buildWindow();

    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindow();
        MyUtils.log("HOUSE BUILD PROCESS", "process complete!");
    }


}