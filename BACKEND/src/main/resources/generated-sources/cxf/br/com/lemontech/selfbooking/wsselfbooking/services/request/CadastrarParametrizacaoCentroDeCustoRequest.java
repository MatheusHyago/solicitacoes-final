
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoDebito;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacao;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarParametrizacaoCentroDeCustoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarParametrizacaoCentroDeCustoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="parametrizacaoCentroDeCustoAprovacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoAprovacao"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="parametrizacaoCentroDeCustoSolicitacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoSolicitacao"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="parametrizacaoCentroDeCustoDebito" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoDebito"/&gt;
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
@XmlType(name = "cadastrarParametrizacaoCentroDeCustoRequest", propOrder = {
    "parametrizacaoCentroDeCustoAprovacao",
    "parametrizacaoCentroDeCustoSolicitacao",
    "parametrizacaoCentroDeCustoDebito",
    "idCliente"
})
public class CadastrarParametrizacaoCentroDeCustoRequest {

    protected ParametrizacaoCentroDeCustoAprovacao parametrizacaoCentroDeCustoAprovacao;
    protected ParametrizacaoCentroDeCustoSolicitacao parametrizacaoCentroDeCustoSolicitacao;
    protected ParametrizacaoCentroDeCustoDebito parametrizacaoCentroDeCustoDebito;
    protected Integer idCliente;

    /**
     * Obtém o valor da propriedade parametrizacaoCentroDeCustoAprovacao.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoCentroDeCustoAprovacao }
     *     
     */
    public ParametrizacaoCentroDeCustoAprovacao getParametrizacaoCentroDeCustoAprovacao() {
        return parametrizacaoCentroDeCustoAprovacao;
    }

    /**
     * Define o valor da propriedade parametrizacaoCentroDeCustoAprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoCentroDeCustoAprovacao }
     *     
     */
    public void setParametrizacaoCentroDeCustoAprovacao(ParametrizacaoCentroDeCustoAprovacao value) {
        this.parametrizacaoCentroDeCustoAprovacao = value;
    }

    /**
     * Obtém o valor da propriedade parametrizacaoCentroDeCustoSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoCentroDeCustoSolicitacao }
     *     
     */
    public ParametrizacaoCentroDeCustoSolicitacao getParametrizacaoCentroDeCustoSolicitacao() {
        return parametrizacaoCentroDeCustoSolicitacao;
    }

    /**
     * Define o valor da propriedade parametrizacaoCentroDeCustoSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoCentroDeCustoSolicitacao }
     *     
     */
    public void setParametrizacaoCentroDeCustoSolicitacao(ParametrizacaoCentroDeCustoSolicitacao value) {
        this.parametrizacaoCentroDeCustoSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade parametrizacaoCentroDeCustoDebito.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoCentroDeCustoDebito }
     *     
     */
    public ParametrizacaoCentroDeCustoDebito getParametrizacaoCentroDeCustoDebito() {
        return parametrizacaoCentroDeCustoDebito;
    }

    /**
     * Define o valor da propriedade parametrizacaoCentroDeCustoDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoCentroDeCustoDebito }
     *     
     */
    public void setParametrizacaoCentroDeCustoDebito(ParametrizacaoCentroDeCustoDebito value) {
        this.parametrizacaoCentroDeCustoDebito = value;
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
