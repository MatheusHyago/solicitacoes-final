
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de parametrizacoesSolicitacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="parametrizacoesSolicitacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parametrizacaoCentroDeCustoSolicitacaoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoSolicitacaoRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrizacoesSolicitacao", propOrder = {
    "parametrizacaoCentroDeCustoSolicitacaoRef"
})
public class ParametrizacoesSolicitacao {

    protected List<ParametrizacaoCentroDeCustoSolicitacaoRef> parametrizacaoCentroDeCustoSolicitacaoRef;

    /**
     * Gets the value of the parametrizacaoCentroDeCustoSolicitacaoRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parametrizacaoCentroDeCustoSolicitacaoRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametrizacaoCentroDeCustoSolicitacaoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametrizacaoCentroDeCustoSolicitacaoRef }
     * 
     * 
     */
    public List<ParametrizacaoCentroDeCustoSolicitacaoRef> getParametrizacaoCentroDeCustoSolicitacaoRef() {
        if (parametrizacaoCentroDeCustoSolicitacaoRef == null) {
            parametrizacaoCentroDeCustoSolicitacaoRef = new ArrayList<ParametrizacaoCentroDeCustoSolicitacaoRef>();
        }
        return this.parametrizacaoCentroDeCustoSolicitacaoRef;
    }

}
