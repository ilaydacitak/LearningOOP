package car;

/**
 *
 * @author ilaydacitak
 */
public class Car {

    public String model;
    public String mark;
    public String color;
    public String plateNum;
    public int km;
    public int price;
    public int speed;
    public int horsePower;
    public boolean isAutomatic;


    public Car (String model,String mark,String plateNum , String color){
        this.model = model ;
        this.mark = mark ;
        this.color = color ;
        this.plateNum = plateNum ;
        this.horsePower = -1 ;
        this.km = -1 ;
        this.price = -1 ;
        this.isAutomatic = false ;
    }

    public void changePrice (int price){
        this.price = price ;
    }
    public void changeHorsePower (int horsePower){
        this.horsePower = horsePower ;
    }
    public void changeKm (int km){
        this.km = km ;
    }
    public void changeIsAutomatic (boolean isAutomatic){
        this.isAutomatic = isAutomatic ;
    }

    public void write (){
        System.out.println("CAR MODEL:"+this.model);
        System.out.println("CAR MARK:"+this.mark);
        System.out.println("CAR COLOR:"+this.color);
        System.out.println("CAR PLATE NUM:"+this.plateNum);
        System.out.println("CAR HORSE POWER"+this.horsePower);
        System.out.println("CAR KM"+this.km);
        System.out.println("CAR PRİCE:"+this.price);
        System.out.println("CAR AUTOMATİC"+this.isAutomatic);
    }

    public static void main (String [] args){
        Car c1 = new Car ("Clio","Renault","23 LK 479","White");
        c1.changeHorsePower(75);
        c1.changeKm(55000);
        c1.changePrice(60000);
        c1.write();
    }
   
}
        
