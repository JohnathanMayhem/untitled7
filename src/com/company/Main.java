package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        ArrayList<Integer> list;
        ArrayList <Integer> sizes = new ArrayList<>();
        Random r = new Random();
        while (sizes.size()<n){
            int size = r.nextInt(10)+1;
            if (sizes.contains(size)){
                continue;
            }
            sizes.add(size);
        }
        int j = 1;
        for (int size: sizes) {
            list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                list.add(r.nextInt(20));
            }

            switch (j%2){
                case (1):
                    Collections.sort(list);
                    break;
                case 0:
                    Collections.sort(list, Collections.reverseOrder());
            }
            ++j;
            arrayLists.add(list);
        }
        for (ArrayList<Integer> l: arrayLists
             ) {
            System.out.println(l.toString());
        }
    }
}
