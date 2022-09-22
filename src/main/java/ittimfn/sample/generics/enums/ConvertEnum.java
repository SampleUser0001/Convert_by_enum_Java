package ittimfn.sample.generics.enums;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public enum ConvertEnum {
    DATA_A("ittimfn.sample.generics.model.DataAModel","convert"),
    DATA_B("ittimfn.sample.generics.model.DataBModel","convert");

    private String className;
    private String methodName;

    private Object obj;
    private Method method;

    private ConvertEnum(String className, String methodName) {
        this.className = className;
        this.methodName = methodName;

        try {
            Class<?> c;
            c = Class.forName(this.className);
            Constructor constractor = c.getConstructor();
            this.obj = constractor.newInstance();
            this.method = c.getMethod(this.methodName, String.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    public Object convert(String line) {
        try {
            return this.method.invoke(this.obj, line);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
        return null;
    }
}
