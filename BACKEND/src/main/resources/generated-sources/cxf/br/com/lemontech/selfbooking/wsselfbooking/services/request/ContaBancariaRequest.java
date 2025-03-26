
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef;
import br.com.lemontech.selfbooking.wsselfbooking.beans.InstituicaoBancariaRef;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de contaBancariaRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="contaBancariaRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="funcionarioRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/&gt;
 *         &lt;element name="instituicaoBancariaRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}instituicaoBancariaRef"/&gt;
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="conta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="padrao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contaBancariaRequest", propOrder = {
    "funcionarioRef",
    "instituicaoBancariaRef",
    "agencia",
    "conta",
    "padrao",
    "status"
})
public class ContaBancariaRequest {

    @XmlElement(required = true)
    protected FuncionarioRef funcionarioRef;
    @XmlElement(required = true)
    protected InstituicaoBancariaRef instituicaoBancariaRef;
    @XmlElement(required = true)
    protected String agencia;
    @XmlElement(required = true)
    protected String conta;
    protected Boolean padrao;
    protected boolean status;

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
     * Obtém o valor da propriedade instituicaoBancariaRef.
     * 
     * @return
     *     possible object is
     *     {@link InstituicaoBancariaRef }
     *     
     */
    public InstituicaoBancariaRef getInstituicaoBancariaRef() {
        return instituicaoBancariaRef;
    }

    /**
     * Define o valor da propriedade instituicaoBancariaRef.
     * 
     * @param value
     *     allowed object is
     *     {@link InstituicaoBancariaRef }
     *     
     */
    public void setInstituicaoBancariaRef(InstituicaoBancariaRef value) {
        this.instituicaoBancariaRef = value;
    }

    /**
     * Obtém o valor da propriedade agencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define o valor da propriedade agencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencia(String value) {
        this.agencia = value;
    }

    /**
     * Obtém o valor da propriedade conta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConta() {
        return conta;
    }

    /**
     * Define o valor da propriedade conta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConta(String value) {
        this.conta = value;
    }

    /**
     * Obtém o valor da propriedade padrao.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPadrao() {
        return padrao;
    }

    /**
     * Define o valor da propriedade padrao.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPadrao(Boolean value) {
        this.padrao = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

}
