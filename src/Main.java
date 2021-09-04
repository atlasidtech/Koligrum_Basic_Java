public class Main {
    public static void main (String args[]){

        System.out.println("Hello World! Welcome to Koligrum Class!");

        int i = 5;
        double phi = 3.14;


        int j = 1;
        j = 10;

        System.out.println(i);   // 5
        System.out.println("angka = " + i); //angka = 5
        System.out.println(i+j); //15

        int a = 10;  // a = 10
        int b = a++; // b = a = 11
        int c = ++a;  // c = ++a = 12

        System.out.println(a); //12
        System.out.println(b); //10
        System.out.println(c); //12

        int aa = 10;  // a = 10
        int bb = ++aa; // b = a = 11
        int cc = ++aa;  // c = ++a = 12
        int dd = aa++;

        boolean isEmpty = false;
        System.out.println("nilai dari isEmpty = " + isEmpty);
        System.out.println("nilai dari isEmpty =" + !isEmpty);

        int ee = 5;
        int ff = 6;
        int gg = 5;

        boolean isTrue = (ee==gg);
        System.out.println(isTrue);

        isTrue = (ff<=gg);
        System.out.println(isTrue);

        isTrue = (ff>ee);
        System.out.println(isTrue);

        Car car = new Car();

        car.setName("Daihatsu");
        car.setPrice(1000000);

        String nama = car.getName();
        int hargaMobil = car.getPrice();

        System.out.println("nama mobil = " + nama);
        System.out.println("harga mobil " + nama + " senilai Rp " + hargaMobil);

        System.out.println(aa); //10
        System.out.println(bb); //11
        System.out.println(cc); //12
        System.out.println(dd); //12

        conditional();

        buatDeret(2);
        buatDeretPakeWhile(2);
    }

    public static void buatDeret(int input){
        //input = 2
        //i=0 <= 2, i = 1
        //print i,
        //i = 1 <= 2, i=2
        //print 1
        //i= 2 <=2, i=3
        //print 2
        //i=3 <=2

        for(int i=0; i<=input; i++){
            System.out.println(i);
        }
    }

    public static void buatDeretPakeWhile(int input){
        int i = 1;
        while (input > 0){
            System.out.println(i);
            i++;
            input--;
        }
    }

    public static void conditional(){
        int a = -5;
        int b = 5;
        int c = 0;

        if(a>b){
            System.out.println("a lebih besar dari b");
        } else if(a==b){
            System.out.println("a sama dengan b");
        } else if(a<0){
            System.out.println("a bernilai negatif");
        }
        else {
            System.out.println("a tidak lebih besar dari b dan tidak sama dengan b");
        }

        int i = 7;
        if(i%2 != 0){
            System.out.println("ini angka ganjil");
        }else if(i%2 == 0){
            System.out.println("ini angka genap");
        } else {
            System.out.println("ini angka bukan genap bukan ganjil");
        }

    }
}
