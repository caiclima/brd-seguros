package br.com.callink.bradesco.seguro.web.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

public class AbstractStringConverter implements Converter {

	public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String string) {
		if (StringUtil.isEmpty(string)) {
			return null;
		} else {
			return string.replace("'", "").replace("\"", "");
		}
	}

	public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object string) {
		if (string == null) {
			return null;
		} else {
			return string.toString().replace("'", "").replace("\"", "").trim();
		}
	}
}