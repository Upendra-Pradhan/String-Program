package Com.My_Package.String;
public class ConvertNum_To_Eng {

    public static String convertNumberToEnglish(int num) {

        String[] ones = {
            "", "One", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"
        };

        String[] tens = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };

        String[] thousands = { "", "Thousand", "Million", "Billion" };

        if (num == 0)
            return "Zero";

        StringBuilder result = new StringBuilder();
        int ind = 0;

        while (num > 0) {

            if (num % 1000 != 0) {

                int part = num % 1000;
                StringBuilder temp = new StringBuilder();

                if (part >= 100) {
                    temp.append(ones[part / 100]).append(" Hundred ");
                    part %= 100;
                }

                if (part >= 20) {
                    temp.append(tens[part / 10]).append(" ");
                    part %= 10;
                }

                if (part > 0) {
                    temp.append(ones[part]).append(" ");
                }

                temp.append(thousands[ind]).append(" ");
                result.insert(0, temp);
            }

            num /= 1000;
            ind++;
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        int num = 1234567;
        System.out.println(convertNumberToEnglish(num));
    }
}

