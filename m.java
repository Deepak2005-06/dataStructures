class main{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int new_element=0;
        for(int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=new_element;
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }


    }

}


