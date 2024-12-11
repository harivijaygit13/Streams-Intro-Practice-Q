package StreamsAPI;

import java.util.ArrayList;
import java.util.Collections;

public class Problem01 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>(20);
        name.add("Ahmedabad");
        name.add("Ahilyanagar");
        name.add("Akola");
        name.add("Amravati");
        name.add("Beed");
        name.add("Latur");
        name.add("Jalna");
        name.add("Anand");
        name.add("Thane");
        name.add("Pune");
        name.add("Mumbai");
        name.add("Jalgaon");
        name.add("Dharashiv");
        name.add("Saswad");
        name.add("Purandar");
        name.add("Baramati");
        name.add("Sangamner");
        name.add("Agra");
        name.add("Amritsar");
        name.add("Ajmer");

        Collections.sort(name);
        for(int i=0; i<name.size(); i++) {
            if(name.get(i).contains("A")) {
                System.out.println(name.get(i) + "->" + name.get(i).length());
            }
        }
    }
}
