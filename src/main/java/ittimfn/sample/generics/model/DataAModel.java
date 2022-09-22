package ittimfn.sample.generics.model;

public class DataAModel {
    public String value;
    public static DataAModel convert(String line) {
        DataAModel model = new DataAModel();
        model.value = line;
        return model;
    }
}
