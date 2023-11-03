class A
{    
    public static void main(String[] args) {    
        String A = "The best of both worlds";    
        int count = 0;    
            
           
        for(int i = 0; i < A.length(); i++) {    
            if(A.charAt(i) != ' ')    
                count++;    
        }    
            
           
        System.out.println("Total number of characters in a string: " + count);    
    }    
}     