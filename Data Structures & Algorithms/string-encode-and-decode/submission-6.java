class Solution {

// public String encode(List<String> strs) {
//         if (strs.isEmpty()) return "";
//         StringBuilder res = new StringBuilder();
//         List<Integer> sizes = new ArrayList<>();
//         for (String str : strs) {
//             sizes.add(str.length());
//         }
//         for (int size : sizes) {
//             res.append(size).append(',');
//         }
//         res.append('#');
//         for (String str : strs) {
//             res.append(str);
//         }
//         return res.toString();
//     }


//     public List<String> decode(String str) {
//         if (str.length() == 0) {
//             return new ArrayList<>();
//         }
//         List<String> res = new ArrayList<>();
// 		int index = str.indexOf("#");
//         String sizeStr = str.substring(0, index);
// 		String[] parts = sizeStr.split(",");
        
//       int[] sizes = new int[parts.length];
//       for (int i = 0; i < parts.length; i++) {
//           sizes[i] = Integer.parseInt(parts[i]);
//       }
		
// 		String wordStr = str.substring(index + 1);
        
//         int tmp = 0;
//         for (int i = 0; i < sizes.length; i++) {
// 			res.add(wordStr.substring(tmp, tmp + sizes[i]));
//             tmp += sizes[i];
//         }

//         return res;
//     }

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for (String str : strs) {
            sizes.add(str.length());
        }
        for (int size : sizes) {
            res.append(size).append(',');
        }
        res.append('#');
        for (String str : strs) {
            res.append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if (str.length() == 0) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            while (str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;
    }
}
