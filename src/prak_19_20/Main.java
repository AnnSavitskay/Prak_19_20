package prak_19_20;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Generator generator = new Generator();
        for(int i = 0; i < 20; i++)
        {
            System.out.println(generator.getNomera()[i]);
        }

        Array array = new Array(generator.getNomera());
        Hash_set hashSet = new Hash_set(generator.getNomera());
        Tree_set treeSet = new Tree_set(generator.getNomera());

        Search search = new Search (array.getArray_nomera(), hashSet.getHashSet(), treeSet.getTreeSet());
        String str = scan.nextLine();
        search.search_array(str);
        search.search_array_binary(str);
        search.setHashSet(str);
        search.setTreeSet(str);
    }
}
