/* 1 -Given an array of ints, return true if 6 appears as either the first or 
last element in the array. The array will be length 1 or more.
*/

public boolean firstLast6(int[] nums) {
  return nums[0]==6 || nums[nums.length-1]==6;
}

/* 2- Given an array of ints, return true if the array is length 1 or more, 
and the first element and the last element are equal.
*/

public boolean sameFirstLast(int[] nums) {
  
  boolean same = false;
  
  if (nums.length == 0) {
    same = false;
  }
  else if (nums.length == 1) {
    same = true;
  }
  else if (nums[0] == nums[nums.length - 1]) {
    same = true;
  }
  return same;
}

// 3- Return an int array length 3 containing the first 3 digits of pi {3, 1, 4}.

public int[] makePi() {
  int[] pi = new int[3];
  pi[0] = 3;
  pi[1] = 1;
  pi[2] = 4;
  return pi;
}

/* 4- Given 2 arrays of ints, a and b, return true if they have the 
same first element or they have the same last element. Both arrays 
will be length 1 or more.
*/

public boolean commonEnd(int[] a, int[] b) {
  return a[0] == b[0] || a[a.length-1] == b[b.length-1];
}

// 5- Given an array of ints length 3, return the sum of all the elements.

public int sum3(int[] nums) {
  int sum=0;
  
  for (int i = 0; i < 3; i++) {
    sum = sum + nums[i];
  }
  return sum;
}

/* 6- Given an array of ints length 3, return an array with the 
elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
*/

public int[] rotateLeft3(int[] nums) {
  int[] newArr = new int[3];
  int first = nums[1];
  int second = nums[2];
  int third = nums[0];
  
  newArr[0] = first;
  newArr[1] = second;
  newArr[2] = third;
  return newArr;
}

/* 7- Given an array of ints length 3, return a new array with the 
elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
*/

public int[] reverse3(int[] nums) {
  
  int first = nums[2];
  int second = nums[1];
  int third = nums[0];
    
  int[] arr = new int[3];
  arr[0] = first;
  arr[1] = second;
  arr[2] = third;
  return arr;
}

/* 8- Given an array of ints length 3, figure out which is larger, 
the first or last element in the array, and set all the other 
elements to be that value. Return the changed array.
*/

public int[] maxEnd3(int[] nums) {
  
  int largest;
  
  if (nums[0] > nums[2]) {
    largest = nums[0];
  }
  else {
    largest = nums[2];
  }
  
  int arr[] = new int[3];
  arr[0] = largest;
  arr[1] = largest;
  arr[2]= largest;
  return arr;
}

/* 9- Given an array of ints, return the sum of the first 2 elements 
in the array. If the array length is less than 2, just sum up the 
elements that exist, returning 0 if the array is length 0.
*/

public int sum2(int[] nums) {
  if (nums.length == 0) {
    return 0;
  }
  else if (nums.length == 1) {
    return nums[0];
  }
  else {
    return nums[0] + nums[1];
  }
}

/* 10 - Given 2 int arrays, a and b, each length 3, return 
a new array length 2 containing their middle elements.
*/

public int[] middleWay(int[] a, int[] b) {
  int first = a[1];
  int second = b[1];
  int arr[] = new int[2];
  arr[0] = first;
  arr[1] = second;
  return arr;
}

/* 11 - Given an array of ints, return a new array length 2 
containing the first and last elements from the original array. 
The original array will be length 1 or more.
*/

public int[] makeEnds(int[] nums) {
  int first = nums[0];
  int last = nums[nums.length-1];
  int[] arr = new int[2];
  arr[0] = first;
  arr[1] = last;
  return arr;
}

// 12 - Given an int array length 2, return true if it contains a 2 or a 3.

public boolean has23(int[] nums) {
  boolean contains = false;
  
  if (nums[0] == 2 || nums[0] == 3) {
    contains = true;
  }
  else if (nums[1] == 2 || nums[1] == 3) {
    contains = true;
  }
  else {
    contains = false;
  }
  return contains;
}

// 13 - Given an int array length 2, return true if it does not contain a 2 or 3.

public boolean no23(int[] nums) {
  return (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3);
}

/* 14 - Given an int array, return a new array with double the length 
where its last element is the same as the original array, and all the 
other elements are 0. The original array will be length 1 or more. 
Note: by default, a new int array contains all 0's.
*/

public int[] makeLast(int[] nums) {
  int[] arr = new int[nums.length *2];
  arr[arr.length-1] = nums[nums.length-1];
  return arr;
}

/* 15 - Given an int array, return true if the array contains 2 
twice, or 3 twice. The array will be length 0, 1, or 2.
*/

public boolean double23(int[] nums) {
  
  boolean doubles = false;
  if (nums.length == 0 || nums.length == 1) {
    doubles = false;
  }
  else if ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)) {
    doubles = true;
  }
  return doubles;
}

/* 16 - Given an int array length 3, if there is a 2 in the array 
immediately followed by a 3, set the 3 element to 0. Return the changed array.
*/

public int[] fix23(int[] nums) {
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2 && nums[i+1] == 3) {
      nums[i+1] = 0;
    }
  }
  return nums;
}

/* 17 - Start with 2 int arrays, a and b, of any length. Return 
how many of the arrays have 1 as their first element.
*/

public int start1(int[] a, int[] b) {
  
  int ones = 0;
  if(a.length > 0 && a[0]==1) {
    ones++;
  }
  if(b.length>0 && b[0] == 1) {
    ones++;
  }
  return ones;
}

/* 18- Given 2 int arrays, a and b, of any length, return a new array with the 
first element of each array. If either array is length 0, ignore that array.
*/

public int[] front11(int[] a, int[] b) {
  
  if (a.length == 0 && b.length == 0) {
    return a;
  }
  
  if (a.length == 0) {
    int[] arr = new int[] {b[0]};
    return arr;
  }
  
  if (b.length == 0) {
    int[] arr = new int[] {a[0]};
    return arr;
  }
  else {
    int[] arr= new int[] {a[0], b[0]};
    return arr;
  }
}

