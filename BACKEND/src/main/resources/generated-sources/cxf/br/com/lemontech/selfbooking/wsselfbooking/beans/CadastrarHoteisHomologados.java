
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarHoteisHomologados complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarHoteisHomologados"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificadorBackOffice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hotelHomologado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="vencimentoHomologacao" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarHoteisHomologados", propOrder = {
    "identificadorBackOffice",
    "hotelHomologado",
    "vencimentoHomologacao"
})
public class CadastrarHoteisHomologados {

    @XmlElement(required = true)
    protected String identificadorBackOffice;
    protected boolean hotelHomologado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vencimentoHomologacao;

    /**
     * Obtém o valor da propriedade identificadorBackOffice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackOffice() {
        return identificadorBackOffice;
    }

    /**
     * Define o valor da propriedade identificadorBackOffice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackOffice(String value) {
        this.identificadorBackOffice = value;
    }

    /**
     * Obtém o valor da propriedade hotelHomologado.
     * 
     */
    public boolean isHotelHomologado() {
        return hotelHomologado;
    }

    /**
     * Define o valor da propriedade hotelHomologado.
     * 
     */
    public void setHotelHomologado(boolean value) {
        this.hotelHomologado = value;
    }

    /**
     * Obtém o valor da propriedade vencimentoHomologacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVencimentoHomologacao() {
        return vencimentoHomologacao;
    }

    /**
     * Define o valor da propriedade vencimentoHomologacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVencimentoHomologacao(XMLGregorianCalendar value) {
        this.vencimentoHomologacao = value;
    }

}
