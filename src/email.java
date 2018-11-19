import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class email {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String bonds="12.1";
		String equities = "50";
		String email = "agrawaldiptanshu@gmail.com";
        ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c", "C:\\Python27\\python.exe C:\\Python27\\EmailOL.py "+email+" "+bonds+" "+equities);
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }
	}

}
;