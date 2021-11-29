package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        try {
            nf.find(new int[]{4, 3, 2, 1});

            System.out.println("T1 Largest: " + nf.getLargest());
            System.out.println("T1 1Smallest: " + nf.getSmallest());

            nf.find(new int[]{-100, -10, -5, 0});

            System.out.println("T2 Largest: " + nf.getLargest());
            System.out.println("T2 1Smallest: " + nf.getSmallest());

            nf.find(new int[]{-100, -10, -5, 0, new Integer(null), 5});

            System.out.println("T3 Largest: " + nf.getLargest());
            System.out.println("T3 1Smallest: " + nf.getSmallest());
        } catch (Exception e)
        {
            System.out.println("Error : "+e.toString());
        }
    }
}
