import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
//removeRange
public class Main {
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (; i>0;i--){
            al.add(sc.nextInt());
        }
        for (int j = 2; j < al.size(); j++){
            if (Objects.equals(al.get(j), al.get(j - 1))){
                if (Objects.equals(al.get(j - 1), al.get(j - 2))){
                    int l = j-2;
                    System.out.println("da");
                    int k = j-2;
                    while (true){
                        k++;
                        if (al.get(k)==l){
                            al.remove(k);
                            res++;
                        }else break;
                    }
                }
            }
        }
        System.out.println(res);
    }
}