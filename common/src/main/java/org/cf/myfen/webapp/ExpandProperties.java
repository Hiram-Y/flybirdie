package org.cf.myfen.webapp;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import base.core.BaseProperties;

/**
 * 读取Propertise文件
 * @author caijing
 *
 */

public class ExpandProperties extends BaseProperties {
	private static final String SIG_ARR = "sig_arr_";
	private String fileName;
	private boolean okay = false;

	public void setFileName(String fileName) {
		this.fileName = fileName;
		okay = true;
	}

	public void load() {
		if (okay) {
//			loads(fileName);
		}
	}

	/**
	 * 获取key value
	 *
	 * @return
	 */
	public Map<String, Object> getKeyValues() {
		Map<String, Object> map = new HashMap<>();
		Properties props = getProps();
		if (props == null)
			return Collections.emptyMap();
		if (props.size() != map.size()) {
			Enumeration<?> names = props.propertyNames();
			while (names.hasMoreElements()) {
				String key = (String) names.nextElement();
				if (key == null)
					continue;
				String val = props.getProperty(key);
				if (val == null)
					continue;
				if (key.startsWith(SIG_ARR)) {
//					map.put(key, JsonUtil.string2Json(val));
				} else {
					map.put(key, val);
				}
			}
		}
		return map;
	}
}
