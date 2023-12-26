package test;
import getwords.GetFile;
/**
 * @Purpose : Main
 * @Project : EnglishWords
 * @FileName : DemoTest.java
 * @Author : Aixinglong
 * @Data : 2023/12/26  18:29
 * @Version : V0.0.1
 * @Description : main to run function
 */
public class DemoTest {
    public static void main(String[] args) throws Exception {
        String file = "source/word.text";
        GetFile gf = new GetFile();
        gf.FileIn(file);
        gf.DevideLine();
    }
}
