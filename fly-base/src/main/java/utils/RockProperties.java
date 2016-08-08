package utils;

import java.util.Locale;

import base.core.BaseProperties;

public class RockProperties extends BaseProperties{
	private static final String PROP_FILE = "/rock.properties";
//	private static final Log LOG = Log.getLogger(RockProperties.class);

	public RockProperties() {
		loads(PROP_FILE);
	}

	public Locale getLocale() {
    	Locale locale;
    	String setting = getProperty("locale");
//    	LOG.d(setting);

    	if (setting.length() == 0) {
    		locale = Locale.getDefault();
    	} else {
    	    String[] s = setting.split("_");
	    	try {
				locale = new Locale(s[0],s[1]);
			} catch (Exception e) {
				locale = Locale.getDefault();
			}
    	}

//        LOG.d(locale.toString());
    	return locale;
	}

}
