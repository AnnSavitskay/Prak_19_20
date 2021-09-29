package prak_19_20;

public class Generator {
    public int num = 2500000;
    public String[] nomera = new String[num];

    public Generator(){
        this.generate();
    }

    public void generate()
    {
        String[] str = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String X;
        String Y;
        String Z;
        String N;
        String R;

        for(int i = 0; i < this.num; i++)
        {
            int rand_n = (int)(Math.random()*9);
            int rand_r = (int)(Math.random()*198 + 1);
            int rand_x = (int)(Math.random()*11);
            int rand_y = (int)(Math.random()*11);
            int rand_z = (int)(Math.random()*11);
            X = str[rand_x];
            Y = str[rand_y];
            Z = str[rand_z];
            N = Integer.toString(rand_n);
            if((rand_r <= 9)&& (rand_r >= 1))
            {
                R = "0" + Integer.toString(rand_r);
            }
            else
            {
                R = Integer.toString(rand_r);
            }
            this.nomera[i] = X + N + N + N + Y + Z + R;
        }
    }

    public String[] getNomera() {
        return nomera;
    }

    public int getNum() {
        return num;
    }
}
