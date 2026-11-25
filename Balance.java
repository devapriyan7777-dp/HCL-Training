import java.util.*;
public class Balance {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        ArrayList<Character> stack = new ArrayList<>();
        boolean balanced = true;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stack.add(ch);
            }
            else if(ch==')'||ch=='}'||ch==']'){
                if(stack.isEmpty()){
                    balanced = false;
                    break;
                }
                char top = stack.remove(stack.size() - 1);
                if((ch==')'&& top!='(')||(ch=='}'&& top!='{')||(ch==']'&& top!='[')){
                    balanced = false;
                    break;
                }
            }
        }
        if(!stack.isEmpty()){
            balanced = false;
        }
        if(balanced){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Unbalanced");
        }
    }
}
