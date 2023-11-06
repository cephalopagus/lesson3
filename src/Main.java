import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1
        float[] massive = {12.2f, 2.3f, -1322.244f, -232.862f, -12.2f, 12.2f,
                1285.24343f, 812.280f, 1682.8072f, 14782.2744f, 1742.772f, -1362.266f, 14742.362f, 2212.852f, -12.2749f};
        float sum = 0; int count=0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i]<0){
                for (int j = i+1; j < massive.length; j++) {
                    if (massive[j]>0){
                        sum+=massive[j];
                        count++;
                    }
                }
                break;
            }
        }


        System.out.println("Среднее арифметическое: " + (sum / count));
        System.out.println("----------------");


        //2
        Scanner in = new Scanner(System.in);
        String str, str2 = "";
        System.out.print("Введите текст: ");
        str = in.nextLine();

        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        for (int i = str.length()-1; i > -1 ; i--) {
            str2+=str.charAt(i);
        }

        if (str.equals(str2)){
            System.out.println("Это палиндром!");
        }else {
            System.out.println("Это не палиндром!");
        }


    }
}