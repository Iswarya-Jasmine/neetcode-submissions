class Solution {

    public String encode(List<String> strs) {

        StringBuilder result = new StringBuilder();

        for (String s : strs) {
            result.append(s.length());
            result.append("#");
            result.append(s);
        }

        return result.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j = i;

            // Find the '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            // Get the length of the string
            int length = Integer.parseInt(str.substring(i, j));

            // Move after '#'
            j++;

            // Extract the actual string
            String word = str.substring(j, j + length);

            result.add(word);

            // Move to the next encoded string
            i = j + length;
        }

        return result;
    }
}