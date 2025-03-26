
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoIntegracao;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de identificadorIntegracaoRef complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="identificadorIntegracaoRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificadorIntegracao"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tipoIntegracao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoIntegracao"/&gt;
 *         &lt;element name="tipoConector" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nomeConector" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idSolicitacaoRef" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="idAereoRef" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="idHotelRef" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="idCarroRef" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="idOutroRef" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="idSeguroRef" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="idTrasladoRef" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="idRodoviarioRef" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificadorIntegracaoRef", propOrder = {
    "identificadorIntegracao",
    "tipoIntegracao",
    "tipoConector",
    "nomeConector",
    "idSolicitacaoRef",
    "idAereoRef",
    "idHotelRef",
    "idCarroRef",
    "idOutroRef",
    "idSeguroRef",
    "idTrasladoRef",
    "idRodoviarioRef"
})
public class IdentificadorIntegracaoRef {

    @XmlElement(required = true)
    protected String identificadorIntegracao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoIntegracao tipoIntegracao;
    @XmlElement(required = true)
    protected String tipoConector;
    @XmlElement(required = true)
    protected String nomeConector;
    protected int idSolicitacaoRef;
    protected Integer idAereoRef;
    protected Integer idHotelRef;
    protected Integer idCarroRef;
    protected Integer idOutroRef;
    protected Integer idSeguroRef;
    protected Integer idTrasladoRef;
    protected Integer idRodoviarioRef;

    /**
     * Obtém o valor da propriedade identificadorIntegracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorIntegracao() {
        return identificadorIntegracao;
    }

    /**
     * Define o valor da propriedade identificadorIntegracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorIntegracao(String value) {
        this.identificadorIntegracao = value;
    }

    /**
     * Obtém o valor da propriedade tipoIntegracao.
     * 
     * @return
     *     possible object is
     *     {@link TipoIntegracao }
     *     
     */
    public TipoIntegracao getTipoIntegracao() {
        return tipoIntegracao;
    }

    /**
     * Define o valor da propriedade tipoIntegracao.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIntegracao }
     *     
     */
    public void setTipoIntegracao(TipoIntegracao value) {
        this.tipoIntegracao = value;
    }

    /**
     * Obtém o valor da propriedade tipoConector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoConector() {
        return tipoConector;
    }

    /**
     * Define o valor da propriedade tipoConector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoConector(String value) {
        this.tipoConector = value;
    }

    /**
     * Obtém o valor da propriedade nomeConector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeConector() {
        return nomeConector;
    }

    /**
     * Define o valor da propriedade nomeConector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeConector(String value) {
        this.nomeConector = value;
    }

    /**
     * Obtém o valor da propriedade idSolicitacaoRef.
     * 
     */
    public int getIdSolicitacaoRef() {
        return idSolicitacaoRef;
    }

    /**
     * Define o valor da propriedade idSolicitacaoRef.
     * 
     */
    public void setIdSolicitacaoRef(int value) {
        this.idSolicitacaoRef = value;
    }

    /**
     * Obtém o valor da propriedade idAereoRef.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAereoRef() {
        return idAereoRef;
    }

    /**
     * Define o valor da propriedade idAereoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAereoRef(Integer value) {
        this.idAereoRef = value;
    }

    /**
     * Obtém o valor da propriedade idHotelRef.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdHotelRef() {
        return idHotelRef;
    }

    /**
     * Define o valor da propriedade idHotelRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdHotelRef(Integer value) {
        this.idHotelRef = value;
    }

    /**
     * Obtém o valor da propriedade idCarroRef.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCarroRef() {
        return idCarroRef;
    }

    /**
     * Define o valor da propriedade idCarroRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCarroRef(Integer value) {
        this.idCarroRef = value;
    }

    /**
     * Obtém o valor da propriedade idOutroRef.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOutroRef() {
        return idOutroRef;
    }

    /**
     * Define o valor da propriedade idOutroRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOutroRef(Integer value) {
        this.idOutroRef = value;
    }

    /**
     * Obtém o valor da propriedade idSeguroRef.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSeguroRef() {
        return idSeguroRef;
    }

    /**
     * Define o valor da propriedade idSeguroRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSeguroRef(Integer value) {
        this.idSeguroRef = value;
    }

    /**
     * Obtém o valor da propriedade idTrasladoRef.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTrasladoRef() {
        return idTrasladoRef;
    }

    /**
     * Define o valor da propriedade idTrasladoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTrasladoRef(Integer value) {
        this.idTrasladoRef = value;
    }

    /**
     * Obtém o valor da propriedade idRodoviarioRef.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdRodoviarioRef() {
        return idRodoviarioRef;
    }

    /**
     * Define o valor da propriedade idRodoviarioRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdRodoviarioRef(Integer value) {
        this.idRodoviarioRef = value;
    }

}
