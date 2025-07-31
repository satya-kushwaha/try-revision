package String;

public class Strings {

    public static void main(String[] args) {
        //concatenation
        String firstName = "Satya";
        String lalstName = "Kushwaha";
        String fullName = firstName + "@" + lalstName;
        System.out.println(fullName);
        //charAt()
     /*   for (int i=0;i<fullName.length();i++){
            System.out.println(firstName.charAt(i));
        }*/
        //compare
        //1 n1 > n2  : +ve value
        //2 n1 == n2 : 0
        //3 n1 < n2  : -ve value
        String name1 = "Satya";
        String name2 = "Satya";
        if(name1.compareTo(name2) == 0){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }
    }
    //String are Immutable
}
