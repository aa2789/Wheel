public class WheelImp
{
   public static void main(String[] args)  
   {
      final int    wS = 95;
      final long seed = 2002L;
      final int  nPos =  4;
      final int  cPos =  94;
      
      //
      // Create a Wheel
      // with wS positions
      // random number seed,
      // nPos notch position,
      // cPos start position.
      //
      Wheel2 ref = new Wheel2(wS,seed,cPos,nPos);
      int c1 = ref.getLtoR(3);
      ref.advance();
      int c2 = ref.getLtoR(0);
      ref.advance();
      int c3 = ref.getLtoR(4);
      ref.advance();
      int c4 = ref.getLtoR(3);
      ref.advance();
      int c5 = ref.getLtoR(3);
      ref.advance();
      int c6 = ref.getLtoR(1);
      ref.advance();
      int c7 = ref.getLtoR(2);
      ref.advance();
      int c8 = ref.getLtoR(2);
      ref.advance();
      //
      // Answer comes out
      // in reverse order.
      //
      ref.reverse();
      int ans8 = ref.getRtoL(c8);
      System.out.println(ans8);
      ref.reverse();
      int ans7 = ref.getRtoL(c7);
      System.out.println(ans7);
      ref.reverse();
      int ans6 = ref.getRtoL(c6);
      System.out.println(ans6);
      ref.reverse();
      int ans5 = ref.getRtoL(c5);
      System.out.println(ans5);
      ref.reverse();
      int ans4 = ref.getRtoL(c4);
      System.out.println(ans4);
      ref.reverse();
      int ans3 = ref.getRtoL(c3);
      System.out.println(ans3);
      ref.reverse();
      int ans2 = ref.getRtoL(c2);
      System.out.println(ans2);
      ref.reverse();
      int ans1 = ref.getRtoL(c1);
      System.out.println(ans1);
   }
}
