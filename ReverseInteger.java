class Solution {
    public int reverse(int x) {
        Integer xx =  x;
        String y=xx.toString();
        String ress=new String();
        boolean neg=false;
        int start=0,length = y.length();
        if(y.charAt(0)=='-'){
            neg=true;
            ress=ress+"-";
            y=y.substring(start, length);
            length--;
        }

        Integer res =0 ;
        int[] z ;
        if(neg){
            z = new int[]{2,1,4,7,4,8,3,6,4,8};
        }else{
            z= new int[]{ 2,1,4,7,4,8,3,6,4,7};
        }
        y= new StringBuilder(y).reverse().toString();
        if(length==10){
            for(int i=0;i<10;i++){
                if( z[i] < Integer.parseInt(y.charAt(start)+"")){
                    res=0;
                    break;
                }else if(z[i] > Integer.parseInt(y.charAt(start)+"")){
                    ress=ress+y.substring(start,length);

                    System.out.println(ress);
                    res = Integer.parseInt(ress);
                    break;
                }
                ress=ress+y.charAt(start);
                System.out.println(ress);
                start++;
                res=Integer.parseInt(ress);
            }
        }else{
            res=Integer.parseInt(ress+y.substring(0,length));
        }

        return res;
    }
}