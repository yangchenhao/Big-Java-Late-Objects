/*Write a method
public static Measurable maximum(Measurable[] objects)
that returns the object with the largest measure. Use that method to determine the
country with the larg­est area from an array of countries.*/

public interface Measurable {
    double getMeasure();
}

/*public static Measurable maximum(Measurable[] objects){
    Measurable largest = objects[0];
    
    for (int i = 1; i < objects.length; i++) {
        if (objects[i].getMeasure() > largest.getMeasure()) {
            largest = objects[i];
        }
    }
    
    return largest;
}*/