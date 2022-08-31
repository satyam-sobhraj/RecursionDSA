public class recursion{
    public static void printNum(int n){
        if(n<1)
        return;
        else{
            System.out.println(n);
            printNum(n-1);
            System.out.println(n);
        }


    }
    public static void main(String[] args) {
        int n = 3;
        printNum(n);
        
    }
}