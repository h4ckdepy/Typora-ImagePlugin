import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Un1kimage {

    public static void main(String[] args) throws IOException {
        String[] var1 = args;
        int var2 = args.length;
        for(int var3 = 0; var3 < var2; ++var3) {
            String arg = var1[var3];
            String[] cmds = new String[]{"curl", "-H", "", "-XPOST", "", "-F", "file=@" + arg};
            Process p = Runtime.getRuntime().exec(cmds);
            InputStream is = p.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = reader.readLine();
            JsonParser jsonParser = new JsonParser();
            String url = jsonParser.parse(line).getAsJsonObject().get("data").getAsJsonArray().get(0).getAsString();
            System.out.println(url);
        }

    }
}
