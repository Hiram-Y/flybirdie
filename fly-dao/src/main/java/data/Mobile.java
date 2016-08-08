package data;


/**
 * Created by Jacobow on 2016/7/14.
 * 通讯录
 */
//@ReplaceSpecial
public class Mobile implements java.io.Serializable {

    private static final long serialVersionUID = -3440239045350438753L;

    private Long id;

    private Long fid;

//    @ReplaceSpecial(length = 50, handler = {ValidStringFilter.class})
    private String name;

//    @ReplaceSpecial(length = 20)
    private String mobile;

    public Mobile(Long id, Long fid, String name, String mobile) {
        setId(id);
        setFid(fid);
        setName(name);
        setMobile(mobile);
    }

    public Mobile(String name, String mobile) {
        setName(name);
        setMobile(mobile);
    }

    public Mobile() {
        //
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
//        if (StringUtils.isNotBlank(name) && name.length() > 30) {
//            name = name.substring(0, 30);
//        }
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
//        if (StringUtils.isNotBlank(mobile) && mobile.length() > 30) {
//            mobile = mobile.substring(0, 30);
//        }
        this.mobile = mobile;
    }

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", fid=" + fid + ", name=" + name + ", mobile=" + mobile + "]";
	}

   
}
