
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import br.com.lemontech.selfbooking.wsselfbooking.beans.types.ModalidadeLancamentoBudget;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoOperacaoBudget;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de budget complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="budget"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="regionalRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}regionalRef"/&gt;
 *           &lt;element name="centroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}centroDeCustoRef"/&gt;
 *           &lt;element name="subCentroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}subCentroDeCustoRef"/&gt;
 *           &lt;element name="projetoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}projetoRef"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="modalidadeLancamentoBudget" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}modalidadeLancamentoBudget"/&gt;
 *         &lt;element name="tipoOperacaoBudget" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoOperacaoBudget"/&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "budget", propOrder = {
    "regionalRef",
    "centroDeCustoRef",
    "subCentroDeCustoRef",
    "projetoRef",
    "modalidadeLancamentoBudget",
    "tipoOperacaoBudget",
    "valor"
})
public class Budget {

    protected RegionalRef regionalRef;
    protected CentroDeCustoRef centroDeCustoRef;
    protected SubCentroDeCustoRef subCentroDeCustoRef;
    protected ProjetoRef projetoRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ModalidadeLancamentoBudget modalidadeLancamentoBudget;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoOperacaoBudget tipoOperacaoBudget;
    protected double valor;

    /**
     * Obtém o valor da propriedade regionalRef.
     * 
     * @return
     *     possible object is
     *     {@link RegionalRef }
     *     
     */
    public RegionalRef getRegionalRef() {
        return regionalRef;
    }

    /**
     * Define o valor da propriedade regionalRef.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalRef }
     *     
     */
    public void setRegionalRef(RegionalRef value) {
        this.regionalRef = value;
    }

    /**
     * Obtém o valor da propriedade centroDeCustoRef.
     * 
     * @return
     *     possible object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public CentroDeCustoRef getCentroDeCustoRef() {
        return centroDeCustoRef;
    }

    /**
     * Define o valor da propriedade centroDeCustoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public void setCentroDeCustoRef(CentroDeCustoRef value) {
        this.centroDeCustoRef = value;
    }

    /**
     * Obtém o valor da propriedade subCentroDeCustoRef.
     * 
     * @return
     *     possible object is
     *     {@link SubCentroDeCustoRef }
     *     
     */
    public SubCentroDeCustoRef getSubCentroDeCustoRef() {
        return subCentroDeCustoRef;
    }

    /**
     * Define o valor da propriedade subCentroDeCustoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SubCentroDeCustoRef }
     *     
     */
    public void setSubCentroDeCustoRef(SubCentroDeCustoRef value) {
        this.subCentroDeCustoRef = value;
    }

    /**
     * Obtém o valor da propriedade projetoRef.
     * 
     * @return
     *     possible object is
     *     {@link ProjetoRef }
     *     
     */
    public ProjetoRef getProjetoRef() {
        return projetoRef;
    }

    /**
     * Define o valor da propriedade projetoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjetoRef }
     *     
     */
    public void setProjetoRef(ProjetoRef value) {
        this.projetoRef = value;
    }

    /**
     * Obtém o valor da propriedade modalidadeLancamentoBudget.
     * 
     * @return
     *     possible object is
     *     {@link ModalidadeLancamentoBudget }
     *     
     */
    public ModalidadeLancamentoBudget getModalidadeLancamentoBudget() {
        return modalidadeLancamentoBudget;
    }

    /**
     * Define o valor da propriedade modalidadeLancamentoBudget.
     * 
     * @param value
     *     allowed object is
     *     {@link ModalidadeLancamentoBudget }
     *     
     */
    public void setModalidadeLancamentoBudget(ModalidadeLancamentoBudget value) {
        this.modalidadeLancamentoBudget = value;
    }

    /**
     * Obtém o valor da propriedade tipoOperacaoBudget.
     * 
     * @return
     *     possible object is
     *     {@link TipoOperacaoBudget }
     *     
     */
    public TipoOperacaoBudget getTipoOperacaoBudget() {
        return tipoOperacaoBudget;
    }

    /**
     * Define o valor da propriedade tipoOperacaoBudget.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOperacaoBudget }
     *     
     */
    public void setTipoOperacaoBudget(TipoOperacaoBudget value) {
        this.tipoOperacaoBudget = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

}
