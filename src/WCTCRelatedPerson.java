/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MCENDROWSKI
 */
public abstract class WCTCRelatedPerson {

    private String IdNumber;
    private int startOfRelation;
    private int endOfRelation;
    private WCTCRelationType typeOfRelation;
    private String name;

    public final void setTypeOfRelation(WCTCRelationType relation) {
        this.typeOfRelation = relation;
    }

    public final void setStartOfRelation(int year) {
        startOfRelation = year;
    }

    public final int getStartOfRelation() {
        return this.startOfRelation;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getIdNumber() {
        return IdNumber;
    }

    public final void setIdNumber(String IdNumber) {
        this.IdNumber = IdNumber;
    }

    public final int getEndOfRelation() {
        return endOfRelation;
    }

    public final void setEndOfRelation(int endOfRelation) {
        this.endOfRelation = endOfRelation;
    }

}
