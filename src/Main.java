import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        Random rand = new Random();
        int sizeX = 5;
        int sizeY = 7;

        for (int i = 0; i < sizeX; i++) {
            x.add(rand.nextInt(11));
        }
        for (int i = 0; i < sizeY; i++) {
            y.add(rand.nextInt(11));
        }

        Collections.sort(x);
        Collections.sort(y);

        List<Integer> xPlusY = new ArrayList<>(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);

        Set<Integer> zSet = new TreeSet<>(x);
        zSet.retainAll(y);

        List<Integer> xMinusY = new ArrayList<>(x);
        xMinusY.removeAll(y);

        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();
        for (int num : xPlusY) {
            if (num <= p) {
                xPlusYLimitedByP.add(num);
            }
        }
        System.out.println("xPlusY: " + xPlusY);
        System.out.println("zSet: " + zSet);
        System.out.println("xMinusY: " + xMinusY);
        System.out.println("xPlusYLimitedByP: " + xPlusYLimitedByP);
    }
}
