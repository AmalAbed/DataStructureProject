
package capThinking;

public class Cap {
    private String redWord;
    private String greenWord;
    private String colorState;
    
    public Cap(String redWord,String greenWord){
        this.greenWord = greenWord;
        this.redWord = redWord;
    }
    
    public Cap(){
    }
  
    public Cap(String color){
       this.colorState = color;
    }
     
    public String getRed(){
      return this.redWord;  
    }
    public void setRed(String red){
        this.redWord =  red;
    }
   
    public String getGreen(){
        return greenWord;
    }
    public void setGreen(String green){
        this.greenWord = green;
    }
    
    public String getColor(){
        return colorState;
    }
    public void setColor(String newColor){
        this.colorState = newColor;
    }
    
    public String red(){
        return redWord;
    }
    
    public String green(){
        return greenWord;
    }
    
    public void changeColor(String color){
        System.out.println("this is color "+ color);
    }
    
    public String stateColor(boolean state){
        if(state==true){
          return "This is red";
        }else{
           return "this is green";
        }
    }
    
    
    
    
    
    
    
    
    
    
}
