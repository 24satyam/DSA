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


// Approach 3 👍

// Using Recursion (index ko bdhana ya ghatana hoga next call k time index+1 aesa kuch )
// Jab start end se bada ho jayega toh return krdo yahi hmara base case hoga 
// Ab ek chij smjho ki jb tm temp ki help se ek element ko reverse kr skte ho to leap of faith lo ki agey bhi ye hota rhega qnki akhir mai fnxn toh wahi call kr rhe ho , isiliye toh jo tm   while(start<=end ) likh rhe the uske jga recursive call krdo start+1 aur end -1 krke 

// (same chij stack se bhi kr skte ho )

// O(n). The recursion goes through each element once, so it’s linear
// Auxiliary Space Complexity: O(n) for non in-place, O(log n) for in-place (due to recursion stack)
// Aur ek chij smjho ki iss chij mai hmlog jo bhi swap kr rhe hai wo in place hai i.e jagah whi reh rhi hai (inplace ka mtlb hi yahi hai 🤣 ) 
// (But stack mai aesa nhi hoga udhar non -inplace hoga kahe ki stack 🙂)
static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }

// Approach 4 👍

// Push krke pop krne pr ulta sequence mai milega 

public static void reverseArrayUsingStack(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        for (int element : arr) {
            stack.push(element);
        }

        // Pop elements from the stack to reverse the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }






