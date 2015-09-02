/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcendrowski
 */
public abstract class WCTCStudents extends WCTCRelatedPersons {
    private String studentId;
    private int currentSemester;
    public abstract void enroll();
    public abstract void graduate();
    
    
}
