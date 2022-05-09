package charString.medium;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * 验证IP地址
 *
 * @link {https://leetcode-cn.com/problems/validate-ip-address/}
 */
public class ValidIPAddress {
    public static String validIPAddress(String queryIP) {

        if (queryIP.chars().filter(ch -> ch == '.').count() == 3) {
            return validateIPv4(queryIP);
        } else if (queryIP.chars().filter(ch -> ch == ':').count() == 7) {
            return validateIPv6(queryIP);
        } else return "Neither";

    }

    // ipv4逻辑
    public static String validateIPv4(String queryIP) {
        String[] strings = queryIP.split("\\.");

        if (strings.length != 4){
            return "Neither";
        }
        for (String str : strings) {
            //  .123.123.123
            if (str.length() == 0 || str.length() > 3) return "Neither";
            // 01.123.123.123
            if (str.charAt(0) == '0' && str.length() != 1) return "Neither";
            // a1.123.123.123
            for (char ch : str.toCharArray()) {
                if (!Character.isDigit(ch)) return "Neither";
            }
            // 1234.123.123.123
            if (Integer.parseInt(str) > 255 || Integer.parseInt(str) < 0) return "Neither";
        }
        return "IPv4";
    }

    // ipv6逻辑
    public static String validateIPv6(String queryIP) {

        String hexDigits = "0123456789abcdefABCDEF";
        String[] strings = queryIP.split(":");

        if (strings.length != 8){
            return "Neither";
        }

        for (String str : strings) {
            if (str.length() == 0 || str.length() > 4) return "Neither";

            for (Character ch : str.toCharArray()) {
                if (hexDigits.indexOf(ch) == -1) return "Neither";
            }
        }
        return "IPv6";
    }
}


