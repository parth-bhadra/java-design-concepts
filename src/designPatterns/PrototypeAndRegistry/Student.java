package src.designPatterns.PrototypeAndRegistry;

import java.util.Date;

public class Student implements Prototype<Student> {
    private int id;
    private String name;
    private int psp;

    // the below attributes would be common amongst a lot of students and hence it is better to clone these objects and
    // assign the values that are different using getters and setters
    private String batchName;
    private String moduleName;
    private String track;
    private Date joinYear;
    private String instructorName;
    private Date completionYear;
    private String paymentPartner;
    private int batchPSP;

    public Student (int id, String name, int psp, String batchName, String moduleName, String track, Date joinYear, String instructorName, Date completionYear, String paymentPartner, int batchPSP) {
        this.id = id;
        this.name = name;
        this.psp = psp;
        this.batchName = batchName;
        this.moduleName = moduleName;
        this.track = track;
        this.joinYear = joinYear;
        this.instructorName = instructorName;
        this.completionYear = completionYear;
        this.paymentPartner = paymentPartner;
        this.batchPSP = batchPSP;
    }

    public Student() {

    }

    @Override
    public Student clone() {
        return new Student(id, name, psp, batchName, moduleName, track, joinYear, instructorName, completionYear, paymentPartner, batchPSP);
    }

    public int getBatchPSP() {
        return batchPSP;
    }

    public void setBatchPSP(int batchPSP) {
        this.batchPSP = batchPSP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public Date getJoinYear() {
        return joinYear;
    }

    public void setJoinYear(Date joinYear) {
        this.joinYear = joinYear;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public Date getCompletionYear() {
        return completionYear;
    }

    public void setCompletionYear(Date completionYear) {
        this.completionYear = completionYear;
    }
}
