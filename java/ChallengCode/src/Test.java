public class Test {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        return names2;
    }

    public static void main(String[] args) {
        Test a =new Test();
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(a.uniqueNames(names1,names2));

        System.out.println();
        //System.out.println(String.join(", ", a.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}