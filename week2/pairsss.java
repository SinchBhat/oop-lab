package week2;

// Java program to count number of distinct pairs 
// that can be formed from all possible contiguous 
// sub-arrays containing distinct numbers 
class pairsss
{
 
static int countPairs(int arr[], int n) 
{ 
    // initialize number of pairs to zero 
    int count = 0; 
 
    //Left and right indexes of current window 
    int right = 0, left = 0; 
 
    // Boolean array visited to mark elements in 
    // current window. Initialized as false 
    boolean visited[] = new boolean[n];
     
    for(int i = 0; i < n; i++)
        visited[i] = false;
 
    // While right boundary of current window 
    // doesn't cross right end 
    while (right < n) 
    { 
        // If current window contains all distinct 
        // elements, widen the window toward right 
        while (right < n && !visited[arr[right]]) 
        { 
            count += (right - left); 
            visited[arr[right]] = true; 
            right++; 
        } 
 
        // If duplicate is found in current window, 
        // then reduce the window from left 
        while (left < right && (right != n && 
            visited[arr[right]])) 
        { 
            visited[arr[left]] = false; 
            left++; 
        } 
    } 
 
    return count; 
} 
 
// Driver code 
public static void main(String args[])
{ 
    int arr[] = {1, 4, 2, 4, 3, 2}; 
    int n = arr.length; 
 
    System.out.println( countPairs(arr, n)); 
}
}