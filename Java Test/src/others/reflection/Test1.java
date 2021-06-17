package others.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {

        Class employeeClass = Class.forName("others.reflection.Employee");
//        Class employeeClass2 = Employee.class;
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();

        System.out.println("\n____getField____\n");
        Field someField = employeeClass.getField("id");
        System.out.println("Type of field = " + someField);
        System.out.println("******************************");

        System.out.println("\n____getFields____\n");
        Field[] fields = employeeClass.getFields();
        for (Field field: fields){
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("******************************");

        System.out.println("\n____getDeclaredFields____\n");
        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field field: allFields){
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("-----------------------------------------------------------");

        System.out.println("\n____getMethod____\n");
        Method someMethod = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = " + someMethod.getReturnType() +
                ", parameter types = " + Arrays.toString(someMethod.getParameterTypes()));
        System.out.println("******************************");

        System.out.println("\n____getMethod with parameters____\n");
        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method increaseSalary = " + someMethod2.getReturnType() +
                ", parameter types = " + Arrays.toString(someMethod2.getParameterTypes()));
        System.out.println("******************************");

        System.out.println("\n____getMethods____\n");
        Method[] methods = employeeClass.getMethods();// Non private methods and super class methods
        for(Method method: methods){
            System.out.println("Name of method = " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    ", parameter types = " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("******************************");

        System.out.println("\n____getDeclaredMethods____\n");
        Method[] methods2 = employeeClass.getDeclaredMethods();// allMethods excluding super class methods
        for(Method method: methods2){
            System.out.println("Name of method = " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    ", parameter types = " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("******************************");

        System.out.println("\n____getDeclaredMethods and non-private____\n");
        Method[] methods3 = employeeClass.getDeclaredMethods();// non private methods excluding super class methods
        for(Method method: methods3){
            if(Modifier.isPublic(method.getModifiers()))
            System.out.println("Name of method = " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    ", parameter types = " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("-----------------------------------------------------------");

        System.out.println("\n____getConstructor____\n");
        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println("Constructor has " + constructor1.getParameterCount() +
                " parameters, their types are: " + Arrays.toString(constructor1.getParameterTypes()));
        System.out.println("******************************");

        System.out.println("\n____getConstructor with parameters____\n");
        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount() +
                " parameters, their types are: " + Arrays.toString(constructor2.getParameterTypes()));
        System.out.println("******************************");

        System.out.println("\n____getConstructors____\n");
        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor constructor: constructors){
            System.out.println("Constructor " + constructor.getName() +
                    " has " + constructor.getParameterCount() +
                    " parameters, their types are: " + Arrays.toString(constructor.getParameterTypes()));
        }
        System.out.println("******************************");

        System.out.println("\n____getDeclaredConstructors____\n");
        Constructor[] constructors2 = employeeClass.getDeclaredConstructors();
        for (Constructor constructor: constructors2){
            System.out.println("Constructor " + constructor.getName() +
                    " has " + constructor.getParameterCount() +
                    " parameters, their types are: " + Arrays.toString(constructor.getParameterTypes()));
        }
    }
}
