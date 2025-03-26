
package br.com.lemontech.selfbooking.wsselfbooking.services.response;

import br.com.lemontech.selfbooking.wsselfbooking.beans.Funcionarios;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pesquisarFuncionarioResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pesquisarFuncionarioResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultadoOperacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}resultadoOperacao" minOccurs="0"/&gt;
 *         &lt;element name="funcionarios" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarios" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarFuncionarioResponse", propOrder = {
    "resultadoOperacao",
    "funcionarios"
})
public class PesquisarFuncionarioResponse {

    protected ResultadoOperacao resultadoOperacao;
    protected Funcionarios funcionarios;

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

    /**
     * Obtém o valor da propriedade funcionarios.
     * 
     * @return
     *     possible object is
     *     {@link Funcionarios }
     *     
     */
    public Funcionarios getFuncionarios() {
        return funcionarios;
    }

    /**
     * Define o valor da propriedade funcionarios.
     * 
     * @param value
     *     allowed object is
     *     {@link Funcionarios }
     *     
     */
    public void setFuncionarios(Funcionarios value) {
        this.funcionarios = value;
    }

}
