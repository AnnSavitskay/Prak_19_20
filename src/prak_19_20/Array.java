package prak_19_20;

import java.util.ArrayList;

public class Array {
    public ArrayList<String> array_nomera;
    public Array(String[] strings)
    {
        array_nomera = new ArrayList<>(strings.length);
        this.add(strings);
    }

    public void add(String[] string)
    {
        for(int i = 0; i < string.length; i++)
        {
            array_nomera.add(string[i]);
        }
    }

    public ArrayList<String> getArray_nomera() {
        return array_nomera;
    }
}
