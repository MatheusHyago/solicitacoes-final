
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.Fornecedor;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarFornecedorRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarFornecedorRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fornecedor" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}fornecedor"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarFornecedorRequest", propOrder = {
    "fornecedor"
})
public class CadastrarFornecedorRequest {

    @XmlElement(required = true)
    protected Fornecedor fornecedor;

    /**
     * Obtém o valor da propriedade fornecedor.
     * 
     * @return
     *     possible object is
     *     {@link Fornecedor }
     *     
     */
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    /**
     * Define o valor da propriedade fornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link Fornecedor }
     *     
     */
    public void setFornecedor(Fornecedor value) {
        this.fornecedor = value;
    }

}
