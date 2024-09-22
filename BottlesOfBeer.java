/**
 * Name: John Paul Doohan
 * Date: 09.19.2024
 * About: BottlesOfBeer
 */
package Lab1;

public class BottlesOfBeer {

    public static void main(String[] args) {
        int bottlesNum = 99;
        String word = " bottles ";

        while (bottlesNum > 0) {
        //while loop, checking to see if the variable "bottlesnum" is above 0

                System.out.println(bottlesNum + word + "of beer on the wall,");
                System.out.println(bottlesNum + word + "of beer,");
                System.out.println("Take one down, pass it around,");

                bottlesNum = bottlesNum - 1;
                //takes 1 away from our variable value

                if (bottlesNum == 1) {
                    word = " bottle ";
                } else { word = " bottles ";
                }
                //checking to see if theres just one bottle using an if/else statement

                System.out.println(bottlesNum + word + "of beer on the wall\n");
                //loop checks and sees if variable is above 0, if not, it repeats from the start of the loop

            }
        if (bottlesNum == 0) {
            word = " bottles ";
            System.out.println("No more" + word + "of beer on the wall,");
            System.out.println("No more" + word + "of beer,");
            System.out.println("We've taken them down, and passed them round,");
            System.out.println("No more" + word + "of beer on the wall\n");

            bottlesNum = bottlesNum - 1;
            }
        //if statement isn't looped so won't repeat infinitely.

            }
        }

