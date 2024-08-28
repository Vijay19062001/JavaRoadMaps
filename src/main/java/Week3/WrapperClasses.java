package Week3;

import java.util.ArrayList;
public class WrapperClasses {


    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList
            = new ArrayList<Integer>();
 
        arrayList.add(25);
        arrayList.add(33);
        arrayList.add(40);
        
 
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
    }
    
}
