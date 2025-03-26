
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pedidoAereo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pedidoAereo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aeroportoOrigem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aeroportoDestino" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataPartida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tarifaCombinada" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="bagagem" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedidoAereo", propOrder = {
    "aeroportoOrigem",
    "aeroportoDestino",
    "dataPartida",
    "tarifaCombinada",
    "bagagem"
})
public class PedidoAereo {

    @XmlElement(required = true)
    protected String aeroportoOrigem;
    @XmlElement(required = true)
    protected String aeroportoDestino;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPartida;
    protected boolean tarifaCombinada;
    protected boolean bagagem;

    /**
     * Obtém o valor da propriedade aeroportoOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    /**
     * Define o valor da propriedade aeroportoOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAeroportoOrigem(String value) {
        this.aeroportoOrigem = value;
    }

    /**
     * Obtém o valor da propriedade aeroportoDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAeroportoDestino() {
        return aeroportoDestino;
    }

    /**
     * Define o valor da propriedade aeroportoDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAeroportoDestino(String value) {
        this.aeroportoDestino = value;
    }

    /**
     * Obtém o valor da propriedade dataPartida.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPartida() {
        return dataPartida;
    }

    /**
     * Define o valor da propriedade dataPartida.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPartida(XMLGregorianCalendar value) {
        this.dataPartida = value;
    }

    /**
     * Obtém o valor da propriedade tarifaCombinada.
     * 
     */
    public boolean isTarifaCombinada() {
        return tarifaCombinada;
    }

    /**
     * Define o valor da propriedade tarifaCombinada.
     * 
     */
    public void setTarifaCombinada(boolean value) {
        this.tarifaCombinada = value;
    }

    /**
     * Obtém o valor da propriedade bagagem.
     * 
     */
    public boolean isBagagem() {
        return bagagem;
    }

    /**
     * Define o valor da propriedade bagagem.
     * 
     */
    public void setBagagem(boolean value) {
        this.bagagem = value;
    }

}
