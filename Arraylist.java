import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("chennai");
        list.add("madurai");
        System.out.println("Default list:");
        System.out.println(list);
        System.out.println("Enter\n'1'-append at end\n'2'-Add at particular Index\n'3'-Search\n'4'-List the string starting with?");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter a string:");
            String app=sc.next();
            list.add(app);
            System.out.println(list);
        }
        else if(choice==2){
            System.out.println("Enter index:");
            int index=sc.nextInt();
            System.out.println("Enter the string: ");
            String str=sc.next();
            list.add(index,str);
            System.out.println(list);
        }
        else if(choice==3){
            int f=0;
            System.out.println("Enter the search string: ");
            String search=sc.next();
            for(int i=0;i<=list.size();i++){
                if(list.get(i).contains(search)){
                    System.out.println("Found");
                    f=1;
                    break;
                }
                if(f==0){
                    System.out.println("Not Found");
                }
            }

        }
        else if(choice==4){
            System.out.println("Enter the string:");
            String start=sc.next();
            for(int i=0;i<=list.size();i++){
                if(list.get(i).startsWith(start)){
                    System.out.println(list.get(i));
                }
                else{
                    System.out.println("Not found");
                }
            }
        }
    }
}
