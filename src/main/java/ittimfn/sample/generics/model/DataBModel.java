package ittimfn.sample.generics.model;

public class DataBModel {
    public String value;
    public static DataBModel convert(String line) {
        DataBModel model = new DataBModel();
        model.value = line;
        return model;
    }
    
}
