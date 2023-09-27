package task6.task6;
import java.util.*;


public class Main {


    public static void main(String[] args) {
        

        List<String>Brend = new ArrayList<String>();
        List<String>Os = new ArrayList<String>();
        Brend.add ("HP");
        Brend.add ("Acer");
        Brend.add ("Lenovo");
        Brend.add ("Asus");
        Os.add ("Windows");
        Os.add ("Linux");

        Random random = new Random();
        int count = 5;
        PC [] pc = new PC[count];
        ShopPC shopPC = new ShopPC();

            for(int i = 0; i <count; i++)
            {
                int pic = random.nextInt(Brend.size());
                String brend = String.valueOf(Brend.get(pic));
                pic = random.nextInt(Os.size());
                String os = String.valueOf(Os.get(pic));

                int display = random.nextInt(17 - 13)+13;

                int osy = random.nextInt(5);
                switch (osy) {
                    case 0 : osy = 4; break;
                    case 1 : osy = 8; break;
                    case 2 : osy = 16; break;
                    case 3 : osy = 32; break;
                }

                int vCard = random.nextInt((5 - 1) + 1) * 2;
                int hd = random.nextInt(8);
                switch(hd) {
                    case 0: hd = 128;break;
                    case 1: hd = 256;break;
                    case 2: hd = 512;break;
                    case 3: hd = 1;break;
                    case 4: hd = 2;break;
                    case 5: hd = 3;break;
                }
                int id =i;
                 pc[i] = new PC(id, brend,os, display, osy,vCard,hd);
                shopPC.Load(pc[i]);

                }


        System.out.println(shopPC);
        shopPC.filterPC();

    }

}