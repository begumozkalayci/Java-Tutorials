package deneme;

public class Arrays {
    public static void main(String[] args) {
        int[] sayiDizisi = new int[10];
        sayiDizisi[0] = 3;
        sayiDizisi[1] = 4;
        sayiDizisi[8] = 9;
        sayiDizisi[9] = 6;


        for (int i = 0; i < sayiDizisi.length; i++) {
        }

        String[] yaziDizisi = {"Begüm", "Ömer", "Kariyer"};
        for (int i = 0; i < yaziDizisi.length; i++) {

        }

        int[][] ikiBoyutlu = new int[3][10];

        ikiBoyutlu[2][7] = 38;
        ikiBoyutlu[0][0] = 54;
        ikiBoyutlu[1][3] = 6;

        for (int i = 0; i < ikiBoyutlu.length; i++) {
            for (int j = 0; j < ikiBoyutlu[0].length; j++) {
                System.out.print(ikiBoyutlu[i][j]);
            }

            System.out.println();

        }

        PenFactory penFactory = new PenFactory();
        Pen[] penArray = new Pen[5];
        String[] colors = new String[]{"red", "yellow", "brown", "blue", "pink", "purple"};
        int[] heights = new int[]{1, 2, 3, 4, 5, 6};


        for (int i = 0; i < penArray.length; i++) {
            penArray[i] = penFactory.penMaker(colors[3],heights[3]);
        }

        for (int i = 0; i < penArray.length; i++) {
            System.out.println("color:" + penArray[i].color + " height:" + penArray[i].height);
        }


    }
}
