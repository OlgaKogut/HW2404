package HW_0304;

public class Person {
    String firstName;
    String lastName;
    int age;
    String sex;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person(String firstName, String lastName, int age, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public void getName(){
        if (sex == "male") {
            System.out.println("Mr. " + firstName + " " + lastName);
        } else {
            System.out.println("Mrs. " + firstName + " " + lastName);
        }
    }

}
