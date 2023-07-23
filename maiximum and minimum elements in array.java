import java.io.*;
class Main{
    static int Min(int[] a){
        int n=a.length;
        int res=a[0];
        for(int i=0;i<n;i++){
            res=Math.min(res,a[i]);
        }
        return res;
    }
    static int max(int[] b){
        int n=b.length;
        int res=0;
        for(int i=0; i<n;i++){
            res=Math.max(res,b[i]);
        }
        return res;
    }
    public static void main(String[] args){
        int[] a={12, 1234, 45, 67, 1};
        int result1=Min(a);
        System.out.println("min numberr of Array: "+result1);
        int result2=max(a);
        System.out.println("maximum number arry: "+result2);
    }
}