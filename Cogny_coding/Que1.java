public class Que1 {
    public static String expandedString(String org){
        StringBuilder result = new StringBuilder();
        int [] firstOcc = new int[26];
        int l = org.length();
        for (int i = 0; i < l; i++) {
            char ch = org.charAt(i);
            int idx = ch - 'a';
            if (firstOcc[idx] == 0) {
                firstOcc[idx] = i+1;
            }
            if (i>0) {
                result.append("-");
            }

            int repeated = firstOcc[idx];
            for (int j = 0; j < repeated; j++) {
                result.append(ch);

            }
        }
        return result.toString();

    }

    public static void main(String[] args) {
        String s = "abcaba";
        System.out.println(expandedString(s));
        
    }
}
