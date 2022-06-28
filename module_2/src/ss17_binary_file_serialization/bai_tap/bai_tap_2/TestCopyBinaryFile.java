package ss17_binary_file_serialization.bai_tap.bai_tap_2;

public class TestCopyBinaryFile {
    public static void main(String[] args) {
        final String SOURCE = "src/ss17_binary_file_serialization/bai_tap/bai_tap_1/service/products.dat";
        final String TARGET = "src/ss17_binary_file_serialization/bai_tap/bai_tap_2/target.dat";
        CopyBinary.copyFileBinary(SOURCE,TARGET);
        CopyBinary.targetFileLength(TARGET);
    }
}
