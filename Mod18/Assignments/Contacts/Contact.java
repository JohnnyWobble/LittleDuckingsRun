/**
 * 
 * @author Max Gordon
 * @version 04/15/2020
 */

public class Contact {
    private String name, relationship, birthday, email, phoneNumber;

    public Contact(String name, String relationship, String birthday, String phoneNumber, String email) {
        this.name = name;
        this.relationship = relationship;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getRelationship() {
        return relationship;
    }
    
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
 
    @Override
    public String toString() {
        return String.format("%-20s   %-10s   %10s   %13s   %-30s", name, relationship, birthday, phoneNumber, email);
    }
}