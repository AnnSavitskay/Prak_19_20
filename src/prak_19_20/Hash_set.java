package prak_19_20;

import java.util.Collections;
import java.util.HashSet;

public class Hash_set {
    public HashSet<String> hashSet;

    public Hash_set(String[] strings)
    {
        this.hashSet = new HashSet<String>(strings.length);
        this.add(strings);
    }

    public void add(String[] strings)
    {
        for(int i = 0; i < strings.length; i++)
        {
            this.hashSet.add(strings[i]);
        }
    }

    public HashSet<String> getHashSet() {
        return hashSet;
    }
}
