package studentlist;

/**
 * This class represents a Student in our application
 *
 * @author Paul Bonenfant
 *
 * Modified by Philip Santram ID# 991620752 
 *
 * 27-01-2022
 */
public class Student {

    private String name;
    
    private String address;

    public Student(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
