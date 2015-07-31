/*A person has a name and a height in centimeters. Use the average method in Section
9.6 to process a collection of Person objects.*/

public class PersonAverage {
    public static double average(Person[] objects) {
        if (objects.length == 0) {
            return 0;
        }
        double sum = 0;
        for (Person obj : objects) {
            sum = sum + obj.getYearOfBirth();
        }
        return sum / objects.length;
    }
}