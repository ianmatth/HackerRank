public class MissingNumbers {

    static int[] missingNumbers(int[] arr, int[] brr) {
        
        int arrv[] = new int[10000];
        int brrv[] = new int[10000];
        List<Integer> lcrr = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++){
                int value = arr[i];
                arrv[value] += 1;
        }
        
        for(int j = 0; j < brr.length; j++){
                int value = brr[j];
                brrv[value] += 1;
        }
        
        for(int k = 0; k < 10000; k++){
            if (arrv[k] != brrv[k]){
                lcrr.add(k);
            } 
        }
        int[] crr = new int[lcrr.size()];
        for(int l = 0; l < crr.length; l++){
            crr[l] = lcrr.get(l);
        }    
        return crr;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] brr = new int[m];
        for(int brr_i = 0; brr_i < m; brr_i++){
            brr[brr_i] = in.nextInt();
        }
        int[] result = missingNumbers(arr, brr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
