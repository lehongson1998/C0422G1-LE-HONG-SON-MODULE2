package ss16_io_text_file.thuc_hanh.thuc_hanh_1;

import java.io.*;

public class SumNumberOfTextFile {
    public static void sumFileText(String path){
        int sum = 0;
        File file = new File(path);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null){
                sum += Integer.parseInt(line);
            }
            System.out.println("sum number of file text:" + sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
