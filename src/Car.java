public class Car {
    private String name;
    private int price;
    private String color;

    public Car(){
        System.out.println("ini dari kelas Car");
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public void setName(String nama){
        name = nama;
    }

    public void setPrice(int harga){
        price = harga;
    }

}


