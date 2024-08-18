import  java.util.*;
public class Reverse_string {
    public String solve(String A) {
        ArrayList<String> arr=new ArrayList<>();
        String temp="";
        A+=" ";
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)==' '){
                arr.add(temp);
                temp="";
            }
            else
                temp+=A.charAt(i);
        }
        int i=0;
        String ans="";
        while(i<arr.size()){
            if(i!=arr.size()-1)
                ans=" "+arr.get(i)+ans;
            else
                ans=arr.get(i)+ans;
            i++;
        }
        return ans;
    }
}
