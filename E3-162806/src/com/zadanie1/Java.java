package com.zadanie1;

import java.time.LocalDate;
import java.util.Date;
import java.util.Vector;
import java.util.Comparator;


public class Java extends ProgrammingLanguage implements Cloneable, Comparable<Java> {
    private static LocalDate dateOfStart = null;
    private Date dateTheLatestRelease = null;
    private Vector<String> properties = null;

    {
        dateOfStart = LocalDate.of(1995, 5, 23);
    }

    public Java(boolean isObjectOriented, Vector<String> prop) {
        super(isObjectOriented);
        this.properties = prop;
        this.dateTheLatestRelease = new Date();
    }

    public Vector<String> getProperties() {
        return properties;
    }

    public String toString() {
        return "Language: " + getClass().getSimpleName()
                + ", dateOfStart = " + dateOfStart
                + ", dateTheLatestRelease = " + dateTheLatestRelease
                + ", properties = " + properties;
    }

    public Java clone() throws CloneNotSupportedException{
        Java cloned = (Java) super.clone();
        ((Java)cloned).dateTheLatestRelease = (Date)dateTheLatestRelease.clone();
        return cloned;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Java)){
            return false;
        }
        Java other = (Java) o;
        return this.dateTheLatestRelease.equals(other.dateTheLatestRelease);
    }

    @Override
    public int compareTo(Java o){
        if(this.dateTheLatestRelease.after(o.dateTheLatestRelease)){
            return 1;
        }
        if(this.dateTheLatestRelease.before(o.dateTheLatestRelease)){
            return -1;
        }
        return 0;
    }
}

class ComparatorData implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
        return ((Java) o1).compareTo((Java) o2);
    }
}
