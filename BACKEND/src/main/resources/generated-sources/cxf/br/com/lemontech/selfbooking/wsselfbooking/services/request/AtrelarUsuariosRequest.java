
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de atrelarUsuariosRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="atrelarUsuariosRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="principal" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/&gt;
 *         &lt;element name="secundario" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/&gt;
 *         &lt;element name="acessoLogas" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="acessoExpense" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atrelarUsuariosRequest", propOrder = {
    "principal",
    "secundario",
    "acessoLogas",
    "acessoExpense"
})
public class AtrelarUsuariosRequest {

    @XmlElement(required = true)
    protected FuncionarioRef principal;
    @XmlElement(required = true)
    protected FuncionarioRef secundario;
    protected boolean acessoLogas;
    protected boolean acessoExpense;

    /**
     * Obtém o valor da propriedade principal.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getPrincipal() {
        return principal;
    }

    /**
     * Define o valor da propriedade principal.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setPrincipal(FuncionarioRef value) {
        this.principal = value;
    }

    /**
     * Obtém o valor da propriedade secundario.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getSecundario() {
        return secundario;
    }

    /**
     * Define o valor da propriedade secundario.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setSecundario(FuncionarioRef value) {
        this.secundario = value;
    }

    /**
     * Obtém o valor da propriedade acessoLogas.
     * 
     */
    public boolean isAcessoLogas() {
        return acessoLogas;
    }

    /**
     * Define o valor da propriedade acessoLogas.
     * 
     */
    public void setAcessoLogas(boolean value) {
        this.acessoLogas = value;
    }

    /**
     * Obtém o valor da propriedade acessoExpense.
     * 
     */
    public boolean isAcessoExpense() {
        return acessoExpense;
    }

    /**
     * Define o valor da propriedade acessoExpense.
     * 
     */
    public void setAcessoExpense(boolean value) {
        this.acessoExpense = value;
    }

}
