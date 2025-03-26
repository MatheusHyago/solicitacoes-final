
package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de imagem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="imagem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="urlImagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imagem", propOrder = {
    "urlImagem"
})
public class Imagem {

    protected String urlImagem;

    /**
     * Obtém o valor da propriedade urlImagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlImagem() {
        return urlImagem;
    }

    /**
     * Define o valor da propriedade urlImagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlImagem(String value) {
        this.urlImagem = value;
    }

}
