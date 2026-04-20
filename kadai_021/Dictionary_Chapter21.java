package kadai_021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {

    public void searchDictionary(String[] seareachwords){
        HashMap<String, String> 辞書 = new HashMap<String,String>();
        辞書.put("apple","りんご");
        辞書.put("peach","桃");
        辞書.put("banana","バナナ");
        辞書.put("lemon","レモン");
        辞書.put("pear","梨");
        辞書.put("kiwi","キウィ");
        辞書.put("strawberry","いちご");
        辞書.put("grape","ぶどう");
        辞書.put("muscat","マスカット");
        辞書.put("cherry","さくらんぼ");

    for (String word : seareachwords){
        String meaning = 辞書.get(word);

        if (meaning != null){
            System.out.println(word +"の意味は"+meaning);
        }else {
            System.out.println(word + "は辞書に含まれていません");
        }
    }


        }

    }
