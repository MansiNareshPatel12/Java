public class DuplicateArrayElement {  
    public static void main(String[] args) {      
          
          
        int [] array = new int [] {10,20,30,40,50,50,60,60};   
          
         
         
        for(int i = 0; i < array.length; i++) {  
            for(int j = i + 1; j < array.length; j++) {  
                if(array[i] == array[j])  
                    System.out.println(array[j]);  
            }  
        }  
    }  
}  