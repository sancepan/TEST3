package com.example.testpr2;

public class MainLogic {
    // Все слова
    String[] words = new String[]{
            "ГОРСТЬ", "ТРОСТЬ", "ГОСТЬ", "ГРОТ", "ОСОТ", "РОСТ",
            "СОРТ", "СТОГ", "ТОРГ", "ТОРС", "ТОРТ", "ТОСТ",
            "ТРОС", "ГОТ", "ОГР", "ОСЬ", "РОГ", "РОТ",
            "СОР"
    };

    // Отметка отгаданных слов
    int[]  marks = new int[]{
            0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0,
            0
    };

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // Проверка наличия введеного слова
    public int wordSearch(String word) {
        return -1;
    }

}
