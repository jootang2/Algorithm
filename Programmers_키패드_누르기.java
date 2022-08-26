package juhwan;

public class Programmers_키패드_누르기 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        String answer = solution(numbers, hand);

        System.out.println("answer = " + answer);
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = 10;
        int right = 12;
        int rightDistance, leftDistance;
        for( int n : numbers){
            if( n == 1 || n == 4 || n == 7){
                left = n ;
                sb.append("L");
            } else if ( n == 3 || n == 6 || n == 9){
                right = n;
                sb.append("R");
            } else {
                if ( n == 0 ){
                    n += 11 ;
                }
                rightDistance = (Math.abs(n - right)) / 3 + (Math.abs(n - right))  % 3;
                leftDistance = (Math.abs(n - left)) / 3 + (Math.abs(n - left)) % 3;
                if(rightDistance == leftDistance){
                    if(hand.equals("right")){
                        sb.append("R");
                        right = n;
                    } else {
                        sb.append("L");
                        left = n;
                    }
                } else if ( rightDistance > leftDistance ){
                    sb.append("L");
                    left = n;
                } else{
                    sb.append("R");
                    right = n;
                }
            }
        }

        return sb.toString();
    }
}
