package zadanie1;


import java.util.ArrayList;

public class zadanie2 {
    private ArrayList tablica;
    public zadanie2(ArrayList tablica){
        this.tablica = tablica;
    }

    public String print(){
        StringBuffer buf = new StringBuffer();
        int i = 0;
        while(this.tablica.indexOf(i) != '\0'){
            buf.append(this.tablica.indexOf(i));
            if(this.tablica.indexOf(i+1) != '\0'){
                buf.append(" ,");
                i+=1;
            }
            i+=1;
        }
        return buf.toString();
    }
}
