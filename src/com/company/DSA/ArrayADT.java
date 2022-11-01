package com.company.DSA;

class Array{
    private int[] arr;
    private int size;
    private int length=0;
    Array(int size){
        this.size=size;
        arr=new int[size];
    }
    void display(){
        for(int i=0;i<length;i++) System.out.print(arr[i]+" ");
    }
    void add(int x){
        if(length<size) arr[length++]=x;
        else throw new ArrayIndexOutOfBoundsException();
    }
    void insert(int index,int x){
        if(length<size){
            if(index>=0 && index<=length){
                for(int i=length;i>index;i--) arr[i]=arr[i-1];
                arr[index]=x;
                length++;
            }
            else throw new IllegalArgumentException();
        }
        else throw new ArrayIndexOutOfBoundsException();

    }
    int delete(int index){
        int x=arr[index];
        if(index>=0 && index<length){
            for(int i=index;i<length-1;i++) arr[i]=arr[i+1];
            length--;
            return x;
        }
        throw new IllegalArgumentException();
    }
    void swap(int[] a,int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    //Transposition
    /*int linearSearch(int key){
        for(int i=0;i<length;i++){
            if(key==arr[i] && key!=arr[0]){
                swap(arr,i,i-1);
                return i;
            }
            else if(key==arr[0]) return 0;
        }
        return -1;
    }*/
    //movetoFront
    /*int linearSearch(int key){
        for(int i=0;i<length;i++){
            if(key==arr[i] && key!=arr[0]){
                swap(arr,i,0);
                return i;
            }
            else if(key==arr[0]) return 0;
        }
        return -1;
    }*/
    int linearSearch(int key){
        for(int i=0;i<length;i++){
            if(key==arr[i]) return i;
        }
        return -1;
    }
    int binarySearch(int key){
        int l=0,mid,h=length-1;
        while(l<=h){
            mid=l+((h-l)/2);
            if(key==arr[mid]) return mid;
            else if(key>arr[mid]) l=mid+1;
            else h=mid-1;
        }
        return -1;
    }
    int get(int index){
        if(index>=0 && index<length) return arr[index];
        return -1;
    }
    void set(int index,int x){
        if(index>=0 && index<length) arr[index]=x;
    }
    int sum(){
        int total=0;
        for(int i=0;i<length;i++){
            total+=arr[i];
        }
        return total;
    }
    float avg(){
        return (float) sum()/length;
    }

    void reverse(){
        int j=length-1;
        for(int i=0;i<j;i++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
    }

    void leftShift(){
        for(int i=0;i<length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[length-1]=0;
    }

    void rotate(){
        int temp=arr[0];
        for(int i=0;i<length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[length-1]=temp;
    }

    Array merge(Array a){
        Array z=new Array(20);
        z.length=length+a.length;
        int i=0,j=0,k=0;
        while(i<length && j<a.length){
            if(arr[i]<a.arr[j]) z.arr[k++]=arr[i++];
            else z.arr[k++]=a.arr[j++];
        }
        for(;i<length;i++) z.arr[k++]=arr[i];
        for(;j<length;j++) z.arr[k++]=arr[j];
        return z;
    }

}

public class ArrayADT {
    public static void main(String[] args) {
        Array a1=new Array(5);
        a1.add(2);
        a1.add(4);
        a1.add(6);
        a1.add(8);
        a1.add(10);
        a1.display();
        System.out.println("");
        Array a2=new Array(5);
        a2.add(1);
        a2.add(3);
        a2.add(5);
        a2.add(7);
        a2.add(9);
        a2.display();
        System.out.println("");
        Array a3=new Array(10);
        a3=a1.merge(a2);
        a3.display();
    }
}
