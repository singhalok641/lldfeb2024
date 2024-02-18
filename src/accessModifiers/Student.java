package accessModifiers;

public class Student {
    private String name;
    // default
    int batchId;
    protected double psp;
    public String univName;

    void changeBatch(int newBatchId){
        name = "Alok";
        batchId = newBatchId;
        psp = 90.0;
        univName = "SST";
    }
}
