package com.lee.designPrinciple;

import java.io.Serializable;
import java.util.*;

public class D1 {

    public static <K, V extends Comparable<? super V>> Comparator<Map.Entry<K,V>> comparingByValue() {
        return (Comparator<Map.Entry<K, V>> & Serializable) (c1, c2) -> c1.getValue().compareTo(c2.getValue());
    }

    public static void main(String[] args) {
        new In1<String, Integer, String>() {
            @Override
            public InBase02<? extends String> action(InBase01<? super String, ? extends Integer> i) {
                return null;
            }
        };
    }
}


interface InBase01<I, O>{
     O action01(I i);
}

interface InBase02<O>{
    O action02();
}


interface In1<I,M,O>{
    InBase02<? extends O> action(InBase01<? super I, ? extends M> i);
}








