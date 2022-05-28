package com.challages;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BetterCompression {
    public static void main(String[] args) {
        String value = "r74k931y545q924j441x493q988n328t841s304r710r561z100y817f98e513l811f980d580h968q394q486r229r195d2x709u669q125e531l723i550g802p978c229p299j636h866s64y426v116a630z518b106u452k189l506w753a717z439i502r872i138e178f295c610h746v636u143b969e261f595o396w114w7s943l83e768t696w672l591n739b617q641b336q973q96t455h290q906q124w814c239y221s367o227c364o845w551f624d386x273d248h497f624a145c736v626s43b680o245t819w693r992h670x554r826s663h809j762d336i996e768x875b557t873a95a756z408b194b681r856i964i677q250z845m809h652p204h532a420h10u930h55a738l318t201y565z649w551m977s555v505z749d379x210p554d448p774c306w54q631q401c371j17i156f558y179m358f879w820t134z721q634p32o590p878c359c255u916d481m956g108i1k36f114k594g355g358t730n564c918p420d748b396p474l749v659h407y825s974t898g951b481b901k534c4g951m781n833w550y250b311t984u41h651f230a747t231";
        System.out.println(betterCompression(value));
    }

    public static String betterCompression(String s) {
        String result = null;
        Pattern pattern = Pattern.compile("[a-z][0-9]+");
        Matcher matcher = pattern.matcher(s);
        int[] counts = new int[26];
        while (matcher.find()) {
            String s1 = matcher.group();
            int location = (byte)(s1.toCharArray()[0]) - 97;
            counts[location] = counts[location] + Integer.valueOf(s1.substring(1));
        }

        StringBuilder stringBuilder = new StringBuilder("");
        for (char i = 'a'; i <= 'z'; i++) {
            int index = i -97;
            if(counts[index] > 0) {
                stringBuilder.append("" + i + counts[index]);
            }
        };
        return stringBuilder.toString();
    }
}
