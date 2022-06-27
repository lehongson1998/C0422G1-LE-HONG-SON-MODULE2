package ss16_io_text_file.bai_tap.bai_tap_2;

import java.util.ArrayList;
import java.util.List;

public class TestCSV {
    public static void main(String[] args) {
        List<Nation> nationList = new ArrayList<>();
        nationList = ReadAndWriteCSV.readFileCSV("src/ss16_io_text_file/bai_tap/bai_tap_2/csv.txt");
        for (int i = 0; i < nationList.size(); i++) {
            System.out.println(nationList.get(i).toString());
        }
    }
}
