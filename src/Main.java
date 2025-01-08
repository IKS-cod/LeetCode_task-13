import java.util.*;

/*
13. Римские числа в целые числа

Римские цифры представлены семью различными символами: I, V, X, L, и .CDM

Символ  Значение
I 1
V 5
X 10
L 50
C 100
D 500
M 1000
Например, 2 записывается как II римская цифра, просто две единицы, сложенные вместе.
12записывается как XII, что просто X + II. Число 27записывается как XXVII, что XX + V + II.

Римские цифры обычно пишутся от большего к меньшему слева направо. Однако цифра для четырех не IIII.
Вместо этого число четыре записывается как IV. Поскольку единица стоит перед пятью, мы вычитаем ее, получая четыре.
Тот же принцип применим к числу девять, которое записывается как IX. Существует шесть случаев, когда используется вычитание:

I можно поместить перед V(5) и X(10), чтобы получить 4 и 9.
X можно поместить перед L(50) и C(100), чтобы получить 40 и 90.
C можно разместить перед D(500) и M(1000), чтобы получить 400 и 900.
Данную римскую цифру преобразуйте в целое число.

Пример 1:
Вход: s = "III"
Выход: 3
Пояснение: III = 3.

Пример 2:
Вход: s = "LVIII"
Выход: 58
Пояснение: L = 50, V = 5, III = 3.

Пример 3:
Ввод: s = "MCMXCIV"
Вывод: 1994
Пояснение: M = 1000, CM = 900, XC = 90 и IV = 4.

Ограничения:
1 <= s.length <= 15
s содержит только символы ('I', 'V', 'X', 'L', 'C', 'D', 'M').
Гарантируется, что s это допустимая римская цифра в диапазоне [1, 3999].
*/

public class Main {
    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        List<Integer> arrInt = new ArrayList<>();
        int count = 0;
        for (char e : chars) {
            if (e == 'I') {
                arrInt.add(1);
            }
            if (e == 'V') {
                arrInt.add(5);
            }
            if (e == 'X') {
                arrInt.add(10);
            }
            if (e == 'L') {
                arrInt.add(50);
            }
            if (e == 'C') {
                arrInt.add(100);
            }
            if (e == 'D') {
                arrInt.add(500);
            }
            if (e == 'M') {
                arrInt.add(1000);
            }}
        for (int i = 0; i < arrInt.size(); i++) {
            if (i!=arrInt.size()-1&&arrInt.get(i) < arrInt.get(i + 1)) {
                count-=arrInt.get(i);
            } else {
                count+=arrInt.get(i);
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

}