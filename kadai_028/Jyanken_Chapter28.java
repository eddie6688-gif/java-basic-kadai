package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    public String getMyChoice() {
        Scanner scan = new Scanner(System.in);
        while (true){
        System.out.println("じゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String jann = scan.next();
        if (jann.equals("r") || jann.equals("s") || jann.equals("p")) {
            return jann;
        } else {
            System.out.println("正しい手ではありません。再度入力してください");
        }
        }
    }
public String getRandom(){
        int randumrum = (int)Math.floor(Math.random()*3);
        String[] jannArray = {"r","s","p"};

        return jannArray[randumrum];
}
    public void playGame(){
        HashMap<String, String> kenn=new HashMap<String,String>();
        kenn.put("r","グー");
        kenn.put("s","チョキ");
        kenn.put("p","パー");
        String myChice = this.getMyChoice();
        String yourChice = this.getRandom();
        System.out.println("私の"+kenn.get(myChice)+"相手は"+kenn.get(yourChice));

    if (myChice.equals(yourChice)){
        System.out.println("あいこです");
    }else if ((myChice.equals("r") && yourChice.equals("s"))||
        (myChice.equals("s") && yourChice.equals("p"))||(
            myChice.equals("p") && yourChice.equals("r")
            )){
        System.out.println("私の勝ち");
    }
        else{
            System.out.println("自分の負けです");
        }


}



}
