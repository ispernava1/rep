public class Coronavirus{
 private float infeccio;
 private float mortaldat;
 
 public Coronavirus() {
    this.infeccio = 0.0;
    this.mortaldat = 0.0;
 }

 public Coronavirus(Coronavirus c) {
     this.infeccio = c.infeccio;
     this.mortaldat = c.mortaldat;
 }

 Coronavirus(float x, float y) {
    infeccio=xx;
    mortaldat=yy;
 }


 @Override
 public String toString() {
     return "Infecció: " + this.infeccio + "Mortaldat: " + this.mortaldat;
 }
 
 @Override
 public boolean equals(Coronavirus c) {
     float f1 = this.infeccio;
     float f2 = this.mortaldat;

     if(f1 == c.infeccio && f2 == c.mortaldat) {
         System.out.println("Són iguals.");
     } else {
         System.out.println("No són iguals.");
     
     
 }

}
