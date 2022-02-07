import java.util.Scanner;
 class JavaPalindr {
    public static void main(String agrs[]){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter any String : ");
        String firstStr = scan.nextLine();
        String reverseStr = "";
        int strLength = firstStr.length();
  
        for (int i = (strLength - 1); i >=0; --i) {
          reverseStr = reverseStr + firstStr.charAt(i);
        }
        if (firstStr.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(firstStr + " is a Palindrome String.");
        }
        else if(firstStr.toUpperCase().equals(reverseStr.toUpperCase())) {
                        System.out.println("String is a palindrome.");
                    
          }
          else {
            System.out.println(firstStr + " is not a Palindrome String.");
          }
        }
      }


