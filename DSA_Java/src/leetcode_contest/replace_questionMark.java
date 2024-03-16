package leetcode_contest;
import java.util.*;  
//public class replace_questionMark {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		  HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
//		  String qm = "a?a?";
//		  int length = qm.length();
//		  int start_num = 97;
//		  for(int i=0;i<length;i++) {
//			  if(qm.charAt(i) == '?') {
//				  if(map.get(start_num) == null) {
//					 map.put(start_num, 0);
//					 start_num++;
//				  }
//				  else {
//					  int value = map.get(start_num);
//					  map.put(start_num, value+1);
//				  }
//			  }
////			  else {
////				  int asciiValue = (int) qm.charAt(i);
////				 
////				  if(map.get(asciiValue) == null) {
////						 map.put(asciiValue, 0);
////					  }
////					  else {
////						  int value = map.get(asciiValue);
////						  map.put(asciiValue, value+1);
////					  }
////				  if(start_num == asciiValue) {
////					  start_num++;
////				  }
////			  }
//		  }
//		  System.out.println("Keys and values in the map:");
////		  String character = "";
//		  char[] charArray = qm.toCharArray();
//		  for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			    int asciiValue = entry.getKey();
//			   
//			    for(int i=0;i<length;i++) {
//			    	if(charArray[i] == '?') {
//			    		char character = (char) asciiValue;
//			    		charArray[i] = character;
//			    		System.out.println(charArray[i]);
//			    		break;
//			    	}
//			    }
////			    character = character + (char) asciiValue;
//			}
//		  System.out.println(charArray.toString());
//	}
//
//}
//

//public class replace_questionMark {
//    public String modifyString(String s) {
//        StringBuilder my_string = new StringBuilder(s);
//        int n = my_string.length();
//        char question_mark = '?';
//        for (int i = 0; i < n; i++) {
//            if (my_string.charAt(i) == '?') {
//                char ascii_char = 'a';
//                while ((i > 0 && ascii_char == question_mark) || (i < n - 1 && ascii_char == my_string.charAt(i + 1))) {
//                    ascii_char++;
//                }
//                my_string.setCharAt(i, ascii_char);
//            }
//
//            question_mark = my_string.charAt(i);
//        }
//
//        return my_string.toString();
//    }
//
//    public static void main(String[] args) {
//    	replace_questionMark solution = new replace_questionMark();
//
//        // Example 1
//        String s1 = "???";
//        System.out.println(solution.modifyString(s1)); // Output: "abc"
//
//        // Example 2
//        String s2 = "a?a?";
//        System.out.println(solution.modifyString(s2)); // Output: "abac"
//    }
//}
//

import java.util.HashSet;
import java.util.Set;

public class replace_questionMark {
    public String modifyString(String s) {
        StringBuilder my_string = new StringBuilder(s);
        int length = my_string.length();
        Set<Character> my_hash_set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if (my_string.charAt(i) == '?') {
                char ascii_value = 'a';
                while (ascii_value <= 'z' && my_hash_set.contains(ascii_value)) {
                    ascii_value++;
                }
                my_string.setCharAt(i, ascii_value);
                my_hash_set.add(ascii_value);
            } else {
                my_hash_set.add(my_string.charAt(i));
            }
        }
        return my_string.toString();
    }

    public static void main(String[] args) {
    	replace_questionMark solution = new replace_questionMark();

        // Example 1
        String s1 = "???";
        System.out.println(solution.modifyString(s1)); // Output: "abc"

        // Example 2
        String s2 = "a?a?";
        System.out.println(solution.modifyString(s2)); // Output: "abac"
    }
}

