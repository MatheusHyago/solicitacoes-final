
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoParametrizacao;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de delegarTodasParametrizacoes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="delegarTodasParametrizacoes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoParametrizacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoParametrizacao" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delegarTodasParametrizacoes", propOrder = {
    "tipoParametrizacao"
})
public class DelegarTodasParametrizacoes {

    @XmlSchemaType(name = "string")
    protected TipoParametrizacao tipoParametrizacao;

    /**
     * Obtém o valor da propriedade tipoParametrizacao.
     * 
     * @return
     *     possible object is
     *     {@link TipoParametrizacao }
     *     
     */
    public TipoParametrizacao getTipoParametrizacao() {
        return tipoParametrizacao;
    }

    /**
     * Define o valor da propriedade tipoParametrizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoParametrizacao }
     *     
     */
    public void setTipoParametrizacao(TipoParametrizacao value) {
        this.tipoParametrizacao = value;
    }

}
