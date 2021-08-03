package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Numbers {

    // O(n*log(n) + n) = O(n*log(n))
    public static String getMaxNumberFromDigits(int[] digits){
        Arrays.sort(digits); // O(n*log(n))
        String result = "";
        for (int i = digits.length-1; i >=0 ; i--) { // O(n)
            result += digits[i];
        }

        return result;
    }

    public static String getMaxNumFromDigits(int[] digits){
        /* Переводим массив в поток и исп-ем классы обертки
         * сортируем в обратном порядке, конвертируем из Integer в String каждый элемент
         * преобразуем в массив строк и слепляем массив строк в одну строку при помощи join */

        return String.join("", Arrays.stream(digits).boxed()
                .sorted(Collections.reverseOrder()).map(String::valueOf).toArray(String[]::new));
    }
}
