package data;


import java.util.Arrays;
import java.util.List;


/**
 * Created by Jacobow on 2016/7/30.
 * 图片上传结果, 进件图片缓存
 *
 * @author leefly
 * @since 2016/7/30
 */
public class PicResult implements java.io.Serializable {
    private static final long serialVersionUID = -1468745095618040965L;

    private Record FType;
    private Record RType;
    private Record EType;
    private Record XType;

    public Record getFType() {
        return FType;
    }

    public void setFType(Record FType) {
        this.FType = FType;
    }

    public Record getRType() {
        return RType;
    }

    public void setRType(Record RType) {
        this.RType = RType;
    }

    public Record getEType() {
        return EType;
    }

    public void setEType(Record EType) {
        this.EType = EType;
    }

    public Record getXType() {
        return XType;
    }

    public void setXType(Record XType) {
        this.XType = XType;
    }

    public static class Record implements java.io.Serializable {
        private static final long serialVersionUID = -8885824157288065557L;

        private String picType;
        private String lastUrl;
        private int count = 0;

        public Record(String picType, String lastUrl) {
            setPicType(picType);
            setLastUrl(lastUrl);
        }

        public Record() {
            //
        }

        public String getPicType() {
            return picType;
        }

        public void setPicType(String picType) {
            this.picType = picType;
        }

        public String getLastUrl() {
            return lastUrl;
        }

        public void setLastUrl(String lastUrl) {
            this.lastUrl = lastUrl;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public void addCount() {
            this.count++;
        }

//        public boolean isUpload() {
//            return count > 0 && StringUtils.isNotBlank(lastUrl);
//        }
    }

    /**
     * 验证是否全部上传
     *
     * @return
     */
//    public boolean isAllUpload() {
//        if (FType == null || !FType.isUpload()
//                || RType == null || !RType.isUpload()
//                || EType == null || !EType.isUpload()
//                || XType == null || !XType.isUpload()) {
//            return false;
//        }
//        return true;
//    }

    /**
     * 获取全部上传结果
     *
     * @return
     * @throws VerificationException
     */
//    public List<Record> getAllPicRecords() throws VerificationException {
//        if (isAllUpload())
//            return Arrays.asList(FType, RType, EType, XType);
//        throw new VerificationException(NO_UPLOAD_PICTURE);
//    }

    private static final String F_TYPE = "F";

    private static final String R_TYPE = "R";

    private static final String E_TYPE = "E";

    private static final String X_TYPE = "X";

    /**
     * 创建上传记录
     *
     * @param pic
     * @param type
     * @param url
     */
//    public static void createRecord(PicResult pic, String type, String url) {
//        if (pic == null)
//            return;
//        if (StringUtils.equals(F_TYPE, type)) {
//
//            if (pic.getFType() == null) {
//                pic.setFType(new Record(type, url));
//            } else {
//                pic.getFType().setLastUrl(url);
//                pic.getFType().addCount();
//            }
//
//        } else if (StringUtils.equals(R_TYPE, type)) {
//
//            if (pic.getRType() == null) {
//                pic.setRType(new Record(type, url));
//            } else {
//                pic.getRType().setLastUrl(url);
//                pic.getRType().addCount();
//            }
//
//        } else if (StringUtils.equals(E_TYPE, type)) {
//
//            if (pic.getEType() == null) {
//                pic.setEType(new Record(type, url));
//            } else {
//                pic.getEType().setLastUrl(url);
//                pic.getEType().addCount();
//            }
//
//        } else if (StringUtils.equals(X_TYPE, type)) {
//
//            if (pic.getXType() == null) {
//                pic.setXType(new Record(type, url));
//            } else {
//                pic.getXType().setLastUrl(url);
//                pic.getXType().addCount();
//            }
//
//        }
//    }

    /**
     * 初始化照片上传记录
     *
     * @param pic
     * @return
     */
    public PicResult initPicResult(PicResult pic) {
        if (pic == null)
            pic = new PicResult();
        return pic;
    }

}
