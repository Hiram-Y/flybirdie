package base.core;

import java.io.InputStream;
import java.util.Properties;

public class BaseProperties {
	
//    private static final Log LOG = Log.getLogger(BaseProperties.class);
    private Properties props = null;

    public synchronized void loads(String filename) {
        if (props == null) {
            InputStream is = BaseProperties.class.getResourceAsStream(filename);
            props = new Properties();
            try {
                props.load(is);
            } catch (Exception e) {
//                LOG.e("Cannot load the properties from " + filename + ".");
            }
        }
    }
    
    public String getProperty(String key) {
        String value;
        
        try {
            value = props.getProperty(key);
        } catch (Exception e) {
            value = "";
        }
        
        if (value == null || value.length() == 0) {
            value = "";
        }
        
//        LOG.d(key + ":[" + value +"]");
        return value;
    }
    
    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

}
