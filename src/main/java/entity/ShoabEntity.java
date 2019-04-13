package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.eclipse.persistence.annotations.CacheType;


@Entity
@Table(name="shahed_tbl")
@Cache(type = CacheType.SOFT, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS, size = 1000000)
@NamedQueries({
	@NamedQuery(name="findAllAdmin" , query="SELECT a FROM ShoabEntity a"),
	@NamedQuery(name="findByUsername" , query="SELECT u FROM ShoabEntity u WHERE u.shahedId=:v_shahedId"),
})
public class ShoabEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 85409033337259992L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shahed_id")
	private long shahedId;
	@Column(name = "cityBirth", length = 100, nullable = true)
	private String cityBirth;
	@Column(name="date" , nullable=true)
	private String date;
	@Column(name = "father", length = 100, nullable = true)
	private String father;
	@Column(name = "name", length = 100, nullable = true)
	private String name;
	@Column(name = "shomareGovahiName", length = 100, nullable = true)
	private String shomareGovahiName;
	@Column(name = "ssn", length = 12, nullable = true)
	private String ssn;
	@Column(name = "addres", length = 200, nullable = true)
	private String addres;
	@Column(name = "shogl", length = 100, nullable = true)
	private String shogl;
	@Column(name = "madrak", length = 100, nullable = true)
	private String madrak;
	@Column(name = "reshte", length = 100, nullable = true)
	private String reshte;
	@Column(name = "mobile", length = 20, nullable = true)
	private String mobile;
	@Column(name = "phone", length = 20, nullable = true)
	private String phone;
	@Column(name = "darBakhsh", length = 100, nullable = true)
	private String darBakhsh;
	@Column(name = "darShahr", length = 100, nullable = true)
	private String darShahr;
	@Column(name = "darShahrestan", length = 100, nullable = true)
	private String darShahrestan;
	@Column(name = "darOstan", length = 100, nullable = true)
	private String darOstan;
	@Column(name = "options", length = 300, nullable = true)
	private String options;
	@Column(name = "nahve", length = 100, nullable = true)
	private String nahve;
	@Column(name = "description", length = 5000, nullable = true)
	private String description;
	@Column(name = "khon", length = 100, nullable = true)
	private String khon;
	@Column(name="birthday_new" , nullable=true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthDayNew;
	
	public long getShahedId() {
		return shahedId;
	}
	public void setShahedId(long shahedId) {
		this.shahedId = shahedId;
	}
	public String getCityBirth() {
		return cityBirth;
	}
	public void setCityBirth(String cityBirth) {
		this.cityBirth = cityBirth;
	}
	
	
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getShomareGovahiName() {
		return shomareGovahiName;
	}
	public void setShomareGovahiName(String shomareGovahiName) {
		this.shomareGovahiName = shomareGovahiName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getShogl() {
		return shogl;
	}
	public void setShogl(String shogl) {
		this.shogl = shogl;
	}

	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDarBakhsh() {
		return darBakhsh;
	}
	public void setDarBakhsh(String darBakhsh) {
		this.darBakhsh = darBakhsh;
	}
	public String getDarShahr() {
		return darShahr;
	}
	public void setDarShahr(String darShahr) {
		this.darShahr = darShahr;
	}
	public String getDarShahrestan() {
		return darShahrestan;
	}
	public void setDarShahrestan(String darShahrestan) {
		this.darShahrestan = darShahrestan;
	}
	public String getDarOstan() {
		return darOstan;
	}
	public void setDarOstan(String darOstan) {
		this.darOstan = darOstan;
	}

	public String getMadrak() {
		return madrak;
	}
	public void setMadrak(String madrak) {
		this.madrak = madrak;
	}
	public String getReshte() {
		return reshte;
	}
	public void setReshte(String reshte) {
		this.reshte = reshte;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	public String getNahve() {
		return nahve;
	}
	public void setNahve(String nahve) {
		this.nahve = nahve;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String getKhon() {
		return khon;
	}
	public void setKhon(String khon) {
		this.khon = khon;
	}
	
	public Date getBirthDayNew() {
		return birthDayNew;
	}
	public void setBirthDayNew(Date birthDayNew) {
		this.birthDayNew = birthDayNew;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ShoabEntity))
			return false;
		ShoabEntity shoabEntity=(ShoabEntity) obj;
		return (shoabEntity.shahedId==this.shahedId);
	}
	

}
