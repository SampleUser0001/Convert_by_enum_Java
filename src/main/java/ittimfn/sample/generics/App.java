package ittimfn.sample.generics;

import ittimfn.sample.generics.enums.ConvertEnum;
import ittimfn.sample.generics.model.DataAModel;
import ittimfn.sample.generics.model.DataBModel;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        DataAModel aModel = (DataAModel) ConvertEnum.DATA_A.convert("Hello World.");
        DataBModel bModel = (DataBModel) ConvertEnum.DATA_B.convert("Hello World.");

    }
}
