
package br.com.lemontech.selfbooking.wsselfbooking.services.response;

import br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de criarPreSolicitacaoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="criarPreSolicitacaoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="urlPreSolicitacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultadoOperacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}resultadoOperacao" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "criarPreSolicitacaoResponse", propOrder = {
    "urlPreSolicitacao",
    "resultadoOperacao"
})
public class CriarPreSolicitacaoResponse {

    protected String urlPreSolicitacao;
    protected ResultadoOperacao resultadoOperacao;

    /**
     * Obtém o valor da propriedade urlPreSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlPreSolicitacao() {
        return urlPreSolicitacao;
    }

    /**
     * Define o valor da propriedade urlPreSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlPreSolicitacao(String value) {
        this.urlPreSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade resultadoOperacao.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoOperacao }
     *     
     */
    public ResultadoOperacao getResultadoOperacao() {
        return resultadoOperacao;
    }

    /**
     * Define o valor da propriedade resultadoOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoOperacao }
     *     
     */
    public void setResultadoOperacao(ResultadoOperacao value) {
        this.resultadoOperacao = value;
    }

}
