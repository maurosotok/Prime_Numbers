package numeros_primos;

import java.util.Stack;

public class Numeros_Primos {
    public static void main(String[] args) {
        System.out.println("\u001B[34m" + "and now the text is red");
        Stack st = new Stack();

        for(int i = 1; i < 101; i++){
            if(i == 1){
                
                System.out.println("\u001B[34m" + i);
                continue;
            }
            if(i%2 == 0){
                if(i == 2){
                    st.push(i);
                    System.out.println(i);
                    continue;
                }
                System.out.println("\033[0;31m"+i);
                continue;
            }
            if(i%3 == 0){
                if(i == 3){
                    st.push(i);
                    System.out.println(i);
                    continue;
                }
                System.out.println("\033[0;35m"+i);
                continue;
            }
            if(i%5 == 0){
                if(i == 5){
                    st.push(i);
                    System.out.println(i);
                    continue;
                }
                System.out.println("\u001B[33m"+i);
                continue;
            }
            st.push(i);
           System.out.println(i);
        }
        System.out.println(st);
    }
    
}
