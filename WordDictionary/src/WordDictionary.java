import java.util.HashMap;

public class WordDictionary {
    HashMap<String, String> words = new HashMap<>();

    // 단어 추가
    public void addWord(String english, String korean){
        words.put(english, korean);
    }

    // 단어 검색
    public String find(String english){
        for(String key:words.keySet()){
            if(key.toLowerCase().equals(english.toLowerCase())){
                return words.get(key);
            }
        }

        return null;
    }
}