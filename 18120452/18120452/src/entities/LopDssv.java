package entities;
// Generated Jun 19, 2020 9:15:53 PM by Hibernate Tools 3.6.0



/**
 * LopDssv generated by hbm2java
 */
public class LopDssv  implements java.io.Serializable {


     private LopDssvId id;
     private Integer dgk;
     private Integer dck;
     private Integer dkhac;
     private Double dtong;

    public LopDssv() {
    }

	
    public LopDssv(LopDssvId id) {
        this.id = id;
    }
    public LopDssv(LopDssvId id, Integer dgk, Integer dck, Integer dkhac, Double dtong) {
       this.id = id;
       this.dgk = dgk;
       this.dck = dck;
       this.dkhac = dkhac;
       this.dtong = dtong;
    }
   
    public LopDssvId getId() {
        return this.id;
    }
    
    public void setId(LopDssvId id) {
        this.id = id;
    }
    public Integer getDgk() {
        return this.dgk;
    }
    
    public void setDgk(Integer dgk) {
        this.dgk = dgk;
    }
    public Integer getDck() {
        return this.dck;
    }
    
    public void setDck(Integer dck) {
        this.dck = dck;
    }
    public Integer getDkhac() {
        return this.dkhac;
    }
    
    public void setDkhac(Integer dkhac) {
        this.dkhac = dkhac;
    }
    public Double getDtong() {
        return this.dtong;
    }
    
    public void setDtong(Double dtong) {
        this.dtong = dtong;
    }




}

