
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.StatusAprovacaoConciliacao;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pesquisarConciliacaoCartaoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pesquisarConciliacaoCartaoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroProtocolo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dataVencimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="codRegional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusAprovacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}statusAprovacaoConciliacao" minOccurs="0"/&gt;
 *         &lt;element name="registroInicial"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="quantidadeRegistros" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;maxInclusive value="50"/&gt;
 *               &lt;minInclusive value="1"/&gt;
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
@XmlType(name = "pesquisarConciliacaoCartaoRequest", propOrder = {
    "numeroProtocolo",
    "dataVencimento",
    "codRegional",
    "statusAprovacao",
    "registroInicial",
    "quantidadeRegistros"
})
public class PesquisarConciliacaoCartaoRequest {

    protected Integer numeroProtocolo;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataVencimento;
    protected String codRegional;
    @XmlSchemaType(name = "string")
    protected StatusAprovacaoConciliacao statusAprovacao;
    protected int registroInicial;
    @XmlElement(defaultValue = "50")
    protected Integer quantidadeRegistros;

    /**
     * Obtém o valor da propriedade numeroProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Define o valor da propriedade numeroProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroProtocolo(Integer value) {
        this.numeroProtocolo = value;
    }

    /**
     * Obtém o valor da propriedade dataVencimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Define o valor da propriedade dataVencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVencimento(XMLGregorianCalendar value) {
        this.dataVencimento = value;
    }

    /**
     * Obtém o valor da propriedade codRegional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRegional() {
        return codRegional;
    }

    /**
     * Define o valor da propriedade codRegional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRegional(String value) {
        this.codRegional = value;
    }

    /**
     * Obtém o valor da propriedade statusAprovacao.
     * 
     * @return
     *     possible object is
     *     {@link StatusAprovacaoConciliacao }
     *     
     */
    public StatusAprovacaoConciliacao getStatusAprovacao() {
        return statusAprovacao;
    }

    /**
     * Define o valor da propriedade statusAprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusAprovacaoConciliacao }
     *     
     */
    public void setStatusAprovacao(StatusAprovacaoConciliacao value) {
        this.statusAprovacao = value;
    }

    /**
     * Obtém o valor da propriedade registroInicial.
     * 
     */
    public int getRegistroInicial() {
        return registroInicial;
    }

    /**
     * Define o valor da propriedade registroInicial.
     * 
     */
    public void setRegistroInicial(int value) {
        this.registroInicial = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeRegistros.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadeRegistros() {
        return quantidadeRegistros;
    }

    /**
     * Define o valor da propriedade quantidadeRegistros.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadeRegistros(Integer value) {
        this.quantidadeRegistros = value;
    }

}
