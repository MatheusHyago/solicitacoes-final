
package br.com.lemontech.selfbooking.wsselfbooking.beans.hotel;

import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.CategoriaApartamento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pedidoHotel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pedidoHotel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="checkIn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="checkOut" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tipoApartamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoApartamento" minOccurs="0"/&gt;
 *         &lt;element name="categoriaApartamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}categoriaApartamento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedidoHotel", propOrder = {
    "cidade",
    "estado",
    "pais",
    "checkIn",
    "checkOut",
    "tipoApartamento",
    "categoriaApartamento"
})
public class PedidoHotel {

    @XmlElement(required = true)
    protected String cidade;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(required = true)
    protected String pais;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkIn;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkOut;
    @XmlElement(defaultValue = "INDIVIDUAL")
    @XmlSchemaType(name = "string")
    protected TipoApartamento tipoApartamento;
    @XmlSchemaType(name = "string")
    protected CategoriaApartamento categoriaApartamento;

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define o valor da propriedade estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
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
     * Obtém o valor da propriedade checkIn.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckIn() {
        return checkIn;
    }

    /**
     * Define o valor da propriedade checkIn.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckIn(XMLGregorianCalendar value) {
        this.checkIn = value;
    }

    /**
     * Obtém o valor da propriedade checkOut.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckOut() {
        return checkOut;
    }

    /**
     * Define o valor da propriedade checkOut.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckOut(XMLGregorianCalendar value) {
        this.checkOut = value;
    }

    /**
     * Obtém o valor da propriedade tipoApartamento.
     * 
     * @return
     *     possible object is
     *     {@link TipoApartamento }
     *     
     */
    public TipoApartamento getTipoApartamento() {
        return tipoApartamento;
    }

    /**
     * Define o valor da propriedade tipoApartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoApartamento }
     *     
     */
    public void setTipoApartamento(TipoApartamento value) {
        this.tipoApartamento = value;
    }

    /**
     * Obtém o valor da propriedade categoriaApartamento.
     * 
     * @return
     *     possible object is
     *     {@link CategoriaApartamento }
     *     
     */
    public CategoriaApartamento getCategoriaApartamento() {
        return categoriaApartamento;
    }

    /**
     * Define o valor da propriedade categoriaApartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriaApartamento }
     *     
     */
    public void setCategoriaApartamento(CategoriaApartamento value) {
        this.categoriaApartamento = value;
    }

}
