/*
 * 版權宣告: FDC all rights reserved.
 */

/**
 * 程式資訊摘要：
 * <P>
 * 類別名稱　　：Test.java
 * <P>
 * 程式內容說明：
 * <P>
 * 程式修改記錄：
 * <P>
 * XXXX-XX-XX：
 * <P>
 *
 * @author chtd
 * @version 1.0
 * @since 1.0
 */
public class Test {
    public static void main(String[] args) {
        
        int iphone = 20000;
        
        String[] customerTypes = {"VIP", "Golden", "Premium"};
        
        String mylevel = "Golden";
        
        Customer customer = new Premium(); // instance or object
        
        iphone = customer.discount(iphone);
        
//        if (mylevel.equals(customerTypes[0])) {
//            iphone -= 2000;
//        } else if (mylevel.equals(customerTypes[1])) {
//            iphone -= 1000;            
//        } else if (mylevel.equals(customerTypes[2])) {
//            iphone -= 3000;
//        }
        
        System.out.println(iphone);
    }
}
