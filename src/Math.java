public class Math {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        Double average;

        for(int i : numbers){
            sum+=i;
        }
        int len = numbers.length;
        average = ((double)sum/(double) len);

        System.out.println("Sum :- " +sum);
        System.out.println("Average:-" + average);
    }
}
