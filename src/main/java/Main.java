import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] input = {1,1,1,2,2,3,3,3,3,3};
        List<Integer> answer = TopKFrequentElements.topKFrequent(input, 2);
        System.out.println(answer);
    }
}
