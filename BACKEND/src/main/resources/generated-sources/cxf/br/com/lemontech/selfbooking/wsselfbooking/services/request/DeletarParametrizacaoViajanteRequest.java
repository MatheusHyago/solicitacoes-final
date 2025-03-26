
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacaoDeletarTodosRef;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacaoRef;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de deletarParametrizacaoViajanteRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="deletarParametrizacaoViajanteRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="parametrizacaoViajanteAprovacaoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoViajanteAprovacaoRef"/&gt;
 *           &lt;element name="parametrizacaoViajanteAprovacaoDeletarTodosRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoViajanteAprovacaoDeletarTodosRef"/&gt;
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
@XmlType(name = "deletarParametrizacaoViajanteRequest", propOrder = {
    "parametrizacaoViajanteAprovacaoRef",
    "parametrizacaoViajanteAprovacaoDeletarTodosRef",
    "idCliente"
})
public class DeletarParametrizacaoViajanteRequest {

    protected ParametrizacaoViajanteAprovacaoRef parametrizacaoViajanteAprovacaoRef;
    protected ParametrizacaoViajanteAprovacaoDeletarTodosRef parametrizacaoViajanteAprovacaoDeletarTodosRef;
    protected Integer idCliente;

    /**
     * Obtém o valor da propriedade parametrizacaoViajanteAprovacaoRef.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoViajanteAprovacaoRef }
     *     
     */
    public ParametrizacaoViajanteAprovacaoRef getParametrizacaoViajanteAprovacaoRef() {
        return parametrizacaoViajanteAprovacaoRef;
    }

    /**
     * Define o valor da propriedade parametrizacaoViajanteAprovacaoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoViajanteAprovacaoRef }
     *     
     */
    public void setParametrizacaoViajanteAprovacaoRef(ParametrizacaoViajanteAprovacaoRef value) {
        this.parametrizacaoViajanteAprovacaoRef = value;
    }

    /**
     * Obtém o valor da propriedade parametrizacaoViajanteAprovacaoDeletarTodosRef.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoViajanteAprovacaoDeletarTodosRef }
     *     
     */
    public ParametrizacaoViajanteAprovacaoDeletarTodosRef getParametrizacaoViajanteAprovacaoDeletarTodosRef() {
        return parametrizacaoViajanteAprovacaoDeletarTodosRef;
    }

    /**
     * Define o valor da propriedade parametrizacaoViajanteAprovacaoDeletarTodosRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoViajanteAprovacaoDeletarTodosRef }
     *     
     */
    public void setParametrizacaoViajanteAprovacaoDeletarTodosRef(ParametrizacaoViajanteAprovacaoDeletarTodosRef value) {
        this.parametrizacaoViajanteAprovacaoDeletarTodosRef = value;
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
