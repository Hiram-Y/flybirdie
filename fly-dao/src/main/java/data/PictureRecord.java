package data;


import java.util.Date;

/**
 * Created by Jacobow on 2016/6/24.
 * 图片资料记录
 */
public class PictureRecord implements java.io.Serializable {

    private static final long serialVersionUID = -7836280529824143327L;

    private Long id;

    private Long fid;

    private String picType;

    private String picUrl;

    private Boolean patch;

    private String updateUser;

    private Date uploadTime;

    public PictureRecord(Long id, Long fid, String picType, String picUrl, String updateUser, Date uploadTime) {
        setId(id);
        setFid(fid);
        setPicType(picType);
        setPicUrl(picUrl);
        setUpdateUser(updateUser);
        setUploadTime(uploadTime);
    }

    public PictureRecord() {
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

    public String getPicType() {
        return picType;
    }

    public void setPicType(String picType) {
        this.picType = picType;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Boolean getPatch() {
        return patch;
    }

    public void setPatch(Boolean patch) {
        this.patch = patch;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

	@Override
	public String toString() {
		return "PictureRecord [id=" + id + ", fid=" + fid + ", picType=" + picType + ", picUrl=" + picUrl + ", patch="
				+ patch + ", updateUser=" + updateUser + ", uploadTime=" + uploadTime + "]";
	}

   
}
