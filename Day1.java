// 1 . https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

// Solution:

// Approach 1: o(n)
// swapping the string using two pointers s = 0,e = n-1, swap(a[s],a[e]).

// String Immutability : In Java, strings are immutable, meaning they cannot be modified once created. Attempting to directly change characters in a string will result in a compilation error.
// Indexing : Strings are indexed with the charAt(int index) method rather than using array-style indexing.
// StringBuilder : To reverse a string efficiently in Java, it's best to use StringBuilder, which allows mutable sequences of characters.

public static String reverseWord(String str) {
        StringBuilder sb = new StringBuilder(str);
        int s = 0; 
        int e = sb.length() - 1;
            while (s < e) {
                char temp = sb.charAt(s);
                sb.setCharAt(s, sb.charAt(e));
                sb.setCharAt(e, temp);
                s++;
                e--;
            }
        return sb.toString();
    }

// Java’s StringBuilder also provides a built-in method reverse() that simplifies the process:
public static String reverseWord(String str) {
    return new StringBuilder(str).reverse().toString();
}
// Approach 2 👍  → using extra array SC → O(n)

  public static String reverseWord(String str)
    {
       char y[]=str.toCharArray();
       int size=y.length;
       
       char a[]= new char[size];
       int i=0;
       while(i!=size){
           a[i]=y[size-1-i]; // piche se bhrna suru kro naye array ko 
           ++i;
       } 
       return new String (a) ;
    }

