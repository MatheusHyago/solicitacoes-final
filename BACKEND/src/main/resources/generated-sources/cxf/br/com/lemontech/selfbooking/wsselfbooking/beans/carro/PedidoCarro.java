
package br.com.lemontech.selfbooking.wsselfbooking.beans.carro;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pedidoCarro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pedidoCarro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cidadeRetirada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estadoRetirada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cidadeDevolucao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estadoDevolucao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataRetirada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataDevolucao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nomeLocadora" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="modeloPreferencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedidoCarro", propOrder = {
    "cidadeRetirada",
    "estadoRetirada",
    "cidadeDevolucao",
    "estadoDevolucao",
    "dataRetirada",
    "dataDevolucao",
    "pais",
    "nomeLocadora",
    "modeloPreferencia"
})
public class PedidoCarro {

    @XmlElement(required = true)
    protected String cidadeRetirada;
    @XmlElement(required = true)
    protected String estadoRetirada;
    @XmlElement(required = true)
    protected String cidadeDevolucao;
    @XmlElement(required = true)
    protected String estadoDevolucao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataRetirada;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDevolucao;
    @XmlElement(required = true)
    protected String pais;
    @XmlElement(required = true)
    protected String nomeLocadora;
    @XmlElement(required = true)
    protected String modeloPreferencia;

    /**
     * Obtém o valor da propriedade cidadeRetirada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeRetirada() {
        return cidadeRetirada;
    }

    /**
     * Define o valor da propriedade cidadeRetirada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeRetirada(String value) {
        this.cidadeRetirada = value;
    }

    /**
     * Obtém o valor da propriedade estadoRetirada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoRetirada() {
        return estadoRetirada;
    }

    /**
     * Define o valor da propriedade estadoRetirada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoRetirada(String value) {
        this.estadoRetirada = value;
    }

    /**
     * Obtém o valor da propriedade cidadeDevolucao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeDevolucao() {
        return cidadeDevolucao;
    }

    /**
     * Define o valor da propriedade cidadeDevolucao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeDevolucao(String value) {
        this.cidadeDevolucao = value;
    }

    /**
     * Obtém o valor da propriedade estadoDevolucao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoDevolucao() {
        return estadoDevolucao;
    }

    /**
     * Define o valor da propriedade estadoDevolucao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoDevolucao(String value) {
        this.estadoDevolucao = value;
    }

    /**
     * Obtém o valor da propriedade dataRetirada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRetirada() {
        return dataRetirada;
    }

    /**
     * Define o valor da propriedade dataRetirada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRetirada(XMLGregorianCalendar value) {
        this.dataRetirada = value;
    }

    /**
     * Obtém o valor da propriedade dataDevolucao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * Define o valor da propriedade dataDevolucao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDevolucao(XMLGregorianCalendar value) {
        this.dataDevolucao = value;
    }

    /**
     * Obtém o valor da propriedade pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define o valor da propriedade pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtém o valor da propriedade nomeLocadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeLocadora() {
        return nomeLocadora;
    }

    /**
     * Define o valor da propriedade nomeLocadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeLocadora(String value) {
        this.nomeLocadora = value;
    }

    /**
     * Obtém o valor da propriedade modeloPreferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeloPreferencia() {
        return modeloPreferencia;
    }

    /**
     * Define o valor da propriedade modeloPreferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeloPreferencia(String value) {
        this.modeloPreferencia = value;
    }

}
