/**
 * @Title: PmVo.java
 * @Package org.platform.snail.edu.vo
 * @Description: TODO
 * Copyright: Copyright (c) 2014
 * Company:snail
 * 
 * @author chenxiaoke
 * @date 2014年12月24日 下午3:44:43
 * @version V1.0
 */

package org.platform.snail.edu.vo;

import org.platform.snail.edu.model.Pm;

/**
 * @ClassName: PmVo
 * @Description: TODO
 * @author chenxiaoke
 * @date 2014年12月24日 下午3:44:43
 *
 */

public class PmVo extends Pm{
	  private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	  
}
