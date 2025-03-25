
package com.testelemontech.solicitacoes.wsdl;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tarifarioFornecedorRodoviario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tarifarioFornecedorRodoviario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorRodoviarioRef"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vencimento" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="descricao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento255" minOccurs="0"/&gt;
 *         &lt;element name="tarifa" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}positiveDouble"/&gt;
 *         &lt;element name="taxa" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}positiveDouble"/&gt;
 *         &lt;element name="seguro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}positiveDouble"/&gt;
 *         &lt;element name="moeda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda"/&gt;
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tarifarioFornecedorRodoviario", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", propOrder = {
    "vencimento",
    "descricao",
    "tarifa",
    "taxa",
    "seguro",
    "moeda",
    "ativo"
})
public class TarifarioFornecedorRodoviario
    extends TarifarioFornecedorRodoviarioRef
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vencimento;
    protected String descricao;
    protected double tarifa;
    protected double taxa;
    protected double seguro;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Moeda moeda;
    protected boolean ativo;

    /**
     * Obtém o valor da propriedade vencimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVencimento() {
        return vencimento;
    }

    /**
     * Define o valor da propriedade vencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVencimento(XMLGregorianCalendar value) {
        this.vencimento = value;
    }

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
     * Obtém o valor da propriedade tarifa.
     * 
     */
    public double getTarifa() {
        return tarifa;
    }

    /**
     * Define o valor da propriedade tarifa.
     * 
     */
    public void setTarifa(double value) {
        this.tarifa = value;
    }

    /**
     * Obtém o valor da propriedade taxa.
     * 
     */
    public double getTaxa() {
        return taxa;
    }

    /**
     * Define o valor da propriedade taxa.
     * 
     */
    public void setTaxa(double value) {
        this.taxa = value;
    }

    /**
     * Obtém o valor da propriedade seguro.
     * 
     */
    public double getSeguro() {
        return seguro;
    }

    /**
     * Define o valor da propriedade seguro.
     * 
     */
    public void setSeguro(double value) {
        this.seguro = value;
    }

    /**
     * Obtém o valor da propriedade moeda.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoeda() {
        return moeda;
    }

    /**
     * Define o valor da propriedade moeda.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoeda(Moeda value) {
        this.moeda = value;
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

}
