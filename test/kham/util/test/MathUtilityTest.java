/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kham.util.test;

import static kham.util.MathUtility.*;
// Chỉ có từ JDK 5 ?, Hàm static gọi mà ko cần tên class chấm
// do mình đã chơi trò khai báo sẵn tên class và tên hàm static qua lệnh
// import static
// sau này xài hàm static của class này ko cần tên class chấm, xài như C
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KHAM
 */
public class MathUtilityTest {
    // Viết ra những việc, những tình huống xài hàm getFactorial()
    // Kiểm tra xem actual == expected hay không ??? như truyền thống bên main()
    // Nhưng ở đây xịn sò hơn, show ra màu xanh đỏ
    // Ngoài ra nó còn dùng cho việc CI - Continuous Integration
    //                               CD - Continuous Delivery
    //                               CT - Continuous Regression Test
    //                               DevOps - Development & Operation
    // Ngoài danh nghiệp đang xài
    // app liên tục được kiểm tra chất lượng code, build ra file .jar .war
    // đẩy lên 1 server trung gian - STAGING ENVIROMENT để cho nhóm test 
    // sẵn sàng test kĩ
    // sau đó có thể đẩy thẳng lên PRODUCTION SERVER, MÁY CHẠY THẬT Ở NƠI 
    // KHÁCH HÀNG
    // Mọi việc sẽ bắt đầu kể từ lúc Developer push code lên GitHub
    // Mọi thứ cứ thế tự động, ko cần con người can thiệp
    
    @Test //Từ khoá này tương đương biến hàm này thành public static void main()
    // Trong hàm này mình sẽ show ra màu xanh đỏ dựa trên sự khớp nhau giữa
    // EXPECTED vs ACTUAL qua hàm assertEquals() ... mà thư viện cung cấp
    // assert....() đủ các loại assert trên đời - assert (v) so sánh
    // thay vì so sánh bằng mắt, ta nhờ hàm so sánh giùm, thảy về màu giúp ta
    public void getFactorial_RunsWell_IfValidArgument() {
        assertEquals(120, getFactorial(5));
        assertEquals(24, getFactorial(4));
        assertEquals(720, getFactorial(6));
        assertEquals(1, getFactorial(0));
        
        // Hãy tính dùm 5! coi nó có là 120 hay không
        // Nếu có thì báo màu xanh, ko thì báo màu đỏ
    }
}
