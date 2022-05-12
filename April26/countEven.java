import java.io.*;
import java.util.*;

public class countEven {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        int ans = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if((i+j)%2==0){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}