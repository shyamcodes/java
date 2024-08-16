public class ps_Q01 {
    public static void main(String[] args){
        char grade = 'B';
        grade = (char) (grade + 8); //type casting  
        System.out.println(grade);    

        //Decrypting the grade 
        grade = (char) (grade -8);
        System.out.println(grade);

    }
    
}
