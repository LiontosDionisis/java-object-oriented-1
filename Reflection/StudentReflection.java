package gr.aueb.cf.TEST;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class StudentReflection {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("gr.aueb.cf.TEST.Student");
            Constructor<?> defaultCtr = clazz.getDeclaredConstructor();
            defaultCtr.setAccessible(true);
            Student mario = (Student) defaultCtr.newInstance();
        } catch (ClassNotFoundException e){
            System.out.println("Class not found.");
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
