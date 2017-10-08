package globalfreelance;

import java.util.GregorianCalendar;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private GregorianCalendar dateOfBirth;
    private GregorianCalendar dateOfDeath;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, GregorianCalendar dateOfBirth, GregorianCalendar dateOfDeath) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth.toString() +
                ", dateOfDeath=" + dateOfDeath.toString() +
                '}';
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode() * lastName.hashCode();
        if (this.dateOfBirth != null){
            result *= this.dateOfBirth.hashCode();
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person){
            if (obj == this){
                return true;
            }
            else {
                return firstName.equals(((Person) obj).getFirstName()) &&
                        lastName.equals(((Person) obj).getLastName()) &&
                        dateOfBirth.equals(((Person) obj).dateOfBirth);
            }
        }
        else{
            return false;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public GregorianCalendar getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(GregorianCalendar dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }
}
