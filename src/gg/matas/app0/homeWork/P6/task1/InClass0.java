package gg.matas.app0.homeWork.P6.task1;

public class InClass0 {
    public static void main(String[] args) {
        Matas matas0 = new Matas();
        matas0.setName("Matas");
        matas0.setSurname("Stoskus");
        matas0.setAge(25);
        System.out.println(matas0.getName() + " " + matas0.getSurname() + "\n" + matas0.getAge());
    }
}

class Matas {
    private String name;
    private String surname;
    private int age;
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setSurname(String newSurname) {
        this.surname = newSurname;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
}