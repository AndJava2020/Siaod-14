package com.company;

public class Main {
    static char t;
    public static void main(String[] args) {

        Huffman huffman=new Huffman("Andrianov Stanislav Sergeevich");
        System.out.println(huffman.getCodeText());
        //11010011101101001010001011101011111110010001110110010110101110010111001111111001000000100110100000000111101011011111010
        System.out.println((double) huffman.getSizeBits()/(huffman.getValueOfCharactersOfText()*8)); //коэффициент сжатия относительно aski кодов
        System.out.println((double) huffman.getSizeBits()/(huffman.getValueOfCharactersOfText()*(Math.pow(huffman.getValueOfCharactersOfText(),0.5)))); //коэффициент сжатия относительно равномерного кода. Не учитывается размер таблицы
        System.out.println(huffman.getMediumLength());//средняя длина кодового слова
        System.out.println(huffman.getDisperse());//дисперсия
    }
}
