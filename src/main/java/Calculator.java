public class Calculator {

    public String addition(String str1, String str2)
    {
        // To find the difference in the digit
        // make sure length of str2 is larger.
        if (str1.length() > str2.length()){
            String t = str1;
            str1 = str2;
            str2 = t;
        }

        // Empty String for storing result
        String str = "";

        // Calculate length of both String
        int len1 = str1.length();
        int len2 = str2.length();
        int diff = len2 - len1;

        // Set carry zero
        int carry = 0;

        // Traverse from end of both Strings
        for (int i = len1 - 1; i>=0; i--)
        {
            // Compute sum of current digits and carry
            int sum = ((int)(str1.charAt(i)-'0') + (int)(str2.charAt(i+diff)-'0') + carry);
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        // Add remaining digits of str2[]
        for (int i = len2 - len1 - 1; i >= 0; i--)
        {
            int sum = ((int)(str2.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        // Add remaining carry
        if (carry > 0)
            str += (char)(carry + '0');

        // reverse resultant String
        return new StringBuilder(str).reverse().toString();
    }
}
