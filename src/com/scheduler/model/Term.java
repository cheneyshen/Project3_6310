package com.scheduler.model;

import java.util.ArrayList;

/**
 * @author ubuntu
 *
 */
public class Term {

    public ArrayList<Integer> semesters;

    public Term(String[] sem){
        this.semesters = new ArrayList<Integer>(sem.length);
        for(String s : sem){
            this.semesters.add(Integer.parseInt(s));
        }
    }
    public boolean isInTerm(Integer semester){
        return semesters.contains(semester);
    }

}
