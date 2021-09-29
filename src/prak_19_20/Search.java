package prak_19_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Search {
    public ArrayList<String> arrayList;
    public HashSet<String> hashSet;
    public TreeSet<String> treeSet;

    public Search(ArrayList arrayList, HashSet hashSet, TreeSet treeSet)
    {
        this.arrayList = arrayList;
        this.hashSet = hashSet;
        this.treeSet = treeSet;
    }

    public void search_array(String string)
    {
        long time;
        long startTime = System.nanoTime();
        boolean found_or_not = arrayList.contains(string);
        long finishTime = System.nanoTime();
        time = finishTime - startTime;
        if(found_or_not)
        {
            System.out.println("Perebor -> Number is found, time is " + time + " ns");
        }
        else{
            System.out.println("Perebor -> Number isn`t found, time is " + time + " ns");
        }
    }

    public void search_array_binary(String string)
    {
        long time;
        Collections.sort(arrayList);
        long startTime = System.nanoTime();
        int found_or_not = Collections.binarySearch(arrayList, string);
        long finishTime = System.nanoTime();
        time = finishTime - startTime;
        if(found_or_not >= 0)
        {
            System.out.println("Binary search -> Number is found, time is " + time + " ns");
        }
        else{
            System.out.println("Binary search -> Number isn`t found, time is " + time + " ns");
        }
    }

    public void setHashSet(String string)
    {
        long time;
        long startTime = System.nanoTime();
        boolean found_or_not = hashSet.contains(string);
        long finishTime = System.nanoTime();
        time = finishTime - startTime;
        if(found_or_not)
        {
            System.out.println("Search in HashSet -> Number is found, time is " + time + " ns");
        }
        else{
            System.out.println("Search in HashSet -> Number isn`t found, time is " + time + " ns");
        }
    }

    public void setTreeSet(String string)
    {
        long time;
        long startTime = System.nanoTime();
        boolean found_or_not = treeSet.contains(string);
        long finishTime = System.nanoTime();
        time = finishTime - startTime;
        if(found_or_not)
        {
            System.out.println("Search in TreeSet -> Number is found, time is " + time + " ns");
        }
        else{
            System.out.println("Search in TreeSet -> Number isn`t found, time is " + time + " ns");
        }
    }
}
