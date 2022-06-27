package ss16_io_text_file.bai_tap.bai_tap_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCSV {
    public static List<Nation> readFileCSV(String pathFile){
        List<Nation> nationList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(pathFile);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] array = null;
            while ((line = br.readLine()) != null){
                array = line.split(",");
                Nation nation = new Nation(Integer.parseInt(array[0]),array[1],array[2]);
                nationList.add(nation);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nationList;
    }
}
