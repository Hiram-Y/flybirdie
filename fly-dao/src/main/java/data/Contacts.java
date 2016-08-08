package data;


/**
 * Created by Jacobow on 2016/6/8.
 * 用户联系人信息, 多个所以单独定义
 */
//@ReplaceSpecial
public class Contacts implements java.io.Serializable {

    private static final long serialVersionUID = -889962853706924364L;

    private Long id;

    private Long fid;                   // 仅件快照id

//    @ReplaceSpecial(length = 50, handler = {ValidStringFilter.class})
    private String contactName;

    private String relationship;

//    @ReplaceSpecial(length = 20)
    private String contactMobile;

    private Integer childrenCount;     // 当关系为配偶的情况下需要

    private String contactAddress;      // 联系人地址

    public Contacts(Long id, Long fid, String contactName, String relationship,
                    String contactMobile, int childrenCount, String contactAddress) {
        setId(id);
        setFid(fid);
        setContactName(contactName);
        setRelationship(relationship);
        setContactMobile(contactMobile);
        setChildrenCount(childrenCount);
        setContactAddress(contactAddress);
    }

    public Contacts(String contactName, String relationship,
                    String contactMobile, int childrenCount, String contactAddress) {
        setContactName(contactName);
        setRelationship(relationship);
        setContactMobile(contactMobile);
        setChildrenCount(childrenCount);
        setContactAddress(contactAddress);
    }

    public Contacts() {
        // nothing
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public Integer getChildrenCount() {
        return childrenCount;
    }

    public void setChildrenCount(Integer childrenCount) {
        this.childrenCount = childrenCount;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

	@Override
	public String toString() {
		return "Contacts [id=" + id + ", fid=" + fid + ", contactName=" + contactName + ", relationship=" + relationship
				+ ", contactMobile=" + contactMobile + ", childrenCount=" + childrenCount + ", contactAddress="
				+ contactAddress + "]";
	}

    

}
