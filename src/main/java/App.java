import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static final String START_TAG_PATTERN = "<([^/].*?)>";
    public static final String END_TAG_PATTERN = "</(.*?)>";

    public String extract(String content) {
        if (content == "" || !content.contains("<") || !content.contains("/"))
            return "";

        String startTag = getTag(content, START_TAG_PATTERN);
        String endTag = getTag(content, END_TAG_PATTERN);
        if(startTag != endTag) return "";

//        Pattern tagPattern = Pattern.compile()
        return null;
    }

    private String getTag(String content, String s) {
        String tag = null;
        Pattern startPattern = Pattern.compile(s);
        Matcher matcher1 = startPattern.matcher(content);
        if (matcher1.find()) {
            tag = matcher1.group(1);
        }
        return tag;
    }
}
