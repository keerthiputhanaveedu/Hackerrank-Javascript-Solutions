
package solutiondictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SolutionDictionary {
   

//    Sample input
//   3
//sam 99912222
//tom 11122222
//harry 12299933
//sam
//edward
//harry
    
//Sample Output
    
//sam=99912222
//Not found
//harry=12299933
          
         
        public static void main(String []argh){
            Map<String, Integer> phoneDic = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneDic.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
           
            if(phoneDic.containsKey(s)){
                System.out.println(s+ "=" +phoneDic.get(s));
            }
            else
            {
                System.out.println("Not Found");
            }
        }
       
    }
}

