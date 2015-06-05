package jp.ac.tsuda;

import java.net.URL;
import java.util.Date;
 
import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkData {
	   @PrimaryKey
	    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	    private Long id;
	     
	    @Persistent
	    private String name;
	     
	    @Persistent
	    private String price;
	     
	 
	    public LinkData(String name,String price) {
	        super();
	        this.name = name;
	        this.price = price;
	       
	    }
	 
	    public Long getId() {
	        return id;
	    }
	 
	    public void setId(Long id) {
	        this.id = id;
	    }
	 
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	    public String getPrice() {
	        return price;
	    }
	 
	    public void setPrice(String price) {
	        this.price= price;
	    }
	 
	   
}
