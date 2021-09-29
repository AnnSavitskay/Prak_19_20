package prak_19_20;

import java.util.TreeSet;

public class Tree_set {
    public TreeSet<String> treeSet;
    public Tree_set(String[] strings)
    {
        this.treeSet = new TreeSet<String>();
        this.add(strings);
    }

    public void add(String[] strings)
    {
        for (int i = 0; i < strings.length; i++)
        {
            this.treeSet.add(strings[i]);
        }
    }
    public TreeSet getTreeSet() {
        return treeSet;
    }
}
