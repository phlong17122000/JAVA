package entities;
// Generated Jun 19, 2020 9:15:53 PM by Hibernate Tools 3.6.0



/**
 * LopDssvId generated by hbm2java
 */
public class LopDssvId  implements java.io.Serializable {


     private String malop;
     private String mamon;
     private String mssv;

    public LopDssvId() {
    }

    public LopDssvId(String malop, String mamon, String mssv) {
       this.malop = malop;
       this.mamon = mamon;
       this.mssv = mssv;
    }
   
    public String getMalop() {
        return this.malop;
    }
    
    public void setMalop(String malop) {
        this.malop = malop;
    }
    public String getMamon() {
        return this.mamon;
    }
    
    public void setMamon(String mamon) {
        this.mamon = mamon;
    }
    public String getMssv() {
        return this.mssv;
    }
    
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LopDssvId) ) return false;
		 LopDssvId castOther = ( LopDssvId ) other; 
         
		 return ( (this.getMalop()==castOther.getMalop()) || ( this.getMalop()!=null && castOther.getMalop()!=null && this.getMalop().equals(castOther.getMalop()) ) )
 && ( (this.getMamon()==castOther.getMamon()) || ( this.getMamon()!=null && castOther.getMamon()!=null && this.getMamon().equals(castOther.getMamon()) ) )
 && ( (this.getMssv()==castOther.getMssv()) || ( this.getMssv()!=null && castOther.getMssv()!=null && this.getMssv().equals(castOther.getMssv()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getMalop() == null ? 0 : this.getMalop().hashCode() );
         result = 37 * result + ( getMamon() == null ? 0 : this.getMamon().hashCode() );
         result = 37 * result + ( getMssv() == null ? 0 : this.getMssv().hashCode() );
         return result;
   }   


}

