package tech.strategio;

import java.util.*;

public class E01 {
    public int generateFibSeqHelper( int n){
        if(n == 1 || n == 0){
            return n;
        }

        return generateFibSeqHelper(n-1) + generateFibSeqHelper(n-2);
    }

    public int getNthFib(int n) {
        // FIXME
        int nthFib = generateFibSeqHelper(n-1);

        return nthFib;
    }
}
