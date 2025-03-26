
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.StatusCancelamento;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de aereoSeguimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="aereoSeguimento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataSaida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataChegada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="aereoVoo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}aereoVoo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localizadorCia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="milhas" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="paisOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paisDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cidadeOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cidadeDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataCancelada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="statusCancelamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}statusCancelamento" minOccurs="0"/&gt;
 *         &lt;element name="seguimentoCancelado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="valorTetoPolitica" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="solicitacaoAeroporto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}solicitacaoAeroporto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aereoSeguimento", propOrder = {
    "origem",
    "dataSaida",
    "destino",
    "dataChegada",
    "aereoVoo",
    "localizadorCia",
    "milhas",
    "paisOrigem",
    "estadoOrigem",
    "paisDestino",
    "estadoDestino",
    "cidadeOrigem",
    "cidadeDestino",
    "dataCancelada",
    "statusCancelamento",
    "seguimentoCancelado",
    "valorTetoPolitica",
    "solicitacaoAeroporto"
})
public class AereoSeguimento {

    protected String origem;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSaida;
    protected String destino;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataChegada;
    @XmlElement(nillable = true)
    protected List<AereoVoo> aereoVoo;
    protected String localizadorCia;
    protected Double milhas;
    protected String paisOrigem;
    protected String estadoOrigem;
    protected String paisDestino;
    protected String estadoDestino;
    protected String cidadeOrigem;
    protected String cidadeDestino;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCancelada;
    @XmlSchemaType(name = "string")
    protected StatusCancelamento statusCancelamento;
    protected Boolean seguimentoCancelado;
    protected Double valorTetoPolitica;
    protected SolicitacaoAeroporto solicitacaoAeroporto;

    /**
     * Obtém o valor da propriedade origem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * Define o valor da propriedade origem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigem(String value) {
        this.origem = value;
    }

    /**
     * Obtém o valor da propriedade dataSaida.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSaida() {
        return dataSaida;
    }

    /**
     * Define o valor da propriedade dataSaida.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSaida(XMLGregorianCalendar value) {
        this.dataSaida = value;
    }

    /**
     * Obtém o valor da propriedade destino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Define o valor da propriedade destino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Obtém o valor da propriedade dataChegada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataChegada() {
        return dataChegada;
    }

    /**
     * Define o valor da propriedade dataChegada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataChegada(XMLGregorianCalendar value) {
        this.dataChegada = value;
    }

    /**
     * Gets the value of the aereoVoo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the aereoVoo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAereoVoo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AereoVoo }
     * 
     * 
     */
    public List<AereoVoo> getAereoVoo() {
        if (aereoVoo == null) {
            aereoVoo = new ArrayList<AereoVoo>();
        }
        return this.aereoVoo;
    }

    /**
     * Obtém o valor da propriedade localizadorCia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizadorCia() {
        return localizadorCia;
    }

    /**
     * Define o valor da propriedade localizadorCia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizadorCia(String value) {
        this.localizadorCia = value;
    }

    /**
     * Obtém o valor da propriedade milhas.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMilhas() {
        return milhas;
    }

    /**
     * Define o valor da propriedade milhas.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMilhas(Double value) {
        this.milhas = value;
    }

    /**
     * Obtém o valor da propriedade paisOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisOrigem() {
        return paisOrigem;
    }

    /**
     * Define o valor da propriedade paisOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisOrigem(String value) {
        this.paisOrigem = value;
    }

    /**
     * Obtém o valor da propriedade estadoOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoOrigem() {
        return estadoOrigem;
    }

    /**
     * Define o valor da propriedade estadoOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoOrigem(String value) {
        this.estadoOrigem = value;
    }

    /**
     * Obtém o valor da propriedade paisDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisDestino() {
        return paisDestino;
    }

    /**
     * Define o valor da propriedade paisDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisDestino(String value) {
        this.paisDestino = value;
    }

    /**
     * Obtém o valor da propriedade estadoDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoDestino() {
        return estadoDestino;
    }

    /**
     * Define o valor da propriedade estadoDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoDestino(String value) {
        this.estadoDestino = value;
    }

    /**
     * Obtém o valor da propriedade cidadeOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    /**
     * Define o valor da propriedade cidadeOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeOrigem(String value) {
        this.cidadeOrigem = value;
    }

    /**
     * Obtém o valor da propriedade cidadeDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeDestino() {
        return cidadeDestino;
    }

    /**
     * Define o valor da propriedade cidadeDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeDestino(String value) {
        this.cidadeDestino = value;
    }

    /**
     * Obtém o valor da propriedade dataCancelada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCancelada() {
        return dataCancelada;
    }

    /**
     * Define o valor da propriedade dataCancelada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCancelada(XMLGregorianCalendar value) {
        this.dataCancelada = value;
    }

    /**
     * Obtém o valor da propriedade statusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link StatusCancelamento }
     *     
     */
    public StatusCancelamento getStatusCancelamento() {
        return statusCancelamento;
    }

    /**
     * Define o valor da propriedade statusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCancelamento }
     *     
     */
    public void setStatusCancelamento(StatusCancelamento value) {
        this.statusCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade seguimentoCancelado.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeguimentoCancelado() {
        return seguimentoCancelado;
    }

    /**
     * Define o valor da propriedade seguimentoCancelado.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeguimentoCancelado(Boolean value) {
        this.seguimentoCancelado = value;
    }

    /**
     * Obtém o valor da propriedade valorTetoPolitica.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTetoPolitica() {
        return valorTetoPolitica;
    }

    /**
     * Define o valor da propriedade valorTetoPolitica.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTetoPolitica(Double value) {
        this.valorTetoPolitica = value;
    }

    /**
     * Obtém o valor da propriedade solicitacaoAeroporto.
     * 
     * @return
     *     possible object is
     *     {@link SolicitacaoAeroporto }
     *     
     */
    public SolicitacaoAeroporto getSolicitacaoAeroporto() {
        return solicitacaoAeroporto;
    }

    /**
     * Define o valor da propriedade solicitacaoAeroporto.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitacaoAeroporto }
     *     
     */
    public void setSolicitacaoAeroporto(SolicitacaoAeroporto value) {
        this.solicitacaoAeroporto = value;
    }

}
