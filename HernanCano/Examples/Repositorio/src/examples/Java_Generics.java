package examples;

/**
 *
 * @author Hernan Cano
 * @param <T>
 * @param <V>
 * @link https://www.youtube.com/watch?v=h7piyWnQbZA&t=563s
 */
public class Java_Generics<T extends Number, V extends Number> { // Bounded types = " T extends Number " with this we tell the program to only accept numbers.
    
    /*
    With Java generics we can have one class and take in different types of variables.
    So between this "<>" we set a generic type 'T', this can be an 'int', 'double', 'String', etc.
    */
    
    T obj;
    V obj2;

    public Java_Generics(T objeto, V objeto2) {
        System.out.println("////////////////////////////////////////////////////");
        
        this.obj = objeto;
        this.obj2 = objeto2;

        // This shows the names of the types sent
        System.out.println(objeto.getClass().getName() + " = " + objeto);
        System.out.println(objeto2.getClass().getName() + " = " + objeto2);

        // The program multiplies both values
        double result = objeto.intValue() * objeto2.doubleValue(); // if we dont use bounded types, multiply cannot be done, because the program does not know if the type is going to be an Integer or a String for example.
        System.out.println("Result: " + result);

    }

    public void macaco_Test(Java_Generics<?, ?> cosa) { // Watch the link to understand...
        
    }
}
