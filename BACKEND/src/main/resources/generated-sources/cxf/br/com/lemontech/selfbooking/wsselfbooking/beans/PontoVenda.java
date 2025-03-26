
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pontoVenda complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pontoVenda"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nomePontoVenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codBackOffice" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pccLocalVenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoIntegracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pontoVenda", propOrder = {
    "nomePontoVenda",
    "codBackOffice",
    "pccLocalVenda",
    "codigoIntegracao"
})
public class PontoVenda {

    protected String nomePontoVenda;
    protected int codBackOffice;
    protected String pccLocalVenda;
    protected String codigoIntegracao;

    /**
     * Obtém o valor da propriedade nomePontoVenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePontoVenda() {
        return nomePontoVenda;
    }

    /**
     * Define o valor da propriedade nomePontoVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePontoVenda(String value) {
        this.nomePontoVenda = value;
    }

    /**
     * Obtém o valor da propriedade codBackOffice.
     * 
     */
    public int getCodBackOffice() {
        return codBackOffice;
    }

    /**
     * Define o valor da propriedade codBackOffice.
     * 
     */
    public void setCodBackOffice(int value) {
        this.codBackOffice = value;
    }

    /**
     * Obtém o valor da propriedade pccLocalVenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPccLocalVenda() {
        return pccLocalVenda;
    }

    /**
     * Define o valor da propriedade pccLocalVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPccLocalVenda(String value) {
        this.pccLocalVenda = value;
    }

    /**
     * Obtém o valor da propriedade codigoIntegracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIntegracao() {
        return codigoIntegracao;
    }

    /**
     * Define o valor da propriedade codigoIntegracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIntegracao(String value) {
        this.codigoIntegracao = value;
    }

}
