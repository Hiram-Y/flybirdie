package data;

/**
 * Created by Jacobow on 2016/7/5.
 *
 */
public class Area implements java.io.Serializable{

    private static final long serialVersionUID = 3964507674403765158L;

    private Integer id;

    private String code;

    private String name;

    public Area(Integer id, String code, String name) {
        setId(id);
        setCode(code);
        setName(name);
    }

    public Area() {
        //
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	@Override
	public String toString() {
		return "Area [id=" + id + ", code=" + code + ", name=" + name + "]";
	}

   
}
