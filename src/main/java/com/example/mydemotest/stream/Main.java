package com.example.mydemotest.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("ab");
        list.add("af");
        list.add("bf");
        Stream<String> stream1 = list.stream().filter(s -> s.startsWith("a"));
        stream1.forEach(s-> System.out.println(s));  //第一次用stream1
        Stream<String> stream2 = stream1.filter(s -> s.startsWith("b"));  // ！！第二次用stream1 报错：stream has already been operated upon or closed
        stream2.forEach(s-> System.out.println(s));

       /* HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("key1","a");
        hashMap.put("key2","b");
        hashMap.put("key3","c");
        hashMap.entrySet().stream().forEach(s-> System.out.println(s));*/
  /*      int[] arr=new int[]{1,2,3};
        Arrays.stream(arr).forEach(s-> System.out.println(s));*/
//        Stream.of(1,2,3,4).forEach(s-> System.out.println(s));

    }
}
