package String;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Satya");
        System.out.println(sb);

/*        sb.setCharAt(0,'A');
        System.out.println(sb);

        sb.insert(0,'R');
        System.out.println(sb);

        sb.delete(0,2);
        System.out.println(sb);

        sb.append("Ram");// same things in String str = str + "ram";
        System.out.println(sb);*/

//        System.out.println("Revers String ");
//
//        for(int i=sb.length()-1;i>=0;i--){
//            System.out.print(sb.charAt(i));
//        }

        System.out.println("1/2 revers of string ");
        for(int i=0; i<sb.length()/2; i++){
            int front = i ;
            int back = sb.length() - 1 -i;// s-1-0 = > 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(backChar,frontChar);

        }
        System.out.println(sb);
    }
}
