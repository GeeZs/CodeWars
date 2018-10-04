package CodeWars.eight.AdamAndEve;



public class God {
    public static Human[] create(){
        //code
        Human[] humans = new Human[2];
        Human man = new Man();
        Human woman = new Woman();
        humans[0] = man;
        humans[1] = woman;
        return humans;
    }
}
class Human{}
class Man extends Human{}
class Woman extends Human{}

