import java.io.*;
import java.util.*;
import java.util.stream.*;

class RegexPatternDatabase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());

        Vector<String> mail_Name_Vector = new Vector<String>();

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = br.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];

                String[] emailSplStrings = emailID.split("@");
                if (emailSplStrings[1].equals("gmail.com") && firstName.length() <= 20) {
                    mail_Name_Vector.add(firstName);
                }

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        Collections.sort(mail_Name_Vector);
        for (String str : mail_Name_Vector) {
            System.out.println(str);
        }
        br.close();
    }
}