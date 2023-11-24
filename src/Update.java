public class Update {
    public static void main(String[] args) {

        int[]arr = {12,34,56,78,43,92};
        System.out.println("Before Update :- ");
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
            arr[2] = 100;

            System.out.println("After Update :- ");
            for(int j = 0; j<arr.length; j++){
                System.out.println(arr[j]);
            }
        }
    }

