
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.AcompanhanteRef;
import br.com.lemontech.selfbooking.wsselfbooking.beans.CamposAdicionais;
import br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef;
import br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.PedidosAereos;
import br.com.lemontech.selfbooking.wsselfbooking.beans.carro.PedidosCarros;
import br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.PedidosHoteis;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de criarPreSolicitacaoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="criarPreSolicitacaoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="solicitante" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/&gt;
 *         &lt;element name="passageiro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/&gt;
 *         &lt;element name="acompanhantes" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}acompanhanteRef" minOccurs="0"/&gt;
 *         &lt;element name="centroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}centroDeCustoRef"/&gt;
 *         &lt;element name="pedidosAereos" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}pedidosAereos" minOccurs="0"/&gt;
 *         &lt;element name="pedidosHoteis" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/hotel}pedidosHoteis" minOccurs="0"/&gt;
 *         &lt;element name="pedidosCarros" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/carro}pedidosCarros" minOccurs="0"/&gt;
 *         &lt;element name="controleCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="camposAdicionais" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}camposAdicionais" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "criarPreSolicitacaoRequest", propOrder = {
    "solicitante",
    "passageiro",
    "acompanhantes",
    "centroDeCustoRef",
    "pedidosAereos",
    "pedidosHoteis",
    "pedidosCarros",
    "controleCliente",
    "camposAdicionais"
})
public class CriarPreSolicitacaoRequest {

    @XmlElement(required = true)
    protected FuncionarioRef solicitante;
    @XmlElement(required = true)
    protected FuncionarioRef passageiro;
    protected AcompanhanteRef acompanhantes;
    @XmlElement(required = true)
    protected CentroDeCustoRef centroDeCustoRef;
    protected PedidosAereos pedidosAereos;
    protected PedidosHoteis pedidosHoteis;
    protected PedidosCarros pedidosCarros;
    protected String controleCliente;
    protected CamposAdicionais camposAdicionais;

    /**
     * Obtém o valor da propriedade solicitante.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getSolicitante() {
        return solicitante;
    }

    /**
     * Define o valor da propriedade solicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setSolicitante(FuncionarioRef value) {
        this.solicitante = value;
    }

    /**
     * Obtém o valor da propriedade passageiro.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getPassageiro() {
        return passageiro;
    }

    /**
     * Define o valor da propriedade passageiro.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setPassageiro(FuncionarioRef value) {
        this.passageiro = value;
    }

    /**
     * Obtém o valor da propriedade acompanhantes.
     * 
     * @return
     *     possible object is
     *     {@link AcompanhanteRef }
     *     
     */
    public AcompanhanteRef getAcompanhantes() {
        return acompanhantes;
    }

    /**
     * Define o valor da propriedade acompanhantes.
     * 
     * @param value
     *     allowed object is
     *     {@link AcompanhanteRef }
     *     
     */
    public void setAcompanhantes(AcompanhanteRef value) {
        this.acompanhantes = value;
    }

    /**
     * Obtém o valor da propriedade centroDeCustoRef.
     * 
     * @return
     *     possible object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public CentroDeCustoRef getCentroDeCustoRef() {
        return centroDeCustoRef;
    }

    /**
     * Define o valor da propriedade centroDeCustoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public void setCentroDeCustoRef(CentroDeCustoRef value) {
        this.centroDeCustoRef = value;
    }

    /**
     * Obtém o valor da propriedade pedidosAereos.
     * 
     * @return
     *     possible object is
     *     {@link PedidosAereos }
     *     
     */
    public PedidosAereos getPedidosAereos() {
        return pedidosAereos;
    }

    /**
     * Define o valor da propriedade pedidosAereos.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidosAereos }
     *     
     */
    public void setPedidosAereos(PedidosAereos value) {
        this.pedidosAereos = value;
    }

    /**
     * Obtém o valor da propriedade pedidosHoteis.
     * 
     * @return
     *     possible object is
     *     {@link PedidosHoteis }
     *     
     */
    public PedidosHoteis getPedidosHoteis() {
        return pedidosHoteis;
    }

    /**
     * Define o valor da propriedade pedidosHoteis.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidosHoteis }
     *     
     */
    public void setPedidosHoteis(PedidosHoteis value) {
        this.pedidosHoteis = value;
    }

    /**
     * Obtém o valor da propriedade pedidosCarros.
     * 
     * @return
     *     possible object is
     *     {@link PedidosCarros }
     *     
     */
    public PedidosCarros getPedidosCarros() {
        return pedidosCarros;
    }

    /**
     * Define o valor da propriedade pedidosCarros.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidosCarros }
     *     
     */
    public void setPedidosCarros(PedidosCarros value) {
        this.pedidosCarros = value;
    }

    /**
     * Obtém o valor da propriedade controleCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControleCliente() {
        return controleCliente;
    }

    /**
     * Define o valor da propriedade controleCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControleCliente(String value) {
        this.controleCliente = value;
    }

    /**
     * Obtém o valor da propriedade camposAdicionais.
     * 
     * @return
     *     possible object is
     *     {@link CamposAdicionais }
     *     
     */
    public CamposAdicionais getCamposAdicionais() {
        return camposAdicionais;
    }

    /**
     * Define o valor da propriedade camposAdicionais.
     * 
     * @param value
     *     allowed object is
     *     {@link CamposAdicionais }
     *     
     */
    public void setCamposAdicionais(CamposAdicionais value) {
        this.camposAdicionais = value;
    }

}
