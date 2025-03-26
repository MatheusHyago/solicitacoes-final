
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de listarParametrizacaoCentroDeCustoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="listarParametrizacaoCentroDeCustoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="centroDeCusto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/&gt;
 *         &lt;element name="registroInicial"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="quantidadeRegistros" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;maxInclusive value="50"/&gt;
 *               &lt;minInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarParametrizacaoCentroDeCustoRequest", propOrder = {
    "ativo",
    "centroDeCusto",
    "registroInicial",
    "quantidadeRegistros"
})
public class ListarParametrizacaoCentroDeCustoRequest {

    @XmlElement(defaultValue = "true")
    protected boolean ativo;
    @XmlElement(defaultValue = " ")
    protected String centroDeCusto;
    @XmlElement(defaultValue = "1")
    protected int registroInicial;
    @XmlElement(defaultValue = "50")
    protected Integer quantidadeRegistros;

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
     * Obtém o valor da propriedade centroDeCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroDeCusto() {
        return centroDeCusto;
    }

    /**
     * Define o valor da propriedade centroDeCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroDeCusto(String value) {
        this.centroDeCusto = value;
    }

    /**
     * Obtém o valor da propriedade registroInicial.
     * 
     */
    public int getRegistroInicial() {
        return registroInicial;
    }

    /**
     * Define o valor da propriedade registroInicial.
     * 
     */
    public void setRegistroInicial(int value) {
        this.registroInicial = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeRegistros.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadeRegistros() {
        return quantidadeRegistros;
    }

    /**
     * Define o valor da propriedade quantidadeRegistros.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadeRegistros(Integer value) {
        this.quantidadeRegistros = value;
    }

}
