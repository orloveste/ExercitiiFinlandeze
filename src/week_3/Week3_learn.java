package week_3;

import java.util.Locale;

public class Week3_learn {
    public static void main(String[] args) {
        String firstWord = "fighting with COVID-19 is interesting";
        String secondWord = "it's fun learning programming now";

        System.out.println("our fist String '"+firstWord+"' has next charAt: "+firstWord.charAt(4));
        System.out.println("our fist String '"+firstWord+"' has next indexOf ch, formatindex: "+firstWord.indexOf(5,4));
        System.out.println("our fist String '"+firstWord+"' has next indexOf: "+firstWord.indexOf("covid"));
        System.out.println("our fist String '"+firstWord+"' has next indexOf str, fromIndex: "+firstWord.indexOf("with",5));
        System.out.println("our fist String '"+firstWord+"' has next equalsIgnoreCase: "+firstWord.equalsIgnoreCase("ing"));
        System.out.println("our fist String '"+firstWord+"' has next split regex, limit: "+firstWord.split("r", 4));
        System.out.println("our fist String '"+firstWord+"' has next split regex: "+firstWord.split("is"));
        System.out.println("our fist String '"+firstWord+"' has next substring: "+firstWord.substring(2));
        System.out.println("our fist String '"+firstWord+"' has next substring ,: "+firstWord.substring(3, 5));
        System.out.println("our fist String '"+firstWord+"' has next subsequence: "+firstWord.subSequence(4, 6));
        System.out.println("our fist String '"+firstWord+"' has next contains: "+firstWord.contains("ti"));
        System.out.println("our fist String '"+firstWord+"' has next compareIgnoreCase: "+firstWord.compareToIgnoreCase("covid"));
        System.out.println("our fist String '"+firstWord+"' has next isEmpty: "+firstWord.isEmpty());
        Locale locale = Locale.forLanguageTag("zapa");
        System.out.println("our fist String '"+firstWord+"' has next toLowerCase ,locale: "+firstWord.toLowerCase(locale));
        System.out.println("our fist String '"+firstWord+"' has next toLowerCase: "+firstWord.toLowerCase());
        System.out.println("our fist String '"+firstWord+"' has next equals: "+firstWord.equals(secondWord));
        System.out.println("our fist String '"+firstWord+"' has next toString: "+firstWord.toString());
        System.out.println("our fist String '"+firstWord+"' has next concat: "+firstWord.concat("sa"));
        System.out.println("our fist String '"+firstWord+"' has next intern: "+firstWord.intern());
        System.out.println("our fist String '"+firstWord+"' has next replace target, replacement: "+firstWord.replace("f", "The F"));
        System.out.println("our fist String '"+firstWord+"' has next replace oldChar, newChar: "+firstWord.replace('i', 'w'));
        System.out.println("our fist String '"+firstWord+"' has next replaceAll regex, replacement: "+firstWord.replaceAll("re", "qo"));
        System.out.println("our fist String '"+firstWord+"' has next trim: "+firstWord.trim());
        System.out.println("our fist String '"+firstWord+"' has next matches: "+firstWord.matches("r"));
        System.out.println("our fist String '"+firstWord+"' has next codePointAt: "+firstWord.codePointAt(3));
        System.out.println("our fist String '"+firstWord+"' has next toCharArray: "+firstWord.toCharArray());
        System.out.println("our fist String '"+firstWord+"' has next CodePointCount , : "+firstWord.codePointCount(5, 9));
        System.out.println("our fist String '"+firstWord+"' has next endsWith: "+firstWord.endsWith("ng"));
        System.out.println("our fist String '"+firstWord+"' has next getBytes: "+firstWord.getBytes());
        System.out.println("our fist String '"+firstWord+"' has next hashCode: "+firstWord.hashCode());
        System.out.println("our fist String '"+firstWord+"' has next getChars -no go: "/*+ firstWord.getChars()*/);

        System.out.println("our second String '"+secondWord+"' has next length: "+secondWord.length());
    }
}
//16. Object
//Strings are a bit more clever and for example know how long they are:
// ...code
// We can determine the length by calling the String method length(). Strings have
// other methods as well. Integers (or whole numbers, variables of type int) have no
// methods at all. They do not "know" anything.
//Strings are objects, or "something that has methods and a value".