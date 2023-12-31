package Hibernate;
// Generated Jan 30, 2019 7:46:47 AM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Country generated by hbm2java
 */
public class Country  implements java.io.Serializable {


     private Integer cid;
     private String country;
     private String status;
     private Set<Jobs> jobses = new HashSet<Jobs>(0);
     private Set<Usercountry> usercountries = new HashSet<Usercountry>(0);

    public Country() {
    }

    public Country(String country, String status, Set<Jobs> jobses, Set<Usercountry> usercountries) {
       this.country = country;
       this.status = status;
       this.jobses = jobses;
       this.usercountries = usercountries;
    }
   
    public Integer getCid() {
        return this.cid;
    }
    
    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Set<Jobs> getJobses() {
        return this.jobses;
    }
    
    public void setJobses(Set<Jobs> jobses) {
        this.jobses = jobses;
    }
    public Set<Usercountry> getUsercountries() {
        return this.usercountries;
    }
    
    public void setUsercountries(Set<Usercountry> usercountries) {
        this.usercountries = usercountries;
    }




}


