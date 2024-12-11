package StreamsAPI;

import java.util.ArrayList;
import java.util.List;

public class Problem2approach {
        public static void main(String[] args) {
            List<String> name = new ArrayList<>(20);
            name.add("Ahmedabad");
            name.add("Ahilyanagar");
            name.add("amravati");
            name.add("Beed");
            name.add("Latur");
            name.add("Jalna");
            name.add("Anand");
            name.add("Akola");
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


            System.out.println(name);
            // Swapping
            for (int i = 0; i < name.size(); i++) {
                for (int j = i + 1; j < name.size(); j++) {
                    if(name.get(i).length()>=name.get(j).length())
                    {
                        String Swap=name.get(i);
                        name.set(i,name.get(j));
                        name.set(j,Swap);
                    }
                }
            }
            System.out.println(name);

            // Comparator
        /*
        for(int i=0; i<name.size(); i++) {
            if(name.get(i).startsWith("a")||name.get(i).startsWith("A")) {

                //Collections
                Collections.sort(name, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.length()-o2.length();
                    }
                });
            }
        }*/

            for(int i=0; i<name.size(); i++) {
                if(name.get(i).startsWith("a")||name.get(i).startsWith("A")) {
                    System.out.println(name.get(i)+"->"+name.get(i).length());
                }
            }
        }
    }
