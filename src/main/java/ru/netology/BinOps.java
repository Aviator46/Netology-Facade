package ru.netology;

public class BinOps {
    public String sum(String a, String b) {
        int one = Integer.parseInt(a);
        int to = Integer.parseInt(b);
        return Integer.toBinaryString(one + to);
    }

    public String mult(String a, String b) {
        int one = Integer.parseInt(a);
        int to = Integer.parseInt(b);
        return Integer.toBinaryString(one * to);
    }
}