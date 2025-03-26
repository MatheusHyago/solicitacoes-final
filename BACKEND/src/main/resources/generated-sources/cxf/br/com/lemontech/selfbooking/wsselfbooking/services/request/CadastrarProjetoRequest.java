
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.Projeto;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarProjetoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarProjetoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="projeto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}projeto"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarProjetoRequest", propOrder = {
    "projeto"
})
public class CadastrarProjetoRequest {

    @XmlElement(required = true)
    protected Projeto projeto;

    /**
     * Obtém o valor da propriedade projeto.
     * 
     * @return
     *     possible object is
     *     {@link Projeto }
     *     
     */
    public Projeto getProjeto() {
        return projeto;
    }

    /**
     * Define o valor da propriedade projeto.
     * 
     * @param value
     *     allowed object is
     *     {@link Projeto }
     *     
     */
    public void setProjeto(Projeto value) {
        this.projeto = value;
    }

}
