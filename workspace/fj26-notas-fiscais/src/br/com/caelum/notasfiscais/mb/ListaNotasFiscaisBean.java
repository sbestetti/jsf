package br.com.caelum.notasfiscais.mb;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.LazyDataModel;

import br.com.caelum.notasfiscais.datamodel.DataModelNotasFiscais;
import br.com.caelum.notasfiscais.modelo.NotaFiscal;
import br.com.caelum.notasfiscais.util.ViewModel;

@Named
@ViewModel
public class ListaNotasFiscaisBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private DataModelNotasFiscais dataModel;
	
	public LazyDataModel<NotaFiscal> getDataModel() {
		return dataModel;
	}
}
