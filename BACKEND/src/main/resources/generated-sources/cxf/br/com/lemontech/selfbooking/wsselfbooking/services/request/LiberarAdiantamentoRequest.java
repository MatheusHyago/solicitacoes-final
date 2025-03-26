
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de liberarAdiantamentoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="liberarAdiantamentoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idSolicitacao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idAdiantamento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="funcionarioLiberacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/&gt;
 *         &lt;element name="dataPagamento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="numeroAutorizacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento50" minOccurs="0"/&gt;
 *         &lt;element name="observacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "liberarAdiantamentoRequest", propOrder = {
    "version",
    "idSolicitacao",
    "idAdiantamento",
    "status",
    "funcionarioLiberacao",
    "dataPagamento",
    "numeroAutorizacao",
    "observacao"
})
public class LiberarAdiantamentoRequest {

    protected String version;
    protected int idSolicitacao;
    protected int idAdiantamento;
    protected boolean status;
    @XmlElement(required = true)
    protected FuncionarioRef funcionarioLiberacao;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataPagamento;
    protected String numeroAutorizacao;
    protected String observacao;

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
     * Obtém o valor da propriedade idAdiantamento.
     * 
     */
    public int getIdAdiantamento() {
        return idAdiantamento;
    }

    /**
     * Define o valor da propriedade idAdiantamento.
     * 
     */
    public void setIdAdiantamento(int value) {
        this.idAdiantamento = value;
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
     * Obtém o valor da propriedade funcionarioLiberacao.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getFuncionarioLiberacao() {
        return funcionarioLiberacao;
    }

    /**
     * Define o valor da propriedade funcionarioLiberacao.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setFuncionarioLiberacao(FuncionarioRef value) {
        this.funcionarioLiberacao = value;
    }

    /**
     * Obtém o valor da propriedade dataPagamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPagamento() {
        return dataPagamento;
    }

    /**
     * Define o valor da propriedade dataPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPagamento(XMLGregorianCalendar value) {
        this.dataPagamento = value;
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
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

}
