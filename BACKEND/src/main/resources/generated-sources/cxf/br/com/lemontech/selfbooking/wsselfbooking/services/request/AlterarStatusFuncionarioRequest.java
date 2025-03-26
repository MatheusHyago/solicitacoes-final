
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de alterarStatusFuncionarioRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="alterarStatusFuncionarioRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="funcionarioRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/&gt;
 *         &lt;element name="novaMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="novoLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alterarStatusFuncionarioRequest", propOrder = {
    "ativo",
    "funcionarioRef",
    "novaMatricula",
    "novoLogin"
})
public class AlterarStatusFuncionarioRequest {

    protected boolean ativo;
    @XmlElement(required = true)
    protected FuncionarioRef funcionarioRef;
    protected String novaMatricula;
    protected String novoLogin;

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
     * Obtém o valor da propriedade funcionarioRef.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getFuncionarioRef() {
        return funcionarioRef;
    }

    /**
     * Define o valor da propriedade funcionarioRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setFuncionarioRef(FuncionarioRef value) {
        this.funcionarioRef = value;
    }

    /**
     * Obtém o valor da propriedade novaMatricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNovaMatricula() {
        return novaMatricula;
    }

    /**
     * Define o valor da propriedade novaMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNovaMatricula(String value) {
        this.novaMatricula = value;
    }

    /**
     * Obtém o valor da propriedade novoLogin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNovoLogin() {
        return novoLogin;
    }

    /**
     * Define o valor da propriedade novoLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNovoLogin(String value) {
        this.novoLogin = value;
    }

}
