package enum;

import java.util.EnumSet;

public class Basic {
        enum Week{
            Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
            //these are enum constants
            // since it final you can crate child enum

            //type is week

            Week(){
                System.out.println("Constructor called for " + this);
            }
        }

        public static void main(String[] args) {
           Week week;
           week = Week.Monday;
           for(Week day: Week.values()){
            System.out.println(day);
           }

           System.out.println(week);
        }
}

