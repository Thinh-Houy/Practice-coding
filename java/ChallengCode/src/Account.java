public class Account {
    public static void uniqueNames(String[] names1, String[] names2) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        for (String a : names2) {
            System.out.println(a);
        }
    }




    public static void main(String[] args) {
        String[] names1 = {"Ava", "Emma", "Olivia"};
        String[] names2 = {"Olivia", "Sophia", "Emma"};
        System.out.println(uniqueNames(names1,names2));
        // System.out.println(String.join(", ", Account.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}