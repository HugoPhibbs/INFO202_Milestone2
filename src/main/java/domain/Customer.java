package domain;

import java.util.Objects;
import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.NotBlank;
import net.sf.oval.constraint.NotNull;

/**
 * @author Mark George
 */
public class Customer {
	private Integer customerId;
        
    @NotNull(message = "Username cannot be null!")
    @NotBlank(message = "Password cannot be empty") 
    @Length(min = 1, message = "Username cannot be empty!")
	private String username;
	private String firstName;
	private String surname;
        
    @NotNull(message = "Password cannot be null!")
    @NotBlank(message = "Password cannot be empty")
    @Length(min = 1, message = "Password cannot be empty!")
	private String password;
	private String emailAddress;
	private String shippingAddress;

	public Customer() {
	}

	public Customer(String username, String firstName, String surname, String shippingAddress, String emailAddress) {
		this.username = username;
		this.firstName = firstName;
		this.surname = surname;
		this.shippingAddress = shippingAddress;
		this.emailAddress = emailAddress;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer personId) {
		this.customerId = personId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@Override
	public String toString() {
		return "Customer{" + "customerId=" + customerId + ", username=" + username + ", firstName=" + firstName + ", surname=" + surname + ", password=" + password + ", emailAddress=" + emailAddress + ", shippingAddress=" + shippingAddress + '}';
	}

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 37 * hash + Objects.hashCode(this.username);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Customer other = (Customer) obj;
            return Objects.equals(this.username, other.username);
        }


}
