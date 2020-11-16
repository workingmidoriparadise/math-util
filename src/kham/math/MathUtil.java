/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kham.math;

import kham.util.MathUtility;

/**
 *
 * @author KHAM
 */
public class MathUtil {

    public static void main(String[] args) {
        long expected = 120; //tớ hy vọng 120 nếu tớ gọi 5!
        long actual = MathUtility.getFactorial(5);
        // In ra để kiểm tra sự khớp nhau giữa cái muốn và cái làm
        System.out.println("5! expected: " + expected);
        System.out.println("5! actual: " + actual);

        // Tiếp tục cho các tình huống khác 6!, 7!, 8!
        // các tình huống cần phải test ta gọi là test case
        // về lý thuyết ta phải test hết các tình huống ...
        // về thực hành: kì 5 sẽ rõ SWT301
        System.out.println("6!: 720, actual: " + MathUtility.getFactorial(6));
        System.out.println("0!: 1, actual: " + MathUtility.getFactorial(0));
        // kì vọng ném về ngoại lệ IllegalArgumentException nếu người dùng
        // cố tình đưa tham số âm hoặc tham số > 20
        System.out.println("expected: IllegalArgumentException: " + MathUtility.getFactorial(-5));
        System.out.println("Test Push GitHub");
    }
}