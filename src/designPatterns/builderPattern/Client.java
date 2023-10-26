package src.designPatterns.builderPattern;

public class Client {
    public static void main(String[] args) {
        Student student = Student.builder()
                .setId(1)
                .setName("Parth")
                .setAge(23)
                .setEmail("parthbhadra14@gmail.com")
                .setPhoneNumber("1234567890")
                .setUniversityName("BOSTON")
                .build();

        System.out.println(student.toString());
    }

}
