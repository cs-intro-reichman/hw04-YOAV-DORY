public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for(int i = 0; i < sentences.length; i++){
            String[] words = toStringArray(sentences[i]); 
            for(int j = 0; j < words.length; j++){
                for(int k = 0; k < keywords.length; k++){
                    if (keywords[k].equalsIgnoreCase(words[j])) {
                        System.out.println(sentences[i]);
                    }
                }
            }
        }
    }



    public static String[] toStringArray(String str){
        String[] wordsArray = new String[howManySpaces(str) + 1];
        int j = 0;
        for(int i = 0; i < wordsArray.length; i++){
            wordsArray[i] = "";
            while ( j < str.length() && str.charAt(j) != ' ') {
                wordsArray[i] += str.charAt(j);
                j++;
            }
            j++;
        }
        return wordsArray;
    }



    public static int howManySpaces(String str){
        int spaces = 0;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' ') {
                spaces++;
            }
        }
        return spaces;
    }
}
