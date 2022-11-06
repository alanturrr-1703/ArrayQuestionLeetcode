import java.util.List;
import java.util.Objects;

public class ItemsMatching {
    public static void main(String[] args) {

    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List i : items) {
            if (Objects.equals(ruleKey, "type")){
                if (ruleValue.equals(i.get(0))){
                    count++;
                }
            } else if (Objects.equals(ruleKey, "color")) {
                if (ruleValue.equals(i.get(1))){
                    count++;
                }
            } else {
                if (ruleValue.equals(i.get(2))){
                    count++;
                }
            }
        }
        return count;
    }
}
