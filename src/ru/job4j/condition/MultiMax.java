package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int resultFirstSecond = first > second ? first : second;
        return resultFirstSecond > third ? resultFirstSecond : third;
    }
}
