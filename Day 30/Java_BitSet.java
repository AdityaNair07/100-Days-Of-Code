import java.util.*;

public class Java_BitSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int numOfOperations = sc.nextInt();

        BitSet bitSet1 = new BitSet(length);
        BitSet bitSet2 = new BitSet(length);
        BitSet[] bitSets = { bitSet1, bitSet2 };

        String operation = "";
        int firstArg = 0;
        int secondArg = 0;

        for (int i = 0; i < numOfOperations; i++) {
            operation = sc.next();
            firstArg = sc.nextInt();
            secondArg = sc.nextInt();

            switch (operation) {
                case "AND":
                    bitSets[firstArg - 1].and(bitSets[secondArg - 1]);
                    break;
                case "OR":
                    bitSets[firstArg - 1].or(bitSets[secondArg - 1]);
                    break;
                case "XOR":
                    bitSets[firstArg - 1].xor(bitSets[secondArg - 1]);
                    break;
                case "FLIP":
                    bitSets[firstArg - 1].flip(secondArg);
                    break;
                case "SET":
                    bitSets[firstArg - 1].set(secondArg);
                    break;
            }
            System.out.printf("%d %d%n",
                    bitSet1.cardinality(),
                    bitSet2.cardinality());
        }
        sc.close();
    }
}
