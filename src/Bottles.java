public class Bottles {
    String print;
    String verse(int bottles) {
        if(bottles==0){
           print="No more bottles of milk on the wall, no more bottles of milk.\nGo to the store and buy some more, 99 bottles of milk on the wall.";
           return print;
        }
        else if(bottles>1) {
            print = bottles + " bottles of milk on the wall, "+bottles+" bottles of milk.\nTake one down and pass it around, ";
            if(bottles-1>1)
                print = print + (bottles-1) +" bottles of milk on the wall.";
            else
                print = print + (bottles-1) + " bottle of milk on the wall.";

        }
        else if(bottles==1){
            print = bottles + " bottle of milk on the wall, 1 bottle of milk.\nTake it down and pass it around, no more bottles of milk on the wall.";
        }
        return print;
    }

}
