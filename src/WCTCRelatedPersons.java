/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcendrowski
 */
public abstract class WCTCRelatedPersons {
    private String IdNumber;
    private int startOfRelation;
    private int endOfRelation;
    private WCTCRelationTypes typeOfRelation;
    public void setTypeOfRelation(WCTCRelationTypes relation){
        this.typeOfRelation=relation;
    }
    public void setStartOfRelation (int year){
        startOfRelation=year;
    }
    public int getStartOfRelation(){
        return this.startOfRelation;
    }
}
