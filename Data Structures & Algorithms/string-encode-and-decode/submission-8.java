class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< strs.size();i++) {
            if(strs.get(i) == "") {
                sb.append("%");
            }
            sb.append(strs.get(i));
            if ( i != strs.size() - 1) {
                sb.append("__");
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) {
            return new ArrayList<>();
        }
        String[] strList = str.split("__");
        List<String> result = new ArrayList<>();
        for(int i = 0 ; i<strList.length ; i++) {
            if( strList[i].equals("%")) {
                result.add("");
                continue;
            }
            if( strList[i].equals("%%")) {
                result.add(",");
                continue;
            }
            result.add(strList[i]);
        }
        return result;
    }
}
