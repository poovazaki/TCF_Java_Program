class FourDigit{
    public static void main(String[] args) {
        int num=4567;
        int first=num/1000;
        int unit=num%10;
        int rev=first+unit;
        System.out.println(rev);
}
}