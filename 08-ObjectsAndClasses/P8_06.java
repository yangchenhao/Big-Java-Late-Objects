/*Implement a class Car with the following properties. A car has a cer­tain fuel
efficiency (measured in miles/gallon) and a certain amount of fuel in the gas tank.
The efficiency is specified in the constructor, and the initial fuel level is 0.
Supply a method drive that simulates driving the car for a certain distance,
reducing the fuel level in the gas tank, and methods getGasLevel , to return the
current fuel level, and addGas , to tank up. Sample usage:
Car myHybrid = new Car(50); // 50 miles per gallon
myHybrid.addGas(20); // Tank 20 gallons
myHybrid.drive(100); // Drive 100 miles
System.out.println(myHybrid.getGasLevel()); // Print fuel remaining
*/

public class P8_06 {
    double fuelEfficiency;
    double amountOfFuel;

    public P8_06(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
        this.amountOfFuel = 0;
    }

    public double getGasLevel() {
        return this.amountOfFuel;
    }

    public void addGas(double gas) {
        this.amountOfFuel += gas;
    }

    public void drive(double miles) {
        double burnedFuel = miles / fuelEfficiency;
        this.amountOfFuel -= burnedFuel;
    }
}