
package denemelerim;


public class yigit {

  int [] yigit = new int [10];
  int isaretci =-1;
  
  void push(int eleman){
      if(isaretci<9){
          yigit[isaretci++]=eleman;
      }
      else{
         System.out.print("yigit dolu");          
      }
  }
  int pop (){
      if(isaretci>=0){
       return yigit[--isaretci];
      }
      else{
          System.out.print("yigit bos");
          return -1;
      }
  }
  boolean bosMu(){
      if(isaretci>=0){
          return false;
      }else{
          return true;
      }
  }
  void listele(){
      for(int i=0; i<=isaretci; i++){
          System.out.print(yigit[i]+" ");
      }
  }
  
    public static void main(String[] args) {
       yigit y = new yigit();
       y.pop();
       y.push(5);
       y.push(10);
       y.listele();
       System.out.print("-----"+y.pop());
       y.listele();
    }
    
}
