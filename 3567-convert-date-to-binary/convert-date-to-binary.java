class Solution {
    public String convertDateToBinary(String date) {
        String[] arr=date.split("-");

        int d1=Integer.parseInt(arr[0]);
        int d2=Integer.parseInt(arr[1]);
        int d3=Integer.parseInt(arr[2]);

        String s1=Integer.toBinaryString(d1);
        String s2=Integer.toBinaryString(d2);
        String s3=Integer.toBinaryString(d3);

        return s1+"-"+s2+"-"+s3;
    }
}