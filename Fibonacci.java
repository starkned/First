public class Fibonacci {
    public static int of(int x) {
        int arr[] = new int[x+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=x;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[x];



    }

    public static void main(String[] args) {
        int i=1;
        while (true){
            if (Fibonacci.of(i)<=200){
                System.out.println(Fibonacci.of(i));
                i++;
            }
            else {
                break;
            }
        }
    }
}


