package syntaxtree;

/**
 * Created by pjurasek on 17.03.17.
 */
public class StringUtils {

    public static String repeat(char c, int times) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < times; i++) {
            sb.append(c);
        }

        return sb.toString();
    }

}
