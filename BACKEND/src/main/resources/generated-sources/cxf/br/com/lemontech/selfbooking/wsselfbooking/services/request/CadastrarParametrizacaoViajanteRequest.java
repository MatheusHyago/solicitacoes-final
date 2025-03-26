
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacao;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarParametrizacaoViajanteRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarParametrizacaoViajanteRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parametrizacaoViajanteAprovacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoViajanteAprovacao"/&gt;
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
@XmlType(name = "cadastrarParametrizacaoViajanteRequest", propOrder = {
    "parametrizacaoViajanteAprovacao",
    "idCliente"
})
public class CadastrarParametrizacaoViajanteRequest {

    @XmlElement(required = true)
    protected ParametrizacaoViajanteAprovacao parametrizacaoViajanteAprovacao;
    protected Integer idCliente;

    /**
     * Obtém o valor da propriedade parametrizacaoViajanteAprovacao.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoViajanteAprovacao }
     *     
     */
    public ParametrizacaoViajanteAprovacao getParametrizacaoViajanteAprovacao() {
        return parametrizacaoViajanteAprovacao;
    }

    /**
     * Define o valor da propriedade parametrizacaoViajanteAprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoViajanteAprovacao }
     *     
     */
    public void setParametrizacaoViajanteAprovacao(ParametrizacaoViajanteAprovacao value) {
        this.parametrizacaoViajanteAprovacao = value;
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
