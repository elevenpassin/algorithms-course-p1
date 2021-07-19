/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWord {
    public static void main(String[] args) {
        double randomIndex = Math.floor(Math.random() * args.length);
        System.out.println(args[(int) randomIndex]);
    }
}
