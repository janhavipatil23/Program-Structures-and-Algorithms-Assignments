package edu.neu.coe.info6205.union_find;
import java.util.Random;
public class UFClient {

    private static int count(int n){
        int count = 0;
        UF_HWQUPC uf = new UF_HWQUPC(n);
        Random random = new Random();
        while(uf.components()!=1){
            int a = random.nextInt(n);
            int b = random.nextInt(n);
            uf.connect(a,b);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int times = 200;
        for(int n = 1; n <= 100000; n*=2){
            long sum = 0;
            for(int i = 0; i < times; i++){
                sum += count(n);
            }
            long connections = sum/times;
            System.out.println("N Values: " + n + "," + " Number of Connections Generated: " + connections);

        }

    }

}
