
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de reprovarSolicitacaoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="reprovarSolicitacaoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idSolicitacaoRef" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="aprovador" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/&gt;
 *         &lt;element name="justificativa"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="controleCliente"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reprovarSolicitacaoRequest", propOrder = {
    "idSolicitacaoRef",
    "aprovador",
    "justificativa",
    "controleCliente"
})
public class ReprovarSolicitacaoRequest {

    protected int idSolicitacaoRef;
    @XmlElement(required = true)
    protected FuncionarioRef aprovador;
    @XmlElement(required = true)
    protected String justificativa;
    @XmlElement(required = true)
    protected String controleCliente;

    /**
     * Obtém o valor da propriedade idSolicitacaoRef.
     * 
     */
    public int getIdSolicitacaoRef() {
        return idSolicitacaoRef;
    }

    /**
     * Define o valor da propriedade idSolicitacaoRef.
     * 
     */
    public void setIdSolicitacaoRef(int value) {
        this.idSolicitacaoRef = value;
    }

    /**
     * Obtém o valor da propriedade aprovador.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getAprovador() {
        return aprovador;
    }

    /**
     * Define o valor da propriedade aprovador.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setAprovador(FuncionarioRef value) {
        this.aprovador = value;
    }

    /**
     * Obtém o valor da propriedade justificativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativa() {
        return justificativa;
    }

    /**
     * Define o valor da propriedade justificativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativa(String value) {
        this.justificativa = value;
    }

    /**
     * Obtém o valor da propriedade controleCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControleCliente() {
        return controleCliente;
    }

    /**
     * Define o valor da propriedade controleCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControleCliente(String value) {
        this.controleCliente = value;
    }

}
