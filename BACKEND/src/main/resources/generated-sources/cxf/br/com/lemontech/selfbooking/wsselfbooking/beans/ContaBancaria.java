
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de contaBancaria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="contaBancaria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="funcionarioContaBancariaRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioContaBancariaRef"/&gt;
 *         &lt;element name="instituicaoBancariaRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}instituicaoBancariaRef"/&gt;
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="conta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="padrao" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contaBancaria", propOrder = {
    "funcionarioContaBancariaRef",
    "instituicaoBancariaRef",
    "agencia",
    "conta",
    "padrao",
    "status",
    "id"
})
public class ContaBancaria {

    @XmlElement(required = true)
    protected FuncionarioContaBancariaRef funcionarioContaBancariaRef;
    @XmlElement(required = true)
    protected InstituicaoBancariaRef instituicaoBancariaRef;
    @XmlElement(required = true)
    protected String agencia;
    @XmlElement(required = true)
    protected String conta;
    protected boolean padrao;
    protected boolean status;
    @XmlElement(required = true)
    protected BigInteger id;

    /**
     * Obtém o valor da propriedade funcionarioContaBancariaRef.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioContaBancariaRef }
     *     
     */
    public FuncionarioContaBancariaRef getFuncionarioContaBancariaRef() {
        return funcionarioContaBancariaRef;
    }

    /**
     * Define o valor da propriedade funcionarioContaBancariaRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioContaBancariaRef }
     *     
     */
    public void setFuncionarioContaBancariaRef(FuncionarioContaBancariaRef value) {
        this.funcionarioContaBancariaRef = value;
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
     */
    public boolean isPadrao() {
        return padrao;
    }

    /**
     * Define o valor da propriedade padrao.
     * 
     */
    public void setPadrao(boolean value) {
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

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

}
