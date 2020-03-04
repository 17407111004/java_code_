package word11;
import java.util.Arrays;
public class homework07 {
    //数组排序（冒泡排序(升序)）
        public static void main(String[] args) {
            int[] arr={4,5,6,7,1,9,2,3,8};
            bubbleSort(arr);
            System.out.println(Arrays.toString(arr));
        }
        public static void  bubbleSort(int[] arr){
            for(int i=0;i<arr.length;i++){
                for(int j=arr.length-1;j>i;j--){
                    if(arr[j-1]>arr[j]){
                        int tmp=0;
                        tmp=arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=tmp;
                    }
                }
            }
        }
    }

//冒泡排序(降序)
/*(
package word11;
        import java.util.Arrays;
public class homework07 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,9,2,3,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void  bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j-1]<arr[j]){
                    int tmp=0;
                    tmp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }
}

 */
