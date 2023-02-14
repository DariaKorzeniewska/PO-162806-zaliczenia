package zadanie1;

import java.util.Comparator;
import java.util.Date;

public class Assistant<T extends Comparable<T>> extends AcademicTeacher implements Cloneable, Comparable<Assistant<T>>{
    private final int id;
    private Date dateOfStart = null;

    public Assistant(String name, int id) {
        super(name);
        this.id = id;
        this.dateOfStart = new Date();
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID = " + id
                + ", dateOfStart = " + dateOfStart
                + "]";
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Assistant)){
            return false;
        }
        Assistant other = (Assistant) o;

        return this.getName().equals(other.getName()) && (this.id == other.id) && (this.dateOfStart == other.dateOfStart);
    }

    @Override
    public int compareTo(Assistant<T> o){
        Assistant other = (Assistant) o;

        if(this.getName().length() > other.getName().length()){
            return 1;
        }
        if(this.getName().length() < other.getName().length()){
            return -1;
        }
        return 0;
    }

}
