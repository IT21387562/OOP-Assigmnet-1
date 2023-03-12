//IT21387562
//E.M.A.M.Ekanayake
//Assignment 1
//Question 1

public class RoomChargeCalculator
  {
    public int getChargeDeluxDouble(boolean b, boolean p, boolean t, boolean kd, boolean w)
    {
      int fixed = 5000;

      if(b==true)
      {
        fixed+=500;
      }
      if(p==true)
      {
        fixed+=200;
      }
      if(t==true)
      {
        fixed+=200;
      }
      if(kd==true)
      {
        fixed+=1000;
      }
      if(w==true)
      {
        fixed+=100;
      }

      return fixed;
    }

    public int getChargeStandardFamily(boolean p, boolean ks, boolean g)
    {
      int fixed1 =3000;

      if(p==true)
      {
        fixed1+=200;
      }
      if(ks==true)
      {
        fixed1+=500;
      }
      if(g==true)
      {
        fixed1+=200;
      }

      return fixed1;
    }

    public int getChargeStandardSingle(boolean p, boolean a, boolean w)
    {
      int fixed2 = 2000;

      if(p==true)
      {
        fixed2+=200;
      }
      if(a==true)
      {
        fixed2+=500;
      }
      if(w==true)
      {
        fixed2+=100;
      }

      return fixed2;
    }
  }