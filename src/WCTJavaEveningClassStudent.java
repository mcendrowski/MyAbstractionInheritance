/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MCENDROWSKI
 */
public class WCTJavaEveningClassStudent extends WCTCRelatedPerson implements WCTCStudent, WCTCJavaStudent, WorkingPerson {

    private String studentId;
    private String currentSemester;
    private String finalGrade;
    private String teacher;
    private int courseId;
    private String job;

    @Override
    public void enroll() {
        System.out.println("You are enrolled.");
    }

    @Override
    public void graduate() {
        System.out.println("You have graduated.");
    }

    @Override
    public String getStudentId() {
        return this.studentId;
    }

    @Override
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String getCurrentSemester() {
        return this.currentSemester;
    }

    @Override
    public void setCurrentSemester(String currentSemester) {
        this.currentSemester = currentSemester;
    }

    @Override
    public String getFinalGrade() {
        return this.finalGrade;
    }

    @Override
    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    @Override
    public String getTeacher() {
        return this.teacher;
    }

    @Override
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public int getCourseId() {
        return this.courseId;
    }

    @Override
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public String getJob() {
        return this.job;
    }

    @Override
    public void setJob(String job) {
        this.job = job;
    }

}
