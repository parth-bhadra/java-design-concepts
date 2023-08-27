package builderPattern;

public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String universityName;
    private int gradYear;
    private double psp;
    private String batchName;

    public Student(int id, String name, int age, String email, String phoneNumber,
                   String universityName, int gradYear, double psp, String batchName) {

        if(gradYear <= 2023) {
            throw new InvalidGradYearException("Invalid graduation year");
        }

        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradYear = gradYear;
        this.psp = psp;
        this.batchName = batchName;


    }

    public Student(int id, String name, int age, String email, String phoneNumber,
                   String universityName, int gradYear) {
        // duplication of code and messy code
        if(gradYear <= 2023) {
            throw new InvalidGradYearException("Invalid graduation year");
        }

        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradYear = gradYear;
        this.psp = psp;

    }
}
