package getwords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @Purpose      : TODO
 * @Project      : EnglishWords
 * @FileName     : GetFile.java
 * @Author       : Aixinglong
 * @Data         : 2023/12/26  18:34
 * @Version      : V0.0.1
 * @Description  : TODO
 */
public class GetFile {

    private ArrayList<String> haveWords = new ArrayList<>();
    private ArrayList<String[]> allWords = new ArrayList<>();

    public GetFile() {
    }

    /** 
     * @Method: FileIn();
     * @param file; 
     * @return boolean;
     * @Author: AiXingLong
     * @Date: 2023/12/26 19:02
     * @Description: get word's line
     */
    public ArrayList<String> FileIn(String file) throws Exception {

        File fileinput = new File(file);
        BufferedReader br = new BufferedReader(new FileReader(fileinput));
        while(br.ready()){
            haveWords.add(br.readLine());
        }
        br.close();
        //haveWords.forEach(System.out::println);//print words
        return haveWords;
    }

    /**
     * @Method: DevideLine(); ;
     * @return java.lang.String[][];
     * @Author: AiXingLong
     * @Date: 2023/12/26 20:10
     * @Description: device words line into String[] to Arraylist.   find arraylist .then find word's project
     */
    public ArrayList<String[]> DevideLine(){
        for (int i = 0; i < haveWords.size(); i++) {
            String[] Word = new String[7];
            StringTokenizer st = new StringTokenizer(haveWords.get(i),"|{}",false);
            for (int j = 0; st.hasMoreTokens(); j++) {
                Word[j] = st.nextToken();
            }
            allWords.add(Word);
        }
        //print to terminal
        for (String[] allWord : allWords) {
            for (String s : allWord) {
                System.out.printf("%-8s\t\t\t",s);//format print,"%-s"----from left to right
            }
            System.out.println();
        }
        return allWords;
    }
}
