package it.develhope.exercise40;

public class Start {
    public static void main(String[] args) {
        enum Month {January, February, March, April, May, June, July, August, September, October, November, December}

        for(Month month : Month.values()){
            String name = month.name();
            if(name.endsWith("y")){
                System.out.println(name + " ends with y");
            }
            else {
                System.out.println(name + " Doesn't end with y");
            }
        }
    }
}
