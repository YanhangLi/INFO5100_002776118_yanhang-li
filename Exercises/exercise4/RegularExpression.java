import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    // Match Numbers
    public void matchNumbers(String s){
        Pattern p = Pattern.compile("^[0-9]*[1-9][0-9]*$");
        Matcher m = p.matcher(s);
        if (m.find()){
            System.out.println("Match Numbers success!");
        }else {
            System.out.println("Match Numbers Error!");
        }
    }

    // match characters
    public void matchCharacters(String s){
        Pattern p = Pattern.compile("^[A-Za-z]+$");
        Matcher m = p.matcher(s);
        if (m.find()){
            System.out.println("Match Characters success!");
        }else {
            System.out.println("Match Characters Error!");
        }
    }

    // match phoneNumber
    public void matchPhoneNumber(String s){
        Pattern p = Pattern.compile("^((\\d2,3 \\d2,3)|(\\d{3}\\-))?13\\d{9}$");
        Matcher m = p.matcher(s);
        if (m.find()){
            System.out.println("Match PhoneNumber Success!");
        }else {
            System.out.println("Match PhoneNumber Error!");
        }
    }

    // match email
    public void matchEmail(String s){
        Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$");
        Matcher m = p.matcher(s);
        if (m.find()){
            System.out.println("Match Email Success!");
        }else {
            System.out.println("Match Email Error!");
        }
    }

    // match ip
    public void matchIP(String s){
        Pattern p = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)");
        Matcher m = p.matcher(s);
        if (m.find()){
            System.out.println("Match IP Success!");
        }else {
            System.out.println("Match IP Error!");
        }
    }

    public static void main(String[] args) {
        RegularExpression regularExpression = new RegularExpression();
        System.out.println("--------------------");
        System.out.println("--  Match Numbers --");
        System.out.println("--------------------");
        // success
        regularExpression.matchNumbers("123456");
        // error
        regularExpression.matchNumbers("about");

        System.out.println("--------------------");
        System.out.println("--Match Characters--");
        System.out.println("--------------------");
        // success
        regularExpression.matchCharacters("abdel");
        // error
        regularExpression.matchCharacters("123456");

        System.out.println("---------------------");
        System.out.println("--Match PhoneNumber--");
        System.out.println("--------------------");
        // success
        regularExpression.matchPhoneNumber("13763729081");
        // error
        regularExpression.matchPhoneNumber("5895499");

        System.out.println("--------------------");
        System.out.println("--   Match Email  --");
        System.out.println("--------------------");
        // success
        regularExpression.matchEmail("yanghangli@gmail.com");
        // error
        regularExpression.matchEmail("YangHangLi@");

        System.out.println("--------------------");
        System.out.println("--    Match IP    --");
        System.out.println("--------------------");
        // success
        regularExpression.matchIP("127.0.0.1");
        // error
        regularExpression.matchIP("255.0.0");
    }
}
