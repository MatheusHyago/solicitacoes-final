
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import java.util.ArrayList;
import java.util.List;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Classe;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de aereoTarifa complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="aereoTarifa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acordo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classe" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}classe" minOccurs="0"/&gt;
 *         &lt;element name="aereoTarifaPax" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}aereoTarifaPax" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="familiaTarifaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "aereoTarifa", propOrder = {
    "acordo",
    "classe",
    "aereoTarifaPax",
    "familiaTarifaria",
    "bagagem"
})
public class AereoTarifa {

    protected String acordo;
    @XmlSchemaType(name = "string")
    protected Classe classe;
    @XmlElement(nillable = true)
    protected List<AereoTarifaPax> aereoTarifaPax;
    protected String familiaTarifaria;
    protected boolean bagagem;

    /**
     * Obtém o valor da propriedade acordo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcordo() {
        return acordo;
    }

    /**
     * Define o valor da propriedade acordo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcordo(String value) {
        this.acordo = value;
    }

    /**
     * Obtém o valor da propriedade classe.
     * 
     * @return
     *     possible object is
     *     {@link Classe }
     *     
     */
    public Classe getClasse() {
        return classe;
    }

    /**
     * Define o valor da propriedade classe.
     * 
     * @param value
     *     allowed object is
     *     {@link Classe }
     *     
     */
    public void setClasse(Classe value) {
        this.classe = value;
    }

    /**
     * Gets the value of the aereoTarifaPax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the aereoTarifaPax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAereoTarifaPax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AereoTarifaPax }
     * 
     * 
     */
    public List<AereoTarifaPax> getAereoTarifaPax() {
        if (aereoTarifaPax == null) {
            aereoTarifaPax = new ArrayList<AereoTarifaPax>();
        }
        return this.aereoTarifaPax;
    }

    /**
     * Obtém o valor da propriedade familiaTarifaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamiliaTarifaria() {
        return familiaTarifaria;
    }

    /**
     * Define o valor da propriedade familiaTarifaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamiliaTarifaria(String value) {
        this.familiaTarifaria = value;
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
