
package br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor;

import br.com.lemontech.selfbooking.wsselfbooking.beans.types.ClasseRodoviario;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tarifarioFornecedorRodoviarioRef complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tarifarioFornecedorRodoviarioRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificadorBackofficeFornecedor" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice"/&gt;
 *         &lt;element name="identificadorBackofficeCliente" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice" minOccurs="0"/&gt;
 *         &lt;element name="classeRodoviario" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}classeRodoviario"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tarifarioFornecedorRodoviarioRef", propOrder = {
    "identificadorBackofficeFornecedor",
    "identificadorBackofficeCliente",
    "classeRodoviario"
})
@XmlSeeAlso({
    TarifarioFornecedorRodoviario.class
})
public class TarifarioFornecedorRodoviarioRef {

    @XmlElement(required = true)
    protected String identificadorBackofficeFornecedor;
    protected String identificadorBackofficeCliente;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ClasseRodoviario classeRodoviario;

    /**
     * Obtém o valor da propriedade identificadorBackofficeFornecedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackofficeFornecedor() {
        return identificadorBackofficeFornecedor;
    }

    /**
     * Define o valor da propriedade identificadorBackofficeFornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackofficeFornecedor(String value) {
        this.identificadorBackofficeFornecedor = value;
    }

    /**
     * Obtém o valor da propriedade identificadorBackofficeCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackofficeCliente() {
        return identificadorBackofficeCliente;
    }

    /**
     * Define o valor da propriedade identificadorBackofficeCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackofficeCliente(String value) {
        this.identificadorBackofficeCliente = value;
    }

    /**
     * Obtém o valor da propriedade classeRodoviario.
     * 
     * @return
     *     possible object is
     *     {@link ClasseRodoviario }
     *     
     */
    public ClasseRodoviario getClasseRodoviario() {
        return classeRodoviario;
    }

    /**
     * Define o valor da propriedade classeRodoviario.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasseRodoviario }
     *     
     */
    public void setClasseRodoviario(ClasseRodoviario value) {
        this.classeRodoviario = value;
    }

}
