
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import java.util.ArrayList;
import java.util.List;
import br.com.lemontech.selfbooking.wsselfbooking.beans.AereoFinalizar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.CarroFinalizar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef;
import br.com.lemontech.selfbooking.wsselfbooking.beans.HotelFinalizar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de finalizarSolicitacaoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="finalizarSolicitacaoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idSolicitacao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="controleClienteSolicitacao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="funcionario" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/&gt;
 *         &lt;element name="aereoFinalizar" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}aereoFinalizar" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hotelFinalizar" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}hotelFinalizar" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="carroFinalizar" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}carroFinalizar" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "finalizarSolicitacaoRequest", propOrder = {
    "idSolicitacao",
    "controleClienteSolicitacao",
    "funcionario",
    "aereoFinalizar",
    "hotelFinalizar",
    "carroFinalizar"
})
public class FinalizarSolicitacaoRequest {

    protected int idSolicitacao;
    @XmlElement(required = true)
    protected String controleClienteSolicitacao;
    @XmlElement(required = true)
    protected FuncionarioRef funcionario;
    protected List<AereoFinalizar> aereoFinalizar;
    protected List<HotelFinalizar> hotelFinalizar;
    protected List<CarroFinalizar> carroFinalizar;

    /**
     * Obtém o valor da propriedade idSolicitacao.
     * 
     */
    public int getIdSolicitacao() {
        return idSolicitacao;
    }

    /**
     * Define o valor da propriedade idSolicitacao.
     * 
     */
    public void setIdSolicitacao(int value) {
        this.idSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade controleClienteSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControleClienteSolicitacao() {
        return controleClienteSolicitacao;
    }

    /**
     * Define o valor da propriedade controleClienteSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControleClienteSolicitacao(String value) {
        this.controleClienteSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade funcionario.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getFuncionario() {
        return funcionario;
    }

    /**
     * Define o valor da propriedade funcionario.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setFuncionario(FuncionarioRef value) {
        this.funcionario = value;
    }

    /**
     * Gets the value of the aereoFinalizar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the aereoFinalizar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAereoFinalizar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AereoFinalizar }
     * 
     * 
     */
    public List<AereoFinalizar> getAereoFinalizar() {
        if (aereoFinalizar == null) {
            aereoFinalizar = new ArrayList<AereoFinalizar>();
        }
        return this.aereoFinalizar;
    }

    /**
     * Gets the value of the hotelFinalizar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hotelFinalizar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelFinalizar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelFinalizar }
     * 
     * 
     */
    public List<HotelFinalizar> getHotelFinalizar() {
        if (hotelFinalizar == null) {
            hotelFinalizar = new ArrayList<HotelFinalizar>();
        }
        return this.hotelFinalizar;
    }

    /**
     * Gets the value of the carroFinalizar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the carroFinalizar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarroFinalizar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarroFinalizar }
     * 
     * 
     */
    public List<CarroFinalizar> getCarroFinalizar() {
        if (carroFinalizar == null) {
            carroFinalizar = new ArrayList<CarroFinalizar>();
        }
        return this.carroFinalizar;
    }

}
