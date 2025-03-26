
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de regional complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="regional"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}regionalRef"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descricao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100"/&gt;
 *         &lt;element name="pcc" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice" minOccurs="0"/&gt;
 *         &lt;element name="identificadorBackofficeCliente" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice" minOccurs="0"/&gt;
 *         &lt;element name="identificadorBackofficeFranquia" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice" minOccurs="0"/&gt;
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="taxaFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="corporateIdGol" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}corporateIdGol" minOccurs="0"/&gt;
 *         &lt;element name="numeroDk" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="numeroDkTreinamento" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="numeroDkEvento" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="emitirNotaFiscalEmNomeDoHospede" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="emitirNotaFiscalEmNomeDaRegional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="permiteAlterarAgencia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regional", propOrder = {
    "descricao",
    "pcc",
    "identificadorBackofficeCliente",
    "identificadorBackofficeFranquia",
    "ativo",
    "taxaFee",
    "corporateIdGol",
    "numeroDk",
    "numeroDkTreinamento",
    "numeroDkEvento",
    "emitirNotaFiscalEmNomeDoHospede",
    "emitirNotaFiscalEmNomeDaRegional",
    "permiteAlterarAgencia"
})
public class Regional
    extends RegionalRef
{

    @XmlElement(required = true)
    protected String descricao;
    protected String pcc;
    protected String identificadorBackofficeCliente;
    protected String identificadorBackofficeFranquia;
    protected boolean ativo;
    protected Double taxaFee;
    protected String corporateIdGol;
    protected String numeroDk;
    protected String numeroDkTreinamento;
    protected String numeroDkEvento;
    @XmlElement(defaultValue = "false")
    protected Boolean emitirNotaFiscalEmNomeDoHospede;
    @XmlElement(defaultValue = "false")
    protected Boolean emitirNotaFiscalEmNomeDaRegional;
    @XmlElement(defaultValue = "true")
    protected Boolean permiteAlterarAgencia;

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade pcc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcc() {
        return pcc;
    }

    /**
     * Define o valor da propriedade pcc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcc(String value) {
        this.pcc = value;
    }

    /**
     * Obtém o valor da propriedade identificadorBackofficeCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackofficeCliente() {
        return identificadorBackofficeCliente;
    }

    /**
     * Define o valor da propriedade identificadorBackofficeCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackofficeCliente(String value) {
        this.identificadorBackofficeCliente = value;
    }

    /**
     * Obtém o valor da propriedade identificadorBackofficeFranquia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackofficeFranquia() {
        return identificadorBackofficeFranquia;
    }

    /**
     * Define o valor da propriedade identificadorBackofficeFranquia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackofficeFranquia(String value) {
        this.identificadorBackofficeFranquia = value;
    }

    /**
     * Obtém o valor da propriedade ativo.
     * 
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Define o valor da propriedade ativo.
     * 
     */
    public void setAtivo(boolean value) {
        this.ativo = value;
    }

    /**
     * Obtém o valor da propriedade taxaFee.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaFee() {
        return taxaFee;
    }

    /**
     * Define o valor da propriedade taxaFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaFee(Double value) {
        this.taxaFee = value;
    }

    /**
     * Obtém o valor da propriedade corporateIdGol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateIdGol() {
        return corporateIdGol;
    }

    /**
     * Define o valor da propriedade corporateIdGol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateIdGol(String value) {
        this.corporateIdGol = value;
    }

    /**
     * Obtém o valor da propriedade numeroDk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDk() {
        return numeroDk;
    }

    /**
     * Define o valor da propriedade numeroDk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDk(String value) {
        this.numeroDk = value;
    }

    /**
     * Obtém o valor da propriedade numeroDkTreinamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDkTreinamento() {
        return numeroDkTreinamento;
    }

    /**
     * Define o valor da propriedade numeroDkTreinamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDkTreinamento(String value) {
        this.numeroDkTreinamento = value;
    }

    /**
     * Obtém o valor da propriedade numeroDkEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDkEvento() {
        return numeroDkEvento;
    }

    /**
     * Define o valor da propriedade numeroDkEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDkEvento(String value) {
        this.numeroDkEvento = value;
    }

    /**
     * Obtém o valor da propriedade emitirNotaFiscalEmNomeDoHospede.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmitirNotaFiscalEmNomeDoHospede() {
        return emitirNotaFiscalEmNomeDoHospede;
    }

    /**
     * Define o valor da propriedade emitirNotaFiscalEmNomeDoHospede.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmitirNotaFiscalEmNomeDoHospede(Boolean value) {
        this.emitirNotaFiscalEmNomeDoHospede = value;
    }

    /**
     * Obtém o valor da propriedade emitirNotaFiscalEmNomeDaRegional.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmitirNotaFiscalEmNomeDaRegional() {
        return emitirNotaFiscalEmNomeDaRegional;
    }

    /**
     * Define o valor da propriedade emitirNotaFiscalEmNomeDaRegional.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmitirNotaFiscalEmNomeDaRegional(Boolean value) {
        this.emitirNotaFiscalEmNomeDaRegional = value;
    }

    /**
     * Obtém o valor da propriedade permiteAlterarAgencia.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermiteAlterarAgencia() {
        return permiteAlterarAgencia;
    }

    /**
     * Define o valor da propriedade permiteAlterarAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermiteAlterarAgencia(Boolean value) {
        this.permiteAlterarAgencia = value;
    }

}
