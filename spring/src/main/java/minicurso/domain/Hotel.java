package minicurso.domain;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.lang.Long;
import javax.persistence.Entity;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Hotel {

  @Id
  @GeneratedValue
  private Long id;

  @NotEmpty
  private String name;

  @NotEmpty
  private String address;

  @NotEmpty
  private String zip;

  public void setId(Long id){
    this.id = id;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setAddress(String address){
    this.address = address;
  }
  public void setZip(String zip){
    this.zip = zip;
  }

  public Long getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public String getAddress(){
    return address;
  }
  public String getZip(){
    return zip;
  }

}
