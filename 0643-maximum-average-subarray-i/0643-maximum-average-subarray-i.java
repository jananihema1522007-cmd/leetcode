class Solution {
    public double findMaxAverage(int[] a, int k) {
int s = 0;

for(int i = 0;i<k;i++){
    s = s + a[i];

}
int max  = s;
for(int i =k;  i < a.length ; i++){
    s = s-a[i-k] + a[i];
    max = Math. max(s,max);
}
return(double)max/k;

        
    }
}