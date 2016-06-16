package pe.com.peruInka.core.domain;

public class Product extends BaseEntity implements Serializable{
	
	private string productName;
	private Double price;
	private string description;
	private string attribute;
	private StatusProduct statusProduct;
	private string productType;
	private string createBy;
	private Date dateCreated;
	private Date dateLastUpdated;
	private string lastUpdatedBy;
	private string version;
	
	public string getProductName() {
		return productName;
	}
	public void setProductName(string productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public string getDescription() {
		return description;
	}
	public void setDescription(string description) {
		this.description = description;
	}
	public string getAttribute() {
		return attribute;
	}
	public void setAttribute(string attribute) {
		this.attribute = attribute;
	}
	public StatusProduct getStatusProduct() {
		return statusProduct;
	}
	public void setStatusProduct(StatusProduct statusProduct) {
		this.statusProduct = statusProduct;
	}
	public string getProductType() {
		return productType;
	}
	public void setProductType(string productType) {
		this.productType = productType;
	}
	public string getCreateBy() {
		return createBy;
	}
	public void setCreateBy(string createBy) {
		this.createBy = createBy;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateLastUpdated() {
		return dateLastUpdated;
	}
	public void setDateLastUpdated(Date dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}
	public string getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(string lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public string getVersion() {
		return version;
	}
	public void setVersion(string version) {
		this.version = version;
	}
	

}
