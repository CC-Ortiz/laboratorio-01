public class ArrayAlias {
    public static void main(String[] args) {
        int[] firstNumbers = {2, 4, 6};
        int[] sameArray = firstNumbers;
        int[] otherArray = {2, 4, 6};

        sameArray[0] = 99;

        System.out.println(firstNumbers[0]);
        System.out.println(otherArray[0]);
        System.out.println(firstNumbers == sameArray);
        System.out.println(firstNumbers == otherArray);
    }
}
