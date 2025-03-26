
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de parametrizacaoCentroDeCustoAprovacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="parametrizacaoCentroDeCustoAprovacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoAprovacaoRef"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vencimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="periodoViagemFinal" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="valorAlcadaInicial" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorAlcadaFinal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrizacaoCentroDeCustoAprovacao", propOrder = {
    "vencimento",
    "periodoViagemFinal",
    "valorAlcadaInicial",
    "valorAlcadaFinal"
})
public class ParametrizacaoCentroDeCustoAprovacao
    extends ParametrizacaoCentroDeCustoAprovacaoRef
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vencimento;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodoViagemFinal;
    @XmlElement(defaultValue = "0")
    protected Double valorAlcadaInicial;
    @XmlElement(defaultValue = "0")
    protected Double valorAlcadaFinal;

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
     * Obtém o valor da propriedade periodoViagemFinal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodoViagemFinal() {
        return periodoViagemFinal;
    }

    /**
     * Define o valor da propriedade periodoViagemFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodoViagemFinal(XMLGregorianCalendar value) {
        this.periodoViagemFinal = value;
    }

    /**
     * Obtém o valor da propriedade valorAlcadaInicial.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorAlcadaInicial() {
        return valorAlcadaInicial;
    }

    /**
     * Define o valor da propriedade valorAlcadaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorAlcadaInicial(Double value) {
        this.valorAlcadaInicial = value;
    }

    /**
     * Obtém o valor da propriedade valorAlcadaFinal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorAlcadaFinal() {
        return valorAlcadaFinal;
    }

    /**
     * Define o valor da propriedade valorAlcadaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorAlcadaFinal(Double value) {
        this.valorAlcadaFinal = value;
    }

}
