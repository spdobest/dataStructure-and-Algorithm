package sptech.datastructureandalgorithm;

public class LinearSearch {
    public static void main(String...args){
        LinearSearch linearSearch = new LinearSearch();

        if(linearSearch.isPallindrom("AAAABAAAA")){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }

    private boolean isPallindrom(String pallindromString){
        boolean isPalindrom = false;
        if(pallindromString!=null && pallindromString.length()>0){
            if(pallindromString.length()==1){
                isPalindrom = true;
            }
            else {
                int length = pallindromString.length();
                length = length-1;
                for(int i = 0;i<length;i++){
                    if(i>=length-i){
                        return true;
                    }
                    else{
                        if(pallindromString.charAt(i) == pallindromString.charAt(length-i)){
                            isPalindrom = true;
                        }
                        else{
                            isPalindrom = false;
                            break;
                        }
                    }
                }
            }
        }
        return isPalindrom;
    }

    boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }
}