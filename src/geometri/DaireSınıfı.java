package geometri;

public class DaireSınıfı {

        int yarıCap;

    public DaireSınıfı(int yarıCap) {
        this.yarıCap = yarıCap;
    }

    public double daireAlan(){
            return Math.round(Math.PI*yarıCap*yarıCap);
        }
        public double daireCevre(){
            return Math.round(2*Math.PI*yarıCap);
        }

        public String showInfo(){
           return"Daire Yarı Çap :"+this.yarıCap+" Daire Alan :"+ daireAlan()+" Daire Çevre :"+daireCevre();
        }
}
