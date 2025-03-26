
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de logDeAcesso complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="logDeAcesso"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idLogAcesso" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dataAcesso" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ipOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numCPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoPessoa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nonBancoDados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoTipoAplicacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logDeAcesso", propOrder = {
    "idLogAcesso",
    "idUsuario",
    "dataAcesso",
    "ipOrigem",
    "numCPF",
    "codigoPessoa",
    "nonBancoDados",
    "codigoTipoAplicacao"
})
public class LogDeAcesso {

    protected int idLogAcesso;
    protected int idUsuario;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataAcesso;
    protected String ipOrigem;
    protected String numCPF;
    protected String codigoPessoa;
    protected String nonBancoDados;
    protected String codigoTipoAplicacao;

    /**
     * Obtém o valor da propriedade idLogAcesso.
     * 
     */
    public int getIdLogAcesso() {
        return idLogAcesso;
    }

    /**
     * Define o valor da propriedade idLogAcesso.
     * 
     */
    public void setIdLogAcesso(int value) {
        this.idLogAcesso = value;
    }

    /**
     * Obtém o valor da propriedade idUsuario.
     * 
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define o valor da propriedade idUsuario.
     * 
     */
    public void setIdUsuario(int value) {
        this.idUsuario = value;
    }

    /**
     * Obtém o valor da propriedade dataAcesso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAcesso() {
        return dataAcesso;
    }

    /**
     * Define o valor da propriedade dataAcesso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAcesso(XMLGregorianCalendar value) {
        this.dataAcesso = value;
    }

    /**
     * Obtém o valor da propriedade ipOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpOrigem() {
        return ipOrigem;
    }

    /**
     * Define o valor da propriedade ipOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpOrigem(String value) {
        this.ipOrigem = value;
    }

    /**
     * Obtém o valor da propriedade numCPF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCPF() {
        return numCPF;
    }

    /**
     * Define o valor da propriedade numCPF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCPF(String value) {
        this.numCPF = value;
    }

    /**
     * Obtém o valor da propriedade codigoPessoa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPessoa() {
        return codigoPessoa;
    }

    /**
     * Define o valor da propriedade codigoPessoa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPessoa(String value) {
        this.codigoPessoa = value;
    }

    /**
     * Obtém o valor da propriedade nonBancoDados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonBancoDados() {
        return nonBancoDados;
    }

    /**
     * Define o valor da propriedade nonBancoDados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonBancoDados(String value) {
        this.nonBancoDados = value;
    }

    /**
     * Obtém o valor da propriedade codigoTipoAplicacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoAplicacao() {
        return codigoTipoAplicacao;
    }

    /**
     * Define o valor da propriedade codigoTipoAplicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoAplicacao(String value) {
        this.codigoTipoAplicacao = value;
    }

}
