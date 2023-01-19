import java.io.*;

class Result {
    public static String timeConversion(String s) {
        String hrs = s.substring(0, 2);
        String min = s.substring(3, 5);
        String sec = s.substring(6, 8);
        String ampm = s.substring(8, 10);
        if (ampm.equals("AM") && hrs.equals("12")) {
            hrs = "00";
        } else if (ampm.equals("PM") && hrs.equals("12")) {
            hrs = "12";
        } else if (ampm.equals("PM")) {
            int hr = Integer.parseInt(hrs);
            hr = hr + 12;
            hrs = Integer.toString(hr);
        }
        return hrs + ":" + min + ":" + sec;
    }
}

class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = br.readLine();

        String result = Result.timeConversion(s);

        bw.write(result);
        bw.newLine();

        br.close();
        bw.close();
    }
}
