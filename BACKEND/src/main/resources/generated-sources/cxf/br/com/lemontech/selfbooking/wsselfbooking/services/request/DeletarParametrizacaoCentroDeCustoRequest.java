
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacaoRef;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoDebitoRef;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacaoRef;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de deletarParametrizacaoCentroDeCustoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="deletarParametrizacaoCentroDeCustoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="parametrizacaoCentroDeCustoAprovacaoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoAprovacaoRef"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="parametrizacaoCentroDeCustoSolicitacaoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoSolicitacaoRef"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="parametrizacaoCentroDeCustoDebitoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoDebitoRef"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletarParametrizacaoCentroDeCustoRequest", propOrder = {
    "parametrizacaoCentroDeCustoAprovacaoRef",
    "parametrizacaoCentroDeCustoSolicitacaoRef",
    "parametrizacaoCentroDeCustoDebitoRef",
    "idCliente"
})
public class DeletarParametrizacaoCentroDeCustoRequest {

    protected ParametrizacaoCentroDeCustoAprovacaoRef parametrizacaoCentroDeCustoAprovacaoRef;
    protected ParametrizacaoCentroDeCustoSolicitacaoRef parametrizacaoCentroDeCustoSolicitacaoRef;
    protected ParametrizacaoCentroDeCustoDebitoRef parametrizacaoCentroDeCustoDebitoRef;
    protected Integer idCliente;

    /**
     * Obtém o valor da propriedade parametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoCentroDeCustoAprovacaoRef }
     *     
     */
    public ParametrizacaoCentroDeCustoAprovacaoRef getParametrizacaoCentroDeCustoAprovacaoRef() {
        return parametrizacaoCentroDeCustoAprovacaoRef;
    }

    /**
     * Define o valor da propriedade parametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoCentroDeCustoAprovacaoRef }
     *     
     */
    public void setParametrizacaoCentroDeCustoAprovacaoRef(ParametrizacaoCentroDeCustoAprovacaoRef value) {
        this.parametrizacaoCentroDeCustoAprovacaoRef = value;
    }

    /**
     * Obtém o valor da propriedade parametrizacaoCentroDeCustoSolicitacaoRef.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoCentroDeCustoSolicitacaoRef }
     *     
     */
    public ParametrizacaoCentroDeCustoSolicitacaoRef getParametrizacaoCentroDeCustoSolicitacaoRef() {
        return parametrizacaoCentroDeCustoSolicitacaoRef;
    }

    /**
     * Define o valor da propriedade parametrizacaoCentroDeCustoSolicitacaoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoCentroDeCustoSolicitacaoRef }
     *     
     */
    public void setParametrizacaoCentroDeCustoSolicitacaoRef(ParametrizacaoCentroDeCustoSolicitacaoRef value) {
        this.parametrizacaoCentroDeCustoSolicitacaoRef = value;
    }

    /**
     * Obtém o valor da propriedade parametrizacaoCentroDeCustoDebitoRef.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoCentroDeCustoDebitoRef }
     *     
     */
    public ParametrizacaoCentroDeCustoDebitoRef getParametrizacaoCentroDeCustoDebitoRef() {
        return parametrizacaoCentroDeCustoDebitoRef;
    }

    /**
     * Define o valor da propriedade parametrizacaoCentroDeCustoDebitoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoCentroDeCustoDebitoRef }
     *     
     */
    public void setParametrizacaoCentroDeCustoDebitoRef(ParametrizacaoCentroDeCustoDebitoRef value) {
        this.parametrizacaoCentroDeCustoDebitoRef = value;
    }

    /**
     * Obtém o valor da propriedade idCliente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * Define o valor da propriedade idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCliente(Integer value) {
        this.idCliente = value;
    }

}
