package src.designPatterns.builderPattern;

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

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                '}';
    }

    public static class Builder {


        private int id;
        private String name;
        private int age;
        private String email;
        private String phoneNumber;
        private String universityName;
        private int gradYear;
        private double psp;
        private String batchName;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }
        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }
        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }


        private void validate() {
            if(gradYear <= 2023) {
                throw new InvalidGradYearException("Invalid graduation year");
            }
        }

        public Student build() {
            validate();
            return new Student(this.id, this.name, this.age, this.email, this.phoneNumber, this.universityName, this.gradYear, this.psp, this.batchName);
        }

    }
}
