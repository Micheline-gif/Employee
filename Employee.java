/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if age>16
           print "they can drive"
        else
           print "they can not drive"
        return (age);
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        Get values for salary, hours, taxes, unpaid hours, total salary
        Set hourly wage - unpaid hour = hours
        Set hours x salary divided by 0.3 = total salary
        print net pay
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        Get values for salary, payment, amount, unpaid hours, fullname
        Set hours x salary = total salary
        Set String name "John Deere"
    }
}
{
    private int YearOBirth(){
        return (YearOfBirth);
    }
}