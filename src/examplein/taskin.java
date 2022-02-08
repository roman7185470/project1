package examplein;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class taskin {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(10); add(20); add(30);

        }};

        for (Integer x:arr){
            System.out.println(x);
        }

    }
}
