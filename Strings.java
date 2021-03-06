/* Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!". */

public String helloName(String name) {
  return "Hello " + name + "!";
}

/* Given two strings, a and b, return the result of putting them 
together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". */

public String makeAbba(String a, String b) {
  return a+b+b+a;
}

/* The web is built with HTML strings like "<i>Yay</i>" which 
draws Yay as italic text. In this example, the "i" tag makes <i> 
and </i> which surround the word "Yay". Given tag and word strings, 
create the HTML string with tags around the word, e.g. "<i>Yay</i>". */

public String makeTags(String tag, String word) {
  String one = ("<" + tag + ">" + word + "</" + tag + ">");
  return one;
}

/* Given an "out" string length 4, such as "<<>>", and a word, return a new string where 
the word is in the middle of the out string, e.g. "<<word>>". Note: use 
str.substring(i, j) to extract the String starting at index i and going 
up to but not including index j. */

public String makeOutWord(String out, String word) {
  return out.substring(0,2) + word + out.substring(2,4);
}

/* Given a string, return a new string made of 3 copies of the last 2 chars of the 
original string. The string length will be at least 2. */

public String extraEnd(String str) {
  String end = str.substring(str.length()-2, str.length());
  return end + end + end;
}

/* Given a string, return the string made of its first two chars, so the String "Hello" 
yields "He". If the string is shorter than length 2, return whatever there is, so "X" 
yields "X", and the empty string "" yields the empty string "". Note that str.length() 
returns the length of a string. */

public String firstTwo(String str) {
  if (str.length() < 2) {
    return str;
  }
  return str.substring(0,2);
}

/* Given a string of even length, return the first half. So the string "WooHoo" yields "Woo". */

public String firstHalf(String str) {
  int half = (str.length() / 2);
  String halfs = str.substring(0,half);
  return halfs;
}

/* Given a string, return a version without the first and last char, so 
"Hello" yields "ell". The string length will be at least 2. */

public String withoutEnd(String str) {
  return str.substring(1, str.length()-1);
}

/* Given 2 strings, a and b, return a string of the form short+long+short, with the 
shorter string on the outside and the longer string on the inside. The strings will 
not be the same length, but they may be empty (length 0). */

public String comboString(String a, String b) {
  if (a.length()<1) {
    return b;
  }
  else if (b.length()<1) {
    return a;
  }
  else if (b.length() > a.length()) {
    return a+b+a;
  }
  else{
    return b+a+b;
  }
}

/* Given 2 strings, return their concatenation, except omit the first char of each. 
The strings will be at least length 1. */

public String nonStart(String a, String b) {
  String one = a.substring(1);
  String two = b.substring(1);
  return one + two;
}

/* Given a string, return a "rotated left 2" version where the first 2 chars are 
moved to the end. The string length will be at least 2. */

public String left2(String str) {
  String new1 = str.substring(2);
  String front = str.substring(0,2);  
  return new1 + front;
}

/* Given a string, return a string length 1 from its front, unless front is false, in 
which case return a string length 1 from its back. The string will be non-empty. */

public String theEnd(String str, boolean front) {
  if (front == false) {
    return str.substring(str.length()-1);
  }
  else {
    return str.substring(0,1);
  }
}

/* Given a string, return a version without both the first and last char of the string. 
The string may be any length, including 0. */

public String withouEnd2(String str) {
  
  if (str.length() == 1 || str.length() == 0) {
    return "";
  }
  else{
    return str.substring(1, str.length()-1);
  }
}

/* Given a string, return true if it ends in "ly". */

public boolean endsLy(String str) {
  
  int n = str.length();

  if (n < 2) {
    return false;
  }
  else if (str.substring(n-2, n).equals("ly")) {
    return true;
  }
  return false;
}

/* Given a string and an int n, return a string made of the first and 
last n chars from the string. The string length will be at least n. */

public String nTwice(String str, int n) {
  
  String firstHalf = str.substring(0, n);
  String lastHalf = str.substring(str.length()-n, str.length());
  String full = firstHalf + lastHalf;
  return full;
}

/* Given a string and an index, return a string length 2 starting at the given index. 
If the index is too big or too small to define a string length 2, use the first 2 
chars. The string length will be at least 2. */

public String twoChar(String str, int index) {

  if (index < 0 || index > str.length()-2) {  
    return str.substring(0,2);
  }
  else {
    return str.substring(index, index + 2);
  }
}
