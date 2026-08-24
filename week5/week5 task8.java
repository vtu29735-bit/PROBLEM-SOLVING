import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private boolean matches(String word, String pattern) {
        char[] map = new char[26];
        char[] reverseMap = new char[26];

        for (int i = 0; i < 26; i++) {
            map[i] = '#';
            reverseMap[i] = '#';
        }

        for (int i = 0; i < word.length(); i++) {
            char p = pattern.charAt(i);
            char w = word.charAt(i);

            // Pattern character already mapped
            if (map[p - 'a'] != '#') {
                if (map[p - 'a'] != w) {
                    return false;
                }
            }

            // Word character already mapped to another pattern character
            if (reverseMap[w - 'a'] != '#') {
                if (reverseMap[w - 'a'] != p) {
                    return false;
                }
            }

            map[p - 'a'] = w;
            reverseMap[w - 'a'] = p;
        }

        return true;
    }
}

output

Input
words =
["abc","deq","mee","aqq","dkd","ccc"]
pattern =
"abb"
Output
["mee","aqq"]
Expected
["mee","aqq"]
