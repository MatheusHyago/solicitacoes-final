
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de contabilizarRelatorioDespesasRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="contabilizarRelatorioDespesasRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idSolicitacao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idRelatorioDespesas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dataContabilizacao" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="numeroAutorizacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento50" minOccurs="0"/&gt;
 *         &lt;element name="observacaoContabilizacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contabilizarRelatorioDespesasRequest", propOrder = {
    "version",
    "idSolicitacao",
    "idRelatorioDespesas",
    "dataContabilizacao",
    "status",
    "numeroAutorizacao",
    "observacaoContabilizacao"
})
public class ContabilizarRelatorioDespesasRequest {

    protected String version;
    protected int idSolicitacao;
    protected int idRelatorioDespesas;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataContabilizacao;
    protected boolean status;
    protected String numeroAutorizacao;
    protected String observacaoContabilizacao;

    /**
     * Obtém o valor da propriedade version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define o valor da propriedade version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtém o valor da propriedade idSolicitacao.
     * 
     */
    public int getIdSolicitacao() {
        return idSolicitacao;
    }

    /**
     * Define o valor da propriedade idSolicitacao.
     * 
     */
    public void setIdSolicitacao(int value) {
        this.idSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade idRelatorioDespesas.
     * 
     */
    public int getIdRelatorioDespesas() {
        return idRelatorioDespesas;
    }

    /**
     * Define o valor da propriedade idRelatorioDespesas.
     * 
     */
    public void setIdRelatorioDespesas(int value) {
        this.idRelatorioDespesas = value;
    }

    /**
     * Obtém o valor da propriedade dataContabilizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataContabilizacao() {
        return dataContabilizacao;
    }

    /**
     * Define o valor da propriedade dataContabilizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataContabilizacao(XMLGregorianCalendar value) {
        this.dataContabilizacao = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade numeroAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAutorizacao() {
        return numeroAutorizacao;
    }

    /**
     * Define o valor da propriedade numeroAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAutorizacao(String value) {
        this.numeroAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade observacaoContabilizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoContabilizacao() {
        return observacaoContabilizacao;
    }

    /**
     * Define o valor da propriedade observacaoContabilizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoContabilizacao(String value) {
        this.observacaoContabilizacao = value;
    }

}
