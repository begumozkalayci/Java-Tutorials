package deneme;

public class PenFactory {
    public static void main(String[] args) {
        Pen firstPen = new Pen();
        firstPen.color = "Pembe";
        firstPen.height = 10;
        String message = "İlk kalem üretildi.";


        firstPen.writeMessage(message);

        Pen secondPen = new Pen();
        secondPen.color = "Blue";
        secondPen.height = 8;
        secondPen.writeMessage(secondPen.color + " " + secondPen.height);


    }

    public Pen penMaker(String color, int height){
        Pen pen = new Pen();
        pen.color = color;
        pen.height=height;
        return pen;
    }
}

