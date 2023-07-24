public class Main {
    public static void main(String[] args) {
        int [] sinif ={20,25,30,77,86,92};
        double avarege = 0;
        for (int i = 0 ; i< sinif.length;i++ ){
            avarege += sinif[i];
        }
        avarege = avarege/ sinif.length;
        System.out.println(avarege);
    }
}