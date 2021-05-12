package springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "properties")
public class Property {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "street_address")
	private String streetAddress;

	@Column(name = "suburb")
	private String suburb;

	@Column(name = "city")
	private String city;

	@Column(name = "type")
	private String type;

	@Column(name = "grossRental")
	private Double grossRental;

	@Column(name = "nettRental")
	private Double nettRental;

	@Column(name = "commissionPercentage")
	private Double commissionPercentage;

	@Column(name = "ownerName")
	private String ownerName;

	@Column(name = "ownerCell")
	private Long ownerCell;

	@Column(name = "ownerEmail")
	private String ownerEmail;

	@Column(name = "tenantName")
	private String tenantName;

	@Column(name = "tenantCell")
	private Long tenantCell;

	@Column(name = "tenantEmail")
	private String tenantEmail;

	public Property(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Property() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getGrossRental() {
		return grossRental;
	}

	public void setGrossRental(double grossRental) {
		this.grossRental = grossRental;
	}

	public Double getNettRental() {
		return nettRental;
	}

	public void setNettRental(double nettRental) {
		this.nettRental = nettRental;
	}

	public Double getCommissionPercentage() {
		return commissionPercentage;
	}

	public void setCommissionPercentage(double commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Long getOwnerCell() {
		return ownerCell;
	}

	public void setOwnerCell(Long ownerCell) {
		this.ownerCell = ownerCell;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public Long getTenantCell() {
		return tenantCell;
	}

	public void setTenantCell(Long tenantCell) {
		this.tenantCell = tenantCell;
	}

	public String getTenantEmail() {
		return tenantEmail;
	}

	public void setTenantEmail(String tenantEmail) {
		this.tenantEmail = tenantEmail;
	}

	public void setGrossRental(Double grossRental) {
		this.grossRental = grossRental;
	}

	public void setNettRental(Double nettRental) {
		this.nettRental = nettRental;
	}

	public void setCommissionPercentage(Double commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}

}
