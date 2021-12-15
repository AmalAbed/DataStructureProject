
package capThinking;
public class CapTest {
    public static void main(String[] args) {
        Cap cap1 = new Cap();
        Cap cap2 = new Cap("red","green");
        Cap cap3 = new Cap("orange");
        
        cap1.changeColor("white");
        cap1.setGreen("pink");
        System.out.println(cap1.stateColor(true));
         
        System.out.println(cap2.red());
        cap2.setRed("orange");
        System.out.println(cap2.red());

        
    }   
}
