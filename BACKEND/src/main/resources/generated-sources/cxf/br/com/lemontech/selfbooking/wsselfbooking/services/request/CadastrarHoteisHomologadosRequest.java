
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.CadastrarHoteisHomologados;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarHoteisHomologadosRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarHoteisHomologadosRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cadastrarHoteisHomologados" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}cadastrarHoteisHomologados"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarHoteisHomologadosRequest", propOrder = {
    "cadastrarHoteisHomologados"
})
public class CadastrarHoteisHomologadosRequest {

    @XmlElement(required = true)
    protected CadastrarHoteisHomologados cadastrarHoteisHomologados;

    /**
     * Obtém o valor da propriedade cadastrarHoteisHomologados.
     * 
     * @return
     *     possible object is
     *     {@link CadastrarHoteisHomologados }
     *     
     */
    public CadastrarHoteisHomologados getCadastrarHoteisHomologados() {
        return cadastrarHoteisHomologados;
    }

    /**
     * Define o valor da propriedade cadastrarHoteisHomologados.
     * 
     * @param value
     *     allowed object is
     *     {@link CadastrarHoteisHomologados }
     *     
     */
    public void setCadastrarHoteisHomologados(CadastrarHoteisHomologados value) {
        this.cadastrarHoteisHomologados = value;
    }

}
