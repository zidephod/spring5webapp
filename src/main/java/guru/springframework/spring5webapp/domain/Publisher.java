package guru.springframework.spring5webapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String addressLine1;
  private String city;
  private String state;
  private String postalCode;

  public Publisher() {
  }

  public Publisher(String name, String addressLine1, String city, String state,
      String postalCode) {
    this.name = name;
    this.addressLine1 = addressLine1;
    this.city = city;
    this.state = state;
    this.postalCode = postalCode;
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

  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Publisher publisher = (Publisher) o;
    if (id != null ? !id.equals(publisher.id) : publisher.id != null) {
      return false;
    }
    if (name != null ? !name.equals(publisher.name) : publisher.name != null) {
      return false;
    }
    if (addressLine1 != null ? !addressLine1.equals(publisher.addressLine1)
        : publisher.addressLine1 != null) {
      return false;
    }
    if (city != null ? !city.equals(publisher.city) : publisher.city != null) {
      return false;
    }
    if (state != null ? !state.equals(publisher.state) : publisher.state != null) {
      return false;
    }
    return postalCode != null ? postalCode.equals(publisher.postalCode)
        : publisher.postalCode == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (addressLine1 != null ? addressLine1.hashCode() : 0);
    result = 31 * result + (city != null ? city.hashCode() : 0);
    result = 31 * result + (state != null ? state.hashCode() : 0);
    result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Publisher{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", addressLine1='" + addressLine1 + '\'' +
        ", city='" + city + '\'' +
        ", state='" + state + '\'' +
        ", postalCode='" + postalCode + '\'' +
        '}';
  }
}
