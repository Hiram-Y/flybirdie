package org.cf.util;

import org.springframework.beans.factory.annotation.Value;



public class ConfigProperty {
	
	  /** 作者名字 */  
    @Value("#{setting[author_name]}")  
	 private String authorName;
    
    /** 项目信息 */  
    @Value("#{setting[project_info]}")  
    private String projectInfo;  

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getProjectInfo() {
		return projectInfo;
	}

	public void setProjectInfo(String projectInfo) {
		this.projectInfo = projectInfo;
	} 
    
    
	 

}
