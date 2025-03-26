
package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de expense complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="expense"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adiantamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}adiantamento" minOccurs="0"/&gt;
 *         &lt;element name="prestacaoContas" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}prestacaoContas" minOccurs="0"/&gt;
 *         &lt;element name="produto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expense", propOrder = {
    "adiantamento",
    "prestacaoContas",
    "produto"
})
public class Expense {

    protected Adiantamento adiantamento;
    protected PrestacaoContas prestacaoContas;
    protected String produto;

    /**
     * Obtém o valor da propriedade adiantamento.
     * 
     * @return
     *     possible object is
     *     {@link Adiantamento }
     *     
     */
    public Adiantamento getAdiantamento() {
        return adiantamento;
    }

    /**
     * Define o valor da propriedade adiantamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Adiantamento }
     *     
     */
    public void setAdiantamento(Adiantamento value) {
        this.adiantamento = value;
    }

    /**
     * Obtém o valor da propriedade prestacaoContas.
     * 
     * @return
     *     possible object is
     *     {@link PrestacaoContas }
     *     
     */
    public PrestacaoContas getPrestacaoContas() {
        return prestacaoContas;
    }

    /**
     * Define o valor da propriedade prestacaoContas.
     * 
     * @param value
     *     allowed object is
     *     {@link PrestacaoContas }
     *     
     */
    public void setPrestacaoContas(PrestacaoContas value) {
        this.prestacaoContas = value;
    }

    /**
     * Obtém o valor da propriedade produto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduto() {
        return produto;
    }

    /**
     * Define o valor da propriedade produto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduto(String value) {
        this.produto = value;
    }

}
