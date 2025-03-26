
package br.com.lemontech.selfbooking.wsselfbooking.services.response;

import java.util.ArrayList;
import java.util.List;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ConciliacoesCartao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoAcao;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pesquisarConciliacaoCartaoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pesquisarConciliacaoCartaoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultadoAcao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}resultadoAcao" minOccurs="0"/&gt;
 *         &lt;element name="numeroConciliacoes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="conciliacoesCartao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}conciliacoesCartao" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mensagemRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarConciliacaoCartaoResponse", propOrder = {
    "resultadoAcao",
    "numeroConciliacoes",
    "conciliacoesCartao",
    "mensagemRetorno"
})
public class PesquisarConciliacaoCartaoResponse {

    @XmlSchemaType(name = "string")
    protected ResultadoAcao resultadoAcao;
    protected Integer numeroConciliacoes;
    protected List<ConciliacoesCartao> conciliacoesCartao;
    protected String mensagemRetorno;

    /**
     * Obtém o valor da propriedade resultadoAcao.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoAcao }
     *     
     */
    public ResultadoAcao getResultadoAcao() {
        return resultadoAcao;
    }

    /**
     * Define o valor da propriedade resultadoAcao.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoAcao }
     *     
     */
    public void setResultadoAcao(ResultadoAcao value) {
        this.resultadoAcao = value;
    }

    /**
     * Obtém o valor da propriedade numeroConciliacoes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroConciliacoes() {
        return numeroConciliacoes;
    }

    /**
     * Define o valor da propriedade numeroConciliacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroConciliacoes(Integer value) {
        this.numeroConciliacoes = value;
    }

    /**
     * Gets the value of the conciliacoesCartao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the conciliacoesCartao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConciliacoesCartao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConciliacoesCartao }
     * 
     * 
     */
    public List<ConciliacoesCartao> getConciliacoesCartao() {
        if (conciliacoesCartao == null) {
            conciliacoesCartao = new ArrayList<ConciliacoesCartao>();
        }
        return this.conciliacoesCartao;
    }

    /**
     * Obtém o valor da propriedade mensagemRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagemRetorno() {
        return mensagemRetorno;
    }

    /**
     * Define o valor da propriedade mensagemRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagemRetorno(String value) {
        this.mensagemRetorno = value;
    }

}
