package com.zhuwuhui.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {


        List<Object> list1 = new ArrayList<>();
        list1.add("小君宝");
        list1.add(111);
        System.out.println(list1);

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"小福贵");
        map.put(2,"小四喜");
        String a = map.putIfAbsent(3, "小天宝");
        System.out.println(a);
        System.out.println(map);
        String b = map.putIfAbsent(2, "小四喜");
        System.out.println(b);
        System.out.println(map);

        List<String> list = new ArrayList<>();
        list.add("小福贵");
        list.add("小四喜");
        list.add("段云卿");
        list.add("小四喜");
        System.out.println(list);
        List<String> list2 = list.stream().filter(test(String::toString)).collect(Collectors.toList());
        System.out.println(list2);
    }

    public static <T> Predicate<T> test(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return object -> map.putIfAbsent(keyExtractor.apply(object), Boolean.TRUE) == null;
    }
}
