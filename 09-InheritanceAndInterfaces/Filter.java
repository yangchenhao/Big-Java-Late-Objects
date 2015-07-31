/*Declare an interface Filter as follows:
public interface Filter{
    boolean accept(Object x);
}
Write a method
public static ArrayList<Object> collectAll(ArrayList<Object> objects, Filter f)
that returns all objects in the objects array that are accepted by the given filter.
Provide a class ShortWordFilter whose filter method accepts all strings of length < 5.
Then write a program that reads all words from System.in , puts them into an
Array­List<Object> , calls collec­tAll , and prints a list of the short words.*/

public interface Filter {
    boolean accept(Object x);
}