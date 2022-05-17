import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (!translations.containsKey(word)) {
            translations.put(word, new ArrayList<>());
        }
        translations.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        return translations.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        translations.remove(word);
    }
}
