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
        System.out.println("I want to test .yml file");
    }
}


// Mình muốn kết luận hàm ngon, mình phải test các trường hợp xài hàm
// Trường hợp 5!, 0!, -5! .....
// mình phải thiết kế các test case, tình huống test đê sau đó mình verify
// giữa giá trị trả về của hàm (actual) có khớp với expected cái mình dự đoán
// hàm chạy phải trả về
// và nếu mọi thứ khớp, tức là actual == expected, mình mới dám gáy: HÀM NGON
// CÁCH NÀY CÓ NHƯỢC ĐIỂM, NHÌN BẰNG MẮT VÀ SO SÁNH KẾT QUẢ CỦA TỪNG CASE

// CÁCH NÀY ỔN NHƯNG TIỀM ẨN SAI SÓT DO NHÌN = MẮT NHIỀU CASE
// CÁCH NÂNG CAO: !!!!

// CÙNG NHÌN BẰNG MẮT NHƯNG CHỈ NHÌN 2 MÀU XANH - ĐỎ CHO MOI TEST CASES
// CÓ NGHĨA: NẾU BẠN XÀI HÀM VỚI 100 THAM SỐ, CHẠY HÀM 100 TÌNH HUỐNG KHÁC NHAU
// BẠN CHỈ CẦN NHÌN DUY NHẤT 2 MÀU XANH VÀ ĐỎ
// XANH, CODE ỔN CHO MỌI TEST CASE, MỌI TÌNH HUỐNG GỌI HÀM
// MỌI CASE PHẢI CÓ EXPECTED = ACTUAL THÌ MỚI XANH
// ĐỎ, MỌI CASE MÀU XANH, CHỈ CÓ ÍT NHẤT 1 THẰNG ĐỎ => KẾT LUẬN CẢ ĐÁM ĐỎ
// Hàm đúng cho 99 trường hợp, expected = actual cho 99% tình huống
// chỉ có 1 trường huống sai , ko khớp, kết luận luôn là hàm ko ổn định
// AI DÁM XÀI KHI KO ỔN ĐỊNH, ỔN ĐỊNH VÀ CHÍNH XÁC PHẢI CHO MỌI CASES
// CHỈ CẦN ÍT NHẤT 1 CÁI KHÔNG ỔN ĐỊNH, ĐỎ CẢ ĐÁM ĐỂ ĐẢM BẢO RẰNG HÀM PHẢI CHÍNH XÁC
// MỌI TÌNH HUỐNG

// MUỐN LÀM ĐƯỢC ĐIỀU NÀY, CẦN SỰ PHỤ GIÚP CỦA CÁC THƯ VIỆN BÊN NGOÀI JDK, GỌI LÀ
// UNIT TEST FRAMEWORK
// CÁC BỘ UNIT TEST NỔI TIẾNG: JUnit, TestNG, NUnit, xUnit, PHPUnit ...
// Bữa nay mình học xanh đỏ qua JUnit
// Vãn với mục tiêu test hàm có ngôn ko, nhưng chỉ nhìn đúng 2 màu, ko care chi 
// tiết các tình huống chạy hàm