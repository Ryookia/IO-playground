package pl.shane.ui.MainWindow;

//Listener informs MainWindow that model has changed and refresh is needed
public interface ControllerChangeListener {
    //In addition listener sends information about last object added to model
    //Information can be used to select new location
    void onDataInvalidate(int buildingIndex, int floorIndex, int roomIndex);
}
