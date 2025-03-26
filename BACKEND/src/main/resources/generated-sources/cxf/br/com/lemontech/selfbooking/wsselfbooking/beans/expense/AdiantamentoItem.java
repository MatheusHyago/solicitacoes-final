
package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de adiantamentoItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="adiantamentoItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoDespesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="moeda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda" minOccurs="0"/&gt;
 *         &lt;element name="codigoDespesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classificacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="moedaCambio" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda" minOccurs="0"/&gt;
 *         &lt;element name="valorMoedaCambio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalConvertido" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="complementoCombo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="complementoComboValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iof" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adiantamentoItem", propOrder = {
    "tipoDespesa",
    "valor",
    "moeda",
    "codigoDespesa",
    "classificacao",
    "id",
    "moedaCambio",
    "valorMoedaCambio",
    "totalConvertido",
    "complementoCombo",
    "complementoComboValor",
    "cidade",
    "horaInicial",
    "horaFinal",
    "iof"
})
public class AdiantamentoItem {

    protected String tipoDespesa;
    protected Double valor;
    @XmlSchemaType(name = "string")
    protected Moeda moeda;
    protected String codigoDespesa;
    protected String classificacao;
    protected int id;
    @XmlSchemaType(name = "string")
    protected Moeda moedaCambio;
    protected Double valorMoedaCambio;
    protected Double totalConvertido;
    protected String complementoCombo;
    protected String complementoComboValor;
    protected String cidade;
    protected String horaInicial;
    protected String horaFinal;
    protected Double iof;

    /**
     * Obtém o valor da propriedade tipoDespesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDespesa() {
        return tipoDespesa;
    }

    /**
     * Define o valor da propriedade tipoDespesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDespesa(String value) {
        this.tipoDespesa = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValor(Double value) {
        this.valor = value;
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
     * Obtém o valor da propriedade codigoDespesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDespesa() {
        return codigoDespesa;
    }

    /**
     * Define o valor da propriedade codigoDespesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDespesa(String value) {
        this.codigoDespesa = value;
    }

    /**
     * Obtém o valor da propriedade classificacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificacao() {
        return classificacao;
    }

    /**
     * Define o valor da propriedade classificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificacao(String value) {
        this.classificacao = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade moedaCambio.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoedaCambio() {
        return moedaCambio;
    }

    /**
     * Define o valor da propriedade moedaCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoedaCambio(Moeda value) {
        this.moedaCambio = value;
    }

    /**
     * Obtém o valor da propriedade valorMoedaCambio.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorMoedaCambio() {
        return valorMoedaCambio;
    }

    /**
     * Define o valor da propriedade valorMoedaCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorMoedaCambio(Double value) {
        this.valorMoedaCambio = value;
    }

    /**
     * Obtém o valor da propriedade totalConvertido.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalConvertido() {
        return totalConvertido;
    }

    /**
     * Define o valor da propriedade totalConvertido.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalConvertido(Double value) {
        this.totalConvertido = value;
    }

    /**
     * Obtém o valor da propriedade complementoCombo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoCombo() {
        return complementoCombo;
    }

    /**
     * Define o valor da propriedade complementoCombo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoCombo(String value) {
        this.complementoCombo = value;
    }

    /**
     * Obtém o valor da propriedade complementoComboValor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoComboValor() {
        return complementoComboValor;
    }

    /**
     * Define o valor da propriedade complementoComboValor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoComboValor(String value) {
        this.complementoComboValor = value;
    }

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
     * Obtém o valor da propriedade horaInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraInicial() {
        return horaInicial;
    }

    /**
     * Define o valor da propriedade horaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraInicial(String value) {
        this.horaInicial = value;
    }

    /**
     * Obtém o valor da propriedade horaFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraFinal() {
        return horaFinal;
    }

    /**
     * Define o valor da propriedade horaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraFinal(String value) {
        this.horaFinal = value;
    }

    /**
     * Obtém o valor da propriedade iof.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIof() {
        return iof;
    }

    /**
     * Define o valor da propriedade iof.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIof(Double value) {
        this.iof = value;
    }

}
