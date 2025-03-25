
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pesquisarFuncionarioRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pesquisarFuncionarioRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idClienteRef" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="funcionarioRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="dataInicialAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *             &lt;element name="dataFinalAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *             &lt;element name="registroInicial"&gt;
 *               &lt;simpleType&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                   &lt;minInclusive value="1"/&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/simpleType&gt;
 *             &lt;/element&gt;
 *             &lt;element name="quantidadeRegistros" minOccurs="0"&gt;
 *               &lt;simpleType&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                   &lt;maxInclusive value="100"/&gt;
 *                   &lt;minInclusive value="1"/&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/simpleType&gt;
 *             &lt;/element&gt;
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
@XmlType(name = "pesquisarFuncionarioRequest", propOrder = {
    "idClienteRef",
    "funcionarioRef",
    "dataInicialAtualizacao",
    "dataFinalAtualizacao",
    "registroInicial",
    "quantidadeRegistros"
})
public class PesquisarFuncionarioRequest {

    protected Integer idClienteRef;
    protected FuncionarioRef funcionarioRef;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicialAtualizacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFinalAtualizacao;
    protected Integer registroInicial;
    @XmlElement(defaultValue = "50")
    protected Integer quantidadeRegistros;

    /**
     * Obtém o valor da propriedade idClienteRef.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdClienteRef() {
        return idClienteRef;
    }

    /**
     * Define o valor da propriedade idClienteRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdClienteRef(Integer value) {
        this.idClienteRef = value;
    }

    /**
     * Obtém o valor da propriedade funcionarioRef.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getFuncionarioRef() {
        return funcionarioRef;
    }

    /**
     * Define o valor da propriedade funcionarioRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setFuncionarioRef(FuncionarioRef value) {
        this.funcionarioRef = value;
    }

    /**
     * Obtém o valor da propriedade dataInicialAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicialAtualizacao() {
        return dataInicialAtualizacao;
    }

    /**
     * Define o valor da propriedade dataInicialAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicialAtualizacao(XMLGregorianCalendar value) {
        this.dataInicialAtualizacao = value;
    }

    /**
     * Obtém o valor da propriedade dataFinalAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinalAtualizacao() {
        return dataFinalAtualizacao;
    }

    /**
     * Define o valor da propriedade dataFinalAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinalAtualizacao(XMLGregorianCalendar value) {
        this.dataFinalAtualizacao = value;
    }

    /**
     * Obtém o valor da propriedade registroInicial.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegistroInicial() {
        return registroInicial;
    }

    /**
     * Define o valor da propriedade registroInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegistroInicial(Integer value) {
        this.registroInicial = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeRegistros.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadeRegistros() {
        return quantidadeRegistros;
    }

    /**
     * Define o valor da propriedade quantidadeRegistros.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadeRegistros(Integer value) {
        this.quantidadeRegistros = value;
    }

}
