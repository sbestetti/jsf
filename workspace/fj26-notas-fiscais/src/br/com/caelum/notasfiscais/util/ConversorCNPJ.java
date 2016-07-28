package br.com.caelum.notasfiscais.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.caelum.stella.format.CNPJFormatter;

@FacesConverter("cnpj")
public class ConversorCNPJ implements Converter {
	
	public Object getAsObject (FacesContext context, UIComponent component, String valor) {
		
		if(valor == null || valor.trim().isEmpty()){
			return valor;
		}
		return new CNPJFormatter().unformat(valor);
	}
	
	public String getAsString (FacesContext context, UIComponent component, Object valor) {
		
		if(valor == null){
			return null;
		}
		if(valor.toString().trim().isEmpty()) {
			return "";
		}
		return new CNPJFormatter().format(valor.toString());
	}

}
