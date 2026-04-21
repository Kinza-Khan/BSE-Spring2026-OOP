package Generics;

import java.util.ArrayList;

// Interface
interface Duty {
    void showDuty();
}

// Abstract Class
abstract class Doctor implements Duty {
    protected int id;
    protected String name;

    public Doctor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void getDetails();
}

// General Doctor
class GeneralDoctor extends Doctor {
    private String area;

    public GeneralDoctor(int id, String name, String area) {
        super(id, name);
        this.area = area;
    }

    void getDetails() {
        System.out.println("General Doctor: " + name + ", Area: " + area);
    }

    public void showDuty() {
        System.out.println("Duty: Treat general patients");
    }
}

// Specialist Doctor
class SpecialistDoctor extends Doctor {
    private String specialization;

    public SpecialistDoctor(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    void getDetails() {
        System.out.println("Specialist Doctor: " + name + ", Specialization: " + specialization);
    }

    public void showDuty() {
        System.out.println("Duty: Handle specialized cases");
    }
}

// Generic Class
class Hospital<T extends Doctor> {
    private ArrayList<T> doctors = new ArrayList<>();

    void addDoctor(T doc) {
        doctors.add(doc);
    }

    void displayAll() {
        for (T d : doctors) {
            d.getDetails();   // polymorphism
            d.showDuty();
        }
    }
}

// Generic Method
class Utility {
    public static <T> void print(T data) {
        System.out.println(data);
    }
}

// Main Class
public class Assignment {
    public static void main(String[] args) {

        Hospital<Doctor> hospital = new Hospital<>();

        hospital.addDoctor(new GeneralDoctor(1, "Ali", "City Area"));
        hospital.addDoctor(new SpecialistDoctor(2, "Sara", "Cardiology"));

        hospital.displayAll();

        Utility.print("System Running...");
        Utility.print(500);
    }
}