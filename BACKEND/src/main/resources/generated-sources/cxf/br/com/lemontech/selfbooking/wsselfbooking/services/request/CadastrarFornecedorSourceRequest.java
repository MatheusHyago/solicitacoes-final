
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.FornecedorRef;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarFornecedorSourceRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarFornecedorSourceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idFornecedorSource" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fornecedorRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}fornecedorRef"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarFornecedorSourceRequest", propOrder = {
    "source",
    "idFornecedorSource",
    "fornecedorRef"
})
public class CadastrarFornecedorSourceRequest {

    @XmlElement(required = true)
    protected String source;
    @XmlElement(required = true)
    protected String idFornecedorSource;
    @XmlElement(required = true)
    protected FornecedorRef fornecedorRef;

    /**
     * Obtém o valor da propriedade source.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Define o valor da propriedade source.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Obtém o valor da propriedade idFornecedorSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFornecedorSource() {
        return idFornecedorSource;
    }

    /**
     * Define o valor da propriedade idFornecedorSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFornecedorSource(String value) {
        this.idFornecedorSource = value;
    }

    /**
     * Obtém o valor da propriedade fornecedorRef.
     * 
     * @return
     *     possible object is
     *     {@link FornecedorRef }
     *     
     */
    public FornecedorRef getFornecedorRef() {
        return fornecedorRef;
    }

    /**
     * Define o valor da propriedade fornecedorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FornecedorRef }
     *     
     */
    public void setFornecedorRef(FornecedorRef value) {
        this.fornecedorRef = value;
    }

}
