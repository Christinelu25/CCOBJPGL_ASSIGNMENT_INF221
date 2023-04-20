public class App {


static boolean iWillNotCheat= true;
static boolean iWillWin = true;
    public static void main(String[] args) throws Exception {
        

        //precondtion    
        assert iWillNotCheat== true: "Magagalit si sir ";
       EnterCompetition();
      
       //PostConditon
        assert iWillWin== true: "Ouch pain!";
       
}


    static void EnterCompetition() {
   iWillWin = false;


}
} 
