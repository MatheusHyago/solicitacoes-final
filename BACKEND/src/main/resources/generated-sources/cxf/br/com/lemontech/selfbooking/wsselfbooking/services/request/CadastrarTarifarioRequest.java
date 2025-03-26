
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorCarro;
import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorHotel;
import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorOutro;
import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorRodoviario;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarTarifarioRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarTarifarioRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="tarifarioHotel" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorHotel"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="tarifarioCarro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorCarro"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="tarifarioOutro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorOutro"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="tarifarioRodoviario" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorRodoviario"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarTarifarioRequest", propOrder = {
    "tarifarioHotel",
    "tarifarioCarro",
    "tarifarioOutro",
    "tarifarioRodoviario"
})
public class CadastrarTarifarioRequest {

    protected TarifarioFornecedorHotel tarifarioHotel;
    protected TarifarioFornecedorCarro tarifarioCarro;
    protected TarifarioFornecedorOutro tarifarioOutro;
    protected TarifarioFornecedorRodoviario tarifarioRodoviario;

    /**
     * Obtém o valor da propriedade tarifarioHotel.
     * 
     * @return
     *     possible object is
     *     {@link TarifarioFornecedorHotel }
     *     
     */
    public TarifarioFornecedorHotel getTarifarioHotel() {
        return tarifarioHotel;
    }

    /**
     * Define o valor da propriedade tarifarioHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifarioFornecedorHotel }
     *     
     */
    public void setTarifarioHotel(TarifarioFornecedorHotel value) {
        this.tarifarioHotel = value;
    }

    /**
     * Obtém o valor da propriedade tarifarioCarro.
     * 
     * @return
     *     possible object is
     *     {@link TarifarioFornecedorCarro }
     *     
     */
    public TarifarioFornecedorCarro getTarifarioCarro() {
        return tarifarioCarro;
    }

    /**
     * Define o valor da propriedade tarifarioCarro.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifarioFornecedorCarro }
     *     
     */
    public void setTarifarioCarro(TarifarioFornecedorCarro value) {
        this.tarifarioCarro = value;
    }

    /**
     * Obtém o valor da propriedade tarifarioOutro.
     * 
     * @return
     *     possible object is
     *     {@link TarifarioFornecedorOutro }
     *     
     */
    public TarifarioFornecedorOutro getTarifarioOutro() {
        return tarifarioOutro;
    }

    /**
     * Define o valor da propriedade tarifarioOutro.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifarioFornecedorOutro }
     *     
     */
    public void setTarifarioOutro(TarifarioFornecedorOutro value) {
        this.tarifarioOutro = value;
    }

    /**
     * Obtém o valor da propriedade tarifarioRodoviario.
     * 
     * @return
     *     possible object is
     *     {@link TarifarioFornecedorRodoviario }
     *     
     */
    public TarifarioFornecedorRodoviario getTarifarioRodoviario() {
        return tarifarioRodoviario;
    }

    /**
     * Define o valor da propriedade tarifarioRodoviario.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifarioFornecedorRodoviario }
     *     
     */
    public void setTarifarioRodoviario(TarifarioFornecedorRodoviario value) {
        this.tarifarioRodoviario = value;
    }

}
