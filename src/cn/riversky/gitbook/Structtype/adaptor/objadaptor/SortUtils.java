package cn.riversky.gitbook.Structtype.adaptor.objadaptor;


import javax.activation.UnsupportedDataTypeException;
import java.util.Arrays;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public class SortUtils {
    public <T> T[] quickSort(T[] arr){
        try {
            sort(arr,0,arr.length-1);
        } catch (UnsupportedDataTypeException e) {
            e.printStackTrace();
        }
        return arr;
    }
    private  <T> void sort(T[] arr,int p,int r) throws UnsupportedDataTypeException {
        int q=0;
        if(p<r){
            q=partition(arr,p,r);
            sort(arr,p,q-1);
            sort(arr,q+1,r);
        }
    }

    /**
     * 分块，数组中p->r，锁定arr[p]的排序后位置，并保证前面元素比其小，后面位置比其大，并返回排序后的位置索引
     * @param arr
     * @param p
     * @param r
     * @param <T>
     * @return
     * @throws UnsupportedDataTypeException
     */
    private <T> int partition(T[] arr, int p, int r) throws UnsupportedDataTypeException {
        T x=arr[r];
        int j=p-1;
        for(int i=p;i<r-1;i++){
            if(arr[i] instanceof Integer){
                if((Integer)arr[i]<=(Integer) x){
                    j++;
                    swap(arr,j,i);
                }
            }
//            else if(arr[i] instanceof Character){
//                if((Character)arr[i]<=(Character) x){
//                    j++;
//                    swap(arr,j,i);
//                }
//            }
            else {
                throw new UnsupportedDataTypeException();
            }
        }
        swap(arr,j+1,r);
        return j+1;
    }

    /**
     * 交换两个元素的位置
     * @param arr
     * @param j
     * @param i
     * @param <T>
     */
    private <T> void swap(T[] arr, int j, int i) {
        T t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

    public static void main(String[] args) {
        Integer []a= {1,2,7,3,0,5,8,3,5,6,33};
//        new SortUtils().quickSort(a);
        Arrays.sort(a);
        System.out.println(a.toString());
    }
}
